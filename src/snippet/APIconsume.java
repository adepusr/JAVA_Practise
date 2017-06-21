package snippet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Scanner;
import org.json.*;
public class APIconsume {
	public static void main(String[] args) throws IOException, JSONException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String subst=sc.nextLine();
		URL hacker = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title="+subst);
        URLConnection yc = hacker.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                yc.getInputStream()));
        String inputLine="", st;
        while ((st = in.readLine()) != null) 
            inputLine+= st;
        in.close();
        JSONObject jb=new JSONObject(inputLine);
        int s=jb.getInt("total");
        System.out.println(inputLine);
        System.out.println("---->"+s);
	}
}
