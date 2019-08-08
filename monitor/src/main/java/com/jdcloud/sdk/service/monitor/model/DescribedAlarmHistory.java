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
 * describedAlarmHistory
 */
public class DescribedAlarmHistory  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * alarm
     */
    private DescribedAlarm alarm;

    /**
     * 告警联系人
     */
    private List<DescribedNoticeContacts> contacts;

    /**
     * 告警持续次数
     */
    private Long durationTimes;

    /**
     * 告警持续时间，单位分钟
     */
    private Long noticeDurationTime;

    /**
     * 触发的告警级别。从低到高分别为‘common’, ‘critical’, ‘fatal’
     */
    private String noticeLevelTriggered;

    /**
     * 告警时间
     */
    private String noticeTime;

    /**
     * 告警值
     */
    private Double value;


    /**
     * get alarm
     *
     * @return
     */
    public DescribedAlarm getAlarm() {
        return alarm;
    }

    /**
     * set alarm
     *
     * @param alarm
     */
    public void setAlarm(DescribedAlarm alarm) {
        this.alarm = alarm;
    }

    /**
     * get 告警联系人
     *
     * @return
     */
    public List<DescribedNoticeContacts> getContacts() {
        return contacts;
    }

    /**
     * set 告警联系人
     *
     * @param contacts
     */
    public void setContacts(List<DescribedNoticeContacts> contacts) {
        this.contacts = contacts;
    }

    /**
     * get 告警持续次数
     *
     * @return
     */
    public Long getDurationTimes() {
        return durationTimes;
    }

    /**
     * set 告警持续次数
     *
     * @param durationTimes
     */
    public void setDurationTimes(Long durationTimes) {
        this.durationTimes = durationTimes;
    }

    /**
     * get 告警持续时间，单位分钟
     *
     * @return
     */
    public Long getNoticeDurationTime() {
        return noticeDurationTime;
    }

    /**
     * set 告警持续时间，单位分钟
     *
     * @param noticeDurationTime
     */
    public void setNoticeDurationTime(Long noticeDurationTime) {
        this.noticeDurationTime = noticeDurationTime;
    }

    /**
     * get 触发的告警级别。从低到高分别为‘common’, ‘critical’, ‘fatal’
     *
     * @return
     */
    public String getNoticeLevelTriggered() {
        return noticeLevelTriggered;
    }

    /**
     * set 触发的告警级别。从低到高分别为‘common’, ‘critical’, ‘fatal’
     *
     * @param noticeLevelTriggered
     */
    public void setNoticeLevelTriggered(String noticeLevelTriggered) {
        this.noticeLevelTriggered = noticeLevelTriggered;
    }

    /**
     * get 告警时间
     *
     * @return
     */
    public String getNoticeTime() {
        return noticeTime;
    }

    /**
     * set 告警时间
     *
     * @param noticeTime
     */
    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    /**
     * get 告警值
     *
     * @return
     */
    public Double getValue() {
        return value;
    }

    /**
     * set 告警值
     *
     * @param value
     */
    public void setValue(Double value) {
        this.value = value;
    }


    /**
     * set alarm
     *
     * @param alarm
     */
    public DescribedAlarmHistory alarm(DescribedAlarm alarm) {
        this.alarm = alarm;
        return this;
    }

    /**
     * set 告警联系人
     *
     * @param contacts
     */
    public DescribedAlarmHistory contacts(List<DescribedNoticeContacts> contacts) {
        this.contacts = contacts;
        return this;
    }

    /**
     * set 告警持续次数
     *
     * @param durationTimes
     */
    public DescribedAlarmHistory durationTimes(Long durationTimes) {
        this.durationTimes = durationTimes;
        return this;
    }

    /**
     * set 告警持续时间，单位分钟
     *
     * @param noticeDurationTime
     */
    public DescribedAlarmHistory noticeDurationTime(Long noticeDurationTime) {
        this.noticeDurationTime = noticeDurationTime;
        return this;
    }

    /**
     * set 触发的告警级别。从低到高分别为‘common’, ‘critical’, ‘fatal’
     *
     * @param noticeLevelTriggered
     */
    public DescribedAlarmHistory noticeLevelTriggered(String noticeLevelTriggered) {
        this.noticeLevelTriggered = noticeLevelTriggered;
        return this;
    }

    /**
     * set 告警时间
     *
     * @param noticeTime
     */
    public DescribedAlarmHistory noticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
        return this;
    }

    /**
     * set 告警值
     *
     * @param value
     */
    public DescribedAlarmHistory value(Double value) {
        this.value = value;
        return this;
    }


    /**
     * add item to 告警联系人
     *
     * @param contact
     */
    public void addContact(DescribedNoticeContacts contact) {
        if (this.contacts == null) {
            this.contacts = new ArrayList<>();
        }
        this.contacts.add(contact);
    }

}