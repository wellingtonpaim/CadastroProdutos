ALTER TABLE `product-registration`.`product` 
ADD COLUMN `registration_date` DATETIME NOT NULL AFTER `family_id`,
ADD COLUMN `update_date` DATETIME NOT NULL AFTER `registration_date`;
