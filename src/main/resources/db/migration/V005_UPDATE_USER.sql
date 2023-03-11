ALTER TABLE `tab_user`  ADD  `salt` VARCHAR(8);

ALTER TABLE `tab_user` MODIFY COLUMN `password` VARCHAR(128);

