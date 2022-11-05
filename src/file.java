import java.io.*;

public class file {
	String readFile(String str) throws IOException {
		FileReader fr=new FileReader(str);
		BufferedReader br=new BufferedReader(fr);
		String line="";
		String arrs = new String();
		int cnt = 0;
		while ((line=br.readLine())!= null && cnt != 5) {
			arrs += line + "\n";
			cnt ++;
		}
		br.close();
		fr.close();
		return arrs;
	}

	void writeFile(String str, File f) throws IOException {
		InputStream in = new FileInputStream(f);
		OutputStream out = new FileOutputStream(new File(str));
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}

}