/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BootstrapSyncRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BootstrapSyncRequest\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"supportedProtocols\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ProtocolVersionPair\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"version\",\"type\":\"int\"}],\"direction\":\"out\"}}}],\"direction\":\"out\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int requestId;
   private java.util.List<org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair> supportedProtocols;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public BootstrapSyncRequest() {}

  /**
   * All-args constructor.
   */
  public BootstrapSyncRequest(java.lang.Integer requestId, java.util.List<org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair> supportedProtocols) {
    this.requestId = requestId;
    this.supportedProtocols = supportedProtocols;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return requestId;
    case 1: return supportedProtocols;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: requestId = (java.lang.Integer)value$; break;
    case 1: supportedProtocols = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'requestId' field.
   */
  public java.lang.Integer getRequestId() {
    return requestId;
  }

  /**
   * Sets the value of the 'requestId' field.
   * @param value the value to set.
   */
  public void setRequestId(java.lang.Integer value) {
    this.requestId = value;
  }

  /**
   * Gets the value of the 'supportedProtocols' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair> getSupportedProtocols() {
    return supportedProtocols;
  }

  /**
   * Sets the value of the 'supportedProtocols' field.
   * @param value the value to set.
   */
  public void setSupportedProtocols(java.util.List<org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair> value) {
    this.supportedProtocols = value;
  }

  /** Creates a new BootstrapSyncRequest RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.Builder();
  }
  
  /** Creates a new BootstrapSyncRequest RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.Builder(other);
  }
  
  /** Creates a new BootstrapSyncRequest RecordBuilder by copying an existing BootstrapSyncRequest instance */
  public static org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest other) {
    return new org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for BootstrapSyncRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BootstrapSyncRequest>
    implements org.apache.avro.data.RecordBuilder<BootstrapSyncRequest> {

    private int requestId;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair> supportedProtocols;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.requestId)) {
        this.requestId = data().deepCopy(fields()[0].schema(), other.requestId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.supportedProtocols)) {
        this.supportedProtocols = data().deepCopy(fields()[1].schema(), other.supportedProtocols);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing BootstrapSyncRequest instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest other) {
            super(org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.requestId)) {
        this.requestId = data().deepCopy(fields()[0].schema(), other.requestId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.supportedProtocols)) {
        this.supportedProtocols = data().deepCopy(fields()[1].schema(), other.supportedProtocols);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'requestId' field */
    public java.lang.Integer getRequestId() {
      return requestId;
    }
    
    /** Sets the value of the 'requestId' field */
    public org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.Builder setRequestId(int value) {
      validate(fields()[0], value);
      this.requestId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'requestId' field has been set */
    public boolean hasRequestId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'requestId' field */
    public org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.Builder clearRequestId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'supportedProtocols' field */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair> getSupportedProtocols() {
      return supportedProtocols;
    }
    
    /** Sets the value of the 'supportedProtocols' field */
    public org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.Builder setSupportedProtocols(java.util.List<org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair> value) {
      validate(fields()[1], value);
      this.supportedProtocols = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'supportedProtocols' field has been set */
    public boolean hasSupportedProtocols() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'supportedProtocols' field */
    public org.kaaproject.kaa.common.endpoint.gen.BootstrapSyncRequest.Builder clearSupportedProtocols() {
      supportedProtocols = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public BootstrapSyncRequest build() {
      try {
        BootstrapSyncRequest record = new BootstrapSyncRequest();
        record.requestId = fieldSetFlags()[0] ? this.requestId : (java.lang.Integer) defaultValue(fields()[0]);
        record.supportedProtocols = fieldSetFlags()[1] ? this.supportedProtocols : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.ProtocolVersionPair>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
