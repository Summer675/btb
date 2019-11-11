package com.msy.demo.po;

import java.util.Date;

public class Block {
    private String blkid;

    private Integer height;

    private Integer txcount;

    private Integer size;

    private String preid;

    private Date timestamp;

    private Long nonce;

    private Integer difficulty;

    private String bits;

    private Integer version;

    private String txmerkleroot;

    public String getBlkid() {
        return blkid;
    }

    public void setBlkid(String blkid) {
        this.blkid = blkid == null ? null : blkid.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getTxcount() {
        return txcount;
    }

    public void setTxcount(Integer txcount) {
        this.txcount = txcount;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getPreid() {
        return preid;
    }

    public void setPreid(String preid) {
        this.preid = preid == null ? null : preid.trim();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Long getNonce() {
        return nonce;
    }

    public void setNonce(Long nonce) {
        this.nonce = nonce;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits == null ? null : bits.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getTxmerkleroot() {
        return txmerkleroot;
    }

    public void setTxmerkleroot(String txmerkleroot) {
        this.txmerkleroot = txmerkleroot == null ? null : txmerkleroot.trim();
    }
}