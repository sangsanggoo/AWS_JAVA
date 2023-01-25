insert into author_mst
   (author_name)
select distinct
   저작자
from
   library_mst
order by
   저작자;
    
select * from author_mst;

insert into publisher_mst
	(publisher_name)
select distinct
	         출판사
from
	library_mst
order by
	출판사;
select * from publisher_mst;

