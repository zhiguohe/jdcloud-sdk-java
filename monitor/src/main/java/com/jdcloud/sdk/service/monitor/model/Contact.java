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

import com.jdcloud.sdk.annotation.Required;

/**
 * contact
 */
public class Contact  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 联系人类型。&quot;group&quot;表示群组，&quot;user&quot;表示用户， &quot;self&quot;表示发给pin自己
     * Required:true
     */
    @Required
    private String category;

    /**
     * 联系人ID
     * Required:true
     */
    @Required
    private Long id;


    /**
     * get 联系人类型。&quot;group&quot;表示群组，&quot;user&quot;表示用户， &quot;self&quot;表示发给pin自己
     *
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     * set 联系人类型。&quot;group&quot;表示群组，&quot;user&quot;表示用户， &quot;self&quot;表示发给pin自己
     *
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * get 联系人ID
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 联系人ID
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * set 联系人类型。&quot;group&quot;表示群组，&quot;user&quot;表示用户， &quot;self&quot;表示发给pin自己
     *
     * @param category
     */
    public Contact category(String category) {
        this.category = category;
        return this;
    }

    /**
     * set 联系人ID
     *
     * @param id
     */
    public Contact id(Long id) {
        this.id = id;
        return this;
    }


}