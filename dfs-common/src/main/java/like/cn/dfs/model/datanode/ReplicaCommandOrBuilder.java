// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datanode.proto

package like.cn.dfs.model.datanode;

public interface ReplicaCommandOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.ruyuan.dfs.common.proto.ReplicaCommand)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string filename = 1;</code>
     */
    java.lang.String getFilename();

    /**
     * <code>string filename = 1;</code>
     */
    com.google.protobuf.ByteString
    getFilenameBytes();

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
     * <code>int32 port = 3;</code>
     */
    int getPort();

    /**
     * <code>int32 command = 4;</code>
     */
    int getCommand();
}