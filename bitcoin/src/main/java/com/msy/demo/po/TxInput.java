package com.msy.demo.po;

public class TxInput {
    private Integer idx;

    private Integer txid;

    private Long amount;

    private String prevouttxid;

    private Integer prevoutindex;

    private Integer paymentscriptlen;

    private String paymentscript;

    private String address;

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

    public String getPrevouttxid() {
        return prevouttxid;
    }

    public void setPrevouttxid(String prevouttxid) {
        this.prevouttxid = prevouttxid == null ? null : prevouttxid.trim();
    }

    public Integer getPrevoutindex() {
        return prevoutindex;
    }

    public void setPrevoutindex(Integer prevoutindex) {
        this.prevoutindex = prevoutindex;
    }

    public Integer getPaymentscriptlen() {
        return paymentscriptlen;
    }

    public void setPaymentscriptlen(Integer paymentscriptlen) {
        this.paymentscriptlen = paymentscriptlen;
    }

    public String getPaymentscript() {
        return paymentscript;
    }

    public void setPaymentscript(String paymentscript) {
        this.paymentscript = paymentscript == null ? null : paymentscript.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}