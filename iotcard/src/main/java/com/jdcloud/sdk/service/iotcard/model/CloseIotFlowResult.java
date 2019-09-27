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
 * iot-card-Related-API
 * 物联网卡服务相关API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcard.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.iotcard.model.OperationIotCardResp;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 物联网卡停流量操作
 */
public class CloseIotFlowResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 请求状态(0:成功;1:失败)
     */
    private String status;

    /**
     * 消息描述
     */
    private String message;

    /**
     * result
     */
    private List<OperationIotCardResp> result;


    /**
     * get 请求状态(0:成功;1:失败)
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 请求状态(0:成功;1:失败)
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 消息描述
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 消息描述
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get result
     *
     * @return
     */
    public List<OperationIotCardResp> getResult() {
        return result;
    }

    /**
     * set result
     *
     * @param result
     */
    public void setResult(List<OperationIotCardResp> result) {
        this.result = result;
    }


    /**
     * set 请求状态(0:成功;1:失败)
     *
     * @param status
     */
    public CloseIotFlowResult status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 消息描述
     *
     * @param message
     */
    public CloseIotFlowResult message(String message) {
        this.message = message;
        return this;
    }

    /**
     * set result
     *
     * @param result
     */
    public CloseIotFlowResult result(List<OperationIotCardResp> result) {
        this.result = result;
        return this;
    }


    /**
     * add item to result
     *
     * @param result
     */
    public void addResult(OperationIotCardResp result) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(result);
    }

}