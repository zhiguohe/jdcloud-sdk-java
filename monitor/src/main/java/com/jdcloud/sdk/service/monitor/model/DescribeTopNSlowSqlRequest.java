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
 * Slow Sql APIs
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看sqlserver数据库某资源一段时间内的topN慢sql数据
 */
public class DescribeTopNSlowSqlRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
in: query
     */
    private String endTime;

    /**
     * 资源的uuid
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 资源的类型,sqlserver
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（默认为当前时间，早于30d时，将被重置为30d）
in: query
     */
    private String startTime;

    /**
     * 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
in: query
     */
    private String timeInterval;

    /**
     * topN数量
     * Required:true
     */
    @Required
    private Long topN;

    /**
     * region
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
in: query
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
in: query
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 资源的uuid
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源的uuid
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 资源的类型,sqlserver
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 资源的类型,sqlserver
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（默认为当前时间，早于30d时，将被重置为30d）
in: query
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（默认为当前时间，早于30d时，将被重置为30d）
in: query
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
in: query
     *
     * @return
     */
    public String getTimeInterval() {
        return timeInterval;
    }

    /**
     * set 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
in: query
     *
     * @param timeInterval
     */
    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

    /**
     * get topN数量
     *
     * @return
     */
    public Long getTopN() {
        return topN;
    }

    /**
     * set topN数量
     *
     * @param topN
     */
    public void setTopN(Long topN) {
        this.topN = topN;
    }

    /**
     * get region
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set region
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12- yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（为空时，将由startTime与timeInterval计算得出）
in: query
     *
     * @param endTime
     */
    public DescribeTopNSlowSqlRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 资源的uuid
     *
     * @param resourceId
     */
    public DescribeTopNSlowSqlRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 资源的类型,sqlserver
     *
     * @param serviceCode
     */
    public DescribeTopNSlowSqlRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 查询时间范围的开始时间， UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ（默认为当前时间，早于30d时，将被重置为30d）
in: query
     *
     * @param startTime
     */
    public DescribeTopNSlowSqlRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
in: query
     *
     * @param timeInterval
     */
    public DescribeTopNSlowSqlRequest timeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * set topN数量
     *
     * @param topN
     */
    public DescribeTopNSlowSqlRequest topN(Long topN) {
        this.topN = topN;
        return this;
    }

    /**
     * set region
     *
     * @param regionId
     */
    public DescribeTopNSlowSqlRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}