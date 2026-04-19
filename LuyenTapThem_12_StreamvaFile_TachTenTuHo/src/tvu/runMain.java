package tvu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class runMain {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("HoTen.txt");
		BufferedReader buf = new BufferedReader(fr);
		while(true) {
			String line = buf.readLine();
			if(line == null ) 
				break;
			String[] s = line.split(" ");
			System.out.println(s[s.length - 1]);
		}
		
	}

}
