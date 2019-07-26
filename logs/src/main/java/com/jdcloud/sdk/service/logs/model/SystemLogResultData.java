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

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;

/**
 * systemLogResultData
 */
public class SystemLogResultData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 上下文日志搜索锚点
     */
    private List<Object> anchor;

    /**
     * 包含id, originalMsg, time字段
     */
    private Object source;


    /**
     * get 上下文日志搜索锚点
     *
     * @return
     */
    public List<Object> getAnchor() {
        return anchor;
    }

    /**
     * set 上下文日志搜索锚点
     *
     * @param anchor
     */
    public void setAnchor(List<Object> anchor) {
        this.anchor = anchor;
    }

    /**
     * get 包含id, originalMsg, time字段
     *
     * @return
     */
    public Object getSource() {
        return source;
    }

    /**
     * set 包含id, originalMsg, time字段
     *
     * @param source
     */
    public void setSource(Object source) {
        this.source = source;
    }


    /**
     * set 上下文日志搜索锚点
     *
     * @param anchor
     */
    public SystemLogResultData anchor(List<Object> anchor) {
        this.anchor = anchor;
        return this;
    }

    /**
     * set 包含id, originalMsg, time字段
     *
     * @param source
     */
    public SystemLogResultData source(Object source) {
        this.source = source;
        return this;
    }


    /**
     * add item to 上下文日志搜索锚点
     *
     * @param anchor
     */
    public void addAnchor(Object anchor) {
        if (this.anchor == null) {
            this.anchor = new ArrayList<>();
        }
        this.anchor.add(anchor);
    }

}