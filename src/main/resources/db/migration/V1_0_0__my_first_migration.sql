<!-- https://erd.dbdesigner.net/designer/schema/1708369628-animalmanager -->

CREATE TABLE `animal` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` varchar(50) NOT NULL,
	`species_id` INT NOT NULL,
	`race_id` INT NOT NULL,
	`genre` varchar(20) NOT NULL,
	`description` varchar(300),
	`is_adopted` bool NOT NULL,
	`adopter_id` INT NOT NULL,
	`is_sterilized` BOOLEAN NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `species` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`denomination` varchar(100) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `race` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`species_id` INT NOT NULL,
	`denomination` varchar(100) NOT NULL,
	PRIMARY KEY (`id`,`species_id`)
);

CREATE TABLE `flyway_schema_history` (
	`installed_rank` INT NOT NULL AUTO_INCREMENT,
	`version` varchar(50),
	`description` varchar(200) NOT NULL,
	`type` varchar(20) NOT NULL,
	`script` varchar(1000) NOT NULL,
	`checksum` INT,
	`installed_by` varchar(100) NOT NULL,
	`installed_on` TIMESTAMP,
	`execution_time` INT NOT NULL,
	`success` tinyint(1) NOT NULL,
	PRIMARY KEY (`installed_rank`)
);

CREATE TABLE `adopter` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` varchar(90) NOT NULL,
	`surname_1` varchar(90) NOT NULL,
	`surname_2` varchar(90),
	`phone_1` varchar(12) NOT NULL,
	`phone_2` varchar(12),
	`birth_date` DATE,
	`id_number` varchar(9) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `veterinarian_visit` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`animal_id` INT,
	`title` INT,
	`description` INT NOT NULL,
	`total_amount` INT NOT NULL,
	`visit_date` DATE,
	PRIMARY KEY (`id`)
);

ALTER TABLE `animal` ADD CONSTRAINT `animal_fk0` FOREIGN KEY (`species_id`) REFERENCES `species`(`id`);

ALTER TABLE `animal` ADD CONSTRAINT `animal_fk1` FOREIGN KEY (`race_id`) REFERENCES `race`(`id`);

ALTER TABLE `animal` ADD CONSTRAINT `animal_fk2` FOREIGN KEY (`adopter_id`) REFERENCES `adopter`(`id`);

ALTER TABLE `race` ADD CONSTRAINT `race_fk0` FOREIGN KEY (`species_id`) REFERENCES `species`(`id`);

ALTER TABLE `veterinarian_visit` ADD CONSTRAINT `veterinarian_visit_fk0` FOREIGN KEY (`animal_id`) REFERENCES `animal`(`id`);

