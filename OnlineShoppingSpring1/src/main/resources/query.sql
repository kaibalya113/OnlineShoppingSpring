create table catagory(
	id integer,
	name varchar(20),
	description varchar(50),
	imageURL varchar(50),
	active boolean,
	
	constraint pk_catagory_id primary key (id) 
	);