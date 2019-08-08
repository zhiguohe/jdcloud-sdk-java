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

package com.jdcloud.sdk.service.pod.model;


/**
 * 容器日志配置信息。
 */
public class LogConfigSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志Driver名称，目前只支持默认为每一个容器在本地分配10MB的存储空间，自动rotate。目前仅支持default。默认值：default。
     */
    private String logDriver;


    /**
     * get 日志Driver名称，目前只支持默认为每一个容器在本地分配10MB的存储空间，自动rotate。目前仅支持default。默认值：default。
     *
     * @return
     */
    public String getLogDriver() {
        return logDriver;
    }

    /**
     * set 日志Driver名称，目前只支持默认为每一个容器在本地分配10MB的存储空间，自动rotate。目前仅支持default。默认值：default。
     *
     * @param logDriver
     */
    public void setLogDriver(String logDriver) {
        this.logDriver = logDriver;
    }


    /**
     * set 日志Driver名称，目前只支持默认为每一个容器在本地分配10MB的存储空间，自动rotate。目前仅支持default。默认值：default。
     *
     * @param logDriver
     */
    public LogConfigSpec logDriver(String logDriver) {
        this.logDriver = logDriver;
        return this;
    }


}