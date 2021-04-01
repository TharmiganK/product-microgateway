// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/throttle/throttle_data.proto

package org.wso2.gateway.discovery.throttle;

/**
 * <pre>
 * Throttle Data model
 * </pre>
 *
 * Protobuf type {@code wso2.discovery.throttle.ThrottleData}
 */
public final class ThrottleData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wso2.discovery.throttle.ThrottleData)
    ThrottleDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThrottleData.newBuilder() to construct.
  private ThrottleData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThrottleData() {
    keyTemplates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThrottleData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ThrottleData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              keyTemplates_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            keyTemplates_.add(s);
            break;
          }
          case 18: {
            org.wso2.gateway.discovery.throttle.BlockingConditions.Builder subBuilder = null;
            if (blockingConditions_ != null) {
              subBuilder = blockingConditions_.toBuilder();
            }
            blockingConditions_ = input.readMessage(org.wso2.gateway.discovery.throttle.BlockingConditions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(blockingConditions_);
              blockingConditions_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        keyTemplates_ = keyTemplates_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.wso2.gateway.discovery.throttle.ThrottleDataProto.internal_static_wso2_discovery_throttle_ThrottleData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.wso2.gateway.discovery.throttle.ThrottleDataProto.internal_static_wso2_discovery_throttle_ThrottleData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.wso2.gateway.discovery.throttle.ThrottleData.class, org.wso2.gateway.discovery.throttle.ThrottleData.Builder.class);
  }

  public static final int KEY_TEMPLATES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList keyTemplates_;
  /**
   * <code>repeated string key_templates = 1;</code>
   * @return A list containing the keyTemplates.
   */
  public com.google.protobuf.ProtocolStringList
      getKeyTemplatesList() {
    return keyTemplates_;
  }
  /**
   * <code>repeated string key_templates = 1;</code>
   * @return The count of keyTemplates.
   */
  public int getKeyTemplatesCount() {
    return keyTemplates_.size();
  }
  /**
   * <code>repeated string key_templates = 1;</code>
   * @param index The index of the element to return.
   * @return The keyTemplates at the given index.
   */
  public java.lang.String getKeyTemplates(int index) {
    return keyTemplates_.get(index);
  }
  /**
   * <code>repeated string key_templates = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the keyTemplates at the given index.
   */
  public com.google.protobuf.ByteString
      getKeyTemplatesBytes(int index) {
    return keyTemplates_.getByteString(index);
  }

  public static final int BLOCKING_CONDITIONS_FIELD_NUMBER = 2;
  private org.wso2.gateway.discovery.throttle.BlockingConditions blockingConditions_;
  /**
   * <code>.wso2.discovery.throttle.BlockingConditions blocking_conditions = 2;</code>
   * @return Whether the blockingConditions field is set.
   */
  @java.lang.Override
  public boolean hasBlockingConditions() {
    return blockingConditions_ != null;
  }
  /**
   * <code>.wso2.discovery.throttle.BlockingConditions blocking_conditions = 2;</code>
   * @return The blockingConditions.
   */
  @java.lang.Override
  public org.wso2.gateway.discovery.throttle.BlockingConditions getBlockingConditions() {
    return blockingConditions_ == null ? org.wso2.gateway.discovery.throttle.BlockingConditions.getDefaultInstance() : blockingConditions_;
  }
  /**
   * <code>.wso2.discovery.throttle.BlockingConditions blocking_conditions = 2;</code>
   */
  @java.lang.Override
  public org.wso2.gateway.discovery.throttle.BlockingConditionsOrBuilder getBlockingConditionsOrBuilder() {
    return getBlockingConditions();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < keyTemplates_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keyTemplates_.getRaw(i));
    }
    if (blockingConditions_ != null) {
      output.writeMessage(2, getBlockingConditions());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < keyTemplates_.size(); i++) {
        dataSize += computeStringSizeNoTag(keyTemplates_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKeyTemplatesList().size();
    }
    if (blockingConditions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBlockingConditions());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.wso2.gateway.discovery.throttle.ThrottleData)) {
      return super.equals(obj);
    }
    org.wso2.gateway.discovery.throttle.ThrottleData other = (org.wso2.gateway.discovery.throttle.ThrottleData) obj;

    if (!getKeyTemplatesList()
        .equals(other.getKeyTemplatesList())) return false;
    if (hasBlockingConditions() != other.hasBlockingConditions()) return false;
    if (hasBlockingConditions()) {
      if (!getBlockingConditions()
          .equals(other.getBlockingConditions())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getKeyTemplatesCount() > 0) {
      hash = (37 * hash) + KEY_TEMPLATES_FIELD_NUMBER;
      hash = (53 * hash) + getKeyTemplatesList().hashCode();
    }
    if (hasBlockingConditions()) {
      hash = (37 * hash) + BLOCKING_CONDITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getBlockingConditions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.wso2.gateway.discovery.throttle.ThrottleData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.gateway.discovery.throttle.ThrottleData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.gateway.discovery.throttle.ThrottleData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.gateway.discovery.throttle.ThrottleData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.gateway.discovery.throttle.ThrottleData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.gateway.discovery.throttle.ThrottleData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.gateway.discovery.throttle.ThrottleData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.gateway.discovery.throttle.ThrottleData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.gateway.discovery.throttle.ThrottleData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.wso2.gateway.discovery.throttle.ThrottleData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.gateway.discovery.throttle.ThrottleData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.gateway.discovery.throttle.ThrottleData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.wso2.gateway.discovery.throttle.ThrottleData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Throttle Data model
   * </pre>
   *
   * Protobuf type {@code wso2.discovery.throttle.ThrottleData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wso2.discovery.throttle.ThrottleData)
      org.wso2.gateway.discovery.throttle.ThrottleDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.wso2.gateway.discovery.throttle.ThrottleDataProto.internal_static_wso2_discovery_throttle_ThrottleData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.wso2.gateway.discovery.throttle.ThrottleDataProto.internal_static_wso2_discovery_throttle_ThrottleData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.wso2.gateway.discovery.throttle.ThrottleData.class, org.wso2.gateway.discovery.throttle.ThrottleData.Builder.class);
    }

    // Construct using org.wso2.gateway.discovery.throttle.ThrottleData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      keyTemplates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (blockingConditionsBuilder_ == null) {
        blockingConditions_ = null;
      } else {
        blockingConditions_ = null;
        blockingConditionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.wso2.gateway.discovery.throttle.ThrottleDataProto.internal_static_wso2_discovery_throttle_ThrottleData_descriptor;
    }

    @java.lang.Override
    public org.wso2.gateway.discovery.throttle.ThrottleData getDefaultInstanceForType() {
      return org.wso2.gateway.discovery.throttle.ThrottleData.getDefaultInstance();
    }

    @java.lang.Override
    public org.wso2.gateway.discovery.throttle.ThrottleData build() {
      org.wso2.gateway.discovery.throttle.ThrottleData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.wso2.gateway.discovery.throttle.ThrottleData buildPartial() {
      org.wso2.gateway.discovery.throttle.ThrottleData result = new org.wso2.gateway.discovery.throttle.ThrottleData(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        keyTemplates_ = keyTemplates_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.keyTemplates_ = keyTemplates_;
      if (blockingConditionsBuilder_ == null) {
        result.blockingConditions_ = blockingConditions_;
      } else {
        result.blockingConditions_ = blockingConditionsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.wso2.gateway.discovery.throttle.ThrottleData) {
        return mergeFrom((org.wso2.gateway.discovery.throttle.ThrottleData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.wso2.gateway.discovery.throttle.ThrottleData other) {
      if (other == org.wso2.gateway.discovery.throttle.ThrottleData.getDefaultInstance()) return this;
      if (!other.keyTemplates_.isEmpty()) {
        if (keyTemplates_.isEmpty()) {
          keyTemplates_ = other.keyTemplates_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureKeyTemplatesIsMutable();
          keyTemplates_.addAll(other.keyTemplates_);
        }
        onChanged();
      }
      if (other.hasBlockingConditions()) {
        mergeBlockingConditions(other.getBlockingConditions());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.wso2.gateway.discovery.throttle.ThrottleData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.wso2.gateway.discovery.throttle.ThrottleData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList keyTemplates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureKeyTemplatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keyTemplates_ = new com.google.protobuf.LazyStringArrayList(keyTemplates_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string key_templates = 1;</code>
     * @return A list containing the keyTemplates.
     */
    public com.google.protobuf.ProtocolStringList
        getKeyTemplatesList() {
      return keyTemplates_.getUnmodifiableView();
    }
    /**
     * <code>repeated string key_templates = 1;</code>
     * @return The count of keyTemplates.
     */
    public int getKeyTemplatesCount() {
      return keyTemplates_.size();
    }
    /**
     * <code>repeated string key_templates = 1;</code>
     * @param index The index of the element to return.
     * @return The keyTemplates at the given index.
     */
    public java.lang.String getKeyTemplates(int index) {
      return keyTemplates_.get(index);
    }
    /**
     * <code>repeated string key_templates = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the keyTemplates at the given index.
     */
    public com.google.protobuf.ByteString
        getKeyTemplatesBytes(int index) {
      return keyTemplates_.getByteString(index);
    }
    /**
     * <code>repeated string key_templates = 1;</code>
     * @param index The index to set the value at.
     * @param value The keyTemplates to set.
     * @return This builder for chaining.
     */
    public Builder setKeyTemplates(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeyTemplatesIsMutable();
      keyTemplates_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string key_templates = 1;</code>
     * @param value The keyTemplates to add.
     * @return This builder for chaining.
     */
    public Builder addKeyTemplates(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeyTemplatesIsMutable();
      keyTemplates_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string key_templates = 1;</code>
     * @param values The keyTemplates to add.
     * @return This builder for chaining.
     */
    public Builder addAllKeyTemplates(
        java.lang.Iterable<java.lang.String> values) {
      ensureKeyTemplatesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keyTemplates_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string key_templates = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyTemplates() {
      keyTemplates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string key_templates = 1;</code>
     * @param value The bytes of the keyTemplates to add.
     * @return This builder for chaining.
     */
    public Builder addKeyTemplatesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureKeyTemplatesIsMutable();
      keyTemplates_.add(value);
      onChanged();
      return this;
    }

    private org.wso2.gateway.discovery.throttle.BlockingConditions blockingConditions_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.wso2.gateway.discovery.throttle.BlockingConditions, org.wso2.gateway.discovery.throttle.BlockingConditions.Builder, org.wso2.gateway.discovery.throttle.BlockingConditionsOrBuilder> blockingConditionsBuilder_;
    /**
     * <code>.wso2.discovery.throttle.BlockingConditions blocking_conditions = 2;</code>
     * @return Whether the blockingConditions field is set.
     */
    public boolean hasBlockingConditions() {
      return blockingConditionsBuilder_ != null || blockingConditions_ != null;
    }
    /**
     * <code>.wso2.discovery.throttle.BlockingConditions blocking_conditions = 2;</code>
     * @return The blockingConditions.
     */
    public org.wso2.gateway.discovery.throttle.BlockingConditions getBlockingConditions() {
      if (blockingConditionsBuilder_ == null) {
        return blockingConditions_ == null ? org.wso2.gateway.discovery.throttle.BlockingConditions.getDefaultInstance() : blockingConditions_;
      } else {
        return blockingConditionsBuilder_.getMessage();
      }
    }
    /**
     * <code>.wso2.discovery.throttle.BlockingConditions blocking_conditions = 2;</code>
     */
    public Builder setBlockingConditions(org.wso2.gateway.discovery.throttle.BlockingConditions value) {
      if (blockingConditionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blockingConditions_ = value;
        onChanged();
      } else {
        blockingConditionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.wso2.discovery.throttle.BlockingConditions blocking_conditions = 2;</code>
     */
    public Builder setBlockingConditions(
        org.wso2.gateway.discovery.throttle.BlockingConditions.Builder builderForValue) {
      if (blockingConditionsBuilder_ == null) {
        blockingConditions_ = builderForValue.build();
        onChanged();
      } else {
        blockingConditionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.wso2.discovery.throttle.BlockingConditions blocking_conditions = 2;</code>
     */
    public Builder mergeBlockingConditions(org.wso2.gateway.discovery.throttle.BlockingConditions value) {
      if (blockingConditionsBuilder_ == null) {
        if (blockingConditions_ != null) {
          blockingConditions_ =
            org.wso2.gateway.discovery.throttle.BlockingConditions.newBuilder(blockingConditions_).mergeFrom(value).buildPartial();
        } else {
          blockingConditions_ = value;
        }
        onChanged();
      } else {
        blockingConditionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.wso2.discovery.throttle.BlockingConditions blocking_conditions = 2;</code>
     */
    public Builder clearBlockingConditions() {
      if (blockingConditionsBuilder_ == null) {
        blockingConditions_ = null;
        onChanged();
      } else {
        blockingConditions_ = null;
        blockingConditionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.wso2.discovery.throttle.BlockingConditions blocking_conditions = 2;</code>
     */
    public org.wso2.gateway.discovery.throttle.BlockingConditions.Builder getBlockingConditionsBuilder() {
      
      onChanged();
      return getBlockingConditionsFieldBuilder().getBuilder();
    }
    /**
     * <code>.wso2.discovery.throttle.BlockingConditions blocking_conditions = 2;</code>
     */
    public org.wso2.gateway.discovery.throttle.BlockingConditionsOrBuilder getBlockingConditionsOrBuilder() {
      if (blockingConditionsBuilder_ != null) {
        return blockingConditionsBuilder_.getMessageOrBuilder();
      } else {
        return blockingConditions_ == null ?
            org.wso2.gateway.discovery.throttle.BlockingConditions.getDefaultInstance() : blockingConditions_;
      }
    }
    /**
     * <code>.wso2.discovery.throttle.BlockingConditions blocking_conditions = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.wso2.gateway.discovery.throttle.BlockingConditions, org.wso2.gateway.discovery.throttle.BlockingConditions.Builder, org.wso2.gateway.discovery.throttle.BlockingConditionsOrBuilder> 
        getBlockingConditionsFieldBuilder() {
      if (blockingConditionsBuilder_ == null) {
        blockingConditionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.wso2.gateway.discovery.throttle.BlockingConditions, org.wso2.gateway.discovery.throttle.BlockingConditions.Builder, org.wso2.gateway.discovery.throttle.BlockingConditionsOrBuilder>(
                getBlockingConditions(),
                getParentForChildren(),
                isClean());
        blockingConditions_ = null;
      }
      return blockingConditionsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:wso2.discovery.throttle.ThrottleData)
  }

  // @@protoc_insertion_point(class_scope:wso2.discovery.throttle.ThrottleData)
  private static final org.wso2.gateway.discovery.throttle.ThrottleData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.wso2.gateway.discovery.throttle.ThrottleData();
  }

  public static org.wso2.gateway.discovery.throttle.ThrottleData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThrottleData>
      PARSER = new com.google.protobuf.AbstractParser<ThrottleData>() {
    @java.lang.Override
    public ThrottleData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ThrottleData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ThrottleData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThrottleData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.wso2.gateway.discovery.throttle.ThrottleData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

