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

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * addSecurityGroupRules
 */
public class AddSecurityGroupRules  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则限定协议。300:All; 6:TCP; 17:UDP; 1:ICMP
     * Required:true
     */
    @Required
    private Number protocol;

    /**
     * 安全组规则方向。0：入规则; 1：出规则
     * Required:true
     */
    @Required
    private Number direction;

    /**
     * 匹配地址前缀
     * Required:true
     */
    @Required
    private String addressPrefix;

    /**
     * 规则限定起始传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为1，若protocol不是传输层协议，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     */
    private Number fromPort;

    /**
     * 规则限定终止传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为65535，若protocol不是传输层协议，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     */
    private Number toPort;

    /**
     * 描述,​ 允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;


    /**
     * get 规则限定协议。300:All; 6:TCP; 17:UDP; 1:ICMP
     *
     * @return
     */
    public Number getProtocol() {
        return protocol;
    }

    /**
     * set 规则限定协议。300:All; 6:TCP; 17:UDP; 1:ICMP
     *
     * @param protocol
     */
    public void setProtocol(Number protocol) {
        this.protocol = protocol;
    }

    /**
     * get 安全组规则方向。0：入规则; 1：出规则
     *
     * @return
     */
    public Number getDirection() {
        return direction;
    }

    /**
     * set 安全组规则方向。0：入规则; 1：出规则
     *
     * @param direction
     */
    public void setDirection(Number direction) {
        this.direction = direction;
    }

    /**
     * get 匹配地址前缀
     *
     * @return
     */
    public String getAddressPrefix() {
        return addressPrefix;
    }

    /**
     * set 匹配地址前缀
     *
     * @param addressPrefix
     */
    public void setAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
    }

    /**
     * get 规则限定起始传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为1，若protocol不是传输层协议，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     *
     * @return
     */
    public Number getFromPort() {
        return fromPort;
    }

    /**
     * set 规则限定起始传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为1，若protocol不是传输层协议，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     *
     * @param fromPort
     */
    public void setFromPort(Number fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * get 规则限定终止传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为65535，若protocol不是传输层协议，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     *
     * @return
     */
    public Number getToPort() {
        return toPort;
    }

    /**
     * set 规则限定终止传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为65535，若protocol不是传输层协议，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     *
     * @param toPort
     */
    public void setToPort(Number toPort) {
        this.toPort = toPort;
    }

    /**
     * get 描述,​ 允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述,​ 允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * set 规则限定协议。300:All; 6:TCP; 17:UDP; 1:ICMP
     *
     * @param protocol
     */
    public AddSecurityGroupRules protocol(Number protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * set 安全组规则方向。0：入规则; 1：出规则
     *
     * @param direction
     */
    public AddSecurityGroupRules direction(Number direction) {
        this.direction = direction;
        return this;
    }

    /**
     * set 匹配地址前缀
     *
     * @param addressPrefix
     */
    public AddSecurityGroupRules addressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * set 规则限定起始传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为1，若protocol不是传输层协议，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     *
     * @param fromPort
     */
    public AddSecurityGroupRules fromPort(Number fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * set 规则限定终止传输层端口, 取值范围:1-65535, 若protocol为传输层协议，默认值为65535，若protocol不是传输层协议，恒为0。如果规则只限定一个端口号，fromPort和toPort填写同一个值
     *
     * @param toPort
     */
    public AddSecurityGroupRules toPort(Number toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * set 描述,​ 允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public AddSecurityGroupRules description(String description) {
        this.description = description;
        return this;
    }


}