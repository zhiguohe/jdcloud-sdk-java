/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdw.model;

import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * dBInstance
 */
public class DBInstance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 节点规格
     */
    private String nodeType;

    /**
     * CPU核数
     */
    private Integer cpu;

    /**
     * 内存容量，单位GB
     */
    private Integer memory;

    /**
     * 存储空间容量，单位GB
     */
    private Integer storage;

    /**
     * 节点数量
     */
    private Integer nodeNumber;

    /**
     * 可用区
     */
    private String azId;

    /**
     * VPCID
     */
    private String vpcId;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * 实例状态
     */
    private String instanceStatus;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 计费配置
     */
    private Charge charge;


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 节点规格
     *
     * @return
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * set 节点规格
     *
     * @param nodeType
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * get CPU核数
     *
     * @return
     */
    public Integer getCpu() {
        return cpu;
    }

    /**
     * set CPU核数
     *
     * @param cpu
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * get 内存容量，单位GB
     *
     * @return
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * set 内存容量，单位GB
     *
     * @param memory
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * get 存储空间容量，单位GB
     *
     * @return
     */
    public Integer getStorage() {
        return storage;
    }

    /**
     * set 存储空间容量，单位GB
     *
     * @param storage
     */
    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    /**
     * get 节点数量
     *
     * @return
     */
    public Integer getNodeNumber() {
        return nodeNumber;
    }

    /**
     * set 节点数量
     *
     * @param nodeNumber
     */
    public void setNodeNumber(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
    }

    /**
     * get 可用区
     *
     * @return
     */
    public String getAzId() {
        return azId;
    }

    /**
     * set 可用区
     *
     * @param azId
     */
    public void setAzId(String azId) {
        this.azId = azId;
    }

    /**
     * get VPCID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set VPCID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 实例状态
     *
     * @return
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * set 实例状态
     *
     * @param instanceStatus
     */
    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 计费配置
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public DBInstance instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public DBInstance instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 节点规格
     *
     * @param nodeType
     */
    public DBInstance nodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * set CPU核数
     *
     * @param cpu
     */
    public DBInstance cpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * set 内存容量，单位GB
     *
     * @param memory
     */
    public DBInstance memory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * set 存储空间容量，单位GB
     *
     * @param storage
     */
    public DBInstance storage(Integer storage) {
        this.storage = storage;
        return this;
    }

    /**
     * set 节点数量
     *
     * @param nodeNumber
     */
    public DBInstance nodeNumber(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
        return this;
    }

    /**
     * set 可用区
     *
     * @param azId
     */
    public DBInstance azId(String azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set VPCID
     *
     * @param vpcId
     */
    public DBInstance vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public DBInstance subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 实例状态
     *
     * @param instanceStatus
     */
    public DBInstance instanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public DBInstance createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public DBInstance charge(Charge charge) {
        this.charge = charge;
        return this;
    }


}