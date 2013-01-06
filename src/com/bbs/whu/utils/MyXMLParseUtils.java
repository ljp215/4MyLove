package com.bbs.whu.utils;

import java.util.List;

import com.bbs.whu.model.TopTenBean;
import com.bbs.whu.model.bulletin.Page;
import com.bbs.whu.model.bulletin.numConverter;
import com.bbs.whu.model.bulletin.totalConverter;
import com.thoughtworks.xstream.XStream;

/**
 * XML���л��뷴���л�����
 * 
 * @author WWang
 * 
 */
public class MyXMLParseUtils {

	/**
	 * �����л�ʮ����ժ�б�
	 * 
	 * @param XMLStream
	 * @return List<TopTenBean>
	 */
	public static List<TopTenBean> readXml2TopTenList(String XMLStream) {
		if (null == XMLStream) {
			return null;
		}
		XMLStream = XMLStream.trim();
		XMLStream = XMLStream.replaceAll("&", "&amp;");
		// �滻<hots>��ǩΪ<list>��ǩ
		XMLStream = XMLStream.replace("<hots>", "<list>");
		XMLStream = XMLStream.replace("</hots>", "</list>");
		XStream xstream = new XStream();
		// ��������
		xstream.alias("hot", TopTenBean.class);
		// �����л�
		@SuppressWarnings("unchecked")
		List<TopTenBean> topTenList = (List<TopTenBean>) xstream
				.fromXML(XMLStream);
		return topTenList;
	}

	/**
	 * �����л����������б�
	 * 
	 * @param XMLStream
	 * @return Page
	 */
	public static Page readXml2Page(String XMLStream) {
		if (null == XMLStream) {
			return null;
		}
		XMLStream = XMLStream.trim();
		XMLStream = XMLStream.replaceAll("&", "&amp;");
		// �滻<article>��ǩΪ<articles><article>��ǩ
		XMLStream = XMLStream.replaceFirst("<article>", "<articles><article>");
		// �滻</page>��ǩΪ</articles></page>��ǩ
		XMLStream = XMLStream.replace("</page>", "</articles></page>");
		XStream xstream = new XStream();
		xstream.alias("page", Page.class);
		xstream.alias("article", Page.Article.class);
		xstream.useAttributeFor(Page.class, "num");
		xstream.useAttributeFor(Page.class, "total");
		xstream.registerConverter(new numConverter());
		xstream.registerConverter(new totalConverter());
		return (Page) xstream.fromXML(XMLStream);
	}
}