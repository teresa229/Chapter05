package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStreamApp2 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\Javastudy\\MS949.txt");
//		Reader fr = new FileReader("C:\\Javastudy\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine(); //한줄씩 읽어온다. 글자가 있거나 null하거나 (Byte stream에서 -1숫자가 나올때 까지와는 다른 접근)
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		fr.close();
	}
}
