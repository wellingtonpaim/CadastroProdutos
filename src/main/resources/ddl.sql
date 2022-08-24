create table family (id bigint not null auto_increment, name varchar(255) not null, primary key (id)) engine=MyISAM;
create table product (id bigint not null auto_increment, description varchar(255), name varchar(255) not null, price decimal(19,2) not null, quantity bigint, registration_date datetime not null, update_date datetime not null, family_id bigint not null, primary key (id)) engine=MyISAM;
alter table product add constraint FKensx2bfyl4ic169gtgi8iqcre foreign key (family_id) references family (id);
