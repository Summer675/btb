SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `txoutput`;
CREATE TABLE `txoutput`
(
    `TxId`  int(11) NOT NULL,
    `Idx`      int(11) NOT NULL,
    `Amount`         bigint(20),
    `ScriptPubKeyLen`   int (11),
    `ScriptPubKey`  varchar (8000),
    `Address` char (58),
    `IsUnspendable`        bit(1),
    `IsPayToScriptHash`        bit(1),
    `IsValid`        bit(1),
    `IsSpent`        bit(11),
    PRIMARY KEY (`Idx`),

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 auto_increment=1;
