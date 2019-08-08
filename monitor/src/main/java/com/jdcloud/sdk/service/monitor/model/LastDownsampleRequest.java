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
 * 监控项相关接口
 * 监控项相关接口，提供可用监控项列表查询和监控数据查询等功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.monitor.model.TagFilter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看某资源的最后一个点,metric介绍：&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/monitoring/metrics&quot;&gt;Metrics&lt;/a&gt;
 */
public class LastDownsampleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源的类型，取值vm, lb, ip, database 等
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 资源的uuid，支持多个resourceId批量查询，每个id用竖线分隔。 如：id1|id2|id3|id4
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 自定义标签
     */
    private List<TagFilter> tags;

    /**
     * 查询时间范围的开始时间， UTC时间，格式：2016-12-11T00:00:00+0800（早于30d时，将被重置为30d）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     */
    private String startTime;

    /**
     * 查询时间范围的结束时间， UTC时间，格式：2016-12-11T00:00:00+0800（为空时，将由startTime与timeInterval计算得出）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     */
    private String endTime;

    /**
     * 查询的时间间隔，最大不超过30天，支持分钟级别,小时级别，天级别，例如：1m、1h、1d
     */
    private String timeInterval;

    /**
     * 聚合方式：max avg min等,用于不同维度之间聚合
     */
    private String aggrType;

    /**
     * 聚合方式：max avg min等,用于将维度内一个周期数据聚合为一个点的聚合方式,默认last
     */
    private String downAggrType;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 监控项英文标识(id)
     * Required:true
     */
    @Required
    private String metric;


    /**
     * get 资源的类型，取值vm, lb, ip, database 等
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 资源的类型，取值vm, lb, ip, database 等
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 资源的uuid，支持多个resourceId批量查询，每个id用竖线分隔。 如：id1|id2|id3|id4
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源的uuid，支持多个resourceId批量查询，每个id用竖线分隔。 如：id1|id2|id3|id4
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 自定义标签
     *
     * @return
     */
    public List<TagFilter> getTags() {
        return tags;
    }

    /**
     * set 自定义标签
     *
     * @param tags
     */
    public void setTags(List<TagFilter> tags) {
        this.tags = tags;
    }

    /**
     * get 查询时间范围的开始时间， UTC时间，格式：2016-12-11T00:00:00+0800（早于30d时，将被重置为30d）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询时间范围的开始时间， UTC时间，格式：2016-12-11T00:00:00+0800（早于30d时，将被重置为30d）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询时间范围的结束时间， UTC时间，格式：2016-12-11T00:00:00+0800（为空时，将由startTime与timeInterval计算得出）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12-11T00:00:00+0800（为空时，将由startTime与timeInterval计算得出）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 查询的时间间隔，最大不超过30天，支持分钟级别,小时级别，天级别，例如：1m、1h、1d
     *
     * @return
     */
    public String getTimeInterval() {
        return timeInterval;
    }

    /**
     * set 查询的时间间隔，最大不超过30天，支持分钟级别,小时级别，天级别，例如：1m、1h、1d
     *
     * @param timeInterval
     */
    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

    /**
     * get 聚合方式：max avg min等,用于不同维度之间聚合
     *
     * @return
     */
    public String getAggrType() {
        return aggrType;
    }

    /**
     * set 聚合方式：max avg min等,用于不同维度之间聚合
     *
     * @param aggrType
     */
    public void setAggrType(String aggrType) {
        this.aggrType = aggrType;
    }

    /**
     * get 聚合方式：max avg min等,用于将维度内一个周期数据聚合为一个点的聚合方式,默认last
     *
     * @return
     */
    public String getDownAggrType() {
        return downAggrType;
    }

    /**
     * set 聚合方式：max avg min等,用于将维度内一个周期数据聚合为一个点的聚合方式,默认last
     *
     * @param downAggrType
     */
    public void setDownAggrType(String downAggrType) {
        this.downAggrType = downAggrType;
    }

    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 监控项英文标识(id)
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控项英文标识(id)
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }


    /**
     * set 资源的类型，取值vm, lb, ip, database 等
     *
     * @param serviceCode
     */
    public LastDownsampleRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 资源的uuid，支持多个resourceId批量查询，每个id用竖线分隔。 如：id1|id2|id3|id4
     *
     * @param resourceId
     */
    public LastDownsampleRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 自定义标签
     *
     * @param tags
     */
    public LastDownsampleRequest tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 查询时间范围的开始时间， UTC时间，格式：2016-12-11T00:00:00+0800（早于30d时，将被重置为30d）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @param startTime
     */
    public LastDownsampleRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12-11T00:00:00+0800（为空时，将由startTime与timeInterval计算得出）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @param endTime
     */
    public LastDownsampleRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 查询的时间间隔，最大不超过30天，支持分钟级别,小时级别，天级别，例如：1m、1h、1d
     *
     * @param timeInterval
     */
    public LastDownsampleRequest timeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * set 聚合方式：max avg min等,用于不同维度之间聚合
     *
     * @param aggrType
     */
    public LastDownsampleRequest aggrType(String aggrType) {
        this.aggrType = aggrType;
        return this;
    }

    /**
     * set 聚合方式：max avg min等,用于将维度内一个周期数据聚合为一个点的聚合方式,默认last
     *
     * @param downAggrType
     */
    public LastDownsampleRequest downAggrType(String downAggrType) {
        this.downAggrType = downAggrType;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public LastDownsampleRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 监控项英文标识(id)
     *
     * @param metric
     */
    public LastDownsampleRequest metric(String metric) {
        this.metric = metric;
        return this;
    }


    /**
     * add item to 自定义标签
     *
     * @param tag
     */
    public void addTag(TagFilter tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}