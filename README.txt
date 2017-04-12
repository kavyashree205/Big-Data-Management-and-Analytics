README - Assignment 1 Part 1
-----------------------------

Method of execution :
---------------------

Command :
---------
	Generic:

	hadoop jar Assignment1-0.0.1-SNAPSHOT.jar Assignment1.Assignment1.DownloadTextbook <HDFS-Path>

	Example:

	hadoop jar Assignment1-0.0.1-SNAPSHOT.jar Assignment1.Assignment1.DownloadTextbook hdfs://cshadoop1/user/kxa152030

	The compressed and decompressed files are saved in the same location (i.e., hdfs://cshadoop1/user/kxa152030)

NOTE : The program first downloads the textbooks(from the hardcoded URLs) into the HDFS location specified by the user through command line.
Then the downloaded file(in compressed format) is decompressed and saved in the same location.
