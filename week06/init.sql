create table user
(
id bigint AUTO_INCREMENT,
user_name varchar(16),
user_address varchar(16),
PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table product
(
id bigint AUTO_INCREMENT,
product_name varchar(16),
product_price float,
PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table order
(
id bigint AUTO_INCREMENT,
user_id bigint ,
product_id bigint,
PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE order(
   `id` int(11) NOT NULL AUTO_INCREMENT,  
   `user_id` int(11) ,
   `product_id` int(11) ,
   PRIMARY KEY (`id`)  
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8; 
