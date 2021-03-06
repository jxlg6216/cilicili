package cn.rk6216.entityandtools.entitys;

import java.util.ArrayList;
import java.util.List;

public class VideoInformationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table video_information
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table video_information
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table video_information
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_information
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public VideoInformationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_information
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_information
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_information
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_information
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_information
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_information
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_information
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
     * This method corresponds to the database table video_information
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
     * This method corresponds to the database table video_information
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_information
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
     * This class corresponds to the database table video_information
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

        public Criteria andVideoTitleIsNull() {
            addCriterion("video_title is null");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIsNotNull() {
            addCriterion("video_title is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTitleEqualTo(String value) {
            addCriterion("video_title =", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotEqualTo(String value) {
            addCriterion("video_title <>", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleGreaterThan(String value) {
            addCriterion("video_title >", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("video_title >=", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLessThan(String value) {
            addCriterion("video_title <", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLessThanOrEqualTo(String value) {
            addCriterion("video_title <=", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLike(String value) {
            addCriterion("video_title like", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotLike(String value) {
            addCriterion("video_title not like", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIn(List<String> values) {
            addCriterion("video_title in", values, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotIn(List<String> values) {
            addCriterion("video_title not in", values, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleBetween(String value1, String value2) {
            addCriterion("video_title between", value1, value2, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotBetween(String value1, String value2) {
            addCriterion("video_title not between", value1, value2, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionIsNull() {
            addCriterion("video_introduction is null");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionIsNotNull() {
            addCriterion("video_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionEqualTo(String value) {
            addCriterion("video_introduction =", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionNotEqualTo(String value) {
            addCriterion("video_introduction <>", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionGreaterThan(String value) {
            addCriterion("video_introduction >", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("video_introduction >=", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionLessThan(String value) {
            addCriterion("video_introduction <", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionLessThanOrEqualTo(String value) {
            addCriterion("video_introduction <=", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionLike(String value) {
            addCriterion("video_introduction like", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionNotLike(String value) {
            addCriterion("video_introduction not like", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionIn(List<String> values) {
            addCriterion("video_introduction in", values, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionNotIn(List<String> values) {
            addCriterion("video_introduction not in", values, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionBetween(String value1, String value2) {
            addCriterion("video_introduction between", value1, value2, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionNotBetween(String value1, String value2) {
            addCriterion("video_introduction not between", value1, value2, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorIsNull() {
            addCriterion("video_author is null");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorIsNotNull() {
            addCriterion("video_author is not null");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorEqualTo(String value) {
            addCriterion("video_author =", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorNotEqualTo(String value) {
            addCriterion("video_author <>", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorGreaterThan(String value) {
            addCriterion("video_author >", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("video_author >=", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorLessThan(String value) {
            addCriterion("video_author <", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorLessThanOrEqualTo(String value) {
            addCriterion("video_author <=", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorLike(String value) {
            addCriterion("video_author like", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorNotLike(String value) {
            addCriterion("video_author not like", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorIn(List<String> values) {
            addCriterion("video_author in", values, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorNotIn(List<String> values) {
            addCriterion("video_author not in", values, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorBetween(String value1, String value2) {
            addCriterion("video_author between", value1, value2, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorNotBetween(String value1, String value2) {
            addCriterion("video_author not between", value1, value2, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIsNull() {
            addCriterion("video_status is null");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIsNotNull() {
            addCriterion("video_status is not null");
            return (Criteria) this;
        }

        public Criteria andVideoStatusEqualTo(String value) {
            addCriterion("video_status =", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotEqualTo(String value) {
            addCriterion("video_status <>", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusGreaterThan(String value) {
            addCriterion("video_status >", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("video_status >=", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLessThan(String value) {
            addCriterion("video_status <", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLessThanOrEqualTo(String value) {
            addCriterion("video_status <=", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLike(String value) {
            addCriterion("video_status like", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotLike(String value) {
            addCriterion("video_status not like", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIn(List<String> values) {
            addCriterion("video_status in", values, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotIn(List<String> values) {
            addCriterion("video_status not in", values, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusBetween(String value1, String value2) {
            addCriterion("video_status between", value1, value2, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotBetween(String value1, String value2) {
            addCriterion("video_status not between", value1, value2, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNull() {
            addCriterion("video_time is null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNotNull() {
            addCriterion("video_time is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeEqualTo(String value) {
            addCriterion("video_time =", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotEqualTo(String value) {
            addCriterion("video_time <>", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThan(String value) {
            addCriterion("video_time >", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("video_time >=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThan(String value) {
            addCriterion("video_time <", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThanOrEqualTo(String value) {
            addCriterion("video_time <=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLike(String value) {
            addCriterion("video_time like", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotLike(String value) {
            addCriterion("video_time not like", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIn(List<String> values) {
            addCriterion("video_time in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotIn(List<String> values) {
            addCriterion("video_time not in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeBetween(String value1, String value2) {
            addCriterion("video_time between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotBetween(String value1, String value2) {
            addCriterion("video_time not between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVidoePraiseIsNull() {
            addCriterion("vidoe_praise is null");
            return (Criteria) this;
        }

        public Criteria andVidoePraiseIsNotNull() {
            addCriterion("vidoe_praise is not null");
            return (Criteria) this;
        }

        public Criteria andVidoePraiseEqualTo(Integer value) {
            addCriterion("vidoe_praise =", value, "vidoePraise");
            return (Criteria) this;
        }

        public Criteria andVidoePraiseNotEqualTo(Integer value) {
            addCriterion("vidoe_praise <>", value, "vidoePraise");
            return (Criteria) this;
        }

        public Criteria andVidoePraiseGreaterThan(Integer value) {
            addCriterion("vidoe_praise >", value, "vidoePraise");
            return (Criteria) this;
        }

        public Criteria andVidoePraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("vidoe_praise >=", value, "vidoePraise");
            return (Criteria) this;
        }

        public Criteria andVidoePraiseLessThan(Integer value) {
            addCriterion("vidoe_praise <", value, "vidoePraise");
            return (Criteria) this;
        }

        public Criteria andVidoePraiseLessThanOrEqualTo(Integer value) {
            addCriterion("vidoe_praise <=", value, "vidoePraise");
            return (Criteria) this;
        }

        public Criteria andVidoePraiseIn(List<Integer> values) {
            addCriterion("vidoe_praise in", values, "vidoePraise");
            return (Criteria) this;
        }

        public Criteria andVidoePraiseNotIn(List<Integer> values) {
            addCriterion("vidoe_praise not in", values, "vidoePraise");
            return (Criteria) this;
        }

        public Criteria andVidoePraiseBetween(Integer value1, Integer value2) {
            addCriterion("vidoe_praise between", value1, value2, "vidoePraise");
            return (Criteria) this;
        }

        public Criteria andVidoePraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("vidoe_praise not between", value1, value2, "vidoePraise");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionsIsNull() {
            addCriterion("video_collections is null");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionsIsNotNull() {
            addCriterion("video_collections is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionsEqualTo(Integer value) {
            addCriterion("video_collections =", value, "videoCollections");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionsNotEqualTo(Integer value) {
            addCriterion("video_collections <>", value, "videoCollections");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionsGreaterThan(Integer value) {
            addCriterion("video_collections >", value, "videoCollections");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_collections >=", value, "videoCollections");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionsLessThan(Integer value) {
            addCriterion("video_collections <", value, "videoCollections");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionsLessThanOrEqualTo(Integer value) {
            addCriterion("video_collections <=", value, "videoCollections");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionsIn(List<Integer> values) {
            addCriterion("video_collections in", values, "videoCollections");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionsNotIn(List<Integer> values) {
            addCriterion("video_collections not in", values, "videoCollections");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionsBetween(Integer value1, Integer value2) {
            addCriterion("video_collections between", value1, value2, "videoCollections");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionsNotBetween(Integer value1, Integer value2) {
            addCriterion("video_collections not between", value1, value2, "videoCollections");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNull() {
            addCriterion("video_type is null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNotNull() {
            addCriterion("video_type is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeEqualTo(String value) {
            addCriterion("video_type =", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotEqualTo(String value) {
            addCriterion("video_type <>", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThan(String value) {
            addCriterion("video_type >", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("video_type >=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThan(String value) {
            addCriterion("video_type <", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThanOrEqualTo(String value) {
            addCriterion("video_type <=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLike(String value) {
            addCriterion("video_type like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotLike(String value) {
            addCriterion("video_type not like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIn(List<String> values) {
            addCriterion("video_type in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotIn(List<String> values) {
            addCriterion("video_type not in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeBetween(String value1, String value2) {
            addCriterion("video_type between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotBetween(String value1, String value2) {
            addCriterion("video_type not between", value1, value2, "videoType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table video_information
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
     * This class corresponds to the database table video_information
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