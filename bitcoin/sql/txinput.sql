SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `txinput`;
CREATE TABLE `txinput`
(
    `TxId`  int(11) NOT NULL,
    `Idx`      int(11) NOT NULL,
    `Amount`         bigint(20),
    `PrevOutTxId`   char (64),
    `PrevOutIndex`  int(11),
    `PaymentScriptLen`  int(11),
    `PaymentScript`   varchar (8000),
    `Address` char (58),
    PRIMARY KEY (`Idx`)

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 auto_increment=1;
