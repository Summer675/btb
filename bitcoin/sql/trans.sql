SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `trans`;
CREATE TABLE `trans`
(
    `TxId` int(11) NOT NULL ,
    `BlkId`        char(64),
    `TxHash`        char(64),
    `Version`        int(11),
    `InputCount`      bigint(20),
    `OutputCount`        bigint(20),
    `TotalOutAmount`        bigint(20),
    `TotalInAmount`        bigint(20),
    `TransFee`        bigint(20),
    `IsCoinbase`        bit(1),
    `IsHeightLock`        bit(1),
    `IsTimeLock`        bit(1),
    `LockTimeValue`        int(11),
    PRIMARY KEY (`TxId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  auto_increment = 1;
