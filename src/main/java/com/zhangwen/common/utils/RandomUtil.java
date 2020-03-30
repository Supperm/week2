package com.zhangwen.common.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机数工具类
 * @author: 张稳
 * @date: 2020年3月30日 下午1:38:52
 */
public class RandomUtil {

	/**
	 * 
	 * @Title: random 
	 * @Description: 返回min-max之间的随机整数
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	public static int random(int min,int max) {
		int a = (int) (Math.random()*(max - min + 1 ) + min);
		return a;
	}
	
	/**
	 * 
	 * @Title: subRandom 
	 * @Description: 在最小值min与最大值max之间截取subs个不重复的随机数
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 * @return: int[]
	 */
	public static int[] subRandom(int min,int max,int subs) {
		Set<Integer> set = new HashSet<Integer>();
		while (set.size()<subs) {
			int a = (int) (Math.random()*(max - min + 1 ) + min);
			set.add(a);
		}
		int[] in = new int[subs];
		int j = 0;
		
		for (int i : set) { 
			in[j] = i; 
			j++; 
		}
		 
		return in;
	}
	
	/**
	 * 
	 * @Title: randomCharacter 
	 * @Description: 返回1个1-9,a-Z之间的随机字符
	 * @return
	 * @return: char
	 */
	public static char randomCharacter() {
		String str = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASFGHJKLZXCVBNM";
		return str.charAt(random(1, str.length()));
	}
	
	/**
	 * 
	 * @Title: randomString 
	 * @Description: 返回参数length个字符串
	 * @param length
	 * @return
	 * @return: String
	 */
	public static String randomString(int length){
		String str = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASFGHJKLZXCVBNM";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			char c = RandomUtil.randomCharacter();
			sb.append(c);
		}
		return sb.toString();
	}
}
