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
 * sendEmailSpec
 */
public class SendEmailSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * contacts
     * Required:true
     */
    @Required
    private Contacts contacts;

    /**
     * 邮件内容
     * Required:true
     */
    @Required
    private String content;

    /**
     * 邮件标题
     * Required:true
     */
    @Required
    private String title;


    /**
     * get contacts
     *
     * @return
     */
    public Contacts getContacts() {
        return contacts;
    }

    /**
     * set contacts
     *
     * @param contacts
     */
    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    /**
     * get 邮件内容
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 邮件内容
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * get 邮件标题
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set 邮件标题
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * set contacts
     *
     * @param contacts
     */
    public SendEmailSpec contacts(Contacts contacts) {
        this.contacts = contacts;
        return this;
    }

    /**
     * set 邮件内容
     *
     * @param content
     */
    public SendEmailSpec content(String content) {
        this.content = content;
        return this;
    }

    /**
     * set 邮件标题
     *
     * @param title
     */
    public SendEmailSpec title(String title) {
        this.title = title;
        return this;
    }


}