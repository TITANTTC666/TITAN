package io.titan.modules.core.entity;

import java.io.Serializable;
import java.util.Date;

public class Transactions implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.id
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.transaction_id
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private String transactionId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.status
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.contract
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private String contract;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.sender
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private String sender;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.recipient
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private String recipient;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.amount
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private Long amount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.nonce
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private String nonce;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.gas
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private Long gas;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.block_id
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private String blockId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.block_number
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private Long blockNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.block_time
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private Date blockTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column transactions.input_data
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private String inputData;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.id
	 * @return  the value of transactions.id
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.id
	 * @param id  the value for transactions.id
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.transaction_id
	 * @return  the value of transactions.transaction_id
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.transaction_id
	 * @param transactionId  the value for transactions.transaction_id
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.status
	 * @return  the value of transactions.status
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.status
	 * @param status  the value for transactions.status
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.contract
	 * @return  the value of transactions.contract
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public String getContract() {
		return contract;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.contract
	 * @param contract  the value for transactions.contract
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setContract(String contract) {
		this.contract = contract;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.sender
	 * @return  the value of transactions.sender
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public String getSender() {
		return sender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.sender
	 * @param sender  the value for transactions.sender
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.recipient
	 * @return  the value of transactions.recipient
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public String getRecipient() {
		return recipient;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.recipient
	 * @param recipient  the value for transactions.recipient
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.amount
	 * @return  the value of transactions.amount
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.amount
	 * @param amount  the value for transactions.amount
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.nonce
	 * @return  the value of transactions.nonce
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public String getNonce() {
		return nonce;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.nonce
	 * @param nonce  the value for transactions.nonce
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.gas
	 * @return  the value of transactions.gas
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public Long getGas() {
		return gas;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.gas
	 * @param gas  the value for transactions.gas
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setGas(Long gas) {
		this.gas = gas;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.block_id
	 * @return  the value of transactions.block_id
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public String getBlockId() {
		return blockId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.block_id
	 * @param blockId  the value for transactions.block_id
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.block_number
	 * @return  the value of transactions.block_number
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public Long getBlockNumber() {
		return blockNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.block_number
	 * @param blockNumber  the value for transactions.block_number
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setBlockNumber(Long blockNumber) {
		this.blockNumber = blockNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.block_time
	 * @return  the value of transactions.block_time
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public Date getBlockTime() {
		return blockTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.block_time
	 * @param blockTime  the value for transactions.block_time
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setBlockTime(Date blockTime) {
		this.blockTime = blockTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column transactions.input_data
	 * @return  the value of transactions.input_data
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public String getInputData() {
		return inputData;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column transactions.input_data
	 * @param inputData  the value for transactions.input_data
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	public void setInputData(String inputData) {
		this.inputData = inputData;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table transactions
	 * @mbg.generated  Sat Jun 13 15:30:16 CST 2020
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", transactionId=").append(transactionId);
		sb.append(", status=").append(status);
		sb.append(", contract=").append(contract);
		sb.append(", sender=").append(sender);
		sb.append(", recipient=").append(recipient);
		sb.append(", amount=").append(amount);
		sb.append(", nonce=").append(nonce);
		sb.append(", gas=").append(gas);
		sb.append(", blockId=").append(blockId);
		sb.append(", blockNumber=").append(blockNumber);
		sb.append(", blockTime=").append(blockTime);
		sb.append(", inputData=").append(inputData);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}