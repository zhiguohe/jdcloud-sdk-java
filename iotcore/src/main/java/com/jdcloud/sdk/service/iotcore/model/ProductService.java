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

import java.util.List;
import java.util.ArrayList;

/**
 * productService
 */
public class ProductService  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务名称
     */
    private String name;

    /**
     * 服务描述
     */
    private String description;

    /**
     * 输入参数
     */
    private List<ProductProperty> input;

    /**
     * 输出参数
     */
    private List<ProductProperty> output;

    /**
     * 是否为自定义功能,false:否,true:是
     */
    private Boolean customized;

    /**
     * 创建时间,时间为东八区(UTC/GMT+08:00)
     */
    private Long createdTime;


    /**
     * get 服务名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 服务名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 服务描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 服务描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 输入参数
     *
     * @return
     */
    public List<ProductProperty> getInput() {
        return input;
    }

    /**
     * set 输入参数
     *
     * @param input
     */
    public void setInput(List<ProductProperty> input) {
        this.input = input;
    }

    /**
     * get 输出参数
     *
     * @return
     */
    public List<ProductProperty> getOutput() {
        return output;
    }

    /**
     * set 输出参数
     *
     * @param output
     */
    public void setOutput(List<ProductProperty> output) {
        this.output = output;
    }

    /**
     * get 是否为自定义功能,false:否,true:是
     *
     * @return
     */
    public Boolean getCustomized() {
        return customized;
    }

    /**
     * set 是否为自定义功能,false:否,true:是
     *
     * @param customized
     */
    public void setCustomized(Boolean customized) {
        this.customized = customized;
    }

    /**
     * get 创建时间,时间为东八区(UTC/GMT+08:00)
     *
     * @return
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    /**
     * set 创建时间,时间为东八区(UTC/GMT+08:00)
     *
     * @param createdTime
     */
    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * set 服务名称
     *
     * @param name
     */
    public ProductService name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 服务描述
     *
     * @param description
     */
    public ProductService description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 输入参数
     *
     * @param input
     */
    public ProductService input(List<ProductProperty> input) {
        this.input = input;
        return this;
    }

    /**
     * set 输出参数
     *
     * @param output
     */
    public ProductService output(List<ProductProperty> output) {
        this.output = output;
        return this;
    }

    /**
     * set 是否为自定义功能,false:否,true:是
     *
     * @param customized
     */
    public ProductService customized(Boolean customized) {
        this.customized = customized;
        return this;
    }

    /**
     * set 创建时间,时间为东八区(UTC/GMT+08:00)
     *
     * @param createdTime
     */
    public ProductService createdTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }


    /**
     * add item to 输入参数
     *
     * @param input
     */
    public void addInput(ProductProperty input) {
        if (this.input == null) {
            this.input = new ArrayList<>();
        }
        this.input.add(input);
    }

    /**
     * add item to 输出参数
     *
     * @param output
     */
    public void addOutput(ProductProperty output) {
        if (this.output == null) {
            this.output = new ArrayList<>();
        }
        this.output.add(output);
    }

}