package com.cg.gateway.model;

import org.springframework.data.annotation.Id;

public class Payment {
	
	@Id
	private String transactionId;
	private String cardNumber;
	private String cardType;
	private String bankName;
	private double amount;
	private String description;
	private String paymentDate;
	private int id;
	private String packagename;
	
	public Payment() {
		super();
	}

	public Payment(String transactionId, String cardNumber, String cardType, String bankName, double amount,
			String description, String paymentDate, int id, String packagename) {
		super();
		this.transactionId = transactionId;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.bankName = bankName;
		this.amount = amount;
		this.description = description;
		this.paymentDate = paymentDate;
		this.id = id;
		this.packagename = packagename;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPackagename() {
		return packagename;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}

	@Override
	public String toString() {
		return "Payment [transactionId=" + transactionId + ", cardNumber=" + cardNumber + ", cardType=" + cardType
				+ ", bankName=" + bankName + ", amount=" + amount + ", description=" + description + ", paymentDate="
				+ paymentDate + ", id=" + id + ", packagename=" + packagename + "]";
	}
}

