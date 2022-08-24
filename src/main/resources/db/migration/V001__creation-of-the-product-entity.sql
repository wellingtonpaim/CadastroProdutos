CREATE TABLE `product-registration`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(65) NOT NULL,
  `description` VARCHAR(355) NULL,
  `quantity` VARCHAR(45) NULL,
  `price` FLOAT NOT NULL,
  PRIMARY KEY (`id`));