package com.bbs.whu.model;

/**
 * 十大列表元素结构定义
 * 
 * @author WWang
 * 
 */
public class TopTenBean {
	// 标题
	private String title;
	// 作者
	private String author;
	// 版面英文名
	private String board;
	// 版面中文名
	private String boardname;
	// 版面ID
	private long groupid;
	// 最后更新时间
	private String lasttime;
	// 回帖数
	private long number;

	public String getTilte() {
		return title;
	}

	public void setTilte(String tilte) {
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
		return this.title + "/" + this.author + "/" + this.board + "/"
				+ this.boardname + "/" + this.groupid + "/" + this.lasttime
				+ "/" + this.number;
	}
}