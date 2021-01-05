package io.titan.modules.core.entity;

import java.io.Serializable;

public class Sysconfig implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sysconfig.id
     *
     * @mbg.generated Mon Jun 15 16:12:32 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sysconfig.ckey
     *
     * @mbg.generated Mon Jun 15 16:12:32 CST 2020
     */
    private String ckey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sysconfig.cvalue
     *
     * @mbg.generated Mon Jun 15 16:12:32 CST 2020
     */
    private String cvalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sysconfig
     *
     * @mbg.generated Mon Jun 15 16:12:32 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sysconfig.id
     *
     * @return the value of sysconfig.id
     *
     * @mbg.generated Mon Jun 15 16:12:32 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sysconfig.id
     *
     * @param id the value for sysconfig.id
     *
     * @mbg.generated Mon Jun 15 16:12:32 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sysconfig.ckey
     *
     * @return the value of sysconfig.ckey
     *
     * @mbg.generated Mon Jun 15 16:12:32 CST 2020
     */
    public String getCkey() {
        return ckey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sysconfig.ckey
     *
     * @param ckey the value for sysconfig.ckey
     *
     * @mbg.generated Mon Jun 15 16:12:32 CST 2020
     */
    public void setCkey(String ckey) {
        this.ckey = ckey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sysconfig.cvalue
     *
     * @return the value of sysconfig.cvalue
     *
     * @mbg.generated Mon Jun 15 16:12:32 CST 2020
     */
    public String getCvalue() {
        return cvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sysconfig.cvalue
     *
     * @param cvalue the value for sysconfig.cvalue
     *
     * @mbg.generated Mon Jun 15 16:12:32 CST 2020
     */
    public void setCvalue(String cvalue) {
        this.cvalue = cvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysconfig
     *
     * @mbg.generated Mon Jun 15 16:12:32 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ckey=").append(ckey);
        sb.append(", cvalue=").append(cvalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}