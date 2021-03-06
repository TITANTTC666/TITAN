package io.titan.modules.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlocksExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public BlocksExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
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

		public Criteria andBlockNumberIsNull() {
			addCriterion("block_number is null");
			return (Criteria) this;
		}

		public Criteria andBlockNumberIsNotNull() {
			addCriterion("block_number is not null");
			return (Criteria) this;
		}

		public Criteria andBlockNumberEqualTo(Long value) {
			addCriterion("block_number =", value, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberNotEqualTo(Long value) {
			addCriterion("block_number <>", value, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberGreaterThan(Long value) {
			addCriterion("block_number >", value, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberGreaterThanOrEqualTo(Long value) {
			addCriterion("block_number >=", value, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberLessThan(Long value) {
			addCriterion("block_number <", value, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberLessThanOrEqualTo(Long value) {
			addCriterion("block_number <=", value, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberIn(List<Long> values) {
			addCriterion("block_number in", values, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberNotIn(List<Long> values) {
			addCriterion("block_number not in", values, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberBetween(Long value1, Long value2) {
			addCriterion("block_number between", value1, value2, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockNumberNotBetween(Long value1, Long value2) {
			addCriterion("block_number not between", value1, value2, "blockNumber");
			return (Criteria) this;
		}

		public Criteria andBlockHashIsNull() {
			addCriterion("block_hash is null");
			return (Criteria) this;
		}

		public Criteria andBlockHashIsNotNull() {
			addCriterion("block_hash is not null");
			return (Criteria) this;
		}

		public Criteria andBlockHashEqualTo(String value) {
			addCriterion("block_hash =", value, "blockHash");
			return (Criteria) this;
		}

		public Criteria andBlockHashNotEqualTo(String value) {
			addCriterion("block_hash <>", value, "blockHash");
			return (Criteria) this;
		}

		public Criteria andBlockHashGreaterThan(String value) {
			addCriterion("block_hash >", value, "blockHash");
			return (Criteria) this;
		}

		public Criteria andBlockHashGreaterThanOrEqualTo(String value) {
			addCriterion("block_hash >=", value, "blockHash");
			return (Criteria) this;
		}

		public Criteria andBlockHashLessThan(String value) {
			addCriterion("block_hash <", value, "blockHash");
			return (Criteria) this;
		}

		public Criteria andBlockHashLessThanOrEqualTo(String value) {
			addCriterion("block_hash <=", value, "blockHash");
			return (Criteria) this;
		}

		public Criteria andBlockHashLike(String value) {
			addCriterion("block_hash like", value, "blockHash");
			return (Criteria) this;
		}

		public Criteria andBlockHashNotLike(String value) {
			addCriterion("block_hash not like", value, "blockHash");
			return (Criteria) this;
		}

		public Criteria andBlockHashIn(List<String> values) {
			addCriterion("block_hash in", values, "blockHash");
			return (Criteria) this;
		}

		public Criteria andBlockHashNotIn(List<String> values) {
			addCriterion("block_hash not in", values, "blockHash");
			return (Criteria) this;
		}

		public Criteria andBlockHashBetween(String value1, String value2) {
			addCriterion("block_hash between", value1, value2, "blockHash");
			return (Criteria) this;
		}

		public Criteria andBlockHashNotBetween(String value1, String value2) {
			addCriterion("block_hash not between", value1, value2, "blockHash");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashIsNull() {
			addCriterion("previous_block_hash is null");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashIsNotNull() {
			addCriterion("previous_block_hash is not null");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashEqualTo(String value) {
			addCriterion("previous_block_hash =", value, "previousBlockHash");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashNotEqualTo(String value) {
			addCriterion("previous_block_hash <>", value, "previousBlockHash");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashGreaterThan(String value) {
			addCriterion("previous_block_hash >", value, "previousBlockHash");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashGreaterThanOrEqualTo(String value) {
			addCriterion("previous_block_hash >=", value, "previousBlockHash");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashLessThan(String value) {
			addCriterion("previous_block_hash <", value, "previousBlockHash");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashLessThanOrEqualTo(String value) {
			addCriterion("previous_block_hash <=", value, "previousBlockHash");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashLike(String value) {
			addCriterion("previous_block_hash like", value, "previousBlockHash");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashNotLike(String value) {
			addCriterion("previous_block_hash not like", value, "previousBlockHash");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashIn(List<String> values) {
			addCriterion("previous_block_hash in", values, "previousBlockHash");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashNotIn(List<String> values) {
			addCriterion("previous_block_hash not in", values, "previousBlockHash");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashBetween(String value1, String value2) {
			addCriterion("previous_block_hash between", value1, value2, "previousBlockHash");
			return (Criteria) this;
		}

		public Criteria andPreviousBlockHashNotBetween(String value1, String value2) {
			addCriterion("previous_block_hash not between", value1, value2, "previousBlockHash");
			return (Criteria) this;
		}

		public Criteria andTransactionNumberIsNull() {
			addCriterion("transaction_number is null");
			return (Criteria) this;
		}

		public Criteria andTransactionNumberIsNotNull() {
			addCriterion("transaction_number is not null");
			return (Criteria) this;
		}

		public Criteria andTransactionNumberEqualTo(Integer value) {
			addCriterion("transaction_number =", value, "transactionNumber");
			return (Criteria) this;
		}

		public Criteria andTransactionNumberNotEqualTo(Integer value) {
			addCriterion("transaction_number <>", value, "transactionNumber");
			return (Criteria) this;
		}

		public Criteria andTransactionNumberGreaterThan(Integer value) {
			addCriterion("transaction_number >", value, "transactionNumber");
			return (Criteria) this;
		}

		public Criteria andTransactionNumberGreaterThanOrEqualTo(Integer value) {
			addCriterion("transaction_number >=", value, "transactionNumber");
			return (Criteria) this;
		}

		public Criteria andTransactionNumberLessThan(Integer value) {
			addCriterion("transaction_number <", value, "transactionNumber");
			return (Criteria) this;
		}

		public Criteria andTransactionNumberLessThanOrEqualTo(Integer value) {
			addCriterion("transaction_number <=", value, "transactionNumber");
			return (Criteria) this;
		}

		public Criteria andTransactionNumberIn(List<Integer> values) {
			addCriterion("transaction_number in", values, "transactionNumber");
			return (Criteria) this;
		}

		public Criteria andTransactionNumberNotIn(List<Integer> values) {
			addCriterion("transaction_number not in", values, "transactionNumber");
			return (Criteria) this;
		}

		public Criteria andTransactionNumberBetween(Integer value1, Integer value2) {
			addCriterion("transaction_number between", value1, value2, "transactionNumber");
			return (Criteria) this;
		}

		public Criteria andTransactionNumberNotBetween(Integer value1, Integer value2) {
			addCriterion("transaction_number not between", value1, value2, "transactionNumber");
			return (Criteria) this;
		}

		public Criteria andExtraIsNull() {
			addCriterion("extra is null");
			return (Criteria) this;
		}

		public Criteria andExtraIsNotNull() {
			addCriterion("extra is not null");
			return (Criteria) this;
		}

		public Criteria andExtraEqualTo(String value) {
			addCriterion("extra =", value, "extra");
			return (Criteria) this;
		}

		public Criteria andExtraNotEqualTo(String value) {
			addCriterion("extra <>", value, "extra");
			return (Criteria) this;
		}

		public Criteria andExtraGreaterThan(String value) {
			addCriterion("extra >", value, "extra");
			return (Criteria) this;
		}

		public Criteria andExtraGreaterThanOrEqualTo(String value) {
			addCriterion("extra >=", value, "extra");
			return (Criteria) this;
		}

		public Criteria andExtraLessThan(String value) {
			addCriterion("extra <", value, "extra");
			return (Criteria) this;
		}

		public Criteria andExtraLessThanOrEqualTo(String value) {
			addCriterion("extra <=", value, "extra");
			return (Criteria) this;
		}

		public Criteria andExtraLike(String value) {
			addCriterion("extra like", value, "extra");
			return (Criteria) this;
		}

		public Criteria andExtraNotLike(String value) {
			addCriterion("extra not like", value, "extra");
			return (Criteria) this;
		}

		public Criteria andExtraIn(List<String> values) {
			addCriterion("extra in", values, "extra");
			return (Criteria) this;
		}

		public Criteria andExtraNotIn(List<String> values) {
			addCriterion("extra not in", values, "extra");
			return (Criteria) this;
		}

		public Criteria andExtraBetween(String value1, String value2) {
			addCriterion("extra between", value1, value2, "extra");
			return (Criteria) this;
		}

		public Criteria andExtraNotBetween(String value1, String value2) {
			addCriterion("extra not between", value1, value2, "extra");
			return (Criteria) this;
		}

		public Criteria andTransactionRootIsNull() {
			addCriterion("transaction_root is null");
			return (Criteria) this;
		}

		public Criteria andTransactionRootIsNotNull() {
			addCriterion("transaction_root is not null");
			return (Criteria) this;
		}

		public Criteria andTransactionRootEqualTo(String value) {
			addCriterion("transaction_root =", value, "transactionRoot");
			return (Criteria) this;
		}

		public Criteria andTransactionRootNotEqualTo(String value) {
			addCriterion("transaction_root <>", value, "transactionRoot");
			return (Criteria) this;
		}

		public Criteria andTransactionRootGreaterThan(String value) {
			addCriterion("transaction_root >", value, "transactionRoot");
			return (Criteria) this;
		}

		public Criteria andTransactionRootGreaterThanOrEqualTo(String value) {
			addCriterion("transaction_root >=", value, "transactionRoot");
			return (Criteria) this;
		}

		public Criteria andTransactionRootLessThan(String value) {
			addCriterion("transaction_root <", value, "transactionRoot");
			return (Criteria) this;
		}

		public Criteria andTransactionRootLessThanOrEqualTo(String value) {
			addCriterion("transaction_root <=", value, "transactionRoot");
			return (Criteria) this;
		}

		public Criteria andTransactionRootLike(String value) {
			addCriterion("transaction_root like", value, "transactionRoot");
			return (Criteria) this;
		}

		public Criteria andTransactionRootNotLike(String value) {
			addCriterion("transaction_root not like", value, "transactionRoot");
			return (Criteria) this;
		}

		public Criteria andTransactionRootIn(List<String> values) {
			addCriterion("transaction_root in", values, "transactionRoot");
			return (Criteria) this;
		}

		public Criteria andTransactionRootNotIn(List<String> values) {
			addCriterion("transaction_root not in", values, "transactionRoot");
			return (Criteria) this;
		}

		public Criteria andTransactionRootBetween(String value1, String value2) {
			addCriterion("transaction_root between", value1, value2, "transactionRoot");
			return (Criteria) this;
		}

		public Criteria andTransactionRootNotBetween(String value1, String value2) {
			addCriterion("transaction_root not between", value1, value2, "transactionRoot");
			return (Criteria) this;
		}

		public Criteria andGeneratedByIsNull() {
			addCriterion("generated_by is null");
			return (Criteria) this;
		}

		public Criteria andGeneratedByIsNotNull() {
			addCriterion("generated_by is not null");
			return (Criteria) this;
		}

		public Criteria andGeneratedByEqualTo(String value) {
			addCriterion("generated_by =", value, "generatedBy");
			return (Criteria) this;
		}

		public Criteria andGeneratedByNotEqualTo(String value) {
			addCriterion("generated_by <>", value, "generatedBy");
			return (Criteria) this;
		}

		public Criteria andGeneratedByGreaterThan(String value) {
			addCriterion("generated_by >", value, "generatedBy");
			return (Criteria) this;
		}

		public Criteria andGeneratedByGreaterThanOrEqualTo(String value) {
			addCriterion("generated_by >=", value, "generatedBy");
			return (Criteria) this;
		}

		public Criteria andGeneratedByLessThan(String value) {
			addCriterion("generated_by <", value, "generatedBy");
			return (Criteria) this;
		}

		public Criteria andGeneratedByLessThanOrEqualTo(String value) {
			addCriterion("generated_by <=", value, "generatedBy");
			return (Criteria) this;
		}

		public Criteria andGeneratedByLike(String value) {
			addCriterion("generated_by like", value, "generatedBy");
			return (Criteria) this;
		}

		public Criteria andGeneratedByNotLike(String value) {
			addCriterion("generated_by not like", value, "generatedBy");
			return (Criteria) this;
		}

		public Criteria andGeneratedByIn(List<String> values) {
			addCriterion("generated_by in", values, "generatedBy");
			return (Criteria) this;
		}

		public Criteria andGeneratedByNotIn(List<String> values) {
			addCriterion("generated_by not in", values, "generatedBy");
			return (Criteria) this;
		}

		public Criteria andGeneratedByBetween(String value1, String value2) {
			addCriterion("generated_by between", value1, value2, "generatedBy");
			return (Criteria) this;
		}

		public Criteria andGeneratedByNotBetween(String value1, String value2) {
			addCriterion("generated_by not between", value1, value2, "generatedBy");
			return (Criteria) this;
		}

		public Criteria andGeneratedDateIsNull() {
			addCriterion("generated_date is null");
			return (Criteria) this;
		}

		public Criteria andGeneratedDateIsNotNull() {
			addCriterion("generated_date is not null");
			return (Criteria) this;
		}

		public Criteria andGeneratedDateEqualTo(Date value) {
			addCriterion("generated_date =", value, "generatedDate");
			return (Criteria) this;
		}

		public Criteria andGeneratedDateNotEqualTo(Date value) {
			addCriterion("generated_date <>", value, "generatedDate");
			return (Criteria) this;
		}

		public Criteria andGeneratedDateGreaterThan(Date value) {
			addCriterion("generated_date >", value, "generatedDate");
			return (Criteria) this;
		}

		public Criteria andGeneratedDateGreaterThanOrEqualTo(Date value) {
			addCriterion("generated_date >=", value, "generatedDate");
			return (Criteria) this;
		}

		public Criteria andGeneratedDateLessThan(Date value) {
			addCriterion("generated_date <", value, "generatedDate");
			return (Criteria) this;
		}

		public Criteria andGeneratedDateLessThanOrEqualTo(Date value) {
			addCriterion("generated_date <=", value, "generatedDate");
			return (Criteria) this;
		}

		public Criteria andGeneratedDateIn(List<Date> values) {
			addCriterion("generated_date in", values, "generatedDate");
			return (Criteria) this;
		}

		public Criteria andGeneratedDateNotIn(List<Date> values) {
			addCriterion("generated_date not in", values, "generatedDate");
			return (Criteria) this;
		}

		public Criteria andGeneratedDateBetween(Date value1, Date value2) {
			addCriterion("generated_date between", value1, value2, "generatedDate");
			return (Criteria) this;
		}

		public Criteria andGeneratedDateNotBetween(Date value1, Date value2) {
			addCriterion("generated_date not between", value1, value2, "generatedDate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table blocks
	 * @mbg.generated  Tue Jun 16 14:46:22 CST 2020
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table blocks
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 10 16:31:53 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}