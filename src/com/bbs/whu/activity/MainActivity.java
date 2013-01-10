package com.bbs.whu.activity;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.TabActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.bbs.whu.R;
import com.bbs.whu.handler.MessageHandlerManager;
import com.bbs.whu.utils.MyBBSRequest;
import com.bbs.whu.utils.MyConstants;

/**
 * ������Activity��
 * ����5��tab���ֱ��ǡ���ҳ���������ࡱ�����ҵ�ɽˮ��������Ϣ���������ࡱ
 * 
 * @author double
 * 
 */
public class MainActivity extends TabActivity {
	TabHost tabHost;
	// �����������ݵ�handler
	Handler mHandler;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		tabHost = getTabHost();
		// ���tab
		setTabs();
		// ��ʼ��handler
		initHandler();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// ���񷵻ؼ�
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			showDialog();
			return false;
		}
		return false;
	}

	/**
	 * ���tab
	 */
	private void setTabs() {
		addTab("��ҳ", R.drawable.tab_home, HomeActivity.class);
		addTab("����", R.drawable.tab_search, BoardActivity.class);
		addTab("�ҵ�ɽˮ", R.drawable.tab_home, MineActivity.class);
		addTab("��Ϣ", R.drawable.tab_search, MessageActivity.class);
		addTab("����", R.drawable.tab_home, MoreActivity.class);
	}

	/**
	 * ���һ��tab
	 * 
	 * @param labelId
	 *            tab��id
	 * @param drawableId
	 *            tab��ͼ��
	 * @param c
	 *            tab��Ӧ��Activity
	 */
	private void addTab(String labelId, int drawableId, Class<?> c) {
		Intent intent = new Intent(this, c);
		TabHost.TabSpec spec = tabHost.newTabSpec("tab" + labelId);

		View tabIndicator = LayoutInflater.from(this).inflate(
				R.layout.tab_indicator, getTabWidget(), false);
		TextView title = (TextView) tabIndicator.findViewById(R.id.title);
		title.setText(labelId);
		ImageView icon = (ImageView) tabIndicator.findViewById(R.id.icon);
		icon.setImageResource(drawableId);
		spec.setIndicator(tabIndicator);
		spec.setContent(intent);
		tabHost.addTab(spec);
	}

	/**
	 * ��ʾ�û��Ƿ��˳�
	 */
	private void showDialog() {
		AlertDialog.Builder builder = new Builder(MainActivity.this);
		builder.setMessage("ȷ��Ҫ�˳���?");
		builder.setTitle("��ʾ");
		builder.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// �˳���½
				MyBBSRequest.mGet(MyConstants.LOG_OUT_URL, "MainActivity");
				// �Ի����˳�
				dialog.dismiss();
			}
		});
		builder.setNegativeButton("ȡ��",
				new android.content.DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// �Ի����˳�
						dialog.dismiss();
					}
				});
		builder.create().show();
	}

	/**
	 * ��ʼ��handler
	 */
	private void initHandler() {
		// ��ʼ��handler
		mHandler = new Handler() {
			@Override
			public void handleMessage(Message msg) {
				// ��������
				android.os.Process.killProcess(android.os.Process.myPid());
				return;
			}
		};
		// ע��handler
		MessageHandlerManager.getInstance().register(mHandler,
				MyConstants.REQUEST_SUCCESS, "MainActivity");
		MessageHandlerManager.getInstance().register(mHandler,
				MyConstants.REQUEST_FAIL, "MainActivity");
	}
}