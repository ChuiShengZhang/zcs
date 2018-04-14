package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Õ¯“≥≈¿≥Ê(÷©÷Î)
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://tieba.baidu.com/p/2314539885");
		
		URLConnection con = url.openConnection();
		
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(con.getInputStream()));
		
		String regex = "[a-zA-Z0-9]{5,15}@(.){1,6}\\1+";
		
		String line = null;
		Pattern p = Pattern.compile(regex);
		while((line = bufIn.readLine())!=null){
			Matcher m = p.matcher(line);
			while(m.find()){
				System.out.println(m.group());
			}
		}
	}
}
