package com.msy.demo.po;

public class TxOutput {
    private Integer idx;

    private Integer txid;

    private Long amount;

    private Integer scriptpubkeylen;

    private String scriptpubkey;

    private String address;

    private Boolean isunspendable;

    private Boolean ispaytoscripthash;

    private Boolean isvalid;

    private byte[] isspent;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getTxid() {
        return txid;
    }

    public void setTxid(Integer txid) {
        this.txid = txid;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Integer getScriptpubkeylen() {
        return scriptpubkeylen;
    }

    public void setScriptpubkeylen(Integer scriptpubkeylen) {
        this.scriptpubkeylen = scriptpubkeylen;
    }

    public String getScriptpubkey() {
        return scriptpubkey;
    }

    public void setScriptpubkey(String scriptpubkey) {
        this.scriptpubkey = scriptpubkey == null ? null : scriptpubkey.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getIsunspendable() {
        return isunspendable;
    }

    public void setIsunspendable(Boolean isunspendable) {
        this.isunspendable = isunspendable;
    }

    public Boolean getIspaytoscripthash() {
        return ispaytoscripthash;
    }

    public void setIspaytoscripthash(Boolean ispaytoscripthash) {
        this.ispaytoscripthash = ispaytoscripthash;
    }

    public Boolean getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Boolean isvalid) {
        this.isvalid = isvalid;
    }

    public byte[] getIsspent() {
        return isspent;
    }

    public void setIsspent(byte[] isspent) {
        this.isspent = isspent;
    }
}