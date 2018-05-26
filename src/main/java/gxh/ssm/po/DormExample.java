package gxh.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class DormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DormExample() {
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

        public Criteria andDormIdIsNull() {
            addCriterion("dorm_id is null");
            return (Criteria) this;
        }

        public Criteria andDormIdIsNotNull() {
            addCriterion("dorm_id is not null");
            return (Criteria) this;
        }

        public Criteria andDormIdEqualTo(Integer value) {
            addCriterion("dorm_id =", value, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdNotEqualTo(Integer value) {
            addCriterion("dorm_id <>", value, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdGreaterThan(Integer value) {
            addCriterion("dorm_id >", value, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dorm_id >=", value, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdLessThan(Integer value) {
            addCriterion("dorm_id <", value, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdLessThanOrEqualTo(Integer value) {
            addCriterion("dorm_id <=", value, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdIn(List<Integer> values) {
            addCriterion("dorm_id in", values, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdNotIn(List<Integer> values) {
            addCriterion("dorm_id not in", values, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdBetween(Integer value1, Integer value2) {
            addCriterion("dorm_id between", value1, value2, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dorm_id not between", value1, value2, "dormId");
            return (Criteria) this;
        }

        public Criteria andShouldpeopleIsNull() {
            addCriterion("shouldpeople is null");
            return (Criteria) this;
        }

        public Criteria andShouldpeopleIsNotNull() {
            addCriterion("shouldpeople is not null");
            return (Criteria) this;
        }

        public Criteria andShouldpeopleEqualTo(Integer value) {
            addCriterion("shouldpeople =", value, "shouldpeople");
            return (Criteria) this;
        }

        public Criteria andShouldpeopleNotEqualTo(Integer value) {
            addCriterion("shouldpeople <>", value, "shouldpeople");
            return (Criteria) this;
        }

        public Criteria andShouldpeopleGreaterThan(Integer value) {
            addCriterion("shouldpeople >", value, "shouldpeople");
            return (Criteria) this;
        }

        public Criteria andShouldpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("shouldpeople >=", value, "shouldpeople");
            return (Criteria) this;
        }

        public Criteria andShouldpeopleLessThan(Integer value) {
            addCriterion("shouldpeople <", value, "shouldpeople");
            return (Criteria) this;
        }

        public Criteria andShouldpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("shouldpeople <=", value, "shouldpeople");
            return (Criteria) this;
        }

        public Criteria andShouldpeopleIn(List<Integer> values) {
            addCriterion("shouldpeople in", values, "shouldpeople");
            return (Criteria) this;
        }

        public Criteria andShouldpeopleNotIn(List<Integer> values) {
            addCriterion("shouldpeople not in", values, "shouldpeople");
            return (Criteria) this;
        }

        public Criteria andShouldpeopleBetween(Integer value1, Integer value2) {
            addCriterion("shouldpeople between", value1, value2, "shouldpeople");
            return (Criteria) this;
        }

        public Criteria andShouldpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("shouldpeople not between", value1, value2, "shouldpeople");
            return (Criteria) this;
        }

        public Criteria andNowpeopleIsNull() {
            addCriterion("nowpeople is null");
            return (Criteria) this;
        }

        public Criteria andNowpeopleIsNotNull() {
            addCriterion("nowpeople is not null");
            return (Criteria) this;
        }

        public Criteria andNowpeopleEqualTo(Integer value) {
            addCriterion("nowpeople =", value, "nowpeople");
            return (Criteria) this;
        }

        public Criteria andNowpeopleNotEqualTo(Integer value) {
            addCriterion("nowpeople <>", value, "nowpeople");
            return (Criteria) this;
        }

        public Criteria andNowpeopleGreaterThan(Integer value) {
            addCriterion("nowpeople >", value, "nowpeople");
            return (Criteria) this;
        }

        public Criteria andNowpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("nowpeople >=", value, "nowpeople");
            return (Criteria) this;
        }

        public Criteria andNowpeopleLessThan(Integer value) {
            addCriterion("nowpeople <", value, "nowpeople");
            return (Criteria) this;
        }

        public Criteria andNowpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("nowpeople <=", value, "nowpeople");
            return (Criteria) this;
        }

        public Criteria andNowpeopleIn(List<Integer> values) {
            addCriterion("nowpeople in", values, "nowpeople");
            return (Criteria) this;
        }

        public Criteria andNowpeopleNotIn(List<Integer> values) {
            addCriterion("nowpeople not in", values, "nowpeople");
            return (Criteria) this;
        }

        public Criteria andNowpeopleBetween(Integer value1, Integer value2) {
            addCriterion("nowpeople between", value1, value2, "nowpeople");
            return (Criteria) this;
        }

        public Criteria andNowpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("nowpeople not between", value1, value2, "nowpeople");
            return (Criteria) this;
        }

        public Criteria andDormitoryIsNull() {
            addCriterion("dormitory is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryIsNotNull() {
            addCriterion("dormitory is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryEqualTo(String value) {
            addCriterion("dormitory =", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryNotEqualTo(String value) {
            addCriterion("dormitory <>", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryGreaterThan(String value) {
            addCriterion("dormitory >", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryGreaterThanOrEqualTo(String value) {
            addCriterion("dormitory >=", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryLessThan(String value) {
            addCriterion("dormitory <", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryLessThanOrEqualTo(String value) {
            addCriterion("dormitory <=", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryLike(String value) {
            addCriterion("dormitory like", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryNotLike(String value) {
            addCriterion("dormitory not like", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryIn(List<String> values) {
            addCriterion("dormitory in", values, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryNotIn(List<String> values) {
            addCriterion("dormitory not in", values, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryBetween(String value1, String value2) {
            addCriterion("dormitory between", value1, value2, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryNotBetween(String value1, String value2) {
            addCriterion("dormitory not between", value1, value2, "dormitory");
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