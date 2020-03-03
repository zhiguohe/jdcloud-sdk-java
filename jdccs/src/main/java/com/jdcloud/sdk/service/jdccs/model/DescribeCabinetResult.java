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
 * Resource API
 * 云托管服务的资源API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdccs.model;

import com.jdcloud.sdk.service.jdccs.model.Cabinet;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询机柜详情
 */
public class DescribeCabinetResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * cabinet
     */
    private Cabinet cabinet;


    /**
     * get cabinet
     *
     * @return
     */
    public Cabinet getCabinet() {
        return cabinet;
    }

    /**
     * set cabinet
     *
     * @param cabinet
     */
    public void setCabinet(Cabinet cabinet) {
        this.cabinet = cabinet;
    }


    /**
     * set cabinet
     *
     * @param cabinet
     */
    public DescribeCabinetResult cabinet(Cabinet cabinet) {
        this.cabinet = cabinet;
        return this;
    }


}