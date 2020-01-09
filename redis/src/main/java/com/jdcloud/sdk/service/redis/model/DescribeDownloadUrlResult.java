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
 * Redis Instance API
 * 缓存Redis实例的创建、删除、修改基本信息、设置密码、变配、实例列表、备份、配置参数等接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.redis.model.DownloadUrl;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取缓存Redis实例的备份文件临时下载地址（1个小时有效期）
 */
public class DescribeDownloadUrlResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * downloadUrls
     */
    private List<DownloadUrl> downloadUrls;


    /**
     * get downloadUrls
     *
     * @return
     */
    public List<DownloadUrl> getDownloadUrls() {
        return downloadUrls;
    }

    /**
     * set downloadUrls
     *
     * @param downloadUrls
     */
    public void setDownloadUrls(List<DownloadUrl> downloadUrls) {
        this.downloadUrls = downloadUrls;
    }


    /**
     * set downloadUrls
     *
     * @param downloadUrls
     */
    public DescribeDownloadUrlResult downloadUrls(List<DownloadUrl> downloadUrls) {
        this.downloadUrls = downloadUrls;
        return this;
    }


    /**
     * add item to downloadUrls
     *
     * @param downloadUrl
     */
    public void addDownloadUrl(DownloadUrl downloadUrl) {
        if (this.downloadUrls == null) {
            this.downloadUrls = new ArrayList<>();
        }
        this.downloadUrls.add(downloadUrl);
    }

}