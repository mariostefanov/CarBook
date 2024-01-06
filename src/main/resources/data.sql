INSERT INTO brands (id, name)
VALUES (1, 'Ford'),
       (2, 'Toyota'),
       (3,'BMW'),
       (4,'Audi')
;

INSERT INTO models(id,brand_id,name)
VALUES (1,1,'Focus'),
       (2,3,'X5'),
       (3,3, 'M5'),
       (4,2, 'Yaris'),
       (5, 1,'Mondeo'),
       (6, 1,'Escord'),
       (7, 3,'3 series'),
       (8, 3,'X7'),
       (9, 2,'Corolla'),
       (10, 4,'A6')
;

INSERT INTO users (email, password, first_name, last_name, is_active)
VALUES ( 'mario.stefanov14@gmail.com' ,'014c41dc0e1f7e5ffe8d705d4fb21915129d034fdeffea003f81a15d6ac2dc9cead142e28b74d9eb', 'Mario', 'Stefanov', 1);

INSERT INTO offers (fuel_tank_volume, price_per_day, seats_count, year, model_id, coupe_type, description, engine, image_url, transmission, mileage, deposit)
VALUES(50,55,5,2007,1,1,'A sample description', 'GASOLINE','https://t.ly/5_mxz',1 , 10000, 100 ),
      (70,100,4,2012,3,2,'A sample description2', 'DIESEL','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 10000, 100 );