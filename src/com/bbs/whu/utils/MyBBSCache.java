package com.bbs.whu.utils;

import java.io.File;
import java.io.IOException;

public class MyBBSCache {
	// ������
	public static String getUrlCache(String url) {
		if (url == null) {
			return null;
		}

		String result = null;
		File file = new File(MyFileUtils.getSdcardDataCacheDir() + "/"
				+ getCacheDecodeString(url));
		if (file.exists() && file.isFile()) {
			try {
				result = MyFileUtils.readTextFile(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// д����
	public static void setUrlCache(String data, String url) {
		File file = new File(MyFileUtils.getSdcardDataCacheDir() + "/"
				+ getCacheDecodeString(url));
		try {
			// �����������ݵ����̣����Ǵ����ļ�
			MyFileUtils.writeTextFile(file, data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// URI����
	public static String getCacheDecodeString(String url) {
		if (url != null) {
			return MyFileUtils.md5(url);
		}
		return null;
	}
}
