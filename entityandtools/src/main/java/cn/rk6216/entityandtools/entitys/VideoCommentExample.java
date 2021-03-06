package cn.rk6216.entityandtools.entitys;

import java.util.ArrayList;
import java.util.List;

public class VideoCommentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public VideoCommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
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
     * This method corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(String value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(String value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(String value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(String value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(String value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(String value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLike(String value) {
            addCriterion("comment_id like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotLike(String value) {
            addCriterion("comment_id not like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<String> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<String> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(String value1, String value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(String value1, String value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(String value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(String value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(String value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(String value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(String value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(String value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLike(String value) {
            addCriterion("video_id like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotLike(String value) {
            addCriterion("video_id not like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<String> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<String> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(String value1, String value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(String value1, String value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andCommentValueIsNull() {
            addCriterion("comment_value is null");
            return (Criteria) this;
        }

        public Criteria andCommentValueIsNotNull() {
            addCriterion("comment_value is not null");
            return (Criteria) this;
        }

        public Criteria andCommentValueEqualTo(String value) {
            addCriterion("comment_value =", value, "commentValue");
            return (Criteria) this;
        }

        public Criteria andCommentValueNotEqualTo(String value) {
            addCriterion("comment_value <>", value, "commentValue");
            return (Criteria) this;
        }

        public Criteria andCommentValueGreaterThan(String value) {
            addCriterion("comment_value >", value, "commentValue");
            return (Criteria) this;
        }

        public Criteria andCommentValueGreaterThanOrEqualTo(String value) {
            addCriterion("comment_value >=", value, "commentValue");
            return (Criteria) this;
        }

        public Criteria andCommentValueLessThan(String value) {
            addCriterion("comment_value <", value, "commentValue");
            return (Criteria) this;
        }

        public Criteria andCommentValueLessThanOrEqualTo(String value) {
            addCriterion("comment_value <=", value, "commentValue");
            return (Criteria) this;
        }

        public Criteria andCommentValueLike(String value) {
            addCriterion("comment_value like", value, "commentValue");
            return (Criteria) this;
        }

        public Criteria andCommentValueNotLike(String value) {
            addCriterion("comment_value not like", value, "commentValue");
            return (Criteria) this;
        }

        public Criteria andCommentValueIn(List<String> values) {
            addCriterion("comment_value in", values, "commentValue");
            return (Criteria) this;
        }

        public Criteria andCommentValueNotIn(List<String> values) {
            addCriterion("comment_value not in", values, "commentValue");
            return (Criteria) this;
        }

        public Criteria andCommentValueBetween(String value1, String value2) {
            addCriterion("comment_value between", value1, value2, "commentValue");
            return (Criteria) this;
        }

        public Criteria andCommentValueNotBetween(String value1, String value2) {
            addCriterion("comment_value not between", value1, value2, "commentValue");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameIsNull() {
            addCriterion("comment_username is null");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameIsNotNull() {
            addCriterion("comment_username is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameEqualTo(String value) {
            addCriterion("comment_username =", value, "commentUsername");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameNotEqualTo(String value) {
            addCriterion("comment_username <>", value, "commentUsername");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameGreaterThan(String value) {
            addCriterion("comment_username >", value, "commentUsername");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("comment_username >=", value, "commentUsername");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameLessThan(String value) {
            addCriterion("comment_username <", value, "commentUsername");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameLessThanOrEqualTo(String value) {
            addCriterion("comment_username <=", value, "commentUsername");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameLike(String value) {
            addCriterion("comment_username like", value, "commentUsername");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameNotLike(String value) {
            addCriterion("comment_username not like", value, "commentUsername");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameIn(List<String> values) {
            addCriterion("comment_username in", values, "commentUsername");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameNotIn(List<String> values) {
            addCriterion("comment_username not in", values, "commentUsername");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameBetween(String value1, String value2) {
            addCriterion("comment_username between", value1, value2, "commentUsername");
            return (Criteria) this;
        }

        public Criteria andCommentUsernameNotBetween(String value1, String value2) {
            addCriterion("comment_username not between", value1, value2, "commentUsername");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNull() {
            addCriterion("comment_status is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(String value) {
            addCriterion("comment_status =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(String value) {
            addCriterion("comment_status <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(String value) {
            addCriterion("comment_status >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("comment_status >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(String value) {
            addCriterion("comment_status <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(String value) {
            addCriterion("comment_status <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLike(String value) {
            addCriterion("comment_status like", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotLike(String value) {
            addCriterion("comment_status not like", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<String> values) {
            addCriterion("comment_status in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<String> values) {
            addCriterion("comment_status not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(String value1, String value2) {
            addCriterion("comment_status between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(String value1, String value2) {
            addCriterion("comment_status not between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseIsNull() {
            addCriterion("comment_praise is null");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseIsNotNull() {
            addCriterion("comment_praise is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseEqualTo(Integer value) {
            addCriterion("comment_praise =", value, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseNotEqualTo(Integer value) {
            addCriterion("comment_praise <>", value, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseGreaterThan(Integer value) {
            addCriterion("comment_praise >", value, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_praise >=", value, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseLessThan(Integer value) {
            addCriterion("comment_praise <", value, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("comment_praise <=", value, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseIn(List<Integer> values) {
            addCriterion("comment_praise in", values, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseNotIn(List<Integer> values) {
            addCriterion("comment_praise not in", values, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseBetween(Integer value1, Integer value2) {
            addCriterion("comment_praise between", value1, value2, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_praise not between", value1, value2, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(String value) {
            addCriterion("comment_time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(String value) {
            addCriterion("comment_time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(String value) {
            addCriterion("comment_time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("comment_time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(String value) {
            addCriterion("comment_time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(String value) {
            addCriterion("comment_time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLike(String value) {
            addCriterion("comment_time like", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotLike(String value) {
            addCriterion("comment_time not like", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<String> values) {
            addCriterion("comment_time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<String> values) {
            addCriterion("comment_time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(String value1, String value2) {
            addCriterion("comment_time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(String value1, String value2) {
            addCriterion("comment_time not between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andLocationTimeIsNull() {
            addCriterion("location_time is null");
            return (Criteria) this;
        }

        public Criteria andLocationTimeIsNotNull() {
            addCriterion("location_time is not null");
            return (Criteria) this;
        }

        public Criteria andLocationTimeEqualTo(String value) {
            addCriterion("location_time =", value, "locationTime");
            return (Criteria) this;
        }

        public Criteria andLocationTimeNotEqualTo(String value) {
            addCriterion("location_time <>", value, "locationTime");
            return (Criteria) this;
        }

        public Criteria andLocationTimeGreaterThan(String value) {
            addCriterion("location_time >", value, "locationTime");
            return (Criteria) this;
        }

        public Criteria andLocationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("location_time >=", value, "locationTime");
            return (Criteria) this;
        }

        public Criteria andLocationTimeLessThan(String value) {
            addCriterion("location_time <", value, "locationTime");
            return (Criteria) this;
        }

        public Criteria andLocationTimeLessThanOrEqualTo(String value) {
            addCriterion("location_time <=", value, "locationTime");
            return (Criteria) this;
        }

        public Criteria andLocationTimeLike(String value) {
            addCriterion("location_time like", value, "locationTime");
            return (Criteria) this;
        }

        public Criteria andLocationTimeNotLike(String value) {
            addCriterion("location_time not like", value, "locationTime");
            return (Criteria) this;
        }

        public Criteria andLocationTimeIn(List<String> values) {
            addCriterion("location_time in", values, "locationTime");
            return (Criteria) this;
        }

        public Criteria andLocationTimeNotIn(List<String> values) {
            addCriterion("location_time not in", values, "locationTime");
            return (Criteria) this;
        }

        public Criteria andLocationTimeBetween(String value1, String value2) {
            addCriterion("location_time between", value1, value2, "locationTime");
            return (Criteria) this;
        }

        public Criteria andLocationTimeNotBetween(String value1, String value2) {
            addCriterion("location_time not between", value1, value2, "locationTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table video_comment
     *
     * @mbggenerated do_not_delete_during_merge Sun Dec 22 17:05:56 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table video_comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
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