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

INSERT INTO offers (uuid,fuel_tank_volume, price_per_day, seats_count, year, model_id, coupe_type, description, engine, image_url, transmission, mileage, deposit, location)
VALUES('b72e6550-e365-43bf-aab2-b57cafc2db7c',50,55,5,2007,1,1,'A sample description', 'GASOLINE','https://t.ly/5_mxz',1 , 10000, 100, 'Dobrich' ),
      ('b72e6550-e365-43bf-aab2-b57cafc2db71',70,100,4,2012,3,2,'A sample description2', 'HYBRID','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',2 , 10000, 900,'Varna' ),
      ('b72e6550-e365-43bf-aab2-b57cafc2db72',30,200,4,2012,3,3,'A sample description3', 'GASOLINE','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 20000, 800 , 'Burgas'),
      ('b72e6550-e365-43bf-aab2-b57cafc2db73',40,300,4,2012,4,4,'A sample description4', 'DIESEL','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 30000, 700 , 'Ruse'),
      ('b72e6550-e365-43bf-aab2-b57cafc2db74',60,400,5,2012,5,5,'A sample description5', 'Electricity','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 40000, 500 , 'Vratsa'),
      ('b72e6550-e365-43bf-aab2-b57cafc2db75',10,500,6,2012,6,6,'A sample description6', 'GASOLINE','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 50000, 700 , 'Sofia'),
      ('b72e6550-e365-43bf-aab2-b57cafc2db76',40,600,2,2012,7,6,'A sample description7', 'Electricity','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 60000, 400 , 'Pazardzhik'),
      ('b72e6550-e365-43bf-aab2-b57cafc2db77',70,700,5,2012,8,2,'A sample description8', 'HYBRID','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 70000, 100 , 'Vidin'),
      ('b72e6550-e365-43bf-aab2-b57cafc2db78',120,700,4,2012,8,1,'A sample description9', 'Electricity','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 80000, 300 , 'Montana'),
      ('b72e6550-e365-43bf-aab2-b57cafc2db79',20,20,5,2012,9,5,'A sample description10', 'GASOLINE','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 90000, 10, 'Shumen'),
      ('b72e6550-e365-43bf-aab2-b57cafc2db80',40,1,5,2012,1,3,'A sample description11', 'DIESEL','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 100000, 1001 , 'Pernik'),
      ('b72e6550-e365-43bf-aab2-b57cafc2db81',74,10,4,2012,2,4,'A sample description12', 'GASOLINE','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 10001, 1002,'Blagoevgrad'),
      ('b72e6550-e365-43bf-aab2-b57cafc2db82',17,123,3,2012,3,4,'A sample description13', 'HYBRID','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 10002, 1020, 'Pleven' ),
      ('b72e6550-e365-43bf-aab2-b57cafc2db83',47,231,4,2012,10,1,'A sample description214', 'GASOLINE','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYfvLy3KQKbQLqY7kz35liCJVTJA4s9y3Z_A&usqp=CAU',1 , 10003,  1030 , 'Haskovo');
