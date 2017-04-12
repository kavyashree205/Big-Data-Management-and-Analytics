package Assignment1.Assignment1;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class DownloadTextbook 
{
    public static void main( String[] args )
    {
    	
    	String[] listOfUrls = {"http://www.utdallas.edu/~axn112530/cs6350/lab2/input/20417.txt.bz2",
    						"http://www.utdallas.edu/~axn112530/cs6350/lab2/input/5000-8.txt.bz2",
    						"http://www.utdallas.edu/~axn112530/cs6350/lab2/input/132.txt.bz2",
    						"http://www.utdallas.edu/~axn112530/cs6350/lab2/input/1661-8.txt.bz2",
    						"http://www.utdallas.edu/~axn112530/cs6350/lab2/input/972.txt.bz2",
    						"http://www.utdallas.edu/~axn112530/cs6350/lab2/input/19699.txt.bz2"};
        
        String[] bookNames = {"OutlineOfScience.txt.bz2","LeonardoDaVinci.txt.bz2","ArtOfWar.txt.bz2",
        					"AdvOfSherlockHolmes.txt.bz2","DevilsDictionary.txt.bz2","EncyclopediaBrit.txt.bz2"};
        
    	String saveDir = args[0];
        int i=0;
        
        try {
        	
          for(String url:listOfUrls ){
        	  //returns true if the textbook is downloaded;false if the book already exists
        	  Boolean status=HttpURLDownload.downloadFile(url, saveDir+"/"+bookNames[i]);
              if(status){ //the textbook is decompressed if the download is successful
            	  System.out.println("Downloaded");
            	  FileDecompressor.decompress(saveDir+"/"+bookNames[i]);
            	  System.out.println("Decompressed");
              }
        	  i++;     	  
        }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
