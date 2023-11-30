CREATE TABLE `produit`.`produits` (
    `id` INT NOT NULL ,
    `nom` VARCHAR NOT NULL ,
    `EstDispo` BOOLEAN NOT NULL ,
    `peremption` DATE NOT NULL ,
    PRIMARY KEY (`id`))

INSERT INTO produits (id, nom, EstDispo, peremption)
VALUES
(1,'tomates', true, '2023-12-30'),
(2, 'yaourt', false, '2024-01-15'),
(3, 'saucisson', true, '2024-05-27'),
(4, 'lait frais', true, '2025-02-28') ;