INSERT INTO brands (id, name)
VALUES (1, 'Ford'),
       (2, 'Toyota');

INSERT INTO models(brand_id,name)
VALUES (1,'Focus');

INSERT INTO users (email, password, first_name, last_name, is_active)
VALUES ( 'mario.stefanov14@gmail.com' ,'014c41dc0e1f7e5ffe8d705d4fb21915129d034fdeffea003f81a15d6ac2dc9cead142e28b74d9eb', 'Mario', 'Stefanov', 1);

INSERT INTO offers (doors_count, fuel_tank_volume, price_per_day, seats_count, year, model_id, category, description, engine, image_url, transmission, mileage, deposit)
VALUES(5,50,55,5,2007,1,1,'A sample description', 3,'https://t.ly/5_mxz',1 , 10000, 100 );