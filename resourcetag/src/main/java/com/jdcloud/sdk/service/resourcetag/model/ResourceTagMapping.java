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

package com.jdcloud.sdk.service.resourcetag.model;

import java.util.List;
import java.util.ArrayList;

/**
 * resourceTagMapping
 */
public class ResourceTagMapping  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * jrn本期不用, 默认为null
     */
    private String jrn;

    /**
     * 产品线名称
     */
    private String serviceCode;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 该资源绑定的标签组成的数组
     */
    private List<Tag> tags;


    /**
     * get jrn本期不用, 默认为null
     *
     * @return
     */
    public String getJrn() {
        return jrn;
    }

    /**
     * set jrn本期不用, 默认为null
     *
     * @param jrn
     */
    public void setJrn(String jrn) {
        this.jrn = jrn;
    }

    /**
     * get 产品线名称
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线名称
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 资源id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 该资源绑定的标签组成的数组
     *
     * @return
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * set 该资源绑定的标签组成的数组
     *
     * @param tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


    /**
     * set jrn本期不用, 默认为null
     *
     * @param jrn
     */
    public ResourceTagMapping jrn(String jrn) {
        this.jrn = jrn;
        return this;
    }

    /**
     * set 产品线名称
     *
     * @param serviceCode
     */
    public ResourceTagMapping serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public ResourceTagMapping resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 该资源绑定的标签组成的数组
     *
     * @param tags
     */
    public ResourceTagMapping tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }


    /**
     * add item to 该资源绑定的标签组成的数组
     *
     * @param tag
     */
    public void addTag(Tag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}