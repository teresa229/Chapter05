package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MS949App {
	
	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\Javastudy\\MS949.txt"); //이미지 읽었던 것 인식.010101
		InputStreamReader isr = new InputStreamReader(in, "MS949"); //글자이면 변환을 해주어야 한다. in을 읽어서 번역한다.
		BufferedReader br = new BufferedReader(isr);                //속도를 빠르게
		
		while(true) {
			String str = br.readLine(); //한줄씩 읽어온다. 줄바꿈 기호.
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		
		br.close();
	}

}
