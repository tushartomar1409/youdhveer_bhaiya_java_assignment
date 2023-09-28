package youdhveerbhaiya;
import java.io.*;
class FileReadAndWrite {
	public static void main(String arg[]) throws FileNotFoundException,IOException{
		int l=0,w=0,c=0;
		BufferedReader file=new BufferedReader(new FileReader("C:\\Users\\Tushar Tomar\\OneDrive\\Desktop\\sample.txt"));
		String line=file.readLine();
		file.close();
		while(line !=null) {
			l++;
			String words[]=line.split(" ");
			
			w=w+words.length;
			for(String word:words) {
				c=c+word.length();
				c=c+(words.length-1);
			
			line=file.readLine();
		}
		System.out.println("No of lines: "+l);
		System.out.println("No of Words: "+w);
		System.out.println("No of characters: "+c);
		}
}
}