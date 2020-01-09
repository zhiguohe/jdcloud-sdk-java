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
 * tableColumnB
 */
public class TableColumnB  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * label
     */
    private String label;

    /**
     * link
     */
    private Boolean link;

    /**
     * options
     */
    private List<OptionsB> options;

    /**
     * prop
     */
    private String prop;


    /**
     * get label
     *
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * set label
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * get link
     *
     * @return
     */
    public Boolean getLink() {
        return link;
    }

    /**
     * set link
     *
     * @param link
     */
    public void setLink(Boolean link) {
        this.link = link;
    }

    /**
     * get options
     *
     * @return
     */
    public List<OptionsB> getOptions() {
        return options;
    }

    /**
     * set options
     *
     * @param options
     */
    public void setOptions(List<OptionsB> options) {
        this.options = options;
    }

    /**
     * get prop
     *
     * @return
     */
    public String getProp() {
        return prop;
    }

    /**
     * set prop
     *
     * @param prop
     */
    public void setProp(String prop) {
        this.prop = prop;
    }


    /**
     * set label
     *
     * @param label
     */
    public TableColumnB label(String label) {
        this.label = label;
        return this;
    }

    /**
     * set link
     *
     * @param link
     */
    public TableColumnB link(Boolean link) {
        this.link = link;
        return this;
    }

    /**
     * set options
     *
     * @param options
     */
    public TableColumnB options(List<OptionsB> options) {
        this.options = options;
        return this;
    }

    /**
     * set prop
     *
     * @param prop
     */
    public TableColumnB prop(String prop) {
        this.prop = prop;
        return this;
    }


    /**
     * add item to options
     *
     * @param option
     */
    public void addOption(OptionsB option) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        this.options.add(option);
    }

}