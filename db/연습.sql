/*====================<< select >>===========================*/

select * from student_mst;

/*전체 컬럼 조회*/
select 
	*
from
	student_mst;
    
/*지정 컬럼 조회*/
select
	student_id,
    student_name
from
	student_mst;
 /*임시 컬럼 추가 */
 select 
	1 as num,
    '준일' as name;
select 
	student_id,
    student_name,
    '김준일' as instructor_name
from
	student_mst;
   
   
   
   
/*컬럼명을 임시로 바꾸는 방법*/
select
	student_id as studentId
from
	student_mst;
    
/*컬럼명을 임시로 바꾸는 방법 as(alias) 알리아스 */
select
	sm.student_id as stduentId
from
	student_mst sm;
    
/*조회조건 */

select
	*
from 
	student_mst
where 
	mentor_id = (select
					mentor_id
				from
					mentor_mst
				where
					mentor_name = '문자영');


select 
	student_id,
    student_name,
    mentor_id,
    (select
		mentor_name
     from
		mentor_mst
     where 
		mentor_id = student_mst.mentor_id) as mentor_name
from
	student_mst;
    
     
/*그룹으로 묶어서 조회하기 */
select 
	count(mentor_id),
    min(student_id),
    max(student_id),
    avg(student_id),
    sum(student_id),
    mentor_id
from
	student_mst
group by
	mentor_id ;
    
/*중복 제거*/
select distinct
	mentor_id
from
	student_mst;
    
/* 그룹으로 조회한 결과에 조건주는 방법*/                                                                                                                                                                                                          
select 
	count(mentor_id) as mentor_count,
    min(student_id) as mentor_min,
    max(student_id) as mentor_max,
    avg(student_id) as mentor_avg,
    sum(student_id),
    mentor_id
from
	student_mst
group by
	mentor_id 
having
	mentor_count =5; #그룹으로 묶고난뒤에 조건 mentor_count가 5인것만 출력
    
    /* 정렬 */
select
	*
from
	student_mst
order by
	mentor_id desc, #기본으론 오름차순 desc는 내림차순
	student_id desc;

/*전체 조합 실습*/

select
	count(*) as student_count,
    mentor_id
from
	student_mst
where
	student_id>2
group by
	mentor_id
having
	student_count =1
order by
	mentor_id desc;
    
/* ===================< select insert>=========================*/
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
    
 select * from  publisher_mst;

/*============================<< select updata>>====================*/
update library_mst as lm
set lm.저작자 = (select am.author_id from	author_mst am where	am.author_name = lm.저작자);
select
	*
from
	library_mst;


  
 update library_mst,author_mst
set
	저작자 = author_id
where
	저작자 = author_name;
    
update library_mst,publisher_mst
set
	출판사 = publisher_id
where
	출판사 = publisher_name;
select
*
from
	library_mst lm
    left outer join author_mst am on(am.author_id = lm.저작자)
    left outer join publisher_mst pm on (pm.publisher_id = lm.출판사)
    order by
    am.author_id;
/*======================================================================================<*/
set profiling = 1;
set profiling_history_size = 30;

select
	도서관명,
	도서명
from
	library_mst
where
	저작자  = (select author_id from author_mst where author_name like '%김주%');
    
select
	도서관명,
	도서명
from
	library_mst lm
    left outer join author_mst am on(am.author_id = lm.저작자)
where
	am.author_name like '%김주%';

	











