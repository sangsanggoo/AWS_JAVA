select * from library_mst lm;
select
	순번,
    도서관명,
    구분,
    도서명,
    저작자,
    (select author_name from author_mst where 저작자 = author_id) as 저작자명,
    출판사,
    (select publisher_name from publisher_mst where 출판사 = publisher_id) as 출판사명,
    (select publisher_year from publisher_mst where 출판사 = publisher_id) as 출판사설립일,
    발행연도,
    청구기호
from library_mst; 

/*=========================================================================*/

insert into library_mst
values(0,'테스트도서관','999(테스트)','테스트도서명',9999,9999,'2023','99.99');

select
	lm.순번,
    lm.도서관명,
    lm.구분,
    lm.도서명,
    lm.출판사,
    pm.publisher_name,
    pm.publisher_year
from
	library_mst lm
    left outer join publisher_mst pm on(pm.publisher_id = lm.출판사) 
    # inner join은 A테이블과 B테이블에 둘다 있는 경우만 합쳐줌 on의 조건이 맞는것중      
    # left outer join은 A에다가 B를 붙이는데 A에만 있고 B에는 없어도 출력이 되고 B에는 null값이 적힘
    # 그래서 where 조건에 b값이 null인것을 출력 시키면 A에만 있고 B에는 없는값만 출력이 됨
where
	pm.publisher_id is null
order by
	lm.순번 desc;