CREATE TABLE diagnosis
(
    id     UUID NOT NULL,
    name   VARCHAR(255),
    pet_id UUID,
    date      VARCHAR(255),
    treatment VARCHAR(255),
    CONSTRAINT pk_diagnosis PRIMARY KEY (id)
);

CREATE TABLE pet
(
    id   UUID NOT NULL,
    name VARCHAR(255),
    age   INT  NOT NULL,
    breed VARCHAR(255),
    CONSTRAINT pk_pet PRIMARY KEY (id)
);

ALTER TABLE diagnosis
    ADD CONSTRAINT FK_DIAGNOSIS_ON_PET FOREIGN KEY (pet_id) REFERENCES pet (id);