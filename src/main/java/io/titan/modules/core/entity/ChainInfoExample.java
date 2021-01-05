package io.titan.modules.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChainInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    public ChainInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHeadBlockNumIsNull() {
            addCriterion("head_block_num is null");
            return (Criteria) this;
        }

        public Criteria andHeadBlockNumIsNotNull() {
            addCriterion("head_block_num is not null");
            return (Criteria) this;
        }

        public Criteria andHeadBlockNumEqualTo(Long value) {
            addCriterion("head_block_num =", value, "headBlockNum");
            return (Criteria) this;
        }

        public Criteria andHeadBlockNumNotEqualTo(Long value) {
            addCriterion("head_block_num <>", value, "headBlockNum");
            return (Criteria) this;
        }

        public Criteria andHeadBlockNumGreaterThan(Long value) {
            addCriterion("head_block_num >", value, "headBlockNum");
            return (Criteria) this;
        }

        public Criteria andHeadBlockNumGreaterThanOrEqualTo(Long value) {
            addCriterion("head_block_num >=", value, "headBlockNum");
            return (Criteria) this;
        }

        public Criteria andHeadBlockNumLessThan(Long value) {
            addCriterion("head_block_num <", value, "headBlockNum");
            return (Criteria) this;
        }

        public Criteria andHeadBlockNumLessThanOrEqualTo(Long value) {
            addCriterion("head_block_num <=", value, "headBlockNum");
            return (Criteria) this;
        }

        public Criteria andHeadBlockNumIn(List<Long> values) {
            addCriterion("head_block_num in", values, "headBlockNum");
            return (Criteria) this;
        }

        public Criteria andHeadBlockNumNotIn(List<Long> values) {
            addCriterion("head_block_num not in", values, "headBlockNum");
            return (Criteria) this;
        }

        public Criteria andHeadBlockNumBetween(Long value1, Long value2) {
            addCriterion("head_block_num between", value1, value2, "headBlockNum");
            return (Criteria) this;
        }

        public Criteria andHeadBlockNumNotBetween(Long value1, Long value2) {
            addCriterion("head_block_num not between", value1, value2, "headBlockNum");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashIsNull() {
            addCriterion("head_block_hash is null");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashIsNotNull() {
            addCriterion("head_block_hash is not null");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashEqualTo(String value) {
            addCriterion("head_block_hash =", value, "headBlockHash");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashNotEqualTo(String value) {
            addCriterion("head_block_hash <>", value, "headBlockHash");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashGreaterThan(String value) {
            addCriterion("head_block_hash >", value, "headBlockHash");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashGreaterThanOrEqualTo(String value) {
            addCriterion("head_block_hash >=", value, "headBlockHash");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashLessThan(String value) {
            addCriterion("head_block_hash <", value, "headBlockHash");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashLessThanOrEqualTo(String value) {
            addCriterion("head_block_hash <=", value, "headBlockHash");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashLike(String value) {
            addCriterion("head_block_hash like", value, "headBlockHash");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashNotLike(String value) {
            addCriterion("head_block_hash not like", value, "headBlockHash");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashIn(List<String> values) {
            addCriterion("head_block_hash in", values, "headBlockHash");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashNotIn(List<String> values) {
            addCriterion("head_block_hash not in", values, "headBlockHash");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashBetween(String value1, String value2) {
            addCriterion("head_block_hash between", value1, value2, "headBlockHash");
            return (Criteria) this;
        }

        public Criteria andHeadBlockHashNotBetween(String value1, String value2) {
            addCriterion("head_block_hash not between", value1, value2, "headBlockHash");
            return (Criteria) this;
        }

        public Criteria andHeadBlockTimeIsNull() {
            addCriterion("head_block_time is null");
            return (Criteria) this;
        }

        public Criteria andHeadBlockTimeIsNotNull() {
            addCriterion("head_block_time is not null");
            return (Criteria) this;
        }

        public Criteria andHeadBlockTimeEqualTo(Date value) {
            addCriterion("head_block_time =", value, "headBlockTime");
            return (Criteria) this;
        }

        public Criteria andHeadBlockTimeNotEqualTo(Date value) {
            addCriterion("head_block_time <>", value, "headBlockTime");
            return (Criteria) this;
        }

        public Criteria andHeadBlockTimeGreaterThan(Date value) {
            addCriterion("head_block_time >", value, "headBlockTime");
            return (Criteria) this;
        }

        public Criteria andHeadBlockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("head_block_time >=", value, "headBlockTime");
            return (Criteria) this;
        }

        public Criteria andHeadBlockTimeLessThan(Date value) {
            addCriterion("head_block_time <", value, "headBlockTime");
            return (Criteria) this;
        }

        public Criteria andHeadBlockTimeLessThanOrEqualTo(Date value) {
            addCriterion("head_block_time <=", value, "headBlockTime");
            return (Criteria) this;
        }

        public Criteria andHeadBlockTimeIn(List<Date> values) {
            addCriterion("head_block_time in", values, "headBlockTime");
            return (Criteria) this;
        }

        public Criteria andHeadBlockTimeNotIn(List<Date> values) {
            addCriterion("head_block_time not in", values, "headBlockTime");
            return (Criteria) this;
        }

        public Criteria andHeadBlockTimeBetween(Date value1, Date value2) {
            addCriterion("head_block_time between", value1, value2, "headBlockTime");
            return (Criteria) this;
        }

        public Criteria andHeadBlockTimeNotBetween(Date value1, Date value2) {
            addCriterion("head_block_time not between", value1, value2, "headBlockTime");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerIsNull() {
            addCriterion("head_block_producer is null");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerIsNotNull() {
            addCriterion("head_block_producer is not null");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerEqualTo(String value) {
            addCriterion("head_block_producer =", value, "headBlockProducer");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerNotEqualTo(String value) {
            addCriterion("head_block_producer <>", value, "headBlockProducer");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerGreaterThan(String value) {
            addCriterion("head_block_producer >", value, "headBlockProducer");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerGreaterThanOrEqualTo(String value) {
            addCriterion("head_block_producer >=", value, "headBlockProducer");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerLessThan(String value) {
            addCriterion("head_block_producer <", value, "headBlockProducer");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerLessThanOrEqualTo(String value) {
            addCriterion("head_block_producer <=", value, "headBlockProducer");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerLike(String value) {
            addCriterion("head_block_producer like", value, "headBlockProducer");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerNotLike(String value) {
            addCriterion("head_block_producer not like", value, "headBlockProducer");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerIn(List<String> values) {
            addCriterion("head_block_producer in", values, "headBlockProducer");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerNotIn(List<String> values) {
            addCriterion("head_block_producer not in", values, "headBlockProducer");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerBetween(String value1, String value2) {
            addCriterion("head_block_producer between", value1, value2, "headBlockProducer");
            return (Criteria) this;
        }

        public Criteria andHeadBlockProducerNotBetween(String value1, String value2) {
            addCriterion("head_block_producer not between", value1, value2, "headBlockProducer");
            return (Criteria) this;
        }

        public Criteria andTotalQtyIsNull() {
            addCriterion("total_qty is null");
            return (Criteria) this;
        }

        public Criteria andTotalQtyIsNotNull() {
            addCriterion("total_qty is not null");
            return (Criteria) this;
        }

        public Criteria andTotalQtyEqualTo(Long value) {
            addCriterion("total_qty =", value, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyNotEqualTo(Long value) {
            addCriterion("total_qty <>", value, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyGreaterThan(Long value) {
            addCriterion("total_qty >", value, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyGreaterThanOrEqualTo(Long value) {
            addCriterion("total_qty >=", value, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyLessThan(Long value) {
            addCriterion("total_qty <", value, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyLessThanOrEqualTo(Long value) {
            addCriterion("total_qty <=", value, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyIn(List<Long> values) {
            addCriterion("total_qty in", values, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyNotIn(List<Long> values) {
            addCriterion("total_qty not in", values, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyBetween(Long value1, Long value2) {
            addCriterion("total_qty between", value1, value2, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyNotBetween(Long value1, Long value2) {
            addCriterion("total_qty not between", value1, value2, "totalQty");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table chain_info
     *
     * @mbg.generated do_not_delete_during_merge Sat Jul 25 16:11:11 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table chain_info
     *
     * @mbg.generated Sat Jul 25 16:11:11 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}