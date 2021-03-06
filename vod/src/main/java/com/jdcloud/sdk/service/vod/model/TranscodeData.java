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

package com.jdcloud.sdk.service.vod.model;


/**
 * transcodeData
 */
public class TranscodeData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日期
     */
    private String date;

    /**
     * 转码时长
     */
    private Double duration;


    /**
     * get 日期
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * set 日期
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * get 转码时长
     *
     * @return
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * set 转码时长
     *
     * @param duration
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }


    /**
     * set 日期
     *
     * @param date
     */
    public TranscodeData date(String date) {
        this.date = date;
        return this;
    }

    /**
     * set 转码时长
     *
     * @param duration
     */
    public TranscodeData duration(Double duration) {
        this.duration = duration;
        return this;
    }


}