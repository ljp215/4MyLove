package com.bbs.whu.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bbs.whu.R;
import com.bbs.whu.activity.BulletinActivity;
import com.bbs.whu.model.PlaybillBean;

/**
 * У԰��������������
 * 
 * @author wwang
 * 
 */
public class PlaybillListAdapter extends MyBaseAdapter {

	public PlaybillListAdapter(Context context, ArrayList<PlaybillBean> items,
			int rLayoutList) {
		super(context, items, rLayoutList);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		PlaybillListViewHolder holder;
		if (convertView == null) {
			holder = new PlaybillListViewHolder();
			convertView = LayoutInflater.from(context).inflate(
					this.mRLayoutList, null);
			// ��ȡ�б�Ԫ���еĿؼ�����
			holder.holderPlaybillTitle = (TextView) convertView
					.findViewById(R.id.playbill_title);
			// ���ÿؼ�����convertView
			convertView.setTag(holder);
		} else {
			holder = (PlaybillListViewHolder) convertView.getTag();
		}
		// У԰��������
		String title = ((PlaybillBean) mItems.get(position)).getTitle();
		// У԰�������ڰ���Ӣ����
		final String board = ((PlaybillBean) mItems.get(position)).getBoard();
		;
		// У԰�������ڰ��ı��
		final String groupid = ((PlaybillBean) mItems.get(position))
				.getGroupid();

		// ���ؼ�
		holder.holderPlaybillTitle.setText(title);

		// ��ӵ����Ӧ�¼�
		convertView.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// ��ת�������������
				Intent mIntent = new Intent(context, BulletinActivity.class);
				// ��Ӳ���
				mIntent.putExtra("board", board);
				mIntent.putExtra("groupid", groupid);
				context.startActivity(mIntent);
			}
		});

		return convertView;
	}
}