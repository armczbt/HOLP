CREATE TABLE ad (
    id INT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(255),
    title VARCHAR(255),
    description TEXT,
    ad_when VARCHAR(255),
    ad_where VARCHAR(255),
    idCreator INT,
    creation_date DATETIME,
    validated BOOLEAN,
    FOREIGN KEY (idCreator) REFERENCES user(id)
);
