// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: namenode.proto

package like.cn.dfs.model.namenode;

/**
 * Protobuf type {@code com.ruyuan.dfs.common.proto.NameNodeInfo}
 */
public final class NameNodeInfo extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.ruyuan.dfs.common.proto.NameNodeInfo)
        NameNodeInfoOrBuilder {
  public static final int NODEID_FIELD_NUMBER = 1;
  public static final int HOSTNAME_FIELD_NUMBER = 2;
  public static final int HTTPPORT_FIELD_NUMBER = 3;
  public static final int NIOPORT_FIELD_NUMBER = 4;
  public static final int BACKUPNODEINFO_FIELD_NUMBER = 5;
  private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:com.ruyuan.dfs.common.proto.NameNodeInfo)
  private static final like.cn.dfs.model.namenode.NameNodeInfo DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<NameNodeInfo>
          PARSER = new com.google.protobuf.AbstractParser<NameNodeInfo>() {
    public NameNodeInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return new NameNodeInfo(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new like.cn.dfs.model.namenode.NameNodeInfo();
  }

  private int nodeId_;
  private volatile java.lang.Object hostname_;
  private int httpPort_;
  private int nioPort_;
  private volatile java.lang.Object backupNodeInfo_;
  private byte memoizedIsInitialized = -1;

  // Use NameNodeInfo.newBuilder() to construct.
  private NameNodeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NameNodeInfo() {
    nodeId_ = 0;
    hostname_ = "";
    httpPort_ = 0;
    nioPort_ = 0;
    backupNodeInfo_ = "";
  }

  private NameNodeInfo(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            nodeId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            hostname_ = s;
            break;
          }
          case 24: {

            httpPort_ = input.readInt32();
            break;
          }
          case 32: {

            nioPort_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            backupNodeInfo_ = s;
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
      makeExtensionsImmutable();
    }
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(like.cn.dfs.model.namenode.NameNodeInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static like.cn.dfs.model.namenode.NameNodeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<NameNodeInfo> parser() {
    return PARSER;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return like.cn.dfs.model.namenode.Namenode.internal_static_com_ruyuan_dfs_common_proto_NameNodeInfo_descriptor;
  }

  /**
   * <code>int32 nodeId = 1;</code>
   */
  public int getNodeId() {
    return nodeId_;
  }

  /**
   * <code>string hostname = 2;</code>
   */
  public java.lang.String getHostname() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      return ( java.lang.String ) ref;
    } else {
      com.google.protobuf.ByteString bs =
              ( com.google.protobuf.ByteString ) ref;
      java.lang.String s = bs.toStringUtf8();
      hostname_ = s;
      return s;
    }
  }

  /**
   * <code>string hostname = 2;</code>
   */
  public com.google.protobuf.ByteString
  getHostnameBytes() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      ( java.lang.String ) ref);
      hostname_ = b;
      return b;
    } else {
      return ( com.google.protobuf.ByteString ) ref;
    }
  }

  /**
   * <code>int32 httpPort = 3;</code>
   */
  public int getHttpPort() {
    return httpPort_;
  }

  /**
   * <code>int32 nioPort = 4;</code>
   */
  public int getNioPort() {
    return nioPort_;
  }

  /**
   * <code>string backupNodeInfo = 5;</code>
   */
  public java.lang.String getBackupNodeInfo() {
    java.lang.Object ref = backupNodeInfo_;
    if (ref instanceof java.lang.String) {
      return ( java.lang.String ) ref;
    } else {
      com.google.protobuf.ByteString bs =
              ( com.google.protobuf.ByteString ) ref;
      java.lang.String s = bs.toStringUtf8();
      backupNodeInfo_ = s;
      return s;
    }
  }

  /**
   * <code>string backupNodeInfo = 5;</code>
   */
  public com.google.protobuf.ByteString
  getBackupNodeInfoBytes() {
    java.lang.Object ref = backupNodeInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      ( java.lang.String ) ref);
      backupNodeInfo_ = b;
      return b;
    } else {
      return ( com.google.protobuf.ByteString ) ref;
    }
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof like.cn.dfs.model.namenode.NameNodeInfo)) {
      return super.equals(obj);
    }
    like.cn.dfs.model.namenode.NameNodeInfo other = ( like.cn.dfs.model.namenode.NameNodeInfo ) obj;

    boolean result = true;
    result = result && (getNodeId()
            == other.getNodeId());
    result = result && getHostname()
            .equals(other.getHostname());
    result = result && (getHttpPort()
            == other.getHttpPort());
    result = result && (getNioPort()
            == other.getNioPort());
    result = result && getBackupNodeInfo()
            .equals(other.getBackupNodeInfo());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NODEID_FIELD_NUMBER;
    hash = (53 * hash) + getNodeId();
    hash = (37 * hash) + HOSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getHostname().hashCode();
    hash = (37 * hash) + HTTPPORT_FIELD_NUMBER;
    hash = (53 * hash) + getHttpPort();
    hash = (37 * hash) + NIOPORT_FIELD_NUMBER;
    hash = (53 * hash) + getNioPort();
    hash = (37 * hash) + BACKUPNODEINFO_FIELD_NUMBER;
    hash = (53 * hash) + getBackupNodeInfo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public Builder newBuilderForType() {return newBuilder();}

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NameNodeInfo> getParserForType() {
    return PARSER;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return like.cn.dfs.model.namenode.Namenode.internal_static_com_ruyuan_dfs_common_proto_NameNodeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    like.cn.dfs.model.namenode.NameNodeInfo.class, like.cn.dfs.model.namenode.NameNodeInfo.Builder.class);
  }

  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
          throws java.io.IOException {
    if (nodeId_ != 0) {
      output.writeInt32(1, nodeId_);
    }
    if (!getHostnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hostname_);
    }
    if (httpPort_ != 0) {
      output.writeInt32(3, httpPort_);
    }
    if (nioPort_ != 0) {
      output.writeInt32(4, nioPort_);
    }
    if (!getBackupNodeInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, backupNodeInfo_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
              .computeInt32Size(1, nodeId_);
    }
    if (!getHostnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hostname_);
    }
    if (httpPort_ != 0) {
      size += com.google.protobuf.CodedOutputStream
              .computeInt32Size(3, httpPort_);
    }
    if (nioPort_ != 0) {
      size += com.google.protobuf.CodedOutputStream
              .computeInt32Size(4, nioPort_);
    }
    if (!getBackupNodeInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, backupNodeInfo_);
    }
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  public like.cn.dfs.model.namenode.NameNodeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code com.ruyuan.dfs.common.proto.NameNodeInfo}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:com.ruyuan.dfs.common.proto.NameNodeInfo)
          like.cn.dfs.model.namenode.NameNodeInfoOrBuilder {
    private int nodeId_;
    private java.lang.Object hostname_ = "";
    private int httpPort_;
    private int nioPort_;
    private java.lang.Object backupNodeInfo_ = "";

    // Construct using like.cn.dfs.model.namenode.NameNodeInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return like.cn.dfs.model.namenode.Namenode.internal_static_com_ruyuan_dfs_common_proto_NameNodeInfo_descriptor;
    }

    public like.cn.dfs.model.namenode.NameNodeInfo getDefaultInstanceForType() {
      return like.cn.dfs.model.namenode.NameNodeInfo.getDefaultInstance();
    }

    public like.cn.dfs.model.namenode.NameNodeInfo build() {
      like.cn.dfs.model.namenode.NameNodeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public like.cn.dfs.model.namenode.NameNodeInfo buildPartial() {
      like.cn.dfs.model.namenode.NameNodeInfo result = new like.cn.dfs.model.namenode.NameNodeInfo(this);
      result.nodeId_ = nodeId_;
      result.hostname_ = hostname_;
      result.httpPort_ = httpPort_;
      result.nioPort_ = nioPort_;
      result.backupNodeInfo_ = backupNodeInfo_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return super.clone();
    }

    public Builder clear() {
      super.clear();
      nodeId_ = 0;

      hostname_ = "";

      httpPort_ = 0;

      nioPort_ = 0;

      backupNodeInfo_ = "";

      return this;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return like.cn.dfs.model.namenode.Namenode.internal_static_com_ruyuan_dfs_common_proto_NameNodeInfo_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      like.cn.dfs.model.namenode.NameNodeInfo.class, like.cn.dfs.model.namenode.NameNodeInfo.Builder.class);
    }

    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return like.cn.dfs.model.namenode.Namenode.internal_static_com_ruyuan_dfs_common_proto_NameNodeInfo_descriptor;
    }

    public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
      return super.setField(field, value);
    }

    public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }

    public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
      return super.addRepeatedField(field, value);
    }

    public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof like.cn.dfs.model.namenode.NameNodeInfo) {
        return mergeFrom(( like.cn.dfs.model.namenode.NameNodeInfo ) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      like.cn.dfs.model.namenode.NameNodeInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = ( like.cn.dfs.model.namenode.NameNodeInfo ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    public Builder mergeFrom(like.cn.dfs.model.namenode.NameNodeInfo other) {
      if (other == like.cn.dfs.model.namenode.NameNodeInfo.getDefaultInstance()) return this;
      if (other.getNodeId() != 0) {
        setNodeId(other.getNodeId());
      }
      if (!other.getHostname().isEmpty()) {
        hostname_ = other.hostname_;
        onChanged();
      }
      if (other.getHttpPort() != 0) {
        setHttpPort(other.getHttpPort());
      }
      if (other.getNioPort() != 0) {
        setNioPort(other.getNioPort());
      }
      if (!other.getBackupNodeInfo().isEmpty()) {
        backupNodeInfo_ = other.backupNodeInfo_;
        onChanged();
      }
      onChanged();
      return this;
    }

    /**
     * <code>int32 nodeId = 1;</code>
     */
    public int getNodeId() {
      return nodeId_;
    }

    /**
     * <code>int32 nodeId = 1;</code>
     */
    public Builder setNodeId(int value) {

      nodeId_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string hostname = 2;</code>
     */
    public java.lang.String getHostname() {
      java.lang.Object ref = hostname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                ( com.google.protobuf.ByteString ) ref;
        java.lang.String s = bs.toStringUtf8();
        hostname_ = s;
        return s;
      } else {
        return ( java.lang.String ) ref;
      }
    }

    /**
     * <code>string hostname = 2;</code>
     */
    public com.google.protobuf.ByteString
    getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        ( java.lang.String ) ref);
        hostname_ = b;
        return b;
      } else {
        return ( com.google.protobuf.ByteString ) ref;
      }
    }

    /**
     * <code>string hostname = 2;</code>
     */
    public Builder setHostnameBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      hostname_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int32 httpPort = 3;</code>
     */
    public int getHttpPort() {
      return httpPort_;
    }

    /**
     * <code>int32 httpPort = 3;</code>
     */
    public Builder setHttpPort(int value) {

      httpPort_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int32 nioPort = 4;</code>
     */
    public int getNioPort() {
      return nioPort_;
    }

    /**
     * <code>int32 nioPort = 4;</code>
     */
    public Builder setNioPort(int value) {

      nioPort_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string backupNodeInfo = 5;</code>
     */
    public java.lang.String getBackupNodeInfo() {
      java.lang.Object ref = backupNodeInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                ( com.google.protobuf.ByteString ) ref;
        java.lang.String s = bs.toStringUtf8();
        backupNodeInfo_ = s;
        return s;
      } else {
        return ( java.lang.String ) ref;
      }
    }

    /**
     * <code>string backupNodeInfo = 5;</code>
     */
    public com.google.protobuf.ByteString
    getBackupNodeInfoBytes() {
      java.lang.Object ref = backupNodeInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        ( java.lang.String ) ref);
        backupNodeInfo_ = b;
        return b;
      } else {
        return ( com.google.protobuf.ByteString ) ref;
      }
    }

    /**
     * <code>string backupNodeInfo = 5;</code>
     */
    public Builder setBackupNodeInfoBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      backupNodeInfo_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string backupNodeInfo = 5;</code>
     */
    public Builder setBackupNodeInfo(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      backupNodeInfo_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string hostname = 2;</code>
     */
    public Builder setHostname(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      hostname_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int32 nodeId = 1;</code>
     */
    public Builder clearNodeId() {

      nodeId_ = 0;
      onChanged();
      return this;
    }

    /**
     * <code>string hostname = 2;</code>
     */
    public Builder clearHostname() {

      hostname_ = getDefaultInstance().getHostname();
      onChanged();
      return this;
    }

    /**
     * <code>int32 httpPort = 3;</code>
     */
    public Builder clearHttpPort() {

      httpPort_ = 0;
      onChanged();
      return this;
    }

    /**
     * <code>int32 nioPort = 4;</code>
     */
    public Builder clearNioPort() {

      nioPort_ = 0;
      onChanged();
      return this;
    }

    /**
     * <code>string backupNodeInfo = 5;</code>
     */
    public Builder clearBackupNodeInfo() {

      backupNodeInfo_ = getDefaultInstance().getBackupNodeInfo();
      onChanged();
      return this;
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }


    // @@protoc_insertion_point(builder_scope:com.ruyuan.dfs.common.proto.NameNodeInfo)
  }

}