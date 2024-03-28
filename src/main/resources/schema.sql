CREATE TABLE Product (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    description TEXT,
    price DOUBLE,
    categoryId INTEGER
);

CREATE TABLE Category (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    description TEXT,
    productId INTEGER,
    FOREIGN KEY (productId) REFERENCES Product(id)
);
