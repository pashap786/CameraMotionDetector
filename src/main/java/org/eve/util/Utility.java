package org.eve.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class Utility {

	public static boolean createFolders() {
		File f = new File(getRoot() + "/security/"+today());
		if (f.exists()) {
			return true;
		} else {
			f.mkdirs();
			return f.exists();
		}
	}
	
	public static String todaysPath() {
		return getRoot()+"/security/"+today()+"/";
	}

	public static String today() {
		Date tDate = new Date();
		String date = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(tDate);
		return date;
	}

	public static String imageName() {
		return UUID.randomUUID().toString().replace("-", "");
	}

	public static String getRoot() {
		return new File("/").getAbsolutePath();
	}

}
