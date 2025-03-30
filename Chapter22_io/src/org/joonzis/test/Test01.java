package org.joonzis.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//nationalAnthem 데이터 파일을 읽어들여 화면에 출력하고,
//nationalAnthem2.txt 파일명으로 복사하는 프로그램 작성
public class Test01 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new FileReader(new File("nationalAnthem.txt")));
		BufferedWriter bw=new BufferedWriter(new FileWriter(new File("nationalAnthem2.txt")));
			
			String line="";
			while(true) {
				line=br.readLine();
				if (line ==null) {
					break;
				}
			
				bw.write(line);
				bw.newLine();
			
				System.out.println(line);
			
			br.close();
			bw.close();
			
			
			
			
//			if (file.exists()) {
//				BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
//				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("nationalAnthem2.txt"));
//				
//				byte[] buffer=new byte[1024];
//				while(bis.read(buffer)!=-1) {
//					bos.write(buffer);
//				}
//				
//				bos.close();
//				bis.close();
//			
//			}else {
//				System.out.println("해당 파일을 찾을 수 없습니다");
//			}
//			
			
		
		
		
		
		
		
		
}}}

