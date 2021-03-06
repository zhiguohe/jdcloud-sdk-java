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

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * paramInfo
 */
public class ParamInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否多值,默认为false
     */
    private Boolean isMulti;

    /**
     * 名称
     */
    private String name;

    /**
     * 可选值
     */
    private List<String> optional;

    /**
     * 参数类型，目前只有datasource
     */
    private String paramType;

    /**
     * 是否必须
     */
    private Boolean required;

    /**
     * 值类型，int, float, string
     */
    private String valueType;


    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 是否多值,默认为false
     *
     * @return
     */
    public Boolean getIsMulti() {
        return isMulti;
    }

    /**
     * set 是否多值,默认为false
     *
     * @param isMulti
     */
    public void setIsMulti(Boolean isMulti) {
        this.isMulti = isMulti;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 可选值
     *
     * @return
     */
    public List<String> getOptional() {
        return optional;
    }

    /**
     * set 可选值
     *
     * @param optional
     */
    public void setOptional(List<String> optional) {
        this.optional = optional;
    }

    /**
     * get 参数类型，目前只有datasource
     *
     * @return
     */
    public String getParamType() {
        return paramType;
    }

    /**
     * set 参数类型，目前只有datasource
     *
     * @param paramType
     */
    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    /**
     * get 是否必须
     *
     * @return
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * set 是否必须
     *
     * @param required
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * get 值类型，int, float, string
     *
     * @return
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * set 值类型，int, float, string
     *
     * @param valueType
     */
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }


    /**
     * set 描述
     *
     * @param description
     */
    public ParamInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 是否多值,默认为false
     *
     * @param isMulti
     */
    public ParamInfo isMulti(Boolean isMulti) {
        this.isMulti = isMulti;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public ParamInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 可选值
     *
     * @param optional
     */
    public ParamInfo optional(List<String> optional) {
        this.optional = optional;
        return this;
    }

    /**
     * set 参数类型，目前只有datasource
     *
     * @param paramType
     */
    public ParamInfo paramType(String paramType) {
        this.paramType = paramType;
        return this;
    }

    /**
     * set 是否必须
     *
     * @param required
     */
    public ParamInfo required(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * set 值类型，int, float, string
     *
     * @param valueType
     */
    public ParamInfo valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }


    /**
     * add item to 可选值
     *
     * @param optional
     */
    public void addOptional(String optional) {
        if (this.optional == null) {
            this.optional = new ArrayList<>();
        }
        this.optional.add(optional);
    }

}