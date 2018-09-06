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
 * 配额
 * 配额的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询配额信息
 */
public class DescribeQuotaRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源类型，取值范围：vpc、elastic_ip、subnet、security_group、vpcpeering、network_interface（配额只统计辅助网卡）
     * Required:true
     */
    @Required
    private String type;

    /**
     * type为vpc、elastic_ip、network_interface不设置, type为subnet、security_group、vpcpeering设置为vpcId
     */
    private String parentResourceId;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 资源类型，取值范围：vpc、elastic_ip、subnet、security_group、vpcpeering、network_interface（配额只统计辅助网卡）
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 资源类型，取值范围：vpc、elastic_ip、subnet、security_group、vpcpeering、network_interface（配额只统计辅助网卡）
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get type为vpc、elastic_ip、network_interface不设置, type为subnet、security_group、vpcpeering设置为vpcId
     *
     * @return
     */
    public String getParentResourceId() {
        return parentResourceId;
    }

    /**
     * set type为vpc、elastic_ip、network_interface不设置, type为subnet、security_group、vpcpeering设置为vpcId
     *
     * @param parentResourceId
     */
    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 资源类型，取值范围：vpc、elastic_ip、subnet、security_group、vpcpeering、network_interface（配额只统计辅助网卡）
     *
     * @param type
     */
    public DescribeQuotaRequest type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set type为vpc、elastic_ip、network_interface不设置, type为subnet、security_group、vpcpeering设置为vpcId
     *
     * @param parentResourceId
     */
    public DescribeQuotaRequest parentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribeQuotaRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}