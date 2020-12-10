package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamApp {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\Javastudy\\img.jpg");              //기본 빨대 장착
		BufferedInputStream bin = new BufferedInputStream(in);                       //in 장착시킴.
	
		OutputStream out = new FileOutputStream("C:\\Javastudy\\bufferedimg.jpg");   //기본 빨대 장착
		BufferedOutputStream bout = new BufferedOutputStream(out);                   //out 장착시킴.
		
		System.out.println("버퍼디드 복사 시작");
		while(true) {
			int bData = bin.read();
			if(bData == -1) {
				System.out.println("버퍼디드 복사 끝");
				break;
			}
			bout.write(bData);
		}
		bout.close();
		bin.close();
	}	
}
