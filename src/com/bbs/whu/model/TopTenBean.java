package com.bbs.whu.model;

/**
 * ʮ���б�Ԫ�ؽṹ����
 * 
 * @author WWang
 * 
 */
public class TopTenBean {
	// ����
	private String title;
	// ����
	private String author;
	// ����Ӣ����
	private String board;
	// ����ID
	private String bid;
	// ����������
	private String boardname;
	// ����ID
	private long groupid;
	// ������ʱ��
	private String lasttime;
	// ������
	private long number;

	public String getTitle() {
		return title;
	}

	public void setTitle(String tilte) {
		this.title = tilte;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBid() {
		return bid;
	}
	
	public String getBoardname() {
		return boardname;
	}

	public void setBoardname(String boardname) {
		this.boardname = boardname;
	}

	public long getGroupid() {
		return groupid;
	}

	public void setGroupid(long groupid) {
		this.groupid = groupid;
	}

	public String getLasttime() {
		return lasttime;
	}

	public void setLasttime(String lasttime) {
		this.lasttime = lasttime;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "TopTenBean [title=" + title + ", author=" + author + ", board="
				+ board + ", bid=" + bid + ", boardname=" + boardname
				+ ", groupid=" + groupid + ", lasttime=" + lasttime
				+ ", number=" + number + "]";
	}
}