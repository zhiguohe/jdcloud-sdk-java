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


/**
 * testSiteMonitorOut
 */
public class TestSiteMonitorOut  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 错误信息
     */
    private String error;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 状态码
     */
    private Long status;


    /**
     * get 错误信息
     *
     * @return
     */
    public String getError() {
        return error;
    }

    /**
     * set 错误信息
     *
     * @param error
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * get 提示信息
     *
     * @return
     */
    public String getMsg() {
        return msg;
    }

    /**
     * set 提示信息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * get 状态码
     *
     * @return
     */
    public Long getStatus() {
        return status;
    }

    /**
     * set 状态码
     *
     * @param status
     */
    public void setStatus(Long status) {
        this.status = status;
    }


    /**
     * set 错误信息
     *
     * @param error
     */
    public TestSiteMonitorOut error(String error) {
        this.error = error;
        return this;
    }

    /**
     * set 提示信息
     *
     * @param msg
     */
    public TestSiteMonitorOut msg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * set 状态码
     *
     * @param status
     */
    public TestSiteMonitorOut status(Long status) {
        this.status = status;
        return this;
    }


}