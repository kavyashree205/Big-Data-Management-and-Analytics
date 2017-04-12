package TwitterMapReduce.Assignment2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import com.sun.jersey.api.client.ClientResponse.Status;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws TwitterException, IOException
    {
    	Twitter twitter = TwitterFactory.getSingleton();
        twitter.setOAuthConsumer("CG5M6TROcud73B1gixCFMPT3I", "ANUHFDtV9aS831jMsNQeoq1hpZidmc5OWOwBs3f0s36cfEFzeN");
        RequestToken requestToken = twitter.getOAuthRequestToken();
        AccessToken accessToken = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (null == accessToken) {
          System.out.println("Open the following URL and grant access to your account:");
          System.out.println(requestToken.getAuthorizationURL());
          System.out.print("Enter the PIN(if aviailable) or just hit enter.[PIN]:");
          String pin = br.readLine();
          try{
             if(pin.length() > 0){
               accessToken = twitter.getOAuthAccessToken(requestToken, pin);
             }else{
               accessToken = twitter.getOAuthAccessToken();
             }
          } catch (TwitterException te) {
            if(401 == te.getStatusCode()){
              System.out.println("Unable to get the access token.");
            }else{
              te.printStackTrace();
            }
          }
        }
    	Twitter twit = TwitterFactory.getSingleton();
    	
        Query query = new Query("Djokovic since:2015-09-14");
        
        query.count(100);
        QueryResult result = twit.search(query);
        
        FileWriter fw = new FileWriter("tweetfile6.txt");
        BufferedWriter buff = new BufferedWriter(fw);
        
        for (twitter4j.Status status : result.getTweets()) {
        	
        	buff.write(status.getText());
        	
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
            System.out.println(result.getCount());
        }
        buff.close();
    }
}
