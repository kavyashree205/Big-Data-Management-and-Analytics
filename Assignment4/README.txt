README Assignment 4
----------------------

NOTE: Jar file - InMapperWordCount.jar


Steps to execute :
----------------------


Question 1:
-----------
Syntax:
		hadoop jar <jar-file> <class name> <input-files-directory> <output-files-directoty>
		
Example:

start=$SECONDS
hadoop jar WordCount.jar WordCount.WordCount.WordCount /user/kxa152030/assignout1 /user/kxa152030/NormalWordCount
duration=$((SECONDS - start))
echo $duration
69

start=$SECONDS
hadoop jar InMapperWordCount.jar Assignment4.Assignment4.InMapperWordCount /user/kxa152030/assignout1 /user/kxa152030/InMapperOutput
duration=$((SECONDS - start))
echo $duration
33

Time taken for traditional Wordcount to run: 69 seconds
Time taken for in-mapper combiner Wordcount to run: 33 seconds


-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Question 2:
-----------
Syntax:
		hadoop jar <jar-file> <class name> <input-files-directory> <output-files-directoty> -skip stop_words.txt 
		
Example:

		hadoop jar InMapperWordCount.jar Assignment4.Assignment4.StripesCoOccurence /user/kxa152030/assignout1 /user/kxa152030/Second -skip stop_words.txt

This program takes 6 textbook files as input and outputs stripes of words.
It takes only words with length 6 while creating stripes.
It also takes stop_words.txt file to remove stop words.

Output file - "SecondQuestion.txt"

----------------------------------------------------------------------------------------------------------------------------------------------------------------