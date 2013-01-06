package com.bbs.whu.utils;

import android.app.Application;
import com.loopj.android.http.PersistentCookieStore;

/**
 * ��������Ӧ�õ�ȫ�ֱ����洢��ȡ�Ĺ����࣬ȫ�ֱ���ΪCookie�洢��
 * 
 * @author double
 * 
 */
public class MyApplication extends Application {
	PersistentCookieStore myCookieStore;

	public PersistentCookieStore getCookieStore() {
		return myCookieStore;
	}

	public void setCookieStore(PersistentCookieStore pcs) {
		myCookieStore = pcs;
	}
}