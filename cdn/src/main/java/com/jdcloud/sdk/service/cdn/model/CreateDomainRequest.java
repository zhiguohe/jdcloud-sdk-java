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
 * JCloud Openapi For CDN
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建点播加速域名
 */
public class CreateDomainRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 回源类型只能是[ips,domain,oss]中的一种
     */
    private String sourceType;

    /**
     * 点播域名的类型只能是[vod,download,web]中的一种
     */
    private String cdnType;

    /**
     * 回源方式,只能是[https,http]中的一种,默认http
     */
    private String backSourceType;

    /**
     * 日带宽(Mbps)
     */
    private Long dailyBandWidth;

    /**
     * 服务质量,只能是[good,general]中的一种,默认为good
     */
    private String quaility;

    /**
     * maxFileSize
     */
    private Long maxFileSize;

    /**
     * minFileSize
     */
    private Long minFileSize;

    /**
     * sumFileSize
     */
    private Long sumFileSize;

    /**
     * avgFileSize
     */
    private Long avgFileSize;

    /**
     * defaultSourceHost
     */
    private String defaultSourceHost;

    /**
     * httpType
     */
    private String httpType;

    /**
     * ipSource
     */
    private List<IpSourceInfo> ipSource;

    /**
     * domainSource
     */
    private List<DomainSourceInfo> domainSource;

    /**
     * ossSource
     */
    private String ossSource;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;


    /**
     * get 回源类型只能是[ips,domain,oss]中的一种
     *
     * @return
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * set 回源类型只能是[ips,domain,oss]中的一种
     *
     * @param sourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * get 点播域名的类型只能是[vod,download,web]中的一种
     *
     * @return
     */
    public String getCdnType() {
        return cdnType;
    }

    /**
     * set 点播域名的类型只能是[vod,download,web]中的一种
     *
     * @param cdnType
     */
    public void setCdnType(String cdnType) {
        this.cdnType = cdnType;
    }

    /**
     * get 回源方式,只能是[https,http]中的一种,默认http
     *
     * @return
     */
    public String getBackSourceType() {
        return backSourceType;
    }

    /**
     * set 回源方式,只能是[https,http]中的一种,默认http
     *
     * @param backSourceType
     */
    public void setBackSourceType(String backSourceType) {
        this.backSourceType = backSourceType;
    }

    /**
     * get 日带宽(Mbps)
     *
     * @return
     */
    public Long getDailyBandWidth() {
        return dailyBandWidth;
    }

    /**
     * set 日带宽(Mbps)
     *
     * @param dailyBandWidth
     */
    public void setDailyBandWidth(Long dailyBandWidth) {
        this.dailyBandWidth = dailyBandWidth;
    }

    /**
     * get 服务质量,只能是[good,general]中的一种,默认为good
     *
     * @return
     */
    public String getQuaility() {
        return quaility;
    }

    /**
     * set 服务质量,只能是[good,general]中的一种,默认为good
     *
     * @param quaility
     */
    public void setQuaility(String quaility) {
        this.quaility = quaility;
    }

    /**
     * get maxFileSize
     *
     * @return
     */
    public Long getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * set maxFileSize
     *
     * @param maxFileSize
     */
    public void setMaxFileSize(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    /**
     * get minFileSize
     *
     * @return
     */
    public Long getMinFileSize() {
        return minFileSize;
    }

    /**
     * set minFileSize
     *
     * @param minFileSize
     */
    public void setMinFileSize(Long minFileSize) {
        this.minFileSize = minFileSize;
    }

    /**
     * get sumFileSize
     *
     * @return
     */
    public Long getSumFileSize() {
        return sumFileSize;
    }

    /**
     * set sumFileSize
     *
     * @param sumFileSize
     */
    public void setSumFileSize(Long sumFileSize) {
        this.sumFileSize = sumFileSize;
    }

    /**
     * get avgFileSize
     *
     * @return
     */
    public Long getAvgFileSize() {
        return avgFileSize;
    }

    /**
     * set avgFileSize
     *
     * @param avgFileSize
     */
    public void setAvgFileSize(Long avgFileSize) {
        this.avgFileSize = avgFileSize;
    }

    /**
     * get defaultSourceHost
     *
     * @return
     */
    public String getDefaultSourceHost() {
        return defaultSourceHost;
    }

    /**
     * set defaultSourceHost
     *
     * @param defaultSourceHost
     */
    public void setDefaultSourceHost(String defaultSourceHost) {
        this.defaultSourceHost = defaultSourceHost;
    }

    /**
     * get httpType
     *
     * @return
     */
    public String getHttpType() {
        return httpType;
    }

    /**
     * set httpType
     *
     * @param httpType
     */
    public void setHttpType(String httpType) {
        this.httpType = httpType;
    }

    /**
     * get ipSource
     *
     * @return
     */
    public List<IpSourceInfo> getIpSource() {
        return ipSource;
    }

    /**
     * set ipSource
     *
     * @param ipSource
     */
    public void setIpSource(List<IpSourceInfo> ipSource) {
        this.ipSource = ipSource;
    }

    /**
     * get domainSource
     *
     * @return
     */
    public List<DomainSourceInfo> getDomainSource() {
        return domainSource;
    }

    /**
     * set domainSource
     *
     * @param domainSource
     */
    public void setDomainSource(List<DomainSourceInfo> domainSource) {
        this.domainSource = domainSource;
    }

    /**
     * get ossSource
     *
     * @return
     */
    public String getOssSource() {
        return ossSource;
    }

    /**
     * set ossSource
     *
     * @param ossSource
     */
    public void setOssSource(String ossSource) {
        this.ossSource = ossSource;
    }

    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * set 回源类型只能是[ips,domain,oss]中的一种
     *
     * @param sourceType
     */
    public CreateDomainRequest sourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * set 点播域名的类型只能是[vod,download,web]中的一种
     *
     * @param cdnType
     */
    public CreateDomainRequest cdnType(String cdnType) {
        this.cdnType = cdnType;
        return this;
    }

    /**
     * set 回源方式,只能是[https,http]中的一种,默认http
     *
     * @param backSourceType
     */
    public CreateDomainRequest backSourceType(String backSourceType) {
        this.backSourceType = backSourceType;
        return this;
    }

    /**
     * set 日带宽(Mbps)
     *
     * @param dailyBandWidth
     */
    public CreateDomainRequest dailyBandWidth(Long dailyBandWidth) {
        this.dailyBandWidth = dailyBandWidth;
        return this;
    }

    /**
     * set 服务质量,只能是[good,general]中的一种,默认为good
     *
     * @param quaility
     */
    public CreateDomainRequest quaility(String quaility) {
        this.quaility = quaility;
        return this;
    }

    /**
     * set maxFileSize
     *
     * @param maxFileSize
     */
    public CreateDomainRequest maxFileSize(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
        return this;
    }

    /**
     * set minFileSize
     *
     * @param minFileSize
     */
    public CreateDomainRequest minFileSize(Long minFileSize) {
        this.minFileSize = minFileSize;
        return this;
    }

    /**
     * set sumFileSize
     *
     * @param sumFileSize
     */
    public CreateDomainRequest sumFileSize(Long sumFileSize) {
        this.sumFileSize = sumFileSize;
        return this;
    }

    /**
     * set avgFileSize
     *
     * @param avgFileSize
     */
    public CreateDomainRequest avgFileSize(Long avgFileSize) {
        this.avgFileSize = avgFileSize;
        return this;
    }

    /**
     * set defaultSourceHost
     *
     * @param defaultSourceHost
     */
    public CreateDomainRequest defaultSourceHost(String defaultSourceHost) {
        this.defaultSourceHost = defaultSourceHost;
        return this;
    }

    /**
     * set httpType
     *
     * @param httpType
     */
    public CreateDomainRequest httpType(String httpType) {
        this.httpType = httpType;
        return this;
    }

    /**
     * set ipSource
     *
     * @param ipSource
     */
    public CreateDomainRequest ipSource(List<IpSourceInfo> ipSource) {
        this.ipSource = ipSource;
        return this;
    }

    /**
     * set domainSource
     *
     * @param domainSource
     */
    public CreateDomainRequest domainSource(List<DomainSourceInfo> domainSource) {
        this.domainSource = domainSource;
        return this;
    }

    /**
     * set ossSource
     *
     * @param ossSource
     */
    public CreateDomainRequest ossSource(String ossSource) {
        this.ossSource = ossSource;
        return this;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public CreateDomainRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * add item to ipSource
     *
     * @param ipSource
     */
    public void addIpSource(IpSourceInfo ipSource) {
        if (this.ipSource == null) {
            this.ipSource = new ArrayList<>();
        }
        this.ipSource.add(ipSource);
    }

    /**
     * add item to domainSource
     *
     * @param domainSource
     */
    public void addDomainSource(DomainSourceInfo domainSource) {
        if (this.domainSource == null) {
            this.domainSource = new ArrayList<>();
        }
        this.domainSource.add(domainSource);
    }

}