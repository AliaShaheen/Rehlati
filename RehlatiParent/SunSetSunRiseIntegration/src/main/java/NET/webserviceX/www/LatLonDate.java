/**
 * LatLonDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public class LatLonDate  implements java.io.Serializable {
    private float latitude;

    private float longitude;

    private float sunSetTime;

    private float sunRiseTime;

    private int timeZone;

    private int day;

    private int month;

    private int year;

    public LatLonDate() {
    }

    public LatLonDate(
           float latitude,
           float longitude,
           float sunSetTime,
           float sunRiseTime,
           int timeZone,
           int day,
           int month,
           int year) {
           this.latitude = latitude;
           this.longitude = longitude;
           this.sunSetTime = sunSetTime;
           this.sunRiseTime = sunRiseTime;
           this.timeZone = timeZone;
           this.day = day;
           this.month = month;
           this.year = year;
    }


    /**
     * Gets the latitude value for this LatLonDate.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this LatLonDate.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this LatLonDate.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this LatLonDate.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the sunSetTime value for this LatLonDate.
     * 
     * @return sunSetTime
     */
    public float getSunSetTime() {
        return sunSetTime;
    }


    /**
     * Sets the sunSetTime value for this LatLonDate.
     * 
     * @param sunSetTime
     */
    public void setSunSetTime(float sunSetTime) {
        this.sunSetTime = sunSetTime;
    }


    /**
     * Gets the sunRiseTime value for this LatLonDate.
     * 
     * @return sunRiseTime
     */
    public float getSunRiseTime() {
        return sunRiseTime;
    }


    /**
     * Sets the sunRiseTime value for this LatLonDate.
     * 
     * @param sunRiseTime
     */
    public void setSunRiseTime(float sunRiseTime) {
        this.sunRiseTime = sunRiseTime;
    }


    /**
     * Gets the timeZone value for this LatLonDate.
     * 
     * @return timeZone
     */
    public int getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this LatLonDate.
     * 
     * @param timeZone
     */
    public void setTimeZone(int timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the day value for this LatLonDate.
     * 
     * @return day
     */
    public int getDay() {
        return day;
    }


    /**
     * Sets the day value for this LatLonDate.
     * 
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }


    /**
     * Gets the month value for this LatLonDate.
     * 
     * @return month
     */
    public int getMonth() {
        return month;
    }


    /**
     * Sets the month value for this LatLonDate.
     * 
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }


    /**
     * Gets the year value for this LatLonDate.
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * Sets the year value for this LatLonDate.
     * 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LatLonDate)) return false;
        LatLonDate other = (LatLonDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude() &&
            this.sunSetTime == other.getSunSetTime() &&
            this.sunRiseTime == other.getSunRiseTime() &&
            this.timeZone == other.getTimeZone() &&
            this.day == other.getDay() &&
            this.month == other.getMonth() &&
            this.year == other.getYear();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += new Float(getLongitude()).hashCode();
        _hashCode += new Float(getSunSetTime()).hashCode();
        _hashCode += new Float(getSunRiseTime()).hashCode();
        _hashCode += getTimeZone();
        _hashCode += getDay();
        _hashCode += getMonth();
        _hashCode += getYear();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LatLonDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webserviceX.NET/", "LatLonDate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webserviceX.NET/", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webserviceX.NET/", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sunSetTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webserviceX.NET/", "SunSetTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sunRiseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webserviceX.NET/", "SunRiseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webserviceX.NET/", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webserviceX.NET/", "Day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webserviceX.NET/", "Month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webserviceX.NET/", "Year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
