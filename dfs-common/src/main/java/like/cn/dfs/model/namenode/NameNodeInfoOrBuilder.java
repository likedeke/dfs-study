// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: namenode.proto

package like.cn.dfs.model.namenode;

public interface NameNodeInfoOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.ruyuan.dfs.common.proto.NameNodeInfo)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 nodeId = 1;</code>
     */
    int getNodeId();

    /**
     * <code>string hostname = 2;</code>
     */
    java.lang.String getHostname();

    /**
     * <code>string hostname = 2;</code>
     */
    com.google.protobuf.ByteString
    getHostnameBytes();

    /**
     * <code>int32 httpPort = 3;</code>
     */
    int getHttpPort();

    /**
     * <code>int32 nioPort = 4;</code>
     */
    int getNioPort();

    /**
     * <code>string backupNodeInfo = 5;</code>
     */
    java.lang.String getBackupNodeInfo();

    /**
     * <code>string backupNodeInfo = 5;</code>
     */
    com.google.protobuf.ByteString
    getBackupNodeInfoBytes();
}