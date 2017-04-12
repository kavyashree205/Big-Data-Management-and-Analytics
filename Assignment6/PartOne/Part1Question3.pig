reviewdataset = LOAD 'review.csv' USING PigStorage('^') as (review_id:chararray, user_id:chararray, business_id:chararray, star:float);
businessdataset = LOAD 'business.csv' USING PigStorage('^') as (business_id:chararray, address:chararray,categories:chararray);
Businessstar = JOIN businessdataset BY business_id, reviewdataset BY business_id;
BusinessStanford = FILTER Businessstar BY (businessdataset::address MATCHES '.* Stanford .*');
distinctB = DISTINCT BusinessStanford;
result = FOREACH distinctB GENERATE reviewdataset::user_id, reviewdataset::star;
DUMP result;
STORE result INTO 'Question3';