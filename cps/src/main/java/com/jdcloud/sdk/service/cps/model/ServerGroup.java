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

package com.jdcloud.sdk.service.cps.model;


/**
 * serverGroup
 */
public class ServerGroup  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 负载均衡ID
     */
    private String loadBalancerId;

    /**
     * 虚拟服务器组ID
     */
    private String serverGroupId;

    /**
     * 虚拟服务器组名称
     */
    private String name;


    /**
     * get 负载均衡ID
     *
     * @return
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * set 负载均衡ID
     *
     * @param loadBalancerId
     */
    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    /**
     * get 虚拟服务器组ID
     *
     * @return
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    /**
     * set 虚拟服务器组ID
     *
     * @param serverGroupId
     */
    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    /**
     * get 虚拟服务器组名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 虚拟服务器组名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * set 负载均衡ID
     *
     * @param loadBalancerId
     */
    public ServerGroup loadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }

    /**
     * set 虚拟服务器组ID
     *
     * @param serverGroupId
     */
    public ServerGroup serverGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * set 虚拟服务器组名称
     *
     * @param name
     */
    public ServerGroup name(String name) {
        this.name = name;
        return this;
    }


}