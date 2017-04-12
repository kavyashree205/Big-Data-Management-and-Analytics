Assignment 5
=============

PART 1 - HADOOP MAPREDUCE
-------------------------

jar file is: Assignment5\target\yelp.jar
source files are present in "Assignment5\src\main\java\Assignment5\Assignment5" directory.


Question 1:    (Output file - OutputQuestion1.txt)
-----------

Syntax:
		hadoop jar <jar-file> <class name> <path_to_review.csv> <path_to_business.csv> <output-files-directoty>
		
Example:
		hadoop jar yelp.jar Assignment5.Assignment5.Question1 "/yelpdatafall/review/review.csv" "/yelpdatafall/business/business.csv" "hdfs://cshadoop1/kxa152030/q1output"
		
Question 2:    (Output file - OutputQuestion2.txt)
-----------

Syntax:
		hadoop jar <jar-file> <class name> <path_to_review.csv> <path_to_user.csv> <output-files-directoty> "<User name>"
		
Example:		
		hadoop jar yelp.jar Assignment5.Assignment5.Question2 "/yelpdatafall/review/review.csv" "/yelpdatafall/user/user.csv" "hdfs://cshadoop1/kxa152030/q2output" "John H."
		

Question 3:    (Output file - OutputQuestion3.txt)
-----------

Syntax:
		hadoop jar <jar-file> <class name> <path_to_review.csv> <path_to_business.csv> <output-files-directoty>
		
Example:			
		hadoop jar yelp.jar Assignment5.Assignment5.Question3 "/yelpdatafall/review/review.csv" "/yelpdatafall/business/business.csv" "hdfs://cshadoop1/kxa152030/q3output"
		
Question 4:   (Output file - OutputQuestion4.txt)
-----------

Syntax:
		hadoop jar <jar-file> <class name> <path_to_review.csv> <path_to_user.csv> <output-files-directoty>
		
Example:			
		hadoop jar yelp.jar Assignment5.Assignment5.Question4 "/yelpdatafall/review/review.csv" "/yelpdatafall/user/user.csv" "hdfs://cshadoop1/kxa152030/q4output"
		
Question 5:  (Output file - OutputQuestion5.txt)
-----------

Syntax:
		hadoop jar <jar-file> <class name> <path_to_review.csv> <path_to_business.csv> <output-files-directoty>
		
Example:			
		hadoop jar yelp.jar Assignment5.Assignment5.Question5 "/yelpdatafall/review/review.csv" "/yelpdatafall/business/business.csv" "hdfs://cshadoop1/kxa152030/q5output"
		


==================================================================================================================================

PART 2 - SCALA
---------------

UsingScala.txt - has the scala code for all the five questions
Output files are OutputQuestion1.txt, OutputQuestion2.txt, OutputQuestion3.txt, OutputQuestion4.txt, OutputQuestion5.txt.
 