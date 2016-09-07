import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import javax.imageio.stream.ImageInputStream;

public class comzou4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int str[]=new int[5];
		/*for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			//Array
		}
		
		//int str2[][]=new int[5][5];
		for (int i = 0; i < str.length; i++) {
			int str1[]=new int[5];
			for (int j = 0; j < str.length; j++) {
				
			}
		}*/
		/*
		 * int str[]=new int[5];
		 * str[0]=2;
		str[1]=1;
		str[2]=4;
		str[3]=5;
		str[4]=3;
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		System.out.println(str.length);*/
		/*
		 * 生成随机数并排序
		 */
		//方法1
		Random random=new Random();
		int str[]=new int[ 16 ];
		System.out.print("生成的随机数为：");
		for (int i = 0; i < 16; i++) {
			int a=random.nextInt(100);
			System.out.print(a+",");
			str[i]=a;
		}
		System.out.println();
		Arrays.sort(str);
		System.out.print("排序后为：");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[ i ]+" ");
		}
		//方法2
		int temp=0;
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i]>str[j]) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
	}

}
