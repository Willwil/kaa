/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum LogDeliveryErrorCode { 
  NO_APPENDERS_CONFIGURED, APPENDER_INTERNAL_ERROR, REMOTE_CONNECTION_ERROR, REMOTE_INTERNAL_ERROR  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"LogDeliveryErrorCode\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"symbols\":[\"NO_APPENDERS_CONFIGURED\",\"APPENDER_INTERNAL_ERROR\",\"REMOTE_CONNECTION_ERROR\",\"REMOTE_INTERNAL_ERROR\"],\"direction\":\"in\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
