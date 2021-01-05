package io.titan.modules.core.entity;

import java.io.Serializable;
import java.util.Date;

public class Blocks implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blocks.block_number
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	private Long blockNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blocks.block_hash
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	private String blockHash;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blocks.previous_block_hash
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	private String previousBlockHash;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blocks.transaction_number
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	private Integer transactionNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blocks.extra
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	private String extra;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blocks.transaction_root
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	private String transactionRoot;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blocks.generated_by
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	private String generatedBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column blocks.generated_date
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	private Date generatedDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blocks.block_number
	 * @return  the value of blocks.block_number
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public Long getBlockNumber() {
		return blockNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blocks.block_number
	 * @param blockNumber  the value for blocks.block_number
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public void setBlockNumber(Long blockNumber) {
		this.blockNumber = blockNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blocks.block_hash
	 * @return  the value of blocks.block_hash
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public String getBlockHash() {
		return blockHash;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blocks.block_hash
	 * @param blockHash  the value for blocks.block_hash
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public void setBlockHash(String blockHash) {
		this.blockHash = blockHash;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blocks.previous_block_hash
	 * @return  the value of blocks.previous_block_hash
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public String getPreviousBlockHash() {
		return previousBlockHash;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blocks.previous_block_hash
	 * @param previousBlockHash  the value for blocks.previous_block_hash
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public void setPreviousBlockHash(String previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blocks.transaction_number
	 * @return  the value of blocks.transaction_number
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public Integer getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blocks.transaction_number
	 * @param transactionNumber  the value for blocks.transaction_number
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public void setTransactionNumber(Integer transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blocks.extra
	 * @return  the value of blocks.extra
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public String getExtra() {
		return extra;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blocks.extra
	 * @param extra  the value for blocks.extra
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public void setExtra(String extra) {
		this.extra = extra;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blocks.transaction_root
	 * @return  the value of blocks.transaction_root
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public String getTransactionRoot() {
		return transactionRoot;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blocks.transaction_root
	 * @param transactionRoot  the value for blocks.transaction_root
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public void setTransactionRoot(String transactionRoot) {
		this.transactionRoot = transactionRoot;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blocks.generated_by
	 * @return  the value of blocks.generated_by
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public String getGeneratedBy() {
		return generatedBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blocks.generated_by
	 * @param generatedBy  the value for blocks.generated_by
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public void setGeneratedBy(String generatedBy) {
		this.generatedBy = generatedBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column blocks.generated_date
	 * @return  the value of blocks.generated_date
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public Date getGeneratedDate() {
		return generatedDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column blocks.generated_date
	 * @param generatedDate  the value for blocks.generated_date
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public void setGeneratedDate(Date generatedDate) {
		this.generatedDate = generatedDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", blockNumber=").append(blockNumber);
		sb.append(", blockHash=").append(blockHash);
		sb.append(", previousBlockHash=").append(previousBlockHash);
		sb.append(", transactionNumber=").append(transactionNumber);
		sb.append(", extra=").append(extra);
		sb.append(", transactionRoot=").append(transactionRoot);
		sb.append(", generatedBy=").append(generatedBy);
		sb.append(", generatedDate=").append(generatedDate);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}