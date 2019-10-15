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

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * jDCloudVolumeSourceSpec
 */
public class JDCloudVolumeSourceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云盘id，使用已有云盘
     */
    private String volumeId;

    /**
     * 云盘名称
     */
    private String name;

    /**
     * 云盘快照id，根据云盘快照创建云盘。
     */
    private String snapshotId;

    /**
     * 云盘类型：hdd.std1,ssd.gp1,ssd.io1
     */
    private String diskType;

    /**
     * 云盘size,单位 GB
     */
    private Integer sizeGB;

    /**
     * 指定volume文件系统类型，目前支持[xfs, ext4]；如果新创建的盘，不指定文件系统类型默认格式化成xfs。
     * Required:true
     */
    @Required
    private String fsType;

    /**
     * 随容器自动创建的新盘，会自动格式化成指定的文件系统类型；挂载已有的盘，默认不会格式化，只会按照指定的fsType去挂载；如果希望格式化，必须设置此字段为true。
     */
    private Boolean formatVolume;

    /**
     * 云盘的 iops 值，目前只有 ssd.io1 类型有效。
     */
    private Integer iops;

    /**
     * 是否随pod删除。默认：true
     */
    private Boolean autoDelete;


    /**
     * get 云盘id，使用已有云盘
     *
     * @return
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * set 云盘id，使用已有云盘
     *
     * @param volumeId
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * get 云盘名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 云盘名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 云盘快照id，根据云盘快照创建云盘。
     *
     * @return
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * set 云盘快照id，根据云盘快照创建云盘。
     *
     * @param snapshotId
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * get 云盘类型：hdd.std1,ssd.gp1,ssd.io1
     *
     * @return
     */
    public String getDiskType() {
        return diskType;
    }

    /**
     * set 云盘类型：hdd.std1,ssd.gp1,ssd.io1
     *
     * @param diskType
     */
    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    /**
     * get 云盘size,单位 GB
     *
     * @return
     */
    public Integer getSizeGB() {
        return sizeGB;
    }

    /**
     * set 云盘size,单位 GB
     *
     * @param sizeGB
     */
    public void setSizeGB(Integer sizeGB) {
        this.sizeGB = sizeGB;
    }

    /**
     * get 指定volume文件系统类型，目前支持[xfs, ext4]；如果新创建的盘，不指定文件系统类型默认格式化成xfs。
     *
     * @return
     */
    public String getFsType() {
        return fsType;
    }

    /**
     * set 指定volume文件系统类型，目前支持[xfs, ext4]；如果新创建的盘，不指定文件系统类型默认格式化成xfs。
     *
     * @param fsType
     */
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * get 随容器自动创建的新盘，会自动格式化成指定的文件系统类型；挂载已有的盘，默认不会格式化，只会按照指定的fsType去挂载；如果希望格式化，必须设置此字段为true。
     *
     * @return
     */
    public Boolean getFormatVolume() {
        return formatVolume;
    }

    /**
     * set 随容器自动创建的新盘，会自动格式化成指定的文件系统类型；挂载已有的盘，默认不会格式化，只会按照指定的fsType去挂载；如果希望格式化，必须设置此字段为true。
     *
     * @param formatVolume
     */
    public void setFormatVolume(Boolean formatVolume) {
        this.formatVolume = formatVolume;
    }

    /**
     * get 云盘的 iops 值，目前只有 ssd.io1 类型有效。
     *
     * @return
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * set 云盘的 iops 值，目前只有 ssd.io1 类型有效。
     *
     * @param iops
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * get 是否随pod删除。默认：true
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 是否随pod删除。默认：true
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }


    /**
     * set 云盘id，使用已有云盘
     *
     * @param volumeId
     */
    public JDCloudVolumeSourceSpec volumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * set 云盘名称
     *
     * @param name
     */
    public JDCloudVolumeSourceSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 云盘快照id，根据云盘快照创建云盘。
     *
     * @param snapshotId
     */
    public JDCloudVolumeSourceSpec snapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * set 云盘类型：hdd.std1,ssd.gp1,ssd.io1
     *
     * @param diskType
     */
    public JDCloudVolumeSourceSpec diskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set 云盘size,单位 GB
     *
     * @param sizeGB
     */
    public JDCloudVolumeSourceSpec sizeGB(Integer sizeGB) {
        this.sizeGB = sizeGB;
        return this;
    }

    /**
     * set 指定volume文件系统类型，目前支持[xfs, ext4]；如果新创建的盘，不指定文件系统类型默认格式化成xfs。
     *
     * @param fsType
     */
    public JDCloudVolumeSourceSpec fsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    /**
     * set 随容器自动创建的新盘，会自动格式化成指定的文件系统类型；挂载已有的盘，默认不会格式化，只会按照指定的fsType去挂载；如果希望格式化，必须设置此字段为true。
     *
     * @param formatVolume
     */
    public JDCloudVolumeSourceSpec formatVolume(Boolean formatVolume) {
        this.formatVolume = formatVolume;
        return this;
    }

    /**
     * set 云盘的 iops 值，目前只有 ssd.io1 类型有效。
     *
     * @param iops
     */
    public JDCloudVolumeSourceSpec iops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * set 是否随pod删除。默认：true
     *
     * @param autoDelete
     */
    public JDCloudVolumeSourceSpec autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }


}