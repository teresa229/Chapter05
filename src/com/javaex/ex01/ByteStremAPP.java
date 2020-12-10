package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStremAPP {

	public static void main(String[] args) throws IOException {
		//InputStream  FileInputStream
		//OutputStream FileOutputStream
		
		InputStream in = new FileInputStream("C:\\Javastudy\\img.jpg");  //읽으려는 파일 : 주소+이름
		OutputStream out = new FileOutputStream("C:\\Javastudy\\byteimg.jpg");
		
		System.out.println("복사시작");
		while(true) {
			int bData = in.read();
			if(bData == -1) {  //데이터가 마지막인지체크 ->마지막이면 -1리턴
				System.out.println("복사끝");
				break;         //마지막이면 반복문 탈출
			}
			out.write(bData); //데이터가 있으면 쓴다.
		}
		out.close();  //스트림 닫는 것 잊지 말 것
		in.close();   //스트림 꼭 닫을 것
		}
	}

