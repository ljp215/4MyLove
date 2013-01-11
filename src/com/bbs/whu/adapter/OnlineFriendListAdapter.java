package com.bbs.whu.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbs.whu.R;

/**
 * ���ߺ����б�����������
 * 
 * @author wwang
 * 
 */
public class OnlineFriendListAdapter extends MyBaseAdapter {

	public OnlineFriendListAdapter(Context context, ArrayList<String> items,
			int rLayoutList) {
		super(context, items, rLayoutList);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		OnlineFriendListViewHolder holder;
		if (convertView == null) {
			holder = new OnlineFriendListViewHolder();
			convertView = LayoutInflater.from(context).inflate(
					this.mRLayoutList, null);
			// ��ȡ�б�Ԫ���еĿؼ�����
			holder.holderOnlineFriendNumber = (TextView) convertView
					.findViewById(R.id.online_frined_number);
			holder.holderOnlineFriendHeadPortrait = (ImageView) convertView
					.findViewById(R.id.online_frined_head_portrait);
			holder.holderOnlineFriendName = (TextView) convertView
					.findViewById(R.id.online_frined_name);
			// ���ÿؼ�����convertView
			convertView.setTag(holder);
		} else {
			holder = (OnlineFriendListViewHolder) convertView.getTag();
		}
		// ������Դ��ȡ���ߺ�������
		String name = (String) mItems.get(position);

		// ���ؼ�
		holder.holderOnlineFriendName.setText(name);

		return convertView;
	}
}