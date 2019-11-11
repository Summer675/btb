SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for knowledge
-- ----------------------------
DROP TABLE IF EXISTS `block`;
CREATE TABLE `block`
(
    `Height` int(11) NOT NULL ,
    `BlkId`        char (64),
    `TxCount`        int (11),
    `Size`           int(11)  ,
    `PreId`        char (64),
    `Timestamp`      datetime,
    `Nonce`        bigint(20),
    `Difficulty`        int (11),
    `Bits`           char (64),
    `Version`        int (11),
    `TxMerkleRoot`      char(64),
      PRIMARY KEY (`BlkId`),

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  auto_increment = 1;
