package com.zhangwen.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static String getRandomDate(Date beginDate,Date endDate) {
		int begin = (int) beginDate.getTime();
		int end = (int) endDate.getTime();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		if(begin > end) {
			System.out.println("日期值错误");
			return null;
		}else {
			int i = RandomUtil.random(begin, end);
			return sf.format(new Date(i));
		}	
	}
}
