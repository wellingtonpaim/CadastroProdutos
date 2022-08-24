ALTER TABLE `product-registration`.`product` 
ADD INDEX `fk_product_family_idx` (`family_id` ASC) VISIBLE;
;
ALTER TABLE `product-registration`.`product` 
ADD CONSTRAINT `fk_product_family`
  FOREIGN KEY (`family_id`)
  REFERENCES `product-registration`.`family` (`id`)
  ON DELETE RESTRICT
  ON UPDATE RESTRICT;
