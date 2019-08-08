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

package com.jdcloud.sdk.service.domainservice.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * addViewIP
 */
public class AddViewIP  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自定义线路ID
     * Required:true
     */
    @Required
    private Integer viewId;

    /**
     * 自定义线路名称, 最多64个字节，允许：数字、字母、下划线，-，中文
     * Required:true
     */
    @Required
    private String viewName;

    /**
     * 此线路需要添加的ip段。  
IPv4地址段支持1.2.3.4-5.6.7.8和1.2.3.4/16两种格式。    
IPv6地址段支持CIDR格式，例如：11:22:33:44:55::99/64

     * Required:true
     */
    @Required
    private List<String> ipRanges;


    /**
     * get 自定义线路ID
     *
     * @return
     */
    public Integer getViewId() {
        return viewId;
    }

    /**
     * set 自定义线路ID
     *
     * @param viewId
     */
    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    /**
     * get 自定义线路名称, 最多64个字节，允许：数字、字母、下划线，-，中文
     *
     * @return
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * set 自定义线路名称, 最多64个字节，允许：数字、字母、下划线，-，中文
     *
     * @param viewName
     */
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    /**
     * get 此线路需要添加的ip段。  
IPv4地址段支持1.2.3.4-5.6.7.8和1.2.3.4/16两种格式。    
IPv6地址段支持CIDR格式，例如：11:22:33:44:55::99/64

     *
     * @return
     */
    public List<String> getIpRanges() {
        return ipRanges;
    }

    /**
     * set 此线路需要添加的ip段。  
IPv4地址段支持1.2.3.4-5.6.7.8和1.2.3.4/16两种格式。    
IPv6地址段支持CIDR格式，例如：11:22:33:44:55::99/64

     *
     * @param ipRanges
     */
    public void setIpRanges(List<String> ipRanges) {
        this.ipRanges = ipRanges;
    }


    /**
     * set 自定义线路ID
     *
     * @param viewId
     */
    public AddViewIP viewId(Integer viewId) {
        this.viewId = viewId;
        return this;
    }

    /**
     * set 自定义线路名称, 最多64个字节，允许：数字、字母、下划线，-，中文
     *
     * @param viewName
     */
    public AddViewIP viewName(String viewName) {
        this.viewName = viewName;
        return this;
    }

    /**
     * set 此线路需要添加的ip段。  
IPv4地址段支持1.2.3.4-5.6.7.8和1.2.3.4/16两种格式。    
IPv6地址段支持CIDR格式，例如：11:22:33:44:55::99/64

     *
     * @param ipRanges
     */
    public AddViewIP ipRanges(List<String> ipRanges) {
        this.ipRanges = ipRanges;
        return this;
    }


    /**
     * add item to 此线路需要添加的ip段。  
IPv4地址段支持1.2.3.4-5.6.7.8和1.2.3.4/16两种格式。    
IPv6地址段支持CIDR格式，例如：11:22:33:44:55::99/64

     *
     * @param ipRange
     */
    public void addIpRange(String ipRange) {
        if (this.ipRanges == null) {
            this.ipRanges = new ArrayList<>();
        }
        this.ipRanges.add(ipRange);
    }

}