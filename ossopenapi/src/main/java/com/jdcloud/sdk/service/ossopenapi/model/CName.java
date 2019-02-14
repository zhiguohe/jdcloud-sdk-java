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
 * custom domain name openapi
 * custom domain name openapi
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;


/**
 * cName
 */
public class CName  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自定义域名id
     */
    private Integer id;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 源站域名
     */
    private String originDomain;

    /**
     * 自定义域名
     */
    private String cname;

    /**
     * 自定义域名状态
     */
    private Integer status;

    /**
     * bucket name
     */
    private String bucketName;

    /**
     * cname是否成功，1：已解析；0:未解析
     */
    private Integer isCName;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * http版本，0：http，1：https
     */
    private Integer protoType;


    /**
     * get 自定义域名id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 自定义域名id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 源站域名
     *
     * @return
     */
    public String getOriginDomain() {
        return originDomain;
    }

    /**
     * set 源站域名
     *
     * @param originDomain
     */
    public void setOriginDomain(String originDomain) {
        this.originDomain = originDomain;
    }

    /**
     * get 自定义域名
     *
     * @return
     */
    public String getCname() {
        return cname;
    }

    /**
     * set 自定义域名
     *
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * get 自定义域名状态
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 自定义域名状态
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get bucket name
     *
     * @return
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * set bucket name
     *
     * @param bucketName
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * get cname是否成功，1：已解析；0:未解析
     *
     * @return
     */
    public Integer getIsCName() {
        return isCName;
    }

    /**
     * set cname是否成功，1：已解析；0:未解析
     *
     * @param isCName
     */
    public void setIsCName(Integer isCName) {
        this.isCName = isCName;
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
     * get http版本，0：http，1：https
     *
     * @return
     */
    public Integer getProtoType() {
        return protoType;
    }

    /**
     * set http版本，0：http，1：https
     *
     * @param protoType
     */
    public void setProtoType(Integer protoType) {
        this.protoType = protoType;
    }


    /**
     * set 自定义域名id
     *
     * @param id
     */
    public CName id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public CName pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 源站域名
     *
     * @param originDomain
     */
    public CName originDomain(String originDomain) {
        this.originDomain = originDomain;
        return this;
    }

    /**
     * set 自定义域名
     *
     * @param cname
     */
    public CName cname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * set 自定义域名状态
     *
     * @param status
     */
    public CName status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set bucket name
     *
     * @param bucketName
     */
    public CName bucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * set cname是否成功，1：已解析；0:未解析
     *
     * @param isCName
     */
    public CName isCName(Integer isCName) {
        this.isCName = isCName;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public CName createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set http版本，0：http，1：https
     *
     * @param protoType
     */
    public CName protoType(Integer protoType) {
        this.protoType = protoType;
        return this;
    }


}