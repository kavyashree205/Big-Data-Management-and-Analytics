README - Assignment 2
----------------------

Twitter topic used for search : Djokovic

Timelines used : One day (obtained tweets starting from 2015-09-09 upto 2015-09-14 i.e., during the last week of US Open)

Size of the input files : around 12KB (Each file contains 100 tweets (Maximum limitation of the Twitter Search API - 100))

Files that have been turned in :
---------------------------------

1. App.java (Contains the code for downloading tweets based on "Djokovic" and saving it to a file tweetfile1.txt)
 (This code was executed 6 times locally on eclipse by changing the date from 2015-09-09 to 2015-09-14 and saved it in respective files tweetfile1.txt,tweetfile2.txt,
 tweetfile3.txt and so on)
 
2. WordCount.java (The code has been modified to get the count of words that start from "#")
	--All the 6 input files were placed in /home/005/k/kx/kxa152030 using WinSCP and further were copied to a directory
	  at /user/kxa152030/twitterinput) 
	--The jar file of the project containing App.java and WordCount.java was placed in /home/005/k/kx/kxa152030 using WinSCP 
	--Executed the jar file on hadoop with the directory(containing tweet files) as input. The WordCount program iterates over the 6 files and gives 
	  a count of all the hashtags.
	--The output file part-r-00000 was saved to the local cluster using get command(the output file contains the words starting with hashtags and 
	  their respective counts)
	
3. mapreduce_output.txt 
 (has the contents of part-r-00000 ie., output of WordCount program)
 
4. The JAR file of the project (Assignment2-0.0.1-SNAPSHOT)
 
 
