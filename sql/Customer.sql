create  table core.customer(
id serial primary key,
name varchar not null

)

insert into core.customer (name)
values
('Marsh');

select * from core.customer c;