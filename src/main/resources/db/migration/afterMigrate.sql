set foreign_key_checks = 0;

delete from product;
delete from family;

set foreign_key_checks = 1;

alter table product auto_increment = 1;
alter table family auto_increment = 1;

INSERT INTO `product-registration`.`family` (`id`, `name`) VALUES ('1', 'Furadeiras');
INSERT INTO `product-registration`.`family` (`id`, `name`) VALUES ('2', 'Betoneiras');
INSERT INTO `product-registration`.`family` (`id`, `name`) VALUES ('3', 'Serras Circulares');
INSERT INTO `product-registration`.`family` (`id`, `name`) VALUES ('4', 'Maquinas de Solda');
INSERT INTO `product-registration`.`family` (`id`, `name`) VALUES ('5', 'Alicates');
INSERT INTO `product-registration`.`family` (`id`, `name`) VALUES ('6', 'Ferramentas Especiais');

INSERT INTO `product-registration`.`product` (id, name, description, price, family_id, registration_date, update_date) VALUES (1, 'Furadeira Makita', 'Furadeira de impacto Makita ', 899.70, 1, utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (id, name, description, price, family_id, registration_date, update_date) VALUES (2, 'Furadeira Bosh', 'Furadeira de impacto Bosh ', 1300.50, 1, utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (id, name, description, price, family_id, registration_date, update_date) VALUES (3, 'Betoneira Betontest', 'Betoneira com motor 1 HP Betontest', 2800.90, 2, utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (id, name, description, price, family_id, registration_date, update_date) VALUES (4, 'Betoneira SuperMix', 'Betoneira com motor 1/2 HP SuperMix', 3230.99, 2, utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (id, name, description, price, family_id, registration_date, update_date) VALUES (5, 'Serra Bosh', 'Serra de corte Bosh', 199.60, 3, utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (id, name, description, price, family_id, registration_date, update_date) VALUES (6, 'Serra Makita', 'Serra esmiriladeira Makita', 230.99, 3, utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (id, name, description, price, family_id, registration_date, update_date) VALUES (7, 'Maquina Soldar Fujitso', 'Maquina de solda Fujitso 220V', 1140.30, 4, utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (id, name, description, price, family_id, registration_date, update_date) VALUES (8, 'Soldadora SoldMais', 'Maquina de solda SoldMais 220V', 950.10, 4, utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (id, name, description, price, family_id, registration_date, update_date) VALUES (9, 'Alicate Corte Stanley', 'Alicate corte diagona Stanley', 45.70, 5, utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (id, name, description, price, family_id, registration_date, update_date) VALUES (10, 'Alicate Pressão Tramontina', 'Alicate Pressão Tramontina de aço galvanizado', 79.90, 5, utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (id, name, description, price, family_id, registration_date, update_date) VALUES (11, 'Nivel Laser Bosh', 'Nivel laser Bosh 12 funções', 548.40, 6, utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (id, name, description, price, family_id, registration_date, update_date) VALUES (12, 'Trena Laser Bosh', 'Trena laser Bosh com bateria reserva', 769.30, 6, utc_timestamp, utc_timestamp);
