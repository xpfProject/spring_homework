package cn.xpf.core.bean;

import java.util.ArrayList;
import java.util.List;

public class PrTchElectiveQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public PrTchElectiveQuery() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andFkCourseIdIsNull() {
            addCriterion("fk_course_id is null");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdIsNotNull() {
            addCriterion("fk_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdEqualTo(String value) {
            addCriterion("fk_course_id =", value, "fkCourseId");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdNotEqualTo(String value) {
            addCriterion("fk_course_id <>", value, "fkCourseId");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdGreaterThan(String value) {
            addCriterion("fk_course_id >", value, "fkCourseId");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("fk_course_id >=", value, "fkCourseId");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdLessThan(String value) {
            addCriterion("fk_course_id <", value, "fkCourseId");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdLessThanOrEqualTo(String value) {
            addCriterion("fk_course_id <=", value, "fkCourseId");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdLike(String value) {
            addCriterion("fk_course_id like", value, "fkCourseId");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdNotLike(String value) {
            addCriterion("fk_course_id not like", value, "fkCourseId");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdIn(List<String> values) {
            addCriterion("fk_course_id in", values, "fkCourseId");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdNotIn(List<String> values) {
            addCriterion("fk_course_id not in", values, "fkCourseId");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdBetween(String value1, String value2) {
            addCriterion("fk_course_id between", value1, value2, "fkCourseId");
            return (Criteria) this;
        }

        public Criteria andFkCourseIdNotBetween(String value1, String value2) {
            addCriterion("fk_course_id not between", value1, value2, "fkCourseId");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdIsNull() {
            addCriterion("fk_teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdIsNotNull() {
            addCriterion("fk_teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdEqualTo(String value) {
            addCriterion("fk_teacher_id =", value, "fkTeacherId");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdNotEqualTo(String value) {
            addCriterion("fk_teacher_id <>", value, "fkTeacherId");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdGreaterThan(String value) {
            addCriterion("fk_teacher_id >", value, "fkTeacherId");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("fk_teacher_id >=", value, "fkTeacherId");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdLessThan(String value) {
            addCriterion("fk_teacher_id <", value, "fkTeacherId");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("fk_teacher_id <=", value, "fkTeacherId");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdLike(String value) {
            addCriterion("fk_teacher_id like", value, "fkTeacherId");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdNotLike(String value) {
            addCriterion("fk_teacher_id not like", value, "fkTeacherId");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdIn(List<String> values) {
            addCriterion("fk_teacher_id in", values, "fkTeacherId");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdNotIn(List<String> values) {
            addCriterion("fk_teacher_id not in", values, "fkTeacherId");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdBetween(String value1, String value2) {
            addCriterion("fk_teacher_id between", value1, value2, "fkTeacherId");
            return (Criteria) this;
        }

        public Criteria andFkTeacherIdNotBetween(String value1, String value2) {
            addCriterion("fk_teacher_id not between", value1, value2, "fkTeacherId");
            return (Criteria) this;
        }

        public Criteria andFlagValidIsNull() {
            addCriterion("flag_valid is null");
            return (Criteria) this;
        }

        public Criteria andFlagValidIsNotNull() {
            addCriterion("flag_valid is not null");
            return (Criteria) this;
        }

        public Criteria andFlagValidEqualTo(Integer value) {
            addCriterion("flag_valid =", value, "flagValid");
            return (Criteria) this;
        }

        public Criteria andFlagValidNotEqualTo(Integer value) {
            addCriterion("flag_valid <>", value, "flagValid");
            return (Criteria) this;
        }

        public Criteria andFlagValidGreaterThan(Integer value) {
            addCriterion("flag_valid >", value, "flagValid");
            return (Criteria) this;
        }

        public Criteria andFlagValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag_valid >=", value, "flagValid");
            return (Criteria) this;
        }

        public Criteria andFlagValidLessThan(Integer value) {
            addCriterion("flag_valid <", value, "flagValid");
            return (Criteria) this;
        }

        public Criteria andFlagValidLessThanOrEqualTo(Integer value) {
            addCriterion("flag_valid <=", value, "flagValid");
            return (Criteria) this;
        }

        public Criteria andFlagValidIn(List<Integer> values) {
            addCriterion("flag_valid in", values, "flagValid");
            return (Criteria) this;
        }

        public Criteria andFlagValidNotIn(List<Integer> values) {
            addCriterion("flag_valid not in", values, "flagValid");
            return (Criteria) this;
        }

        public Criteria andFlagValidBetween(Integer value1, Integer value2) {
            addCriterion("flag_valid between", value1, value2, "flagValid");
            return (Criteria) this;
        }

        public Criteria andFlagValidNotBetween(Integer value1, Integer value2) {
            addCriterion("flag_valid not between", value1, value2, "flagValid");
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