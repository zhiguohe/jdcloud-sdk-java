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

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * updateWidgetSpec
 */
public class UpdateWidgetSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * aggregated
     */
    private String aggregated;

    /**
     * createdTime
     */
    private Long createdTime;

    /**
     * dashboardId
     */
    private String dashboardId;

    /**
     * metrics
     */
    private List<WidgetMetric> metrics;

    /**
     * name
     */
    private String name;

    /**
     * position
     */
    private WidgetPosition position;

    /**
     * resources
     */
    private WidgetResources resources;

    /**
     * serviceCode
     */
    private String serviceCode;

    /**
     * topN
     */
    private Integer topN;

    /**
     * type
     */
    private String type;

    /**
     * updatedTime
     */
    private Long updatedTime;

    /**
     * widgetId
     */
    private String widgetId;


    /**
     * get aggregated
     *
     * @return
     */
    public String getAggregated() {
        return aggregated;
    }

    /**
     * set aggregated
     *
     * @param aggregated
     */
    public void setAggregated(String aggregated) {
        this.aggregated = aggregated;
    }

    /**
     * get createdTime
     *
     * @return
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    /**
     * set createdTime
     *
     * @param createdTime
     */
    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get dashboardId
     *
     * @return
     */
    public String getDashboardId() {
        return dashboardId;
    }

    /**
     * set dashboardId
     *
     * @param dashboardId
     */
    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * get metrics
     *
     * @return
     */
    public List<WidgetMetric> getMetrics() {
        return metrics;
    }

    /**
     * set metrics
     *
     * @param metrics
     */
    public void setMetrics(List<WidgetMetric> metrics) {
        this.metrics = metrics;
    }

    /**
     * get name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get position
     *
     * @return
     */
    public WidgetPosition getPosition() {
        return position;
    }

    /**
     * set position
     *
     * @param position
     */
    public void setPosition(WidgetPosition position) {
        this.position = position;
    }

    /**
     * get resources
     *
     * @return
     */
    public WidgetResources getResources() {
        return resources;
    }

    /**
     * set resources
     *
     * @param resources
     */
    public void setResources(WidgetResources resources) {
        this.resources = resources;
    }

    /**
     * get serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get topN
     *
     * @return
     */
    public Integer getTopN() {
        return topN;
    }

    /**
     * set topN
     *
     * @param topN
     */
    public void setTopN(Integer topN) {
        this.topN = topN;
    }

    /**
     * get type
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set type
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get updatedTime
     *
     * @return
     */
    public Long getUpdatedTime() {
        return updatedTime;
    }

    /**
     * set updatedTime
     *
     * @param updatedTime
     */
    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * get widgetId
     *
     * @return
     */
    public String getWidgetId() {
        return widgetId;
    }

    /**
     * set widgetId
     *
     * @param widgetId
     */
    public void setWidgetId(String widgetId) {
        this.widgetId = widgetId;
    }


    /**
     * set aggregated
     *
     * @param aggregated
     */
    public UpdateWidgetSpec aggregated(String aggregated) {
        this.aggregated = aggregated;
        return this;
    }

    /**
     * set createdTime
     *
     * @param createdTime
     */
    public UpdateWidgetSpec createdTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set dashboardId
     *
     * @param dashboardId
     */
    public UpdateWidgetSpec dashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * set metrics
     *
     * @param metrics
     */
    public UpdateWidgetSpec metrics(List<WidgetMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * set name
     *
     * @param name
     */
    public UpdateWidgetSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set position
     *
     * @param position
     */
    public UpdateWidgetSpec position(WidgetPosition position) {
        this.position = position;
        return this;
    }

    /**
     * set resources
     *
     * @param resources
     */
    public UpdateWidgetSpec resources(WidgetResources resources) {
        this.resources = resources;
        return this;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public UpdateWidgetSpec serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set topN
     *
     * @param topN
     */
    public UpdateWidgetSpec topN(Integer topN) {
        this.topN = topN;
        return this;
    }

    /**
     * set type
     *
     * @param type
     */
    public UpdateWidgetSpec type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set updatedTime
     *
     * @param updatedTime
     */
    public UpdateWidgetSpec updatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * set widgetId
     *
     * @param widgetId
     */
    public UpdateWidgetSpec widgetId(String widgetId) {
        this.widgetId = widgetId;
        return this;
    }


    /**
     * add item to metrics
     *
     * @param metric
     */
    public void addMetric(WidgetMetric metric) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metric);
    }

}