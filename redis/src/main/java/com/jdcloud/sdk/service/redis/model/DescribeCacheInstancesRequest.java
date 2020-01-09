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
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.service.common.model.Sort;
import com.jdcloud.sdk.service.common.model.TagFilter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询缓存Redis实例列表，可分页、可排序、可搜索、可过滤
 */
public class DescribeCacheInstancesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码：取值范围[1,∞)，默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小：取值范围[10, 100]，默认为10
     */
    private Integer pageSize;

    /**
     * 过滤属性：
cacheInstanceId - 实例Id，精确匹配，可选择多个
cacheInstanceName - 实例名称，模糊匹配
cacheInstanceStatus - 实例状态，精确匹配，可选择多个(running：运行中，error：错误，creating：创建中，changing：变配中，configuring：参数修改中，restoring：备份恢复中，deleting：删除中)
redisVersion - redis引擎版本，精确匹配，可选择2.8和4.0
instanceType - 实例类型，精确匹配（redis表示主从版，redis_cluster表示集群版）
chargeMode - 计费类型，精确匹配（prepaid_by_duration表示包年包月预付费，postpaid_by_duration表示按配置后付费）

     */
    private List<Filter> filters;

    /**
     * 排序属性：
createTime - 按创建时间排序(asc表示按时间正序，desc表示按时间倒序)

     */
    private List<Sort> sorts;

    /**
     * 标签的过滤条件
     */
    private List<TagFilter> tagFilters;

    /**
     * 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码：取值范围[1,∞)，默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码：取值范围[1,∞)，默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小：取值范围[10, 100]，默认为10
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小：取值范围[10, 100]，默认为10
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 过滤属性：
cacheInstanceId - 实例Id，精确匹配，可选择多个
cacheInstanceName - 实例名称，模糊匹配
cacheInstanceStatus - 实例状态，精确匹配，可选择多个(running：运行中，error：错误，creating：创建中，changing：变配中，configuring：参数修改中，restoring：备份恢复中，deleting：删除中)
redisVersion - redis引擎版本，精确匹配，可选择2.8和4.0
instanceType - 实例类型，精确匹配（redis表示主从版，redis_cluster表示集群版）
chargeMode - 计费类型，精确匹配（prepaid_by_duration表示包年包月预付费，postpaid_by_duration表示按配置后付费）

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set 过滤属性：
cacheInstanceId - 实例Id，精确匹配，可选择多个
cacheInstanceName - 实例名称，模糊匹配
cacheInstanceStatus - 实例状态，精确匹配，可选择多个(running：运行中，error：错误，creating：创建中，changing：变配中，configuring：参数修改中，restoring：备份恢复中，deleting：删除中)
redisVersion - redis引擎版本，精确匹配，可选择2.8和4.0
instanceType - 实例类型，精确匹配（redis表示主从版，redis_cluster表示集群版）
chargeMode - 计费类型，精确匹配（prepaid_by_duration表示包年包月预付费，postpaid_by_duration表示按配置后付费）

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 排序属性：
createTime - 按创建时间排序(asc表示按时间正序，desc表示按时间倒序)

     *
     * @return
     */
    public List<Sort> getSorts() {
        return sorts;
    }

    /**
     * set 排序属性：
createTime - 按创建时间排序(asc表示按时间正序，desc表示按时间倒序)

     *
     * @param sorts
     */
    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }

    /**
     * get 标签的过滤条件
     *
     * @return
     */
    public List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * set 标签的过滤条件
     *
     * @param tagFilters
     */
    public void setTagFilters(List<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
    }

    /**
     * get 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码：取值范围[1,∞)，默认为1
     *
     * @param pageNumber
     */
    public DescribeCacheInstancesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小：取值范围[10, 100]，默认为10
     *
     * @param pageSize
     */
    public DescribeCacheInstancesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 过滤属性：
cacheInstanceId - 实例Id，精确匹配，可选择多个
cacheInstanceName - 实例名称，模糊匹配
cacheInstanceStatus - 实例状态，精确匹配，可选择多个(running：运行中，error：错误，creating：创建中，changing：变配中，configuring：参数修改中，restoring：备份恢复中，deleting：删除中)
redisVersion - redis引擎版本，精确匹配，可选择2.8和4.0
instanceType - 实例类型，精确匹配（redis表示主从版，redis_cluster表示集群版）
chargeMode - 计费类型，精确匹配（prepaid_by_duration表示包年包月预付费，postpaid_by_duration表示按配置后付费）

     *
     * @param filters
     */
    public DescribeCacheInstancesRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 排序属性：
createTime - 按创建时间排序(asc表示按时间正序，desc表示按时间倒序)

     *
     * @param sorts
     */
    public DescribeCacheInstancesRequest sorts(List<Sort> sorts) {
        this.sorts = sorts;
        return this;
    }

    /**
     * set 标签的过滤条件
     *
     * @param tagFilters
     */
    public DescribeCacheInstancesRequest tagFilters(List<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
        return this;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public DescribeCacheInstancesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 过滤属性：
cacheInstanceId - 实例Id，精确匹配，可选择多个
cacheInstanceName - 实例名称，模糊匹配
cacheInstanceStatus - 实例状态，精确匹配，可选择多个(running：运行中，error：错误，creating：创建中，changing：变配中，configuring：参数修改中，restoring：备份恢复中，deleting：删除中)
redisVersion - redis引擎版本，精确匹配，可选择2.8和4.0
instanceType - 实例类型，精确匹配（redis表示主从版，redis_cluster表示集群版）
chargeMode - 计费类型，精确匹配（prepaid_by_duration表示包年包月预付费，postpaid_by_duration表示按配置后付费）

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

    /**
     * add item to 排序属性：
createTime - 按创建时间排序(asc表示按时间正序，desc表示按时间倒序)

     *
     * @param sort
     */
    public void addSort(Sort sort) {
        if (this.sorts == null) {
            this.sorts = new ArrayList<>();
        }
        this.sorts.add(sort);
    }

    /**
     * add item to 标签的过滤条件
     *
     * @param tagFilter
     */
    public void addTagFilter(TagFilter tagFilter) {
        if (this.tagFilters == null) {
            this.tagFilters = new ArrayList<>();
        }
        this.tagFilters.add(tagFilter);
    }

}