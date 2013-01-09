package com.bbs.whu.activity;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.bbs.whu.R;
import com.bbs.whu.utils.MyBBSRequest;
import com.bbs.whu.utils.MyConstants;

public class BulletinReplyActivity extends Activity implements OnClickListener {
	private String board;// ���
	private String id;// id��
	private String title;// ����
	private String author;// ����
	private String content;// ����
	private String signature;// ǩ��

	// �ظ�����
	TextView replyTitle;
	// �ظ�����
	TextView replyContent;
	// ����ť
	Button publishButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bulletin_reply);

		// ��ȡ�����������ݣ����ص�������
		Intent postInfoIntent = getIntent();
		board = postInfoIntent.getStringExtra("board");// ���
		id = postInfoIntent.getStringExtra("id");// id��
		title = postInfoIntent.getStringExtra("title");// ����
		author = postInfoIntent.getStringExtra("author");// ����
		content = postInfoIntent.getStringExtra("content");// ����
		signature = postInfoIntent.getStringExtra("signature");// ǩ��

		// ��ʼ���ؼ�
		initView();
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.bulletin_reply_publish_button:
			// �ظ�����
			String font = "";
			replyPost(board, id, font, replyTitle.getText().toString(),
					replyContent.getText().toString(), signature);
			break;
		}
	}

	/**
	 * ��ʼ���ؼ�
	 */
	private void initView() {
		// ��ʼ�����Ⲣ���ó�ʼֵ
		replyTitle = (TextView) findViewById(R.id.bulletin_reply_title);
		replyTitle.setText(titleFormat(title));
		// ��ʼ�����ݲ����ó�ʼֵ
		replyContent = (TextView) findViewById(R.id.bulletin_reply_content);
		replyContent.setText(contentFormat(author, content));
		// ��ʼ����������ť
		publishButton = (Button) findViewById(R.id.bulletin_reply_publish_button);
		publishButton.setOnClickListener(this);
	}

	// �ظ����ӵı����ʽ
	private String titleFormat(String originalTitle) {
		return "res:" + originalTitle;
	}

	// �ظ����ӵ����ݸ�ʽ:�� �� xioumu �Ĵ������ᵽ: �� : PPT �� PPTX�ļ����ϴ���������
	private String contentFormat(String originalAuthor, String originalContent) {
		// ����
		return "����" + originalAuthor + "�Ĵ������ᵽ: �� : " + originalContent;
	}

	/*
	 * @mboard:�����
	 * 
	 * @mreID:����ID
	 * 
	 * @mfont:����
	 * 
	 * @msubject:����
	 * 
	 * @mContent:����
	 */
	private void replyPost(String mboard, String mreID, String mfont,
			String msubject, String mContent, String msignature) {
		// ���post�������
		ArrayList<String> keys = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		keys.add("board");
		values.add(mboard);
		keys.add("reID");
		values.add(mreID);
		keys.add("font");
		values.add(mfont);
		keys.add("subject");
		values.add(msubject);
		keys.add("Content");
		values.add(mContent);
		keys.add("signature");
		// if (msignature.equals("--"))
		values.add("0");
		// else
		// values.add(msignature);

		// post����
		MyBBSRequest.mPost(MyConstants.POST_BULLETIN_REPLY_URL, keys, values,
				"BulletinReplyActivity", this);

	}
}
