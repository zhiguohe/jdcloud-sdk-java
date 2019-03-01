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
 * returnRule
 * 渠道管理平台返还规则
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.partner.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * returnRuleResult
 */
public class ReturnRuleResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Number id;

    /**
     * 部门ID
     */
    private Integer deptId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 渠道商类型
     */
    private Integer distributorType;

    /**
     * 渠道商类型名称
     */
    private String distributorTypeName;

    /**
     * 是否返还标志
     */
    private Integer isReturn;

    /**
     * 周期类型
     */
    private Integer circleType;

    /**
     * 周期名称
     */
    private String circleName;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 是否删除0未删除,1已删除
     */
    private Integer yn;


    /**
     * get ID
     *
     * @return
     */
    public Number getId() {
        return id;
    }

    /**
     * set ID
     *
     * @param id
     */
    public void setId(Number id) {
        this.id = id;
    }

    /**
     * get 部门ID
     *
     * @return
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * set 部门ID
     *
     * @param deptId
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * get 部门名称
     *
     * @return
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * set 部门名称
     *
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * get 渠道商类型
     *
     * @return
     */
    public Integer getDistributorType() {
        return distributorType;
    }

    /**
     * set 渠道商类型
     *
     * @param distributorType
     */
    public void setDistributorType(Integer distributorType) {
        this.distributorType = distributorType;
    }

    /**
     * get 渠道商类型名称
     *
     * @return
     */
    public String getDistributorTypeName() {
        return distributorTypeName;
    }

    /**
     * set 渠道商类型名称
     *
     * @param distributorTypeName
     */
    public void setDistributorTypeName(String distributorTypeName) {
        this.distributorTypeName = distributorTypeName;
    }

    /**
     * get 是否返还标志
     *
     * @return
     */
    public Integer getIsReturn() {
        return isReturn;
    }

    /**
     * set 是否返还标志
     *
     * @param isReturn
     */
    public void setIsReturn(Integer isReturn) {
        this.isReturn = isReturn;
    }

    /**
     * get 周期类型
     *
     * @return
     */
    public Integer getCircleType() {
        return circleType;
    }

    /**
     * set 周期类型
     *
     * @param circleType
     */
    public void setCircleType(Integer circleType) {
        this.circleType = circleType;
    }

    /**
     * get 周期名称
     *
     * @return
     */
    public String getCircleName() {
        return circleName;
    }

    /**
     * set 周期名称
     *
     * @param circleName
     */
    public void setCircleName(String circleName) {
        this.circleName = circleName;
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
     * get 创建人
     *
     * @return
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * set 创建人
     *
     * @param createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 修改人
     *
     * @return
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * set 修改人
     *
     * @param updateUser
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * get 是否删除0未删除,1已删除
     *
     * @return
     */
    public Integer getYn() {
        return yn;
    }

    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public void setYn(Integer yn) {
        this.yn = yn;
    }


    /**
     * set ID
     *
     * @param id
     */
    public ReturnRuleResult id(Number id) {
        this.id = id;
        return this;
    }

    /**
     * set 部门ID
     *
     * @param deptId
     */
    public ReturnRuleResult deptId(Integer deptId) {
        this.deptId = deptId;
        return this;
    }

    /**
     * set 部门名称
     *
     * @param deptName
     */
    public ReturnRuleResult deptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * set 渠道商类型
     *
     * @param distributorType
     */
    public ReturnRuleResult distributorType(Integer distributorType) {
        this.distributorType = distributorType;
        return this;
    }

    /**
     * set 渠道商类型名称
     *
     * @param distributorTypeName
     */
    public ReturnRuleResult distributorTypeName(String distributorTypeName) {
        this.distributorTypeName = distributorTypeName;
        return this;
    }

    /**
     * set 是否返还标志
     *
     * @param isReturn
     */
    public ReturnRuleResult isReturn(Integer isReturn) {
        this.isReturn = isReturn;
        return this;
    }

    /**
     * set 周期类型
     *
     * @param circleType
     */
    public ReturnRuleResult circleType(Integer circleType) {
        this.circleType = circleType;
        return this;
    }

    /**
     * set 周期名称
     *
     * @param circleName
     */
    public ReturnRuleResult circleName(String circleName) {
        this.circleName = circleName;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public ReturnRuleResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 创建人
     *
     * @param createUser
     */
    public ReturnRuleResult createUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public ReturnRuleResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 修改人
     *
     * @param updateUser
     */
    public ReturnRuleResult updateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public ReturnRuleResult yn(Integer yn) {
        this.yn = yn;
        return this;
    }


}