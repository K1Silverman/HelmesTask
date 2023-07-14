-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-06-22 08:52:14.612

-- tables
-- Table: form
CREATE TABLE form (
    id serial  NOT NULL,
    name varchar(100)  NOT NULL,
    terms boolean  NOT NULL,
    CONSTRAINT form_pk PRIMARY KEY (id)
);

-- Table: selected_sectors
CREATE TABLE selected_sectors (
    id serial  NOT NULL,
    form_id int  NOT NULL,
    sector_id int  NOT NULL,
    CONSTRAINT selected_sectors_pk PRIMARY KEY (id)
);

-- Table: sectors
CREATE TABLE sectors (
    id int  NOT NULL,
    sectorName varchar(100) NOT NULL,
    parent_id int,
    level int,
    CONSTRAINT sectors_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: selected_sectors_form (table: selected_sectors)
ALTER TABLE selected_sectors ADD CONSTRAINT selected_sectors_form
    FOREIGN KEY (form_id)
    REFERENCES form (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: selected_sectors_form (table: selecte_sectors)
ALTER TABLE selected_sectors ADD CONSTRAINT selected_sectors_form2
    FOREIGN KEY (sector_id)
    REFERENCES sectors (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

