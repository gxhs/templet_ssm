package gxh.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class VisitorsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitorsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andVIdIsNull() {
            addCriterion("V_id is null");
            return (Criteria) this;
        }

        public Criteria andVIdIsNotNull() {
            addCriterion("V_id is not null");
            return (Criteria) this;
        }

        public Criteria andVIdEqualTo(Integer value) {
            addCriterion("V_id =", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotEqualTo(Integer value) {
            addCriterion("V_id <>", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdGreaterThan(Integer value) {
            addCriterion("V_id >", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("V_id >=", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLessThan(Integer value) {
            addCriterion("V_id <", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLessThanOrEqualTo(Integer value) {
            addCriterion("V_id <=", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdIn(List<Integer> values) {
            addCriterion("V_id in", values, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotIn(List<Integer> values) {
            addCriterion("V_id not in", values, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdBetween(Integer value1, Integer value2) {
            addCriterion("V_id between", value1, value2, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotBetween(Integer value1, Integer value2) {
            addCriterion("V_id not between", value1, value2, "vId");
            return (Criteria) this;
        }

        public Criteria andVNameIsNull() {
            addCriterion("V_name is null");
            return (Criteria) this;
        }

        public Criteria andVNameIsNotNull() {
            addCriterion("V_name is not null");
            return (Criteria) this;
        }

        public Criteria andVNameEqualTo(String value) {
            addCriterion("V_name =", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotEqualTo(String value) {
            addCriterion("V_name <>", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameGreaterThan(String value) {
            addCriterion("V_name >", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameGreaterThanOrEqualTo(String value) {
            addCriterion("V_name >=", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLessThan(String value) {
            addCriterion("V_name <", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLessThanOrEqualTo(String value) {
            addCriterion("V_name <=", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLike(String value) {
            addCriterion("V_name like", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotLike(String value) {
            addCriterion("V_name not like", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameIn(List<String> values) {
            addCriterion("V_name in", values, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotIn(List<String> values) {
            addCriterion("V_name not in", values, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameBetween(String value1, String value2) {
            addCriterion("V_name between", value1, value2, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotBetween(String value1, String value2) {
            addCriterion("V_name not between", value1, value2, "vName");
            return (Criteria) this;
        }

        public Criteria andVSexIsNull() {
            addCriterion("V_sex is null");
            return (Criteria) this;
        }

        public Criteria andVSexIsNotNull() {
            addCriterion("V_sex is not null");
            return (Criteria) this;
        }

        public Criteria andVSexEqualTo(String value) {
            addCriterion("V_sex =", value, "vSex");
            return (Criteria) this;
        }

        public Criteria andVSexNotEqualTo(String value) {
            addCriterion("V_sex <>", value, "vSex");
            return (Criteria) this;
        }

        public Criteria andVSexGreaterThan(String value) {
            addCriterion("V_sex >", value, "vSex");
            return (Criteria) this;
        }

        public Criteria andVSexGreaterThanOrEqualTo(String value) {
            addCriterion("V_sex >=", value, "vSex");
            return (Criteria) this;
        }

        public Criteria andVSexLessThan(String value) {
            addCriterion("V_sex <", value, "vSex");
            return (Criteria) this;
        }

        public Criteria andVSexLessThanOrEqualTo(String value) {
            addCriterion("V_sex <=", value, "vSex");
            return (Criteria) this;
        }

        public Criteria andVSexLike(String value) {
            addCriterion("V_sex like", value, "vSex");
            return (Criteria) this;
        }

        public Criteria andVSexNotLike(String value) {
            addCriterion("V_sex not like", value, "vSex");
            return (Criteria) this;
        }

        public Criteria andVSexIn(List<String> values) {
            addCriterion("V_sex in", values, "vSex");
            return (Criteria) this;
        }

        public Criteria andVSexNotIn(List<String> values) {
            addCriterion("V_sex not in", values, "vSex");
            return (Criteria) this;
        }

        public Criteria andVSexBetween(String value1, String value2) {
            addCriterion("V_sex between", value1, value2, "vSex");
            return (Criteria) this;
        }

        public Criteria andVSexNotBetween(String value1, String value2) {
            addCriterion("V_sex not between", value1, value2, "vSex");
            return (Criteria) this;
        }

        public Criteria andVAgeIsNull() {
            addCriterion("V_age is null");
            return (Criteria) this;
        }

        public Criteria andVAgeIsNotNull() {
            addCriterion("V_age is not null");
            return (Criteria) this;
        }

        public Criteria andVAgeEqualTo(Integer value) {
            addCriterion("V_age =", value, "vAge");
            return (Criteria) this;
        }

        public Criteria andVAgeNotEqualTo(Integer value) {
            addCriterion("V_age <>", value, "vAge");
            return (Criteria) this;
        }

        public Criteria andVAgeGreaterThan(Integer value) {
            addCriterion("V_age >", value, "vAge");
            return (Criteria) this;
        }

        public Criteria andVAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("V_age >=", value, "vAge");
            return (Criteria) this;
        }

        public Criteria andVAgeLessThan(Integer value) {
            addCriterion("V_age <", value, "vAge");
            return (Criteria) this;
        }

        public Criteria andVAgeLessThanOrEqualTo(Integer value) {
            addCriterion("V_age <=", value, "vAge");
            return (Criteria) this;
        }

        public Criteria andVAgeIn(List<Integer> values) {
            addCriterion("V_age in", values, "vAge");
            return (Criteria) this;
        }

        public Criteria andVAgeNotIn(List<Integer> values) {
            addCriterion("V_age not in", values, "vAge");
            return (Criteria) this;
        }

        public Criteria andVAgeBetween(Integer value1, Integer value2) {
            addCriterion("V_age between", value1, value2, "vAge");
            return (Criteria) this;
        }

        public Criteria andVAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("V_age not between", value1, value2, "vAge");
            return (Criteria) this;
        }

        public Criteria andWorkunitIsNull() {
            addCriterion("workunit is null");
            return (Criteria) this;
        }

        public Criteria andWorkunitIsNotNull() {
            addCriterion("workunit is not null");
            return (Criteria) this;
        }

        public Criteria andWorkunitEqualTo(Integer value) {
            addCriterion("workunit =", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotEqualTo(Integer value) {
            addCriterion("workunit <>", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitGreaterThan(Integer value) {
            addCriterion("workunit >", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("workunit >=", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLessThan(Integer value) {
            addCriterion("workunit <", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLessThanOrEqualTo(Integer value) {
            addCriterion("workunit <=", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitIn(List<Integer> values) {
            addCriterion("workunit in", values, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotIn(List<Integer> values) {
            addCriterion("workunit not in", values, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitBetween(Integer value1, Integer value2) {
            addCriterion("workunit between", value1, value2, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotBetween(Integer value1, Integer value2) {
            addCriterion("workunit not between", value1, value2, "workunit");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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