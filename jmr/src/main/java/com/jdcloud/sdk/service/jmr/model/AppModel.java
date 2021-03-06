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

package com.jdcloud.sdk.service.jmr.model;


/**
 * appModel
 */
public class AppModel  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * app程序
     */
    private String appKey;

    /**
     * app密钥
     */
    private String appSecret;


    /**
     * get app程序
     *
     * @return
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * set app程序
     *
     * @param appKey
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    /**
     * get app密钥
     *
     * @return
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * set app密钥
     *
     * @param appSecret
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }


    /**
     * set app程序
     *
     * @param appKey
     */
    public AppModel appKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * set app密钥
     *
     * @param appSecret
     */
    public AppModel appSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }


}