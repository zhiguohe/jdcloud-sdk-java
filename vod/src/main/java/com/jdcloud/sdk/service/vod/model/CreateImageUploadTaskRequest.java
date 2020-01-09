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
 * Media Upload
 * 媒体上传相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取图片上传地址和凭证
 */
public class CreateImageUploadTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * HTTP 请求方法，取值范围：GET、POST、PUT、DELETE、HEAD、PATCH，默认值为 PUT
     */
    private String httpMethod;

    /**
     * 文件名称
     * Required:true
     */
    @Required
    private String fileName;

    /**
     * 文件大小
     */
    private Long fileSize;


    /**
     * get HTTP 请求方法，取值范围：GET、POST、PUT、DELETE、HEAD、PATCH，默认值为 PUT
     *
     * @return
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * set HTTP 请求方法，取值范围：GET、POST、PUT、DELETE、HEAD、PATCH，默认值为 PUT
     *
     * @param httpMethod
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * get 文件名称
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * set 文件名称
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * get 文件大小
     *
     * @return
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * set 文件大小
     *
     * @param fileSize
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * set HTTP 请求方法，取值范围：GET、POST、PUT、DELETE、HEAD、PATCH，默认值为 PUT
     *
     * @param httpMethod
     */
    public CreateImageUploadTaskRequest httpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * set 文件名称
     *
     * @param fileName
     */
    public CreateImageUploadTaskRequest fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * set 文件大小
     *
     * @param fileSize
     */
    public CreateImageUploadTaskRequest fileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }


}