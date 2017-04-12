val begin=System.nanoTime
val book1 = sc.textFile("shakespeare")
val book2 = sc.textFile("bible")
val filteredwords1 = book1.flatMap(line => line.split(" ")).filter(x => x.length==5)
val filteredwords2 = book2.flatMap(line => line.split(" ")).filter(x => x.length==5)
val wordCounts1 = filteredwords1.map(x => (x, 1)).reduceByKey(_ + _)
val wordCounts2 = filteredwords2.map(x => (x, 1)).reduceByKey(_ + _)
val combinewordcounts = wordCounts1.join(wordCounts2)
val Totalwordcounts=combinewordcounts.map(a=>(a._1,a._2._1+a._2._2)).collect 
val Top10words = Totalwordcounts.sortWith(_._2 >_._2).take(10)
val Top10wordresult = sc.parallelize(Top10words).collect
val end=System.nanoTime
val duration=(end-begin)/1000000000.0



