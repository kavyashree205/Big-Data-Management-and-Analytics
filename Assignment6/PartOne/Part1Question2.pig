reviewdataset = LOAD 'review.csv' USING PigStorage('^') as (review_id:chararray, user_id:chararray, business_id:chararray, star:float);
userdataset = LOAD 'user.csv' Using PigStorage('^') AS (user_id:chararray, name:chararray, url:chararray);
UsersGroups = GROUP reviewdataset BY user_id;
UsersCounts = FOREACH UsersGroups GENERATE group, AVG(reviewdataset.star) as countstars;
UsersDetails =JOIN userdataset BY user_id, UsersCounts BY group;
UserFilter = FILTER UsersDetails BY (userdataset::name MATCHES '.*$Fname\\s$Lname.*');
result = FOREACH UserFilter GENERATE userdataset::user_id, userdataset::name, UsersCounts::countstars;
DUMP result;
STORE result INTO 'Question2'; 