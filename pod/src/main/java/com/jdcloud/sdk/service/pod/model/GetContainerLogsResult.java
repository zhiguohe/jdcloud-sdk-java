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
 * Pod
 * Pod 相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.service.pod.model.Logs;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询单个容器日志

 */
public class GetContainerLogsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * logs
     */
    private Logs logs;


    /**
     * get logs
     *
     * @return
     */
    public Logs getLogs() {
        return logs;
    }

    /**
     * set logs
     *
     * @param logs
     */
    public void setLogs(Logs logs) {
        this.logs = logs;
    }


    /**
     * set logs
     *
     * @param logs
     */
    public GetContainerLogsResult logs(Logs logs) {
        this.logs = logs;
        return this;
    }


}