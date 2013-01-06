package com.bbs.whu.model;

/**
 * ���������б�Ԫ�ؽṹ����
 * 
 * @author WWang
 * 
 */
public class BulletinBean {
	// ¥��
	private String floor;
	// ����
	private String content;
	// id
	private String id;
	// ����������
	private String author;
	// ��������飩
	private String board;
	// ����
	private String title;
	// ��վ��
	private String site;
	// �������ظ���ʱ��
	private String time;
	// ����ͷ��
	private String head;
	// ��������
	private String body;
	// ���ӻظ�
	private String reply;
	// ��������
	private String text;
	// ǩ����
	private String sign;
	// ��Դ
	private String from;

	public BulletinBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BulletinBean(String floor, String content, String id, String author,
			String board, String title, String site, String time, String head,
			String body, String reply, String text, String sign, String from) {
		super();
		this.floor = floor;
		this.content = content;
		this.id = id;
		this.author = author;
		this.board = board;
		this.title = title;
		this.site = site;
		this.time = time;
		this.head = head;
		this.body = body;
		this.reply = reply;
		this.text = text;
		this.sign = sign;
		this.from = from;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.floor + "/" + this.content + "/" + this.id + "/"
				+ this.author + "/" + this.board + "/" + this.title + "/"
				+ this.site + "/" + this.time + "/" + this.head + "/"
				+ this.body + "/" + this.reply + "/" + this.text + "/"
				+ this.sign + "/" + this.from;
	}
}