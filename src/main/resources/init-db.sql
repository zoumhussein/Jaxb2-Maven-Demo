SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `abiyan` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `abiyan` ;

-- -----------------------------------------------------
-- Table `abiyan`.`Tag`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `abiyan`.`Tag` (
  `name` VARCHAR(45) NOT NULL ,
  `latitude` VARCHAR(45) NOT NULL ,
  `longitude` VARCHAR(45) NOT NULL ,
  `creationDate` VARCHAR(45) NULL ,
  `lastUpdate` VARCHAR(45) NULL ,
  `phone` VARCHAR(45) NULL ,
  PRIMARY KEY (`name`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `abiyan`.`Vote`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `abiyan`.`Vote` (
  `plus` INT NULL ,
  `minus` INT NULL ,
  `tag` VARCHAR(45) NULL ,
  `id` INT NOT NULL ,
  INDEX `fk_Vote_Tag` (`tag` ASC) ,
  PRIMARY KEY (`id`) ,
  CONSTRAINT `fk_Vote_Tag`
    FOREIGN KEY (`tag` )
    REFERENCES `abiyan`.`Tag` (`name` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `abiyan`.`Item`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `abiyan`.`Item` (
  `category` VARCHAR(45) NOT NULL ,
  `type` VARCHAR(45) NOT NULL ,
  `price` VARCHAR(45) NULL ,
  `creationDate` VARCHAR(45) NULL ,
  `lastUpdate` VARCHAR(45) NULL ,
  `numberInStock` VARCHAR(45) NULL ,
  `tag` VARCHAR(45) NULL ,
  `id` INT NOT NULL ,
  INDEX `fk_Item_Tag1` (`tag` ASC) ,
  PRIMARY KEY (`id`) ,
  CONSTRAINT `fk_Item_Tag1`
    FOREIGN KEY (`tag` )
    REFERENCES `abiyan`.`Tag` (`name` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
