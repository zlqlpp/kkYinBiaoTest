package com.zlq;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class KK_Test {

	public static void main(String[] args) {
		 String[] kk_dan_changmuyin  		= new String[] {"/e/","/i/","/ɝ/","/o/","/u/","/ɔ/"};
		 String[] kk_dan_duanmuyin 		= new String[] {"/ɪ/","/ɛ/","/æ/","/ɑ/","/ʊ/","/ɚ/","/ə/","/ʌ/"};
		 String[] kk_shuangmuyin		= new String[] {"/аɪ/","/аʊ/","/ɔɪ/"};
		 String[] kk_shuangmuyin_jia	= new String[] {"/ɪr/","/ɛr/","/ɑr/","/ʊr/","/ɔr/","/or/"};

		 System.out.println("长母音：a  短母音：b  双母音：c  假双母音：d");
		 Scanner sc = new Scanner(System.in); 
		 String in = sc.nextLine();
			
		 List list_kk_dan_changmuyin =   new ArrayList(Arrays.asList(kk_dan_changmuyin));
		 Random r = new Random();
		 int index = 0;
		 while(true){
			 if(null==in||"".equals(in)||(!"a".equals(in)
					 &&!"b".equals(in)&&!"c".equals(in)&&!"d".equals(in))){
				 System.out.println("长母音：a  短母音：b  双母音：c  假双母音：d");
				  sc = new Scanner(System.in);
				  in = sc.nextLine();
				 continue;
			 }
			 if(list_kk_dan_changmuyin.size()==0){break;}
			 index = r.nextInt(list_kk_dan_changmuyin.size());
			 System.out.println(list_kk_dan_changmuyin.get(index));
			 list_kk_dan_changmuyin.remove(index);
		 }
	}

}
