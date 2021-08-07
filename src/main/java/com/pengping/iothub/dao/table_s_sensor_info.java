package com.pengping.iothub.dao;
import java.util.Date;

public class table_s_sensor_info {

    private String nodeUUID;

    public String getNodeUUID() {
        return nodeUUID;
    }

    public void setNodeUUID(String nodeUUID) {
        this.nodeUUID = nodeUUID;
    }

    public String getNodeIP() {
        return nodeIP;
    }

    public void setNodeIP(String nodeIP) {
        this.nodeIP = nodeIP;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Date getNodeAddTime() {
        return nodeAddTime;
    }

    public void setNodeAddTime(Date nodeAddTime) {
        this.nodeAddTime = nodeAddTime;
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
    }

    public String getNodeUserName() {
        return nodeUserName;
    }

    public void setNodeUserName(String nodeUserName) {
        this.nodeUserName = nodeUserName;
    }

    public String getNodePassword() {
        return nodePassword;
    }

    public void setNodePassword(String nodePassword) {
        this.nodePassword = nodePassword;
    }

    private String nodeIP;
    private String nodeName;
    private String nodeType;
    private Date nodeAddTime;
    private String nodeDesc;
    private String nodeUserName;
    private String nodePassword;
}
