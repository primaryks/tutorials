package org.ko.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public PlanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
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
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIsNull() {
            addCriterion("plan_code is null");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIsNotNull() {
            addCriterion("plan_code is not null");
            return (Criteria) this;
        }

        public Criteria andPlanCodeEqualTo(String value) {
            addCriterion("plan_code =", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotEqualTo(String value) {
            addCriterion("plan_code <>", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeGreaterThan(String value) {
            addCriterion("plan_code >", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("plan_code >=", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLessThan(String value) {
            addCriterion("plan_code <", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLessThanOrEqualTo(String value) {
            addCriterion("plan_code <=", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeLike(String value) {
            addCriterion("plan_code like", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotLike(String value) {
            addCriterion("plan_code not like", value, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeIn(List<String> values) {
            addCriterion("plan_code in", values, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotIn(List<String> values) {
            addCriterion("plan_code not in", values, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeBetween(String value1, String value2) {
            addCriterion("plan_code between", value1, value2, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanCodeNotBetween(String value1, String value2) {
            addCriterion("plan_code not between", value1, value2, "planCode");
            return (Criteria) this;
        }

        public Criteria andPlanNameIsNull() {
            addCriterion("plan_name is null");
            return (Criteria) this;
        }

        public Criteria andPlanNameIsNotNull() {
            addCriterion("plan_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlanNameEqualTo(String value) {
            addCriterion("plan_name =", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotEqualTo(String value) {
            addCriterion("plan_name <>", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameGreaterThan(String value) {
            addCriterion("plan_name >", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameGreaterThanOrEqualTo(String value) {
            addCriterion("plan_name >=", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameLessThan(String value) {
            addCriterion("plan_name <", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameLessThanOrEqualTo(String value) {
            addCriterion("plan_name <=", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameLike(String value) {
            addCriterion("plan_name like", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotLike(String value) {
            addCriterion("plan_name not like", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameIn(List<String> values) {
            addCriterion("plan_name in", values, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotIn(List<String> values) {
            addCriterion("plan_name not in", values, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameBetween(String value1, String value2) {
            addCriterion("plan_name between", value1, value2, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotBetween(String value1, String value2) {
            addCriterion("plan_name not between", value1, value2, "planName");
            return (Criteria) this;
        }

        public Criteria andSubmitDtIsNull() {
            addCriterion("submit_dt is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDtIsNotNull() {
            addCriterion("submit_dt is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDtEqualTo(Date value) {
            addCriterion("submit_dt =", value, "submitDt");
            return (Criteria) this;
        }

        public Criteria andSubmitDtNotEqualTo(Date value) {
            addCriterion("submit_dt <>", value, "submitDt");
            return (Criteria) this;
        }

        public Criteria andSubmitDtGreaterThan(Date value) {
            addCriterion("submit_dt >", value, "submitDt");
            return (Criteria) this;
        }

        public Criteria andSubmitDtGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_dt >=", value, "submitDt");
            return (Criteria) this;
        }

        public Criteria andSubmitDtLessThan(Date value) {
            addCriterion("submit_dt <", value, "submitDt");
            return (Criteria) this;
        }

        public Criteria andSubmitDtLessThanOrEqualTo(Date value) {
            addCriterion("submit_dt <=", value, "submitDt");
            return (Criteria) this;
        }

        public Criteria andSubmitDtIn(List<Date> values) {
            addCriterion("submit_dt in", values, "submitDt");
            return (Criteria) this;
        }

        public Criteria andSubmitDtNotIn(List<Date> values) {
            addCriterion("submit_dt not in", values, "submitDt");
            return (Criteria) this;
        }

        public Criteria andSubmitDtBetween(Date value1, Date value2) {
            addCriterion("submit_dt between", value1, value2, "submitDt");
            return (Criteria) this;
        }

        public Criteria andSubmitDtNotBetween(Date value1, Date value2) {
            addCriterion("submit_dt not between", value1, value2, "submitDt");
            return (Criteria) this;
        }

        public Criteria andSubmitUserIsNull() {
            addCriterion("submit_user is null");
            return (Criteria) this;
        }

        public Criteria andSubmitUserIsNotNull() {
            addCriterion("submit_user is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitUserEqualTo(String value) {
            addCriterion("submit_user =", value, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserNotEqualTo(String value) {
            addCriterion("submit_user <>", value, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserGreaterThan(String value) {
            addCriterion("submit_user >", value, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserGreaterThanOrEqualTo(String value) {
            addCriterion("submit_user >=", value, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserLessThan(String value) {
            addCriterion("submit_user <", value, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserLessThanOrEqualTo(String value) {
            addCriterion("submit_user <=", value, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserLike(String value) {
            addCriterion("submit_user like", value, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserNotLike(String value) {
            addCriterion("submit_user not like", value, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserIn(List<String> values) {
            addCriterion("submit_user in", values, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserNotIn(List<String> values) {
            addCriterion("submit_user not in", values, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserBetween(String value1, String value2) {
            addCriterion("submit_user between", value1, value2, "submitUser");
            return (Criteria) this;
        }

        public Criteria andSubmitUserNotBetween(String value1, String value2) {
            addCriterion("submit_user not between", value1, value2, "submitUser");
            return (Criteria) this;
        }

        public Criteria andPlanStatusIsNull() {
            addCriterion("plan_status is null");
            return (Criteria) this;
        }

        public Criteria andPlanStatusIsNotNull() {
            addCriterion("plan_status is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStatusEqualTo(String value) {
            addCriterion("plan_status =", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusNotEqualTo(String value) {
            addCriterion("plan_status <>", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusGreaterThan(String value) {
            addCriterion("plan_status >", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusGreaterThanOrEqualTo(String value) {
            addCriterion("plan_status >=", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusLessThan(String value) {
            addCriterion("plan_status <", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusLessThanOrEqualTo(String value) {
            addCriterion("plan_status <=", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusLike(String value) {
            addCriterion("plan_status like", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusNotLike(String value) {
            addCriterion("plan_status not like", value, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusIn(List<String> values) {
            addCriterion("plan_status in", values, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusNotIn(List<String> values) {
            addCriterion("plan_status not in", values, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusBetween(String value1, String value2) {
            addCriterion("plan_status between", value1, value2, "planStatus");
            return (Criteria) this;
        }

        public Criteria andPlanStatusNotBetween(String value1, String value2) {
            addCriterion("plan_status not between", value1, value2, "planStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteIIsNull() {
            addCriterion("delete_i is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIIsNotNull() {
            addCriterion("delete_i is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteIEqualTo(String value) {
            addCriterion("delete_i =", value, "deleteI");
            return (Criteria) this;
        }

        public Criteria andDeleteINotEqualTo(String value) {
            addCriterion("delete_i <>", value, "deleteI");
            return (Criteria) this;
        }

        public Criteria andDeleteIGreaterThan(String value) {
            addCriterion("delete_i >", value, "deleteI");
            return (Criteria) this;
        }

        public Criteria andDeleteIGreaterThanOrEqualTo(String value) {
            addCriterion("delete_i >=", value, "deleteI");
            return (Criteria) this;
        }

        public Criteria andDeleteILessThan(String value) {
            addCriterion("delete_i <", value, "deleteI");
            return (Criteria) this;
        }

        public Criteria andDeleteILessThanOrEqualTo(String value) {
            addCriterion("delete_i <=", value, "deleteI");
            return (Criteria) this;
        }

        public Criteria andDeleteILike(String value) {
            addCriterion("delete_i like", value, "deleteI");
            return (Criteria) this;
        }

        public Criteria andDeleteINotLike(String value) {
            addCriterion("delete_i not like", value, "deleteI");
            return (Criteria) this;
        }

        public Criteria andDeleteIIn(List<String> values) {
            addCriterion("delete_i in", values, "deleteI");
            return (Criteria) this;
        }

        public Criteria andDeleteINotIn(List<String> values) {
            addCriterion("delete_i not in", values, "deleteI");
            return (Criteria) this;
        }

        public Criteria andDeleteIBetween(String value1, String value2) {
            addCriterion("delete_i between", value1, value2, "deleteI");
            return (Criteria) this;
        }

        public Criteria andDeleteINotBetween(String value1, String value2) {
            addCriterion("delete_i not between", value1, value2, "deleteI");
            return (Criteria) this;
        }

        public Criteria andVersionNIsNull() {
            addCriterion("version_n is null");
            return (Criteria) this;
        }

        public Criteria andVersionNIsNotNull() {
            addCriterion("version_n is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNEqualTo(Long value) {
            addCriterion("version_n =", value, "versionN");
            return (Criteria) this;
        }

        public Criteria andVersionNNotEqualTo(Long value) {
            addCriterion("version_n <>", value, "versionN");
            return (Criteria) this;
        }

        public Criteria andVersionNGreaterThan(Long value) {
            addCriterion("version_n >", value, "versionN");
            return (Criteria) this;
        }

        public Criteria andVersionNGreaterThanOrEqualTo(Long value) {
            addCriterion("version_n >=", value, "versionN");
            return (Criteria) this;
        }

        public Criteria andVersionNLessThan(Long value) {
            addCriterion("version_n <", value, "versionN");
            return (Criteria) this;
        }

        public Criteria andVersionNLessThanOrEqualTo(Long value) {
            addCriterion("version_n <=", value, "versionN");
            return (Criteria) this;
        }

        public Criteria andVersionNIn(List<Long> values) {
            addCriterion("version_n in", values, "versionN");
            return (Criteria) this;
        }

        public Criteria andVersionNNotIn(List<Long> values) {
            addCriterion("version_n not in", values, "versionN");
            return (Criteria) this;
        }

        public Criteria andVersionNBetween(Long value1, Long value2) {
            addCriterion("version_n between", value1, value2, "versionN");
            return (Criteria) this;
        }

        public Criteria andVersionNNotBetween(Long value1, Long value2) {
            addCriterion("version_n not between", value1, value2, "versionN");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("create_user_id like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("create_user_id not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNull() {
            addCriterion("create_dt is null");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNotNull() {
            addCriterion("create_dt is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDtEqualTo(Date value) {
            addCriterion("create_dt =", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotEqualTo(Date value) {
            addCriterion("create_dt <>", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThan(Date value) {
            addCriterion("create_dt >", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_dt >=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThan(Date value) {
            addCriterion("create_dt <", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThanOrEqualTo(Date value) {
            addCriterion("create_dt <=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtIn(List<Date> values) {
            addCriterion("create_dt in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotIn(List<Date> values) {
            addCriterion("create_dt not in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtBetween(Date value1, Date value2) {
            addCriterion("create_dt between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotBetween(Date value1, Date value2) {
            addCriterion("create_dt not between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNull() {
            addCriterion("modify_user_id is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNotNull() {
            addCriterion("modify_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdEqualTo(String value) {
            addCriterion("modify_user_id =", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotEqualTo(String value) {
            addCriterion("modify_user_id <>", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThan(String value) {
            addCriterion("modify_user_id >", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("modify_user_id >=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThan(String value) {
            addCriterion("modify_user_id <", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThanOrEqualTo(String value) {
            addCriterion("modify_user_id <=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLike(String value) {
            addCriterion("modify_user_id like", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotLike(String value) {
            addCriterion("modify_user_id not like", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIn(List<String> values) {
            addCriterion("modify_user_id in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotIn(List<String> values) {
            addCriterion("modify_user_id not in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdBetween(String value1, String value2) {
            addCriterion("modify_user_id between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotBetween(String value1, String value2) {
            addCriterion("modify_user_id not between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyDtIsNull() {
            addCriterion("modify_dt is null");
            return (Criteria) this;
        }

        public Criteria andModifyDtIsNotNull() {
            addCriterion("modify_dt is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDtEqualTo(Date value) {
            addCriterion("modify_dt =", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtNotEqualTo(Date value) {
            addCriterion("modify_dt <>", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtGreaterThan(Date value) {
            addCriterion("modify_dt >", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_dt >=", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtLessThan(Date value) {
            addCriterion("modify_dt <", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtLessThanOrEqualTo(Date value) {
            addCriterion("modify_dt <=", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtIn(List<Date> values) {
            addCriterion("modify_dt in", values, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtNotIn(List<Date> values) {
            addCriterion("modify_dt not in", values, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtBetween(Date value1, Date value2) {
            addCriterion("modify_dt between", value1, value2, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtNotBetween(Date value1, Date value2) {
            addCriterion("modify_dt not between", value1, value2, "modifyDt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table art_plan
     *
     * @mbg.generated do_not_delete_during_merge Sat Mar 31 16:47:24 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table art_plan
     *
     * @mbg.generated Sat Mar 31 16:47:24 CST 2018
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