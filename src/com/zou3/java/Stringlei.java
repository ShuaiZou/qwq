package com.zou3.java;

public class Stringlei {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 练习1：去掉中间空格，转成大写
		 */
		String str = "afds jly Fjkp";
		String str1 = str.replaceAll(" ", "");  //用“”替换“ ”
		System.out.println(str1.toUpperCase());
		/**
		 * 练习2：将字符串逗号改成三个数组
		 */
		String str2 = "abc,efd,yui";
		String[] strArray = null;
		strArray = str2.split(","); 
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]+" ");
			
		}
		/**
		 * 判断是否有子字符串“ef”
		 */
		System.out.println(str2.contains("ef"));
		/**
		 * 练习3：从一个字符串中截取字符串“sdf”
		 */
		String str3="iuewrfsdfhiw";
		System.out.println(str3.substring(6,9));
		/**
		 * 练习4：判断两个字符串是否相等
		 */
		String a = "abd"; 
		String b="fsdfew";
		System.out.println(a.equals(b));
		/**
		 * 练习5：判断是不是空字符串
		 */
		String  c= "fsd";
		System.out.println(c.isEmpty());
		/**
		 * 练习6：遍历某个字符串，看字符串中有几个某字符
		 */
		String d = "我是中国人，我爱我自己";
		for (int i = 0; i < d.length(); i++) {
			System.out.println();
		}
		int count=0;int start=0;
		while( start!=d.length()){//
			int index = d.indexOf("我",start);//如果没找到返回值-1；
			if (index!=-1) {
				count++;
				start=index+1;
			}else{
			break;
		}
		}	
		System.out.println(count);
	}}
