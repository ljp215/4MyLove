package com.bbs.whu.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.widget.BaseAdapter;

/**
 * �������������б���涼��Ҫ������������ɼ����������
 * 
 * @author DoubleChen
 * 
 */
public abstract class MyBaseAdapter extends BaseAdapter {
	// Ӧ��������
	protected Context context;
	// ListViewԪ������
	protected ArrayList<?> mItems;
	// ListViewԪ�ص���Դ��ʶ
	protected int mRLayoutList;

	public MyBaseAdapter(Context context, ArrayList<?> items, int rLayoutList) {
		this.context = context;
		this.mItems = items;
		this.mRLayoutList = rLayoutList;
	}

	@Override
	public int getCount() {
		return mItems.size();
	}

	@Override
	public Object getItem(int position) {
		return mItems.get(position);

	}

	@Override
	public long getItemId(int position) {
		return position;
	}
}
