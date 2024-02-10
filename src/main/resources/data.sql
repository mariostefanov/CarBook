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

INSERT INTO offers (fuel_tank_volume, price_per_day, seats_count, year, model_id, coupe_type, description, engine, image_url, transmission, mileage, deposit)
VALUES(50,55,5,2007,1,1,'A sample description', 'GASOLINE','https://t.ly/5_mxz',1 , 10000, 100 ),
      (70,100,4,2012,3,2,'A sample description2', 'HYBRID','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',2 , 10000, 900 ),
      (30,200,4,2012,3,2,'A sample description3', 'GASOLINE','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 20000, 800 ),
      (40,300,4,2012,4,2,'A sample description4', 'DIESEL','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 30000, 700 ),
      (60,400,5,2012,5,2,'A sample description5', 'Electricity','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 40000, 500 ),
      (10,500,6,2012,6,2,'A sample description6', 'GASOLINE','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 50000, 700 ),
      (40,600,2,2012,7,2,'A sample description7', 'Electricity','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 60000, 400 ),
      (70,700,5,2012,8,2,'A sample description8', 'HYBRID','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 70000, 100 ),
      (120,700,4,2012,8,2,'A sample description9', 'Electricity','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 80000, 300 ),
      (20,20,5,2012,9,2,'A sample description10', 'GASOLINE','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 90000, 10 ),
      (40,1,5,2012,1,2,'A sample description11', 'DIESEL','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 100000, 1001 ),
      (74,10,4,2012,2,2,'A sample description12', 'GASOLINE','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 10001, 1002 ),
      (17,123,3,2012,3,2,'A sample description13', 'HYBRID','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 10002, 1020 ),
      (47,231,4,2012,10,2,'A sample description214', 'GASOLINE','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 10003,  1030 );
