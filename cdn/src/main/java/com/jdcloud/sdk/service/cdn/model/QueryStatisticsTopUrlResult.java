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
 * JCloud Openapi For CDN
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.StatisticsTopUrlData;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询TOP Url
 */
public class QueryStatisticsTopUrlResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * startTime
     */
    private String startTime;

    /**
     * endTime
     */
    private String endTime;

    /**
     * domain
     */
    private String domain;

    /**
     * urlData
     */
    private List<StatisticsTopUrlData> urlData;


    /**
     * get startTime
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set startTime
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get endTime
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get domain
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get urlData
     *
     * @return
     */
    public List<StatisticsTopUrlData> getUrlData() {
        return urlData;
    }

    /**
     * set urlData
     *
     * @param urlData
     */
    public void setUrlData(List<StatisticsTopUrlData> urlData) {
        this.urlData = urlData;
    }


    /**
     * set startTime
     *
     * @param startTime
     */
    public QueryStatisticsTopUrlResult startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public QueryStatisticsTopUrlResult endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public QueryStatisticsTopUrlResult domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set urlData
     *
     * @param urlData
     */
    public QueryStatisticsTopUrlResult urlData(List<StatisticsTopUrlData> urlData) {
        this.urlData = urlData;
        return this;
    }


    /**
     * add item to urlData
     *
     * @param urlData
     */
    public void addUrlData(StatisticsTopUrlData urlData) {
        if (this.urlData == null) {
            this.urlData = new ArrayList<>();
        }
        this.urlData.add(urlData);
    }

}