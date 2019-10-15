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

package com.jdcloud.sdk.service.iotcore.model;


/**
 * childModules
 */
public class ChildModules  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模块编号
     */
    private String moduleId;

    /**
     * 模块名称
     */
    private String moduleName;

    /**
     * 模块类型版本
     */
    private String moduleTypeVersion;

    /**
     * 物模型名称
     */
    private String omName;

    /**
     * 物模型描述
     */
    private String omDesc;

    /**
     * 模块状态
     */
    private String moduleState;


    /**
     * get 模块编号
     *
     * @return
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * set 模块编号
     *
     * @param moduleId
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * get 模块名称
     *
     * @return
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * set 模块名称
     *
     * @param moduleName
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * get 模块类型版本
     *
     * @return
     */
    public String getModuleTypeVersion() {
        return moduleTypeVersion;
    }

    /**
     * set 模块类型版本
     *
     * @param moduleTypeVersion
     */
    public void setModuleTypeVersion(String moduleTypeVersion) {
        this.moduleTypeVersion = moduleTypeVersion;
    }

    /**
     * get 物模型名称
     *
     * @return
     */
    public String getOmName() {
        return omName;
    }

    /**
     * set 物模型名称
     *
     * @param omName
     */
    public void setOmName(String omName) {
        this.omName = omName;
    }

    /**
     * get 物模型描述
     *
     * @return
     */
    public String getOmDesc() {
        return omDesc;
    }

    /**
     * set 物模型描述
     *
     * @param omDesc
     */
    public void setOmDesc(String omDesc) {
        this.omDesc = omDesc;
    }

    /**
     * get 模块状态
     *
     * @return
     */
    public String getModuleState() {
        return moduleState;
    }

    /**
     * set 模块状态
     *
     * @param moduleState
     */
    public void setModuleState(String moduleState) {
        this.moduleState = moduleState;
    }


    /**
     * set 模块编号
     *
     * @param moduleId
     */
    public ChildModules moduleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * set 模块名称
     *
     * @param moduleName
     */
    public ChildModules moduleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * set 模块类型版本
     *
     * @param moduleTypeVersion
     */
    public ChildModules moduleTypeVersion(String moduleTypeVersion) {
        this.moduleTypeVersion = moduleTypeVersion;
        return this;
    }

    /**
     * set 物模型名称
     *
     * @param omName
     */
    public ChildModules omName(String omName) {
        this.omName = omName;
        return this;
    }

    /**
     * set 物模型描述
     *
     * @param omDesc
     */
    public ChildModules omDesc(String omDesc) {
        this.omDesc = omDesc;
        return this;
    }

    /**
     * set 模块状态
     *
     * @param moduleState
     */
    public ChildModules moduleState(String moduleState) {
        this.moduleState = moduleState;
        return this;
    }


}