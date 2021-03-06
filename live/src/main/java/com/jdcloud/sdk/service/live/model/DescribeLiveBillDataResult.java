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
 * Live-Video
 * 运营控制台计费账单数据
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.live.model.BillDataObject;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询直播计费账单用量数据
允许通过条件过滤查询，支持的过滤字段如下：
  - startTime[eq]  账单开始时间
  - endTime[eq]    账单结束时间
  - billType[eq]   账单计费类型
  - userPin[like]  用户PIN

 */
public class DescribeLiveBillDataResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询内容
     */
    private List<BillDataObject> content;


    /**
     * get 查询内容
     *
     * @return
     */
    public List<BillDataObject> getContent() {
        return content;
    }

    /**
     * set 查询内容
     *
     * @param content
     */
    public void setContent(List<BillDataObject> content) {
        this.content = content;
    }


    /**
     * set 查询内容
     *
     * @param content
     */
    public DescribeLiveBillDataResult content(List<BillDataObject> content) {
        this.content = content;
        return this;
    }


    /**
     * add item to 查询内容
     *
     * @param content
     */
    public void addContent(BillDataObject content) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(content);
    }

}