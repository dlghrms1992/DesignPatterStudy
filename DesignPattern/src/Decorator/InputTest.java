package Decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import Decorator.inputstream.LowerCaseInputStream;

public class InputTest {

	public static void main(String[] args) throws IOException {
		
		int c;
		
		File file = new File("D:\\디자인패턴 소스\\Head-First-Design-Patterns-master\\test.txt");
		InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(file)));
		
		while((c = in.read()) >= 0) {
			System.out.print((char)c);
		}
		in.close();

	}

}
