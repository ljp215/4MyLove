package com.bbs.whu.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.bbs.whu.R;

public class MineActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mine);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// ֻ�в��񷵻ؼ���������false��������MainActivity�в��񷵻ؼ�
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			return false;
		}
		return false;
	}
}
