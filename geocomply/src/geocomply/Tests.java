package geocomply;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Tests {

	static String filePath = "C:\\SeleniumWorkspace\\geocomply\\basefile.txt";
	static String cfile = "C:\\SeleniumWorkspace\\geocomply\\cfile.txt";
	static String cppfile = "C:\\SeleniumWorkspace\\geocomply\\cppfile.txt";
	static String csfile = "C:\\SeleniumWorkspace\\geocomply\\csfile.txt";
	
	public static void main(String[] args) {
		String line = null;
		File fileToBeread = new File(filePath);
		BufferedReader reader = null;
	try {
		reader = new BufferedReader(new FileReader(fileToBeread));
		line = reader.readLine();
		
		filedelete(cfile, cppfile, csfile);
		while (line != null) {
			if (line.endsWith(".c")) {
			cfile(line, cfile);
			}
			else if (line.endsWith(".cpp")) {
			cppfile(line, cppfile);
			}
			else if (line.endsWith(".cs")) {
			csfile(line, csfile);
			}
			line = reader.readLine();
		}
	}
	catch(Exception ex) {
	
	}
}
	
	public static void cfile(String line, String cFile) {
		try {
//				boolean filepresent = file.exists();
//					if(filepresent=true) {
//					}
//					else {
//					file.createNewFile();
//					}
				
				FileWriter writer = new FileWriter(cFile, true);
				writer.write(line);
				writer.write("\r\n");
				writer.close();
				  
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void cppfile(String line, String cppFile) {
		try {
			FileWriter writer = new FileWriter(cppFile, true);
			writer.write(line);
			writer.write("\r\n");
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void csfile(String line, String cppFile) {
		try {
			FileWriter writer = new FileWriter(cppFile, true);
			writer.write(line);
			writer.write("\r\n");
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void filedelete(String cfile,String cppfile,String csfile) {
		File c = new File(cfile);
		c.delete();
		
		File cpp = new File(cppfile);
		cpp.delete();
		
		File cs = new File(csfile);
		cs.delete();
	}

}
