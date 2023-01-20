
/*DML 
C : insert / into
R : select / from
U : update / set
D : delete / from
​
​=======================<< insert >>===========================*/
select * from student_mst;
insert into 
	`db_study2_explain`.`student_mst`
    (`student_id`, `student_name` ) # 같은 데이터베이스를 사용할때는 '생략이 가능한데 다른 데이터베이스를 사용할경우에는 써줘야함
values (4 , '손지호'); # 위에 적혀잇는 순서대로 넣어짐 null이 허용될 경우에는 insert into에서 생략하고 values에서도 생략 가능

select * from student_mst;
# insert into
	 #student_mst(student_id , student_name) #이렇게 하면 내가 원하는 값만 넣을수 있고 null값은 안적어줘도 되기때문에 편함
insert into	student_mst
	(student_id, 	student_name,	mentor_id)
    values
	( 5, 			'손지호',			10),
	( 6, 			'김준경',			10),
	( 7, 			'이현수',			10),
	( 8, 			'정의현',			10);
	select * from student_mst;
insert into university_mst
	(university_id,	university_name)
    values
    (4,					'부산대'),
    (5,					'창원대'),
    (6,					'부경대'),
    (7,					'동명대'),
    (8,					'동의대'),
    (9,					'동아대');
select * from university_mst;

/* ======================<< updatae>> =========================*/
update student_mst
set
	student_name = '김재영',
	mentor_id = 15
where
	student_id =5; # where(조건) student_id가 5인것을 mentor_id를 15, student_name을 김재영으로 바꿔라
select * from student_mst;

/*멘토 아이디가 10인 학생들의 멘토 아이디를 1로 바꿔라*/
update student_mst
set
	mentor_id = 1
where
	mentor_id= 10;
select * from student_mst;

/*=================================<< delect >>==========================*/
delete from student_mst where mentor_id = 15 and student_name = '김재영';
select * from student_mst;
delete from student_mst where  student_name = '손지호';
select * from student_mst;