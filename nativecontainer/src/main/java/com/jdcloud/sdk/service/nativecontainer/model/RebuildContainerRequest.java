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
 * 原生容器
 * 原生容器相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.nativecontainer.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.nativecontainer.model.EnvVar;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 重置原生容器，对已有原生容器使用新的镜像重置。
原容器 id 不变，不涉及计费变动，暂不支持修改实例类型，不会改变原生容器所在的物理节点，也不支持修改已经使用的系统盘和数据盘以及网络相关参数。
- 镜像
    - 容器的镜像通过镜像名称来确定
    - nginx:tag 或 mysql/mysql-server:tag 这样命名的镜像表示 docker hub 官方镜像
    - container-registry/image:tag 这样命名的镜像表示私有仓储的镜像
    - 私有仓储必须兼容 docker registry 认证机制，并通过 secret 来保存机密信息
- 其他
    - rebuild 之前容器必须处于关闭状态
    - rebuild 完成后，容器仍为关闭状态

 */
public class RebuildContainerRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像名称 &lt;/br&gt; 1. Docker Hub官方镜像通过类似nginx, mysql/mysql-server的名字指定 &lt;/br&gt; &lt;/br&gt; repository长度最大256个字符，tag最大128个字符，registry最大255个字符 &lt;/br&gt; 下载镜像超时时间：10分钟
     * Required:true
     */
    @Required
    private String image;

    /**
     * 镜像仓库认证信息；使用Docker Hub和京东云CR的镜像不需要secret
     */
    private String secret;

    /**
     * 容器启动执行的命令, 如果不指定默认是镜像的ENTRYPOINT. 数组字符总长度范围：[0-256]
     */
    private List<String> command;

    /**
     * 容器启动执行命令的参数, 如果不指定默认是镜像的CMD. 数组字符总长度范围：[0-2048]
     */
    private List<String> args;

    /**
     * 容器是否分配tty。默认不分配
     */
    private Boolean tty;

    /**
     * 容器的工作目录。如果不指定，默认是根目录（/），必须是绝对路径。字符长度范围：[0-1024]
     */
    private String workingDir;

    /**
     * 容器执行的环境变量；如果和镜像中的环境变量Key相同，会覆盖镜像中的值；&lt;/br&gt; 最大100对
     */
    private List<EnvVar> envs;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Container ID
     * Required:true
     */
    @Required
    private String containerId;


    /**
     * get 镜像名称 &lt;/br&gt; 1. Docker Hub官方镜像通过类似nginx, mysql/mysql-server的名字指定 &lt;/br&gt; &lt;/br&gt; repository长度最大256个字符，tag最大128个字符，registry最大255个字符 &lt;/br&gt; 下载镜像超时时间：10分钟
     *
     * @return
     */
    public String getImage() {
        return image;
    }

    /**
     * set 镜像名称 &lt;/br&gt; 1. Docker Hub官方镜像通过类似nginx, mysql/mysql-server的名字指定 &lt;/br&gt; &lt;/br&gt; repository长度最大256个字符，tag最大128个字符，registry最大255个字符 &lt;/br&gt; 下载镜像超时时间：10分钟
     *
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * get 镜像仓库认证信息；使用Docker Hub和京东云CR的镜像不需要secret
     *
     * @return
     */
    public String getSecret() {
        return secret;
    }

    /**
     * set 镜像仓库认证信息；使用Docker Hub和京东云CR的镜像不需要secret
     *
     * @param secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * get 容器启动执行的命令, 如果不指定默认是镜像的ENTRYPOINT. 数组字符总长度范围：[0-256]
     *
     * @return
     */
    public List<String> getCommand() {
        return command;
    }

    /**
     * set 容器启动执行的命令, 如果不指定默认是镜像的ENTRYPOINT. 数组字符总长度范围：[0-256]
     *
     * @param command
     */
    public void setCommand(List<String> command) {
        this.command = command;
    }

    /**
     * get 容器启动执行命令的参数, 如果不指定默认是镜像的CMD. 数组字符总长度范围：[0-2048]
     *
     * @return
     */
    public List<String> getArgs() {
        return args;
    }

    /**
     * set 容器启动执行命令的参数, 如果不指定默认是镜像的CMD. 数组字符总长度范围：[0-2048]
     *
     * @param args
     */
    public void setArgs(List<String> args) {
        this.args = args;
    }

    /**
     * get 容器是否分配tty。默认不分配
     *
     * @return
     */
    public Boolean getTty() {
        return tty;
    }

    /**
     * set 容器是否分配tty。默认不分配
     *
     * @param tty
     */
    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    /**
     * get 容器的工作目录。如果不指定，默认是根目录（/），必须是绝对路径。字符长度范围：[0-1024]
     *
     * @return
     */
    public String getWorkingDir() {
        return workingDir;
    }

    /**
     * set 容器的工作目录。如果不指定，默认是根目录（/），必须是绝对路径。字符长度范围：[0-1024]
     *
     * @param workingDir
     */
    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    /**
     * get 容器执行的环境变量；如果和镜像中的环境变量Key相同，会覆盖镜像中的值；&lt;/br&gt; 最大100对
     *
     * @return
     */
    public List<EnvVar> getEnvs() {
        return envs;
    }

    /**
     * set 容器执行的环境变量；如果和镜像中的环境变量Key相同，会覆盖镜像中的值；&lt;/br&gt; 最大100对
     *
     * @param envs
     */
    public void setEnvs(List<EnvVar> envs) {
        this.envs = envs;
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
     * get Container ID
     *
     * @return
     */
    public String getContainerId() {
        return containerId;
    }

    /**
     * set Container ID
     *
     * @param containerId
     */
    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }


    /**
     * set 镜像名称 &lt;/br&gt; 1. Docker Hub官方镜像通过类似nginx, mysql/mysql-server的名字指定 &lt;/br&gt; &lt;/br&gt; repository长度最大256个字符，tag最大128个字符，registry最大255个字符 &lt;/br&gt; 下载镜像超时时间：10分钟
     *
     * @param image
     */
    public RebuildContainerRequest image(String image) {
        this.image = image;
        return this;
    }

    /**
     * set 镜像仓库认证信息；使用Docker Hub和京东云CR的镜像不需要secret
     *
     * @param secret
     */
    public RebuildContainerRequest secret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * set 容器启动执行的命令, 如果不指定默认是镜像的ENTRYPOINT. 数组字符总长度范围：[0-256]
     *
     * @param command
     */
    public RebuildContainerRequest command(List<String> command) {
        this.command = command;
        return this;
    }

    /**
     * set 容器启动执行命令的参数, 如果不指定默认是镜像的CMD. 数组字符总长度范围：[0-2048]
     *
     * @param args
     */
    public RebuildContainerRequest args(List<String> args) {
        this.args = args;
        return this;
    }

    /**
     * set 容器是否分配tty。默认不分配
     *
     * @param tty
     */
    public RebuildContainerRequest tty(Boolean tty) {
        this.tty = tty;
        return this;
    }

    /**
     * set 容器的工作目录。如果不指定，默认是根目录（/），必须是绝对路径。字符长度范围：[0-1024]
     *
     * @param workingDir
     */
    public RebuildContainerRequest workingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * set 容器执行的环境变量；如果和镜像中的环境变量Key相同，会覆盖镜像中的值；&lt;/br&gt; 最大100对
     *
     * @param envs
     */
    public RebuildContainerRequest envs(List<EnvVar> envs) {
        this.envs = envs;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public RebuildContainerRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Container ID
     *
     * @param containerId
     */
    public RebuildContainerRequest containerId(String containerId) {
        this.containerId = containerId;
        return this;
    }


    /**
     * add item to 容器启动执行的命令, 如果不指定默认是镜像的ENTRYPOINT. 数组字符总长度范围：[0-256]
     *
     * @param command
     */
    public void addCommand(String command) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(command);
    }

    /**
     * add item to 容器启动执行命令的参数, 如果不指定默认是镜像的CMD. 数组字符总长度范围：[0-2048]
     *
     * @param arg
     */
    public void addArg(String arg) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(arg);
    }

    /**
     * add item to 容器执行的环境变量；如果和镜像中的环境变量Key相同，会覆盖镜像中的值；&lt;/br&gt; 最大100对
     *
     * @param env
     */
    public void addEnv(EnvVar env) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(env);
    }

}