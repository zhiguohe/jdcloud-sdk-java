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
 * Monitor API
 * 云托管服务的监控API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdccs.model;

import com.jdcloud.sdk.service.jdccs.model.BandwidthTraffic;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询带宽（出口）流量（资源）详情
 */
public class DescribeBandwidthTrafficResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 带宽（出口）流量（资源）详情
     */
    private BandwidthTraffic bandwidthTraffic;


    /**
     * get 带宽（出口）流量（资源）详情
     *
     * @return
     */
    public BandwidthTraffic getBandwidthTraffic() {
        return bandwidthTraffic;
    }

    /**
     * set 带宽（出口）流量（资源）详情
     *
     * @param bandwidthTraffic
     */
    public void setBandwidthTraffic(BandwidthTraffic bandwidthTraffic) {
        this.bandwidthTraffic = bandwidthTraffic;
    }


    /**
     * set 带宽（出口）流量（资源）详情
     *
     * @param bandwidthTraffic
     */
    public DescribeBandwidthTrafficResult bandwidthTraffic(BandwidthTraffic bandwidthTraffic) {
        this.bandwidthTraffic = bandwidthTraffic;
        return this;
    }


}