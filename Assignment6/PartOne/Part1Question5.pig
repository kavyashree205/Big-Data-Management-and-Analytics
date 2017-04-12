reviewdataset = LOAD 'review.csv' USING PigStorage('^') as (review_id:chararray, user_id:chararray, business_id:chararray, star:float);
businessdataset = LOAD 'business.csv' USING PigStorage('^') as (business_id:chararray, address:chararray,categories:chararray);
BusinessGroups = GROUP reviewdataset BY business_id;
BusinessGroupscount = FOREACH BusinessGroups GENERATE group, COUNT(reviewdataset.star) as countstars;
BusinessDetails = JOIN businessdataset BY business_id, BusinessGroupscount BY group;
distinctB = DISTINCT BusinessDetails;
TXB = FILTER distinctB BY (businessdataset::address MATCHES '.* TX .*');
result = FOREACH TXB GENERATE businessdataset::business_id,BusinessGroupscount::countstars;
DUMP result;
STORE result INTO 'Question5';