package com.bbs.whu.model;

import com.bbs.whu.model.friend.ID;
import com.bbs.whu.model.friend.experience;


/**
 * ȫ�������б�Ԫ�ؽṹ����
 * 
 * @author WWang
 * 
 */
public class FriendsAllBean {
	// BBS�û�����ֵ
	private experience experience;
	// BBS�û�ID�����û���
	private ID ID;
	
	public FriendsAllBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FriendsAllBean(com.bbs.whu.model.friend.experience experience,
			com.bbs.whu.model.friend.ID iD) {
		super();
		this.experience = experience;
		ID = iD;
	}

	public experience getExperience() {
		return experience;
	}

	public void setExperience(experience experience) {
		this.experience = experience;
	}

	public ID getID() {
		return ID;
	}

	public void setID(ID iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "FriendsAllBean [experience=" + experience + ", ID=" + ID + "]";
	}
}
