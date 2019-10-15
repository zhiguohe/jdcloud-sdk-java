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

package com.jdcloud.sdk.service.iotcard.model;


/**
 * operationIotCardResp
 */
public class OperationIotCardResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物联网卡iccid
     */
    private String iccid;

    /**
     * 操作状态(0:操作成功;1:操作失败)
     */
    private String status;

    /**
     * 卡操作反馈信息
     */
    private String message;


    /**
     * get 物联网卡iccid
     *
     * @return
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * set 物联网卡iccid
     *
     * @param iccid
     */
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    /**
     * get 操作状态(0:操作成功;1:操作失败)
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 操作状态(0:操作成功;1:操作失败)
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 卡操作反馈信息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 卡操作反馈信息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * set 物联网卡iccid
     *
     * @param iccid
     */
    public OperationIotCardResp iccid(String iccid) {
        this.iccid = iccid;
        return this;
    }

    /**
     * set 操作状态(0:操作成功;1:操作失败)
     *
     * @param status
     */
    public OperationIotCardResp status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 卡操作反馈信息
     *
     * @param message
     */
    public OperationIotCardResp message(String message) {
        this.message = message;
        return this;
    }


}