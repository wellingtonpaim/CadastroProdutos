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

INSERT INTO `product-registration`.`product` (`id`, `name`, `description`, `quantity`, `price`, `family_id`, `registration_date`, `update_date`) VALUES ('1', 'Furadeira Makita', 'Furadeira de impacto Makita 3/8\"', '', '899.70', '1', utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (`id`, `name`, `description`, `quantity`, `price`, `family_id`, `registration_date`, `update_date`) VALUES ('2', 'Furadeira DeWalt', 'Furadeira de impacto DeWalt 3/8\"', '', '1230.50', '1', utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (`id`, `name`, `description`, `quantity`, `price`, `family_id`, `registration_date`, `update_date`) VALUES ('3', 'Betoneira SuperTank', 'Betoneira com motor 1/2 HP SuperTank', '', '2540.99', '2', utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (`id`, `name`, `description`, `quantity`, `price`, `family_id`, `registration_date`, `update_date`) VALUES ('4', 'Betoneira Betontest', 'Betoneira com motor 1 HP Betontest', '', '3800.78', '2', utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (`id`, `name`, `description`, `quantity`, `price`, `family_id`, `registration_date`, `update_date`) VALUES ('5', 'Serra Bosh', 'Serra circular Bosh', '', '479.89', '3', utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (`id`, `name`, `description`, `quantity`, `price`, `family_id`, `registration_date`, `update_date`) VALUES ('6', 'Serra Makita', 'Serra circular Makita', '', '679.80', '3', utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (`id`, `name`, `description`, `quantity`, `price`, `family_id`, `registration_date`, `update_date`) VALUES ('7', 'Maquina SoldaMais', 'Estação de solda Profissional Soldamais', '', '934.50', '4', utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (`id`, `name`, `description`, `quantity`, `price`, `family_id`, `registration_date`, `update_date`) VALUES ('8', 'Alicate Corte Stanley', 'Alicate de corte diagonal Stanley', '', '45.99', '5', utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (`id`, `name`, `description`, `quantity`, `price`, `family_id`, `registration_date`, `update_date`) VALUES ('9', 'Alicate Pressão Tramontina', 'Alicante de pressão 3/8\" Tramontina', '', '76.50', '5', utc_timestamp, utc_timestamp);
INSERT INTO `product-registration`.`product` (`id`, `name`, `description`, `quantity`, `price`, `family_id`, `registration_date`, `update_date`) VALUES ('10', 'Nivel Laser TopStill', 'Nivel a laser com 8 funções TopStill', '', '699.38', utc_timestamp, utc_timestamp);

