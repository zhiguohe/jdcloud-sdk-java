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

package com.jdcloud.sdk.service.yundingdatapush.model;


/**
 * 数据推送用户对象
 */
public class VenderShow  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appkey
     */
    private String appkey;

    /**
     * 云鼎数据库实例ID
     */
    private String ydRdsInstanceId;

    /**
     * 商家ID
     */
    private String venderId;

    /**
     * 商家店铺名称
     */
    private String venderName;


    /**
     * get appkey
     *
     * @return
     */
    public String getAppkey() {
        return appkey;
    }

    /**
     * set appkey
     *
     * @param appkey
     */
    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    /**
     * get 云鼎数据库实例ID
     *
     * @return
     */
    public String getYdRdsInstanceId() {
        return ydRdsInstanceId;
    }

    /**
     * set 云鼎数据库实例ID
     *
     * @param ydRdsInstanceId
     */
    public void setYdRdsInstanceId(String ydRdsInstanceId) {
        this.ydRdsInstanceId = ydRdsInstanceId;
    }

    /**
     * get 商家ID
     *
     * @return
     */
    public String getVenderId() {
        return venderId;
    }

    /**
     * set 商家ID
     *
     * @param venderId
     */
    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    /**
     * get 商家店铺名称
     *
     * @return
     */
    public String getVenderName() {
        return venderName;
    }

    /**
     * set 商家店铺名称
     *
     * @param venderName
     */
    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }


    /**
     * set appkey
     *
     * @param appkey
     */
    public VenderShow appkey(String appkey) {
        this.appkey = appkey;
        return this;
    }

    /**
     * set 云鼎数据库实例ID
     *
     * @param ydRdsInstanceId
     */
    public VenderShow ydRdsInstanceId(String ydRdsInstanceId) {
        this.ydRdsInstanceId = ydRdsInstanceId;
        return this;
    }

    /**
     * set 商家ID
     *
     * @param venderId
     */
    public VenderShow venderId(String venderId) {
        this.venderId = venderId;
        return this;
    }

    /**
     * set 商家店铺名称
     *
     * @param venderName
     */
    public VenderShow venderName(String venderName) {
        this.venderName = venderName;
        return this;
    }


}