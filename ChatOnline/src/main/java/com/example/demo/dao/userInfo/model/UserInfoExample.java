package com.example.demo.dao.userInfo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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
        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andULoginIDIsNull() {
            addCriterion("U_LoginID is null");
            return (Criteria) this;
        }

        public Criteria andULoginIDIsNotNull() {
            addCriterion("U_LoginID is not null");
            return (Criteria) this;
        }

        public Criteria andULoginIDEqualTo(String value) {
            addCriterion("U_LoginID =", value, "uLoginID");
            return (Criteria) this;
        }

        public Criteria andULoginIDNotEqualTo(String value) {
            addCriterion("U_LoginID <>", value, "uLoginID");
            return (Criteria) this;
        }

        public Criteria andULoginIDGreaterThan(String value) {
            addCriterion("U_LoginID >", value, "uLoginID");
            return (Criteria) this;
        }

        public Criteria andULoginIDGreaterThanOrEqualTo(String value) {
            addCriterion("U_LoginID >=", value, "uLoginID");
            return (Criteria) this;
        }

        public Criteria andULoginIDLessThan(String value) {
            addCriterion("U_LoginID <", value, "uLoginID");
            return (Criteria) this;
        }

        public Criteria andULoginIDLessThanOrEqualTo(String value) {
            addCriterion("U_LoginID <=", value, "uLoginID");
            return (Criteria) this;
        }

        public Criteria andULoginIDLike(String value) {
            addCriterion("U_LoginID like", value, "uLoginID");
            return (Criteria) this;
        }

        public Criteria andULoginIDNotLike(String value) {
            addCriterion("U_LoginID not like", value, "uLoginID");
            return (Criteria) this;
        }

        public Criteria andULoginIDIn(List<String> values) {
            addCriterion("U_LoginID in", values, "uLoginID");
            return (Criteria) this;
        }

        public Criteria andULoginIDNotIn(List<String> values) {
            addCriterion("U_LoginID not in", values, "uLoginID");
            return (Criteria) this;
        }

        public Criteria andULoginIDBetween(String value1, String value2) {
            addCriterion("U_LoginID between", value1, value2, "uLoginID");
            return (Criteria) this;
        }

        public Criteria andULoginIDNotBetween(String value1, String value2) {
            addCriterion("U_LoginID not between", value1, value2, "uLoginID");
            return (Criteria) this;
        }

        public Criteria andUNickNameIsNull() {
            addCriterion("U_NickName is null");
            return (Criteria) this;
        }

        public Criteria andUNickNameIsNotNull() {
            addCriterion("U_NickName is not null");
            return (Criteria) this;
        }

        public Criteria andUNickNameEqualTo(String value) {
            addCriterion("U_NickName =", value, "uNickName");
            return (Criteria) this;
        }

        public Criteria andUNickNameNotEqualTo(String value) {
            addCriterion("U_NickName <>", value, "uNickName");
            return (Criteria) this;
        }

        public Criteria andUNickNameGreaterThan(String value) {
            addCriterion("U_NickName >", value, "uNickName");
            return (Criteria) this;
        }

        public Criteria andUNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("U_NickName >=", value, "uNickName");
            return (Criteria) this;
        }

        public Criteria andUNickNameLessThan(String value) {
            addCriterion("U_NickName <", value, "uNickName");
            return (Criteria) this;
        }

        public Criteria andUNickNameLessThanOrEqualTo(String value) {
            addCriterion("U_NickName <=", value, "uNickName");
            return (Criteria) this;
        }

        public Criteria andUNickNameLike(String value) {
            addCriterion("U_NickName like", value, "uNickName");
            return (Criteria) this;
        }

        public Criteria andUNickNameNotLike(String value) {
            addCriterion("U_NickName not like", value, "uNickName");
            return (Criteria) this;
        }

        public Criteria andUNickNameIn(List<String> values) {
            addCriterion("U_NickName in", values, "uNickName");
            return (Criteria) this;
        }

        public Criteria andUNickNameNotIn(List<String> values) {
            addCriterion("U_NickName not in", values, "uNickName");
            return (Criteria) this;
        }

        public Criteria andUNickNameBetween(String value1, String value2) {
            addCriterion("U_NickName between", value1, value2, "uNickName");
            return (Criteria) this;
        }

        public Criteria andUNickNameNotBetween(String value1, String value2) {
            addCriterion("U_NickName not between", value1, value2, "uNickName");
            return (Criteria) this;
        }

        public Criteria andUPassWordIsNull() {
            addCriterion("U_PassWord is null");
            return (Criteria) this;
        }

        public Criteria andUPassWordIsNotNull() {
            addCriterion("U_PassWord is not null");
            return (Criteria) this;
        }

        public Criteria andUPassWordEqualTo(String value) {
            addCriterion("U_PassWord =", value, "uPassWord");
            return (Criteria) this;
        }

        public Criteria andUPassWordNotEqualTo(String value) {
            addCriterion("U_PassWord <>", value, "uPassWord");
            return (Criteria) this;
        }

        public Criteria andUPassWordGreaterThan(String value) {
            addCriterion("U_PassWord >", value, "uPassWord");
            return (Criteria) this;
        }

        public Criteria andUPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("U_PassWord >=", value, "uPassWord");
            return (Criteria) this;
        }

        public Criteria andUPassWordLessThan(String value) {
            addCriterion("U_PassWord <", value, "uPassWord");
            return (Criteria) this;
        }

        public Criteria andUPassWordLessThanOrEqualTo(String value) {
            addCriterion("U_PassWord <=", value, "uPassWord");
            return (Criteria) this;
        }

        public Criteria andUPassWordLike(String value) {
            addCriterion("U_PassWord like", value, "uPassWord");
            return (Criteria) this;
        }

        public Criteria andUPassWordNotLike(String value) {
            addCriterion("U_PassWord not like", value, "uPassWord");
            return (Criteria) this;
        }

        public Criteria andUPassWordIn(List<String> values) {
            addCriterion("U_PassWord in", values, "uPassWord");
            return (Criteria) this;
        }

        public Criteria andUPassWordNotIn(List<String> values) {
            addCriterion("U_PassWord not in", values, "uPassWord");
            return (Criteria) this;
        }

        public Criteria andUPassWordBetween(String value1, String value2) {
            addCriterion("U_PassWord between", value1, value2, "uPassWord");
            return (Criteria) this;
        }

        public Criteria andUPassWordNotBetween(String value1, String value2) {
            addCriterion("U_PassWord not between", value1, value2, "uPassWord");
            return (Criteria) this;
        }

        public Criteria andUSignaTureIsNull() {
            addCriterion("U_SignaTure is null");
            return (Criteria) this;
        }

        public Criteria andUSignaTureIsNotNull() {
            addCriterion("U_SignaTure is not null");
            return (Criteria) this;
        }

        public Criteria andUSignaTureEqualTo(String value) {
            addCriterion("U_SignaTure =", value, "uSignaTure");
            return (Criteria) this;
        }

        public Criteria andUSignaTureNotEqualTo(String value) {
            addCriterion("U_SignaTure <>", value, "uSignaTure");
            return (Criteria) this;
        }

        public Criteria andUSignaTureGreaterThan(String value) {
            addCriterion("U_SignaTure >", value, "uSignaTure");
            return (Criteria) this;
        }

        public Criteria andUSignaTureGreaterThanOrEqualTo(String value) {
            addCriterion("U_SignaTure >=", value, "uSignaTure");
            return (Criteria) this;
        }

        public Criteria andUSignaTureLessThan(String value) {
            addCriterion("U_SignaTure <", value, "uSignaTure");
            return (Criteria) this;
        }

        public Criteria andUSignaTureLessThanOrEqualTo(String value) {
            addCriterion("U_SignaTure <=", value, "uSignaTure");
            return (Criteria) this;
        }

        public Criteria andUSignaTureLike(String value) {
            addCriterion("U_SignaTure like", value, "uSignaTure");
            return (Criteria) this;
        }

        public Criteria andUSignaTureNotLike(String value) {
            addCriterion("U_SignaTure not like", value, "uSignaTure");
            return (Criteria) this;
        }

        public Criteria andUSignaTureIn(List<String> values) {
            addCriterion("U_SignaTure in", values, "uSignaTure");
            return (Criteria) this;
        }

        public Criteria andUSignaTureNotIn(List<String> values) {
            addCriterion("U_SignaTure not in", values, "uSignaTure");
            return (Criteria) this;
        }

        public Criteria andUSignaTureBetween(String value1, String value2) {
            addCriterion("U_SignaTure between", value1, value2, "uSignaTure");
            return (Criteria) this;
        }

        public Criteria andUSignaTureNotBetween(String value1, String value2) {
            addCriterion("U_SignaTure not between", value1, value2, "uSignaTure");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("U_Sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("U_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(Boolean value) {
            addCriterion("U_Sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(Boolean value) {
            addCriterion("U_Sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(Boolean value) {
            addCriterion("U_Sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("U_Sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(Boolean value) {
            addCriterion("U_Sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(Boolean value) {
            addCriterion("U_Sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<Boolean> values) {
            addCriterion("U_Sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<Boolean> values) {
            addCriterion("U_Sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(Boolean value1, Boolean value2) {
            addCriterion("U_Sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("U_Sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIsNull() {
            addCriterion("U_Birthday is null");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIsNotNull() {
            addCriterion("U_Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUBirthdayEqualTo(Date value) {
            addCriterion("U_Birthday =", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotEqualTo(Date value) {
            addCriterion("U_Birthday <>", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayGreaterThan(Date value) {
            addCriterion("U_Birthday >", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("U_Birthday >=", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayLessThan(Date value) {
            addCriterion("U_Birthday <", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("U_Birthday <=", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIn(List<Date> values) {
            addCriterion("U_Birthday in", values, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotIn(List<Date> values) {
            addCriterion("U_Birthday not in", values, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayBetween(Date value1, Date value2) {
            addCriterion("U_Birthday between", value1, value2, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("U_Birthday not between", value1, value2, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUTelephoneIsNull() {
            addCriterion("U_Telephone is null");
            return (Criteria) this;
        }

        public Criteria andUTelephoneIsNotNull() {
            addCriterion("U_Telephone is not null");
            return (Criteria) this;
        }

        public Criteria andUTelephoneEqualTo(String value) {
            addCriterion("U_Telephone =", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneNotEqualTo(String value) {
            addCriterion("U_Telephone <>", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneGreaterThan(String value) {
            addCriterion("U_Telephone >", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("U_Telephone >=", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneLessThan(String value) {
            addCriterion("U_Telephone <", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneLessThanOrEqualTo(String value) {
            addCriterion("U_Telephone <=", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneLike(String value) {
            addCriterion("U_Telephone like", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneNotLike(String value) {
            addCriterion("U_Telephone not like", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneIn(List<String> values) {
            addCriterion("U_Telephone in", values, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneNotIn(List<String> values) {
            addCriterion("U_Telephone not in", values, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneBetween(String value1, String value2) {
            addCriterion("U_Telephone between", value1, value2, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneNotBetween(String value1, String value2) {
            addCriterion("U_Telephone not between", value1, value2, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("U_Name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("U_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("U_Name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("U_Name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("U_Name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("U_Name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("U_Name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("U_Name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("U_Name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("U_Name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("U_Name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("U_Name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("U_Name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("U_Name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("U_Email is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("U_Email is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("U_Email =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("U_Email <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("U_Email >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("U_Email >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("U_Email <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("U_Email <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("U_Email like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("U_Email not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("U_Email in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("U_Email not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("U_Email between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("U_Email not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUIntroIsNull() {
            addCriterion("U_Intro is null");
            return (Criteria) this;
        }

        public Criteria andUIntroIsNotNull() {
            addCriterion("U_Intro is not null");
            return (Criteria) this;
        }

        public Criteria andUIntroEqualTo(String value) {
            addCriterion("U_Intro =", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroNotEqualTo(String value) {
            addCriterion("U_Intro <>", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroGreaterThan(String value) {
            addCriterion("U_Intro >", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroGreaterThanOrEqualTo(String value) {
            addCriterion("U_Intro >=", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroLessThan(String value) {
            addCriterion("U_Intro <", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroLessThanOrEqualTo(String value) {
            addCriterion("U_Intro <=", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroLike(String value) {
            addCriterion("U_Intro like", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroNotLike(String value) {
            addCriterion("U_Intro not like", value, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroIn(List<String> values) {
            addCriterion("U_Intro in", values, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroNotIn(List<String> values) {
            addCriterion("U_Intro not in", values, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroBetween(String value1, String value2) {
            addCriterion("U_Intro between", value1, value2, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUIntroNotBetween(String value1, String value2) {
            addCriterion("U_Intro not between", value1, value2, "uIntro");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitIsNull() {
            addCriterion("U_HeadPortrait is null");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitIsNotNull() {
            addCriterion("U_HeadPortrait is not null");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitEqualTo(String value) {
            addCriterion("U_HeadPortrait =", value, "uHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitNotEqualTo(String value) {
            addCriterion("U_HeadPortrait <>", value, "uHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitGreaterThan(String value) {
            addCriterion("U_HeadPortrait >", value, "uHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("U_HeadPortrait >=", value, "uHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitLessThan(String value) {
            addCriterion("U_HeadPortrait <", value, "uHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitLessThanOrEqualTo(String value) {
            addCriterion("U_HeadPortrait <=", value, "uHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitLike(String value) {
            addCriterion("U_HeadPortrait like", value, "uHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitNotLike(String value) {
            addCriterion("U_HeadPortrait not like", value, "uHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitIn(List<String> values) {
            addCriterion("U_HeadPortrait in", values, "uHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitNotIn(List<String> values) {
            addCriterion("U_HeadPortrait not in", values, "uHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitBetween(String value1, String value2) {
            addCriterion("U_HeadPortrait between", value1, value2, "uHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUHeadPortraitNotBetween(String value1, String value2) {
            addCriterion("U_HeadPortrait not between", value1, value2, "uHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoIsNull() {
            addCriterion("U_ShengXiao is null");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoIsNotNull() {
            addCriterion("U_ShengXiao is not null");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoEqualTo(String value) {
            addCriterion("U_ShengXiao =", value, "uShengXiao");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoNotEqualTo(String value) {
            addCriterion("U_ShengXiao <>", value, "uShengXiao");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoGreaterThan(String value) {
            addCriterion("U_ShengXiao >", value, "uShengXiao");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoGreaterThanOrEqualTo(String value) {
            addCriterion("U_ShengXiao >=", value, "uShengXiao");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoLessThan(String value) {
            addCriterion("U_ShengXiao <", value, "uShengXiao");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoLessThanOrEqualTo(String value) {
            addCriterion("U_ShengXiao <=", value, "uShengXiao");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoLike(String value) {
            addCriterion("U_ShengXiao like", value, "uShengXiao");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoNotLike(String value) {
            addCriterion("U_ShengXiao not like", value, "uShengXiao");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoIn(List<String> values) {
            addCriterion("U_ShengXiao in", values, "uShengXiao");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoNotIn(List<String> values) {
            addCriterion("U_ShengXiao not in", values, "uShengXiao");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoBetween(String value1, String value2) {
            addCriterion("U_ShengXiao between", value1, value2, "uShengXiao");
            return (Criteria) this;
        }

        public Criteria andUShengXiaoNotBetween(String value1, String value2) {
            addCriterion("U_ShengXiao not between", value1, value2, "uShengXiao");
            return (Criteria) this;
        }

        public Criteria andUAgeIsNull() {
            addCriterion("U_Age is null");
            return (Criteria) this;
        }

        public Criteria andUAgeIsNotNull() {
            addCriterion("U_Age is not null");
            return (Criteria) this;
        }

        public Criteria andUAgeEqualTo(Integer value) {
            addCriterion("U_Age =", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotEqualTo(Integer value) {
            addCriterion("U_Age <>", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeGreaterThan(Integer value) {
            addCriterion("U_Age >", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_Age >=", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeLessThan(Integer value) {
            addCriterion("U_Age <", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeLessThanOrEqualTo(Integer value) {
            addCriterion("U_Age <=", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeIn(List<Integer> values) {
            addCriterion("U_Age in", values, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotIn(List<Integer> values) {
            addCriterion("U_Age not in", values, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeBetween(Integer value1, Integer value2) {
            addCriterion("U_Age between", value1, value2, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("U_Age not between", value1, value2, "uAge");
            return (Criteria) this;
        }

        public Criteria andUConstellationIsNull() {
            addCriterion("U_Constellation is null");
            return (Criteria) this;
        }

        public Criteria andUConstellationIsNotNull() {
            addCriterion("U_Constellation is not null");
            return (Criteria) this;
        }

        public Criteria andUConstellationEqualTo(String value) {
            addCriterion("U_Constellation =", value, "uConstellation");
            return (Criteria) this;
        }

        public Criteria andUConstellationNotEqualTo(String value) {
            addCriterion("U_Constellation <>", value, "uConstellation");
            return (Criteria) this;
        }

        public Criteria andUConstellationGreaterThan(String value) {
            addCriterion("U_Constellation >", value, "uConstellation");
            return (Criteria) this;
        }

        public Criteria andUConstellationGreaterThanOrEqualTo(String value) {
            addCriterion("U_Constellation >=", value, "uConstellation");
            return (Criteria) this;
        }

        public Criteria andUConstellationLessThan(String value) {
            addCriterion("U_Constellation <", value, "uConstellation");
            return (Criteria) this;
        }

        public Criteria andUConstellationLessThanOrEqualTo(String value) {
            addCriterion("U_Constellation <=", value, "uConstellation");
            return (Criteria) this;
        }

        public Criteria andUConstellationLike(String value) {
            addCriterion("U_Constellation like", value, "uConstellation");
            return (Criteria) this;
        }

        public Criteria andUConstellationNotLike(String value) {
            addCriterion("U_Constellation not like", value, "uConstellation");
            return (Criteria) this;
        }

        public Criteria andUConstellationIn(List<String> values) {
            addCriterion("U_Constellation in", values, "uConstellation");
            return (Criteria) this;
        }

        public Criteria andUConstellationNotIn(List<String> values) {
            addCriterion("U_Constellation not in", values, "uConstellation");
            return (Criteria) this;
        }

        public Criteria andUConstellationBetween(String value1, String value2) {
            addCriterion("U_Constellation between", value1, value2, "uConstellation");
            return (Criteria) this;
        }

        public Criteria andUConstellationNotBetween(String value1, String value2) {
            addCriterion("U_Constellation not between", value1, value2, "uConstellation");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeIsNull() {
            addCriterion("U_BloodType is null");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeIsNotNull() {
            addCriterion("U_BloodType is not null");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeEqualTo(String value) {
            addCriterion("U_BloodType =", value, "uBloodType");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeNotEqualTo(String value) {
            addCriterion("U_BloodType <>", value, "uBloodType");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeGreaterThan(String value) {
            addCriterion("U_BloodType >", value, "uBloodType");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("U_BloodType >=", value, "uBloodType");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeLessThan(String value) {
            addCriterion("U_BloodType <", value, "uBloodType");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeLessThanOrEqualTo(String value) {
            addCriterion("U_BloodType <=", value, "uBloodType");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeLike(String value) {
            addCriterion("U_BloodType like", value, "uBloodType");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeNotLike(String value) {
            addCriterion("U_BloodType not like", value, "uBloodType");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeIn(List<String> values) {
            addCriterion("U_BloodType in", values, "uBloodType");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeNotIn(List<String> values) {
            addCriterion("U_BloodType not in", values, "uBloodType");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeBetween(String value1, String value2) {
            addCriterion("U_BloodType between", value1, value2, "uBloodType");
            return (Criteria) this;
        }

        public Criteria andUBloodTypeNotBetween(String value1, String value2) {
            addCriterion("U_BloodType not between", value1, value2, "uBloodType");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagIsNull() {
            addCriterion("U_SchoolTag is null");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagIsNotNull() {
            addCriterion("U_SchoolTag is not null");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagEqualTo(String value) {
            addCriterion("U_SchoolTag =", value, "uSchoolTag");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagNotEqualTo(String value) {
            addCriterion("U_SchoolTag <>", value, "uSchoolTag");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagGreaterThan(String value) {
            addCriterion("U_SchoolTag >", value, "uSchoolTag");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagGreaterThanOrEqualTo(String value) {
            addCriterion("U_SchoolTag >=", value, "uSchoolTag");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagLessThan(String value) {
            addCriterion("U_SchoolTag <", value, "uSchoolTag");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagLessThanOrEqualTo(String value) {
            addCriterion("U_SchoolTag <=", value, "uSchoolTag");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagLike(String value) {
            addCriterion("U_SchoolTag like", value, "uSchoolTag");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagNotLike(String value) {
            addCriterion("U_SchoolTag not like", value, "uSchoolTag");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagIn(List<String> values) {
            addCriterion("U_SchoolTag in", values, "uSchoolTag");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagNotIn(List<String> values) {
            addCriterion("U_SchoolTag not in", values, "uSchoolTag");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagBetween(String value1, String value2) {
            addCriterion("U_SchoolTag between", value1, value2, "uSchoolTag");
            return (Criteria) this;
        }

        public Criteria andUSchoolTagNotBetween(String value1, String value2) {
            addCriterion("U_SchoolTag not between", value1, value2, "uSchoolTag");
            return (Criteria) this;
        }

        public Criteria andUCertnoIsNull() {
            addCriterion("U_Certno is null");
            return (Criteria) this;
        }

        public Criteria andUCertnoIsNotNull() {
            addCriterion("U_Certno is not null");
            return (Criteria) this;
        }

        public Criteria andUCertnoEqualTo(Integer value) {
            addCriterion("U_Certno =", value, "uCertno");
            return (Criteria) this;
        }

        public Criteria andUCertnoNotEqualTo(Integer value) {
            addCriterion("U_Certno <>", value, "uCertno");
            return (Criteria) this;
        }

        public Criteria andUCertnoGreaterThan(Integer value) {
            addCriterion("U_Certno >", value, "uCertno");
            return (Criteria) this;
        }

        public Criteria andUCertnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_Certno >=", value, "uCertno");
            return (Criteria) this;
        }

        public Criteria andUCertnoLessThan(Integer value) {
            addCriterion("U_Certno <", value, "uCertno");
            return (Criteria) this;
        }

        public Criteria andUCertnoLessThanOrEqualTo(Integer value) {
            addCriterion("U_Certno <=", value, "uCertno");
            return (Criteria) this;
        }

        public Criteria andUCertnoIn(List<Integer> values) {
            addCriterion("U_Certno in", values, "uCertno");
            return (Criteria) this;
        }

        public Criteria andUCertnoNotIn(List<Integer> values) {
            addCriterion("U_Certno not in", values, "uCertno");
            return (Criteria) this;
        }

        public Criteria andUCertnoBetween(Integer value1, Integer value2) {
            addCriterion("U_Certno between", value1, value2, "uCertno");
            return (Criteria) this;
        }

        public Criteria andUCertnoNotBetween(Integer value1, Integer value2) {
            addCriterion("U_Certno not between", value1, value2, "uCertno");
            return (Criteria) this;
        }

        public Criteria andUVocationIsNull() {
            addCriterion("U_Vocation is null");
            return (Criteria) this;
        }

        public Criteria andUVocationIsNotNull() {
            addCriterion("U_Vocation is not null");
            return (Criteria) this;
        }

        public Criteria andUVocationEqualTo(String value) {
            addCriterion("U_Vocation =", value, "uVocation");
            return (Criteria) this;
        }

        public Criteria andUVocationNotEqualTo(String value) {
            addCriterion("U_Vocation <>", value, "uVocation");
            return (Criteria) this;
        }

        public Criteria andUVocationGreaterThan(String value) {
            addCriterion("U_Vocation >", value, "uVocation");
            return (Criteria) this;
        }

        public Criteria andUVocationGreaterThanOrEqualTo(String value) {
            addCriterion("U_Vocation >=", value, "uVocation");
            return (Criteria) this;
        }

        public Criteria andUVocationLessThan(String value) {
            addCriterion("U_Vocation <", value, "uVocation");
            return (Criteria) this;
        }

        public Criteria andUVocationLessThanOrEqualTo(String value) {
            addCriterion("U_Vocation <=", value, "uVocation");
            return (Criteria) this;
        }

        public Criteria andUVocationLike(String value) {
            addCriterion("U_Vocation like", value, "uVocation");
            return (Criteria) this;
        }

        public Criteria andUVocationNotLike(String value) {
            addCriterion("U_Vocation not like", value, "uVocation");
            return (Criteria) this;
        }

        public Criteria andUVocationIn(List<String> values) {
            addCriterion("U_Vocation in", values, "uVocation");
            return (Criteria) this;
        }

        public Criteria andUVocationNotIn(List<String> values) {
            addCriterion("U_Vocation not in", values, "uVocation");
            return (Criteria) this;
        }

        public Criteria andUVocationBetween(String value1, String value2) {
            addCriterion("U_Vocation between", value1, value2, "uVocation");
            return (Criteria) this;
        }

        public Criteria andUVocationNotBetween(String value1, String value2) {
            addCriterion("U_Vocation not between", value1, value2, "uVocation");
            return (Criteria) this;
        }

        public Criteria andUNationIDIsNull() {
            addCriterion("U_NationID is null");
            return (Criteria) this;
        }

        public Criteria andUNationIDIsNotNull() {
            addCriterion("U_NationID is not null");
            return (Criteria) this;
        }

        public Criteria andUNationIDEqualTo(Integer value) {
            addCriterion("U_NationID =", value, "uNationID");
            return (Criteria) this;
        }

        public Criteria andUNationIDNotEqualTo(Integer value) {
            addCriterion("U_NationID <>", value, "uNationID");
            return (Criteria) this;
        }

        public Criteria andUNationIDGreaterThan(Integer value) {
            addCriterion("U_NationID >", value, "uNationID");
            return (Criteria) this;
        }

        public Criteria andUNationIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_NationID >=", value, "uNationID");
            return (Criteria) this;
        }

        public Criteria andUNationIDLessThan(Integer value) {
            addCriterion("U_NationID <", value, "uNationID");
            return (Criteria) this;
        }

        public Criteria andUNationIDLessThanOrEqualTo(Integer value) {
            addCriterion("U_NationID <=", value, "uNationID");
            return (Criteria) this;
        }

        public Criteria andUNationIDIn(List<Integer> values) {
            addCriterion("U_NationID in", values, "uNationID");
            return (Criteria) this;
        }

        public Criteria andUNationIDNotIn(List<Integer> values) {
            addCriterion("U_NationID not in", values, "uNationID");
            return (Criteria) this;
        }

        public Criteria andUNationIDBetween(Integer value1, Integer value2) {
            addCriterion("U_NationID between", value1, value2, "uNationID");
            return (Criteria) this;
        }

        public Criteria andUNationIDNotBetween(Integer value1, Integer value2) {
            addCriterion("U_NationID not between", value1, value2, "uNationID");
            return (Criteria) this;
        }

        public Criteria andUFriendshipPolicyIDIsNull() {
            addCriterion("U_FriendshipPolicyID is null");
            return (Criteria) this;
        }

        public Criteria andUFriendshipPolicyIDIsNotNull() {
            addCriterion("U_FriendshipPolicyID is not null");
            return (Criteria) this;
        }

        public Criteria andUFriendshipPolicyIDEqualTo(Integer value) {
            addCriterion("U_FriendshipPolicyID =", value, "uFriendshipPolicyID");
            return (Criteria) this;
        }

        public Criteria andUFriendshipPolicyIDNotEqualTo(Integer value) {
            addCriterion("U_FriendshipPolicyID <>", value, "uFriendshipPolicyID");
            return (Criteria) this;
        }

        public Criteria andUFriendshipPolicyIDGreaterThan(Integer value) {
            addCriterion("U_FriendshipPolicyID >", value, "uFriendshipPolicyID");
            return (Criteria) this;
        }

        public Criteria andUFriendshipPolicyIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_FriendshipPolicyID >=", value, "uFriendshipPolicyID");
            return (Criteria) this;
        }

        public Criteria andUFriendshipPolicyIDLessThan(Integer value) {
            addCriterion("U_FriendshipPolicyID <", value, "uFriendshipPolicyID");
            return (Criteria) this;
        }

        public Criteria andUFriendshipPolicyIDLessThanOrEqualTo(Integer value) {
            addCriterion("U_FriendshipPolicyID <=", value, "uFriendshipPolicyID");
            return (Criteria) this;
        }

        public Criteria andUFriendshipPolicyIDIn(List<Integer> values) {
            addCriterion("U_FriendshipPolicyID in", values, "uFriendshipPolicyID");
            return (Criteria) this;
        }

        public Criteria andUFriendshipPolicyIDNotIn(List<Integer> values) {
            addCriterion("U_FriendshipPolicyID not in", values, "uFriendshipPolicyID");
            return (Criteria) this;
        }

        public Criteria andUFriendshipPolicyIDBetween(Integer value1, Integer value2) {
            addCriterion("U_FriendshipPolicyID between", value1, value2, "uFriendshipPolicyID");
            return (Criteria) this;
        }

        public Criteria andUFriendshipPolicyIDNotBetween(Integer value1, Integer value2) {
            addCriterion("U_FriendshipPolicyID not between", value1, value2, "uFriendshipPolicyID");
            return (Criteria) this;
        }

        public Criteria andUUserStateIsNull() {
            addCriterion("U_UserState is null");
            return (Criteria) this;
        }

        public Criteria andUUserStateIsNotNull() {
            addCriterion("U_UserState is not null");
            return (Criteria) this;
        }

        public Criteria andUUserStateEqualTo(String value) {
            addCriterion("U_UserState =", value, "uUserState");
            return (Criteria) this;
        }

        public Criteria andUUserStateNotEqualTo(String value) {
            addCriterion("U_UserState <>", value, "uUserState");
            return (Criteria) this;
        }

        public Criteria andUUserStateGreaterThan(String value) {
            addCriterion("U_UserState >", value, "uUserState");
            return (Criteria) this;
        }

        public Criteria andUUserStateGreaterThanOrEqualTo(String value) {
            addCriterion("U_UserState >=", value, "uUserState");
            return (Criteria) this;
        }

        public Criteria andUUserStateLessThan(String value) {
            addCriterion("U_UserState <", value, "uUserState");
            return (Criteria) this;
        }

        public Criteria andUUserStateLessThanOrEqualTo(String value) {
            addCriterion("U_UserState <=", value, "uUserState");
            return (Criteria) this;
        }

        public Criteria andUUserStateLike(String value) {
            addCriterion("U_UserState like", value, "uUserState");
            return (Criteria) this;
        }

        public Criteria andUUserStateNotLike(String value) {
            addCriterion("U_UserState not like", value, "uUserState");
            return (Criteria) this;
        }

        public Criteria andUUserStateIn(List<String> values) {
            addCriterion("U_UserState in", values, "uUserState");
            return (Criteria) this;
        }

        public Criteria andUUserStateNotIn(List<String> values) {
            addCriterion("U_UserState not in", values, "uUserState");
            return (Criteria) this;
        }

        public Criteria andUUserStateBetween(String value1, String value2) {
            addCriterion("U_UserState between", value1, value2, "uUserState");
            return (Criteria) this;
        }

        public Criteria andUUserStateNotBetween(String value1, String value2) {
            addCriterion("U_UserState not between", value1, value2, "uUserState");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionIsNull() {
            addCriterion("U_FriendPolicyQuestion is null");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionIsNotNull() {
            addCriterion("U_FriendPolicyQuestion is not null");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionEqualTo(String value) {
            addCriterion("U_FriendPolicyQuestion =", value, "uFriendPolicyQuestion");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionNotEqualTo(String value) {
            addCriterion("U_FriendPolicyQuestion <>", value, "uFriendPolicyQuestion");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionGreaterThan(String value) {
            addCriterion("U_FriendPolicyQuestion >", value, "uFriendPolicyQuestion");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("U_FriendPolicyQuestion >=", value, "uFriendPolicyQuestion");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionLessThan(String value) {
            addCriterion("U_FriendPolicyQuestion <", value, "uFriendPolicyQuestion");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionLessThanOrEqualTo(String value) {
            addCriterion("U_FriendPolicyQuestion <=", value, "uFriendPolicyQuestion");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionLike(String value) {
            addCriterion("U_FriendPolicyQuestion like", value, "uFriendPolicyQuestion");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionNotLike(String value) {
            addCriterion("U_FriendPolicyQuestion not like", value, "uFriendPolicyQuestion");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionIn(List<String> values) {
            addCriterion("U_FriendPolicyQuestion in", values, "uFriendPolicyQuestion");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionNotIn(List<String> values) {
            addCriterion("U_FriendPolicyQuestion not in", values, "uFriendPolicyQuestion");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionBetween(String value1, String value2) {
            addCriterion("U_FriendPolicyQuestion between", value1, value2, "uFriendPolicyQuestion");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyQuestionNotBetween(String value1, String value2) {
            addCriterion("U_FriendPolicyQuestion not between", value1, value2, "uFriendPolicyQuestion");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerIsNull() {
            addCriterion("U_FriendPolicyAnswer is null");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerIsNotNull() {
            addCriterion("U_FriendPolicyAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerEqualTo(String value) {
            addCriterion("U_FriendPolicyAnswer =", value, "uFriendPolicyAnswer");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerNotEqualTo(String value) {
            addCriterion("U_FriendPolicyAnswer <>", value, "uFriendPolicyAnswer");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerGreaterThan(String value) {
            addCriterion("U_FriendPolicyAnswer >", value, "uFriendPolicyAnswer");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("U_FriendPolicyAnswer >=", value, "uFriendPolicyAnswer");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerLessThan(String value) {
            addCriterion("U_FriendPolicyAnswer <", value, "uFriendPolicyAnswer");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerLessThanOrEqualTo(String value) {
            addCriterion("U_FriendPolicyAnswer <=", value, "uFriendPolicyAnswer");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerLike(String value) {
            addCriterion("U_FriendPolicyAnswer like", value, "uFriendPolicyAnswer");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerNotLike(String value) {
            addCriterion("U_FriendPolicyAnswer not like", value, "uFriendPolicyAnswer");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerIn(List<String> values) {
            addCriterion("U_FriendPolicyAnswer in", values, "uFriendPolicyAnswer");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerNotIn(List<String> values) {
            addCriterion("U_FriendPolicyAnswer not in", values, "uFriendPolicyAnswer");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerBetween(String value1, String value2) {
            addCriterion("U_FriendPolicyAnswer between", value1, value2, "uFriendPolicyAnswer");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyAnswerNotBetween(String value1, String value2) {
            addCriterion("U_FriendPolicyAnswer not between", value1, value2, "uFriendPolicyAnswer");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordIsNull() {
            addCriterion("U_FriendPolicyPassword is null");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordIsNotNull() {
            addCriterion("U_FriendPolicyPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordEqualTo(String value) {
            addCriterion("U_FriendPolicyPassword =", value, "uFriendPolicyPassword");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordNotEqualTo(String value) {
            addCriterion("U_FriendPolicyPassword <>", value, "uFriendPolicyPassword");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordGreaterThan(String value) {
            addCriterion("U_FriendPolicyPassword >", value, "uFriendPolicyPassword");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("U_FriendPolicyPassword >=", value, "uFriendPolicyPassword");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordLessThan(String value) {
            addCriterion("U_FriendPolicyPassword <", value, "uFriendPolicyPassword");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordLessThanOrEqualTo(String value) {
            addCriterion("U_FriendPolicyPassword <=", value, "uFriendPolicyPassword");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordLike(String value) {
            addCriterion("U_FriendPolicyPassword like", value, "uFriendPolicyPassword");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordNotLike(String value) {
            addCriterion("U_FriendPolicyPassword not like", value, "uFriendPolicyPassword");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordIn(List<String> values) {
            addCriterion("U_FriendPolicyPassword in", values, "uFriendPolicyPassword");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordNotIn(List<String> values) {
            addCriterion("U_FriendPolicyPassword not in", values, "uFriendPolicyPassword");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordBetween(String value1, String value2) {
            addCriterion("U_FriendPolicyPassword between", value1, value2, "uFriendPolicyPassword");
            return (Criteria) this;
        }

        public Criteria andUFriendPolicyPasswordNotBetween(String value1, String value2) {
            addCriterion("U_FriendPolicyPassword not between", value1, value2, "uFriendPolicyPassword");
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