CREATE TABLE personen (
	  id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	  vorname VARCHAR(45),
	  nachname VARCHAR(45),
	  geburtsjahr INT,
	  CONSTRAINT pk_id PRIMARY KEY (id) )
