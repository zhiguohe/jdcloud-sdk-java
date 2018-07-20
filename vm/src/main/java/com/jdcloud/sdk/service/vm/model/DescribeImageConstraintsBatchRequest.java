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
 * 镜像
 * 关于主机镜像操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 批量查询镜像限制
 */
public class DescribeImageConstraintsBatchRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像ID列表
     */
    private List<String> ids;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 镜像ID列表
     *
     * @return
     */
    public List<String> getIds() {
        return ids;
    }

    /**
     * set 镜像ID列表
     *
     * @param ids
     */
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 镜像ID列表
     *
     * @param ids
     */
    public DescribeImageConstraintsBatchRequest ids(List<String> ids) {
        this.ids = ids;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribeImageConstraintsBatchRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 镜像ID列表
     *
     * @param id
     */
    public void addId(String id) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(id);
    }

}