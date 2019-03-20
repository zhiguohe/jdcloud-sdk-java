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

package com.jdcloud.sdk.service.iam.model;


/**
 * createSubUserRes
 */
public class CreateSubUserRes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * accessKey
     */
    private String accessKey;

    /**
     * AccessKey secret
     */
    private String secretAccessKey;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;


    /**
     * get 用户名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 用户名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 密码
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 密码
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get 邮箱
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get accessKey
     *
     * @return
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * set accessKey
     *
     * @param accessKey
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * get AccessKey secret
     *
     * @return
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    /**
     * set AccessKey secret
     *
     * @param secretAccessKey
     */
    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 用户名
     *
     * @param name
     */
    public CreateSubUserRes name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 密码
     *
     * @param password
     */
    public CreateSubUserRes password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public CreateSubUserRes email(String email) {
        this.email = email;
        return this;
    }

    /**
     * set accessKey
     *
     * @param accessKey
     */
    public CreateSubUserRes accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * set AccessKey secret
     *
     * @param secretAccessKey
     */
    public CreateSubUserRes secretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public CreateSubUserRes createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public CreateSubUserRes updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}