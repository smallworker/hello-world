package cn.test.entity.cadDevices;

import java.util.ArrayList;
import java.util.List;

public class BuildingCadDevicesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int start = -1;

    protected int end = -1;

    public BuildingCadDevicesExample() {
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

    public void setStart(int start) {
        this.start=start;
    }

    public int getStart() {
        return start;
    }

    public void setEnd(int end) {
        this.end=end;
    }

    public int getEnd() {
        return end;
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

        public Criteria andBcdidIsNull() {
            addCriterion("BcdId is null");
            return (Criteria) this;
        }

        public Criteria andBcdidIsNotNull() {
            addCriterion("BcdId is not null");
            return (Criteria) this;
        }

        public Criteria andBcdidEqualTo(Long value) {
            addCriterion("BcdId =", value, "bcdid");
            return (Criteria) this;
        }

        public Criteria andBcdidNotEqualTo(Long value) {
            addCriterion("BcdId <>", value, "bcdid");
            return (Criteria) this;
        }

        public Criteria andBcdidGreaterThan(Long value) {
            addCriterion("BcdId >", value, "bcdid");
            return (Criteria) this;
        }

        public Criteria andBcdidGreaterThanOrEqualTo(Long value) {
            addCriterion("BcdId >=", value, "bcdid");
            return (Criteria) this;
        }

        public Criteria andBcdidLessThan(Long value) {
            addCriterion("BcdId <", value, "bcdid");
            return (Criteria) this;
        }

        public Criteria andBcdidLessThanOrEqualTo(Long value) {
            addCriterion("BcdId <=", value, "bcdid");
            return (Criteria) this;
        }

        public Criteria andBcdidIn(List<Long> values) {
            addCriterion("BcdId in", values, "bcdid");
            return (Criteria) this;
        }

        public Criteria andBcdidNotIn(List<Long> values) {
            addCriterion("BcdId not in", values, "bcdid");
            return (Criteria) this;
        }

        public Criteria andBcdidBetween(Long value1, Long value2) {
            addCriterion("BcdId between", value1, value2, "bcdid");
            return (Criteria) this;
        }

        public Criteria andBcdidNotBetween(Long value1, Long value2) {
            addCriterion("BcdId not between", value1, value2, "bcdid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNull() {
            addCriterion("DeviceId is null");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNotNull() {
            addCriterion("DeviceId is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceidEqualTo(Long value) {
            addCriterion("DeviceId =", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotEqualTo(Long value) {
            addCriterion("DeviceId <>", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThan(Long value) {
            addCriterion("DeviceId >", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThanOrEqualTo(Long value) {
            addCriterion("DeviceId >=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThan(Long value) {
            addCriterion("DeviceId <", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThanOrEqualTo(Long value) {
            addCriterion("DeviceId <=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIn(List<Long> values) {
            addCriterion("DeviceId in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotIn(List<Long> values) {
            addCriterion("DeviceId not in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidBetween(Long value1, Long value2) {
            addCriterion("DeviceId between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotBetween(Long value1, Long value2) {
            addCriterion("DeviceId not between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("Fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("Fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("Fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("Fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("Fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("Fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("Fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("Fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("Fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("Fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("Fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andLeftpointIsNull() {
            addCriterion("LeftPoint is null");
            return (Criteria) this;
        }

        public Criteria andLeftpointIsNotNull() {
            addCriterion("LeftPoint is not null");
            return (Criteria) this;
        }

        public Criteria andLeftpointEqualTo(String value) {
            addCriterion("LeftPoint =", value, "leftpoint");
            return (Criteria) this;
        }

        public Criteria andLeftpointNotEqualTo(String value) {
            addCriterion("LeftPoint <>", value, "leftpoint");
            return (Criteria) this;
        }

        public Criteria andLeftpointGreaterThan(String value) {
            addCriterion("LeftPoint >", value, "leftpoint");
            return (Criteria) this;
        }

        public Criteria andLeftpointGreaterThanOrEqualTo(String value) {
            addCriterion("LeftPoint >=", value, "leftpoint");
            return (Criteria) this;
        }

        public Criteria andLeftpointLessThan(String value) {
            addCriterion("LeftPoint <", value, "leftpoint");
            return (Criteria) this;
        }

        public Criteria andLeftpointLessThanOrEqualTo(String value) {
            addCriterion("LeftPoint <=", value, "leftpoint");
            return (Criteria) this;
        }

        public Criteria andLeftpointLike(String value) {
            addCriterion("LeftPoint like", value, "leftpoint");
            return (Criteria) this;
        }

        public Criteria andLeftpointNotLike(String value) {
            addCriterion("LeftPoint not like", value, "leftpoint");
            return (Criteria) this;
        }

        public Criteria andLeftpointIn(List<String> values) {
            addCriterion("LeftPoint in", values, "leftpoint");
            return (Criteria) this;
        }

        public Criteria andLeftpointNotIn(List<String> values) {
            addCriterion("LeftPoint not in", values, "leftpoint");
            return (Criteria) this;
        }

        public Criteria andLeftpointBetween(String value1, String value2) {
            addCriterion("LeftPoint between", value1, value2, "leftpoint");
            return (Criteria) this;
        }

        public Criteria andLeftpointNotBetween(String value1, String value2) {
            addCriterion("LeftPoint not between", value1, value2, "leftpoint");
            return (Criteria) this;
        }

        public Criteria andToppointIsNull() {
            addCriterion("TopPoint is null");
            return (Criteria) this;
        }

        public Criteria andToppointIsNotNull() {
            addCriterion("TopPoint is not null");
            return (Criteria) this;
        }

        public Criteria andToppointEqualTo(String value) {
            addCriterion("TopPoint =", value, "toppoint");
            return (Criteria) this;
        }

        public Criteria andToppointNotEqualTo(String value) {
            addCriterion("TopPoint <>", value, "toppoint");
            return (Criteria) this;
        }

        public Criteria andToppointGreaterThan(String value) {
            addCriterion("TopPoint >", value, "toppoint");
            return (Criteria) this;
        }

        public Criteria andToppointGreaterThanOrEqualTo(String value) {
            addCriterion("TopPoint >=", value, "toppoint");
            return (Criteria) this;
        }

        public Criteria andToppointLessThan(String value) {
            addCriterion("TopPoint <", value, "toppoint");
            return (Criteria) this;
        }

        public Criteria andToppointLessThanOrEqualTo(String value) {
            addCriterion("TopPoint <=", value, "toppoint");
            return (Criteria) this;
        }

        public Criteria andToppointLike(String value) {
            addCriterion("TopPoint like", value, "toppoint");
            return (Criteria) this;
        }

        public Criteria andToppointNotLike(String value) {
            addCriterion("TopPoint not like", value, "toppoint");
            return (Criteria) this;
        }

        public Criteria andToppointIn(List<String> values) {
            addCriterion("TopPoint in", values, "toppoint");
            return (Criteria) this;
        }

        public Criteria andToppointNotIn(List<String> values) {
            addCriterion("TopPoint not in", values, "toppoint");
            return (Criteria) this;
        }

        public Criteria andToppointBetween(String value1, String value2) {
            addCriterion("TopPoint between", value1, value2, "toppoint");
            return (Criteria) this;
        }

        public Criteria andToppointNotBetween(String value1, String value2) {
            addCriterion("TopPoint not between", value1, value2, "toppoint");
            return (Criteria) this;
        }

        public Criteria andNvrchannelIsNull() {
            addCriterion("NvrChannel is null");
            return (Criteria) this;
        }

        public Criteria andNvrchannelIsNotNull() {
            addCriterion("NvrChannel is not null");
            return (Criteria) this;
        }

        public Criteria andNvrchannelEqualTo(String value) {
            addCriterion("NvrChannel =", value, "nvrchannel");
            return (Criteria) this;
        }

        public Criteria andNvrchannelNotEqualTo(String value) {
            addCriterion("NvrChannel <>", value, "nvrchannel");
            return (Criteria) this;
        }

        public Criteria andNvrchannelGreaterThan(String value) {
            addCriterion("NvrChannel >", value, "nvrchannel");
            return (Criteria) this;
        }

        public Criteria andNvrchannelGreaterThanOrEqualTo(String value) {
            addCriterion("NvrChannel >=", value, "nvrchannel");
            return (Criteria) this;
        }

        public Criteria andNvrchannelLessThan(String value) {
            addCriterion("NvrChannel <", value, "nvrchannel");
            return (Criteria) this;
        }

        public Criteria andNvrchannelLessThanOrEqualTo(String value) {
            addCriterion("NvrChannel <=", value, "nvrchannel");
            return (Criteria) this;
        }

        public Criteria andNvrchannelLike(String value) {
            addCriterion("NvrChannel like", value, "nvrchannel");
            return (Criteria) this;
        }

        public Criteria andNvrchannelNotLike(String value) {
            addCriterion("NvrChannel not like", value, "nvrchannel");
            return (Criteria) this;
        }

        public Criteria andNvrchannelIn(List<String> values) {
            addCriterion("NvrChannel in", values, "nvrchannel");
            return (Criteria) this;
        }

        public Criteria andNvrchannelNotIn(List<String> values) {
            addCriterion("NvrChannel not in", values, "nvrchannel");
            return (Criteria) this;
        }

        public Criteria andNvrchannelBetween(String value1, String value2) {
            addCriterion("NvrChannel between", value1, value2, "nvrchannel");
            return (Criteria) this;
        }

        public Criteria andNvrchannelNotBetween(String value1, String value2) {
            addCriterion("NvrChannel not between", value1, value2, "nvrchannel");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNull() {
            addCriterion("DeviceType is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNotNull() {
            addCriterion("DeviceType is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeEqualTo(Integer value) {
            addCriterion("DeviceType =", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotEqualTo(Integer value) {
            addCriterion("DeviceType <>", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThan(Integer value) {
            addCriterion("DeviceType >", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DeviceType >=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThan(Integer value) {
            addCriterion("DeviceType <", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThanOrEqualTo(Integer value) {
            addCriterion("DeviceType <=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIn(List<Integer> values) {
            addCriterion("DeviceType in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotIn(List<Integer> values) {
            addCriterion("DeviceType not in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeBetween(Integer value1, Integer value2) {
            addCriterion("DeviceType between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DeviceType not between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("ClientId is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("ClientId is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(Integer value) {
            addCriterion("ClientId =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(Integer value) {
            addCriterion("ClientId <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(Integer value) {
            addCriterion("ClientId >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClientId >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(Integer value) {
            addCriterion("ClientId <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(Integer value) {
            addCriterion("ClientId <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<Integer> values) {
            addCriterion("ClientId in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<Integer> values) {
            addCriterion("ClientId not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(Integer value1, Integer value2) {
            addCriterion("ClientId between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(Integer value1, Integer value2) {
            addCriterion("ClientId not between", value1, value2, "clientid");
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