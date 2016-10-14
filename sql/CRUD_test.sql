-- sql(CRUD) test

-- insert
insert
	into guestbook
	values( guestbook_seq.nextval,'박주한','dndhk159',sysdate,'아야어여오요우유으이');
commit;

insert
	into guestbook
	values( guestbook_seq.nextval,'마이콜','1234',sysdate,'아야어여오요우유으이');
commit;

-- delete
delete
	from guestbook where no = 2 and password = '1234';

-- select
select no, name, content, password, to_char(reg_date, 'yyyy-mm-dd hh:mi:ss')
	from guestbook
order by no desc;

-- update

-- delete

