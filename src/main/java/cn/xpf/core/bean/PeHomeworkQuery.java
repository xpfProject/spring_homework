package cn.xpf.core.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PeHomeworkQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public PeHomeworkQuery() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreatUserIsNull() {
            addCriterion("creat_user is null");
            return (Criteria) this;
        }

        public Criteria andCreatUserIsNotNull() {
            addCriterion("creat_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreatUserEqualTo(String value) {
            addCriterion("creat_user =", value, "creatUser");
            return (Criteria) this;
        }

        public Criteria andCreatUserNotEqualTo(String value) {
            addCriterion("creat_user <>", value, "creatUser");
            return (Criteria) this;
        }

        public Criteria andCreatUserGreaterThan(String value) {
            addCriterion("creat_user >", value, "creatUser");
            return (Criteria) this;
        }

        public Criteria andCreatUserGreaterThanOrEqualTo(String value) {
            addCriterion("creat_user >=", value, "creatUser");
            return (Criteria) this;
        }

        public Criteria andCreatUserLessThan(String value) {
            addCriterion("creat_user <", value, "creatUser");
            return (Criteria) this;
        }

        public Criteria andCreatUserLessThanOrEqualTo(String value) {
            addCriterion("creat_user <=", value, "creatUser");
            return (Criteria) this;
        }

        public Criteria andCreatUserLike(String value) {
            addCriterion("creat_user like", value, "creatUser");
            return (Criteria) this;
        }

        public Criteria andCreatUserNotLike(String value) {
            addCriterion("creat_user not like", value, "creatUser");
            return (Criteria) this;
        }

        public Criteria andCreatUserIn(List<String> values) {
            addCriterion("creat_user in", values, "creatUser");
            return (Criteria) this;
        }

        public Criteria andCreatUserNotIn(List<String> values) {
            addCriterion("creat_user not in", values, "creatUser");
            return (Criteria) this;
        }

        public Criteria andCreatUserBetween(String value1, String value2) {
            addCriterion("creat_user between", value1, value2, "creatUser");
            return (Criteria) this;
        }

        public Criteria andCreatUserNotBetween(String value1, String value2) {
            addCriterion("creat_user not between", value1, value2, "creatUser");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andShowScoreIsNull() {
            addCriterion("show_score is null");
            return (Criteria) this;
        }

        public Criteria andShowScoreIsNotNull() {
            addCriterion("show_score is not null");
            return (Criteria) this;
        }

        public Criteria andShowScoreEqualTo(Integer value) {
            addCriterion("show_score =", value, "showScore");
            return (Criteria) this;
        }

        public Criteria andShowScoreNotEqualTo(Integer value) {
            addCriterion("show_score <>", value, "showScore");
            return (Criteria) this;
        }

        public Criteria andShowScoreGreaterThan(Integer value) {
            addCriterion("show_score >", value, "showScore");
            return (Criteria) this;
        }

        public Criteria andShowScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_score >=", value, "showScore");
            return (Criteria) this;
        }

        public Criteria andShowScoreLessThan(Integer value) {
            addCriterion("show_score <", value, "showScore");
            return (Criteria) this;
        }

        public Criteria andShowScoreLessThanOrEqualTo(Integer value) {
            addCriterion("show_score <=", value, "showScore");
            return (Criteria) this;
        }

        public Criteria andShowScoreIn(List<Integer> values) {
            addCriterion("show_score in", values, "showScore");
            return (Criteria) this;
        }

        public Criteria andShowScoreNotIn(List<Integer> values) {
            addCriterion("show_score not in", values, "showScore");
            return (Criteria) this;
        }

        public Criteria andShowScoreBetween(Integer value1, Integer value2) {
            addCriterion("show_score between", value1, value2, "showScore");
            return (Criteria) this;
        }

        public Criteria andShowScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("show_score not between", value1, value2, "showScore");
            return (Criteria) this;
        }

        public Criteria andShowAnswerIsNull() {
            addCriterion("show_answer is null");
            return (Criteria) this;
        }

        public Criteria andShowAnswerIsNotNull() {
            addCriterion("show_answer is not null");
            return (Criteria) this;
        }

        public Criteria andShowAnswerEqualTo(Integer value) {
            addCriterion("show_answer =", value, "showAnswer");
            return (Criteria) this;
        }

        public Criteria andShowAnswerNotEqualTo(Integer value) {
            addCriterion("show_answer <>", value, "showAnswer");
            return (Criteria) this;
        }

        public Criteria andShowAnswerGreaterThan(Integer value) {
            addCriterion("show_answer >", value, "showAnswer");
            return (Criteria) this;
        }

        public Criteria andShowAnswerGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_answer >=", value, "showAnswer");
            return (Criteria) this;
        }

        public Criteria andShowAnswerLessThan(Integer value) {
            addCriterion("show_answer <", value, "showAnswer");
            return (Criteria) this;
        }

        public Criteria andShowAnswerLessThanOrEqualTo(Integer value) {
            addCriterion("show_answer <=", value, "showAnswer");
            return (Criteria) this;
        }

        public Criteria andShowAnswerIn(List<Integer> values) {
            addCriterion("show_answer in", values, "showAnswer");
            return (Criteria) this;
        }

        public Criteria andShowAnswerNotIn(List<Integer> values) {
            addCriterion("show_answer not in", values, "showAnswer");
            return (Criteria) this;
        }

        public Criteria andShowAnswerBetween(Integer value1, Integer value2) {
            addCriterion("show_answer between", value1, value2, "showAnswer");
            return (Criteria) this;
        }

        public Criteria andShowAnswerNotBetween(Integer value1, Integer value2) {
            addCriterion("show_answer not between", value1, value2, "showAnswer");
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