package io.titan.modules.core.entity;

import java.io.Serializable;
import java.util.Date;

public class AcountAssets implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acount_assets.id
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acount_assets.address
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acount_assets.token_name
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    private String tokenName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acount_assets.contract
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    private String contract;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acount_assets.balance
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    private Long balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acount_assets.create_date
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acount_assets.update_date
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table acount_assets
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acount_assets.id
     *
     * @return the value of acount_assets.id
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acount_assets.id
     *
     * @param id the value for acount_assets.id
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acount_assets.address
     *
     * @return the value of acount_assets.address
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acount_assets.address
     *
     * @param address the value for acount_assets.address
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acount_assets.token_name
     *
     * @return the value of acount_assets.token_name
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public String getTokenName() {
        return tokenName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acount_assets.token_name
     *
     * @param tokenName the value for acount_assets.token_name
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acount_assets.contract
     *
     * @return the value of acount_assets.contract
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public String getContract() {
        return contract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acount_assets.contract
     *
     * @param contract the value for acount_assets.contract
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public void setContract(String contract) {
        this.contract = contract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acount_assets.balance
     *
     * @return the value of acount_assets.balance
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acount_assets.balance
     *
     * @param balance the value for acount_assets.balance
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acount_assets.create_date
     *
     * @return the value of acount_assets.create_date
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acount_assets.create_date
     *
     * @param createDate the value for acount_assets.create_date
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acount_assets.update_date
     *
     * @return the value of acount_assets.update_date
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acount_assets.update_date
     *
     * @param updateDate the value for acount_assets.update_date
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acount_assets
     *
     * @mbg.generated Wed Jun 10 16:30:50 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", address=").append(address);
        sb.append(", tokenName=").append(tokenName);
        sb.append(", contract=").append(contract);
        sb.append(", balance=").append(balance);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}