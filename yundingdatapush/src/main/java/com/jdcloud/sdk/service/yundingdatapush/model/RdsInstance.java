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

package com.jdcloud.sdk.service.yundingdatapush.model;


/**
 * 数据推送RDS实例对象
 */
public class RdsInstance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * RDS实例ID
     */
    private String instanceId;

    /**
     * 地域
     */
    private String regionId;

    /**
     * 所属私有网络ID
     */
    private String vpcId;

    /**
     * 所属私有网络名称
     */
    private String vpcName;

    /**
     * RDS实例名称
     */
    private String instanceName;

    /**
     * RDS实例状态
     */
    private String instanceStatus;

    /**
     * RDS实例类型
     */
    private String instanceType;

    /**
     * RDS实例规格
     */
    private String instanceClass;


    /**
     * get RDS实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set RDS实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 所属私有网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 所属私有网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 所属私有网络名称
     *
     * @return
     */
    public String getVpcName() {
        return vpcName;
    }

    /**
     * set 所属私有网络名称
     *
     * @param vpcName
     */
    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    /**
     * get RDS实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set RDS实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get RDS实例状态
     *
     * @return
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * set RDS实例状态
     *
     * @param instanceStatus
     */
    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * get RDS实例类型
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set RDS实例类型
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get RDS实例规格
     *
     * @return
     */
    public String getInstanceClass() {
        return instanceClass;
    }

    /**
     * set RDS实例规格
     *
     * @param instanceClass
     */
    public void setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
    }


    /**
     * set RDS实例ID
     *
     * @param instanceId
     */
    public RdsInstance instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 地域
     *
     * @param regionId
     */
    public RdsInstance regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 所属私有网络ID
     *
     * @param vpcId
     */
    public RdsInstance vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 所属私有网络名称
     *
     * @param vpcName
     */
    public RdsInstance vpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set RDS实例名称
     *
     * @param instanceName
     */
    public RdsInstance instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set RDS实例状态
     *
     * @param instanceStatus
     */
    public RdsInstance instanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set RDS实例类型
     *
     * @param instanceType
     */
    public RdsInstance instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set RDS实例规格
     *
     * @param instanceClass
     */
    public RdsInstance instanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }


}