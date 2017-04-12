README
=======

Part 1:
-------
Files turned in : Folder PartOne has 5 source files

Command to execute : 

Question 1 : exec Part1Question1.pig
Question 2 : exec -param Fname=Greg -param Lname=A Part1Question2.pig
Question 3 : exec Part1Question3.pig
Question 4 : exec Part1Question4.pig
Question 5 : exec Part1Question5.pig

PS : Output for Question2.pig would look like this :

7shg8iOaS_tgMdNCGOXJtw	Greg A.	2.0
BXQuMp_pUEIkfqctZt-jCw	Greg A.	4.0
C7RZIilaw2_XhRgizjdKSg	Greg A.	3.0
DiZyLkHNsUp0Fm0WJ3YMxQ	Greg A.	2.5
UMJa7JWioN291-nQlAda5g	Greg A.	3.857142857142857
ZS6JGKdmP65cJeSNUcQjBA	Greg A.	5.0
jO1rDsrS3_M_fmgl_dQePg	Greg A.	4.0
lUGEzBF3SFKKn0-LaTdasA	Greg A.	4.5
oNNAypob-Pj7j7qF68DQ7A	Greg A.	3.25
v5W0Sr1pG_n2bg7-ECL89A	Greg A.	3.0


=============================================================================================================================================
Part 2:
-------

Using PIG 
----------
Files turned in : 
Folder PartTwo-
	-Part2PigCode.pig (source file)	NOTE : word length has been hardcoded
	-Part2PigOutput.txt (file containing outputs for word lengths k=5,6,7,8)
	
Command to execute :

	exec Part2PigCode.pig 

Time taken by PIG to output the results : 7 seconds

HadoopVersion   PigVersion      UserId  StartedAt       FinishedAt      Features
2.4.1   0.13.0  kxa152030       2016-03-25 22:24:01     2016-03-25 22:24:08     HASH_JOIN,GROUP_BY,ORDER_BY,FILTER,LIMIT

---------------------------------------------------------------------------------------------------------------------------------------------
Using SCALA
------------
Files turned in : 
Folder PartTwo-
	-Part2ScalaCode.scala (source file)	NOTE : word length has been hardcoded
	-Part2ScalaOutput.txt (file containing outputs for word lengths k=5,6,7,8)
	
Command to execute :

	spark-shell -i Part2ScalaCode.scala 

Time taken by SCALA to output the results: 3.15 seconds

duration: Double = 3.150288201

==============================================================================================================================================
