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

import com.jdcloud.sdk.annotation.Required;

/**
 * datasource
 */
public class Datasource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据源名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * opentsdbExtend
     */
    private OpentsdbExtend opentsdbExtend;

    /**
     * jdcloud-monitor-opentsdb     后续可能会有其它。如jdcloud-monitor-prometheus等
     * Required:true
     */
    @Required
    private String pluginType;

    /**
     * 数据源地址
     * Required:true
     */
    @Required
    private String url;


    /**
     * get 数据源名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 数据源名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get opentsdbExtend
     *
     * @return
     */
    public OpentsdbExtend getOpentsdbExtend() {
        return opentsdbExtend;
    }

    /**
     * set opentsdbExtend
     *
     * @param opentsdbExtend
     */
    public void setOpentsdbExtend(OpentsdbExtend opentsdbExtend) {
        this.opentsdbExtend = opentsdbExtend;
    }

    /**
     * get jdcloud-monitor-opentsdb     后续可能会有其它。如jdcloud-monitor-prometheus等
     *
     * @return
     */
    public String getPluginType() {
        return pluginType;
    }

    /**
     * set jdcloud-monitor-opentsdb     后续可能会有其它。如jdcloud-monitor-prometheus等
     *
     * @param pluginType
     */
    public void setPluginType(String pluginType) {
        this.pluginType = pluginType;
    }

    /**
     * get 数据源地址
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set 数据源地址
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * set 数据源名称
     *
     * @param name
     */
    public Datasource name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set opentsdbExtend
     *
     * @param opentsdbExtend
     */
    public Datasource opentsdbExtend(OpentsdbExtend opentsdbExtend) {
        this.opentsdbExtend = opentsdbExtend;
        return this;
    }

    /**
     * set jdcloud-monitor-opentsdb     后续可能会有其它。如jdcloud-monitor-prometheus等
     *
     * @param pluginType
     */
    public Datasource pluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }

    /**
     * set 数据源地址
     *
     * @param url
     */
    public Datasource url(String url) {
        this.url = url;
        return this;
    }


}