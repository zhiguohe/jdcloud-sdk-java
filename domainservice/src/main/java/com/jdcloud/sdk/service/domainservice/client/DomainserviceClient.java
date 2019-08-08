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
 * 京东云解析OpenAPI接口
 * 京东云解析OpenAPI接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.domainservice.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.domainservice.model.DeleteUserViewIPRequest;
import com.jdcloud.sdk.service.domainservice.model.DeleteUserViewIPResponse;
import com.jdcloud.sdk.service.domainservice.client.DeleteUserViewIPExecutor;
import com.jdcloud.sdk.service.domainservice.model.DescribeActionLogRequest;
import com.jdcloud.sdk.service.domainservice.model.DescribeActionLogResponse;
import com.jdcloud.sdk.service.domainservice.client.DescribeActionLogExecutor;
import com.jdcloud.sdk.service.domainservice.model.DescribeDomainQueryCountRequest;
import com.jdcloud.sdk.service.domainservice.model.DescribeDomainQueryCountResponse;
import com.jdcloud.sdk.service.domainservice.client.DescribeDomainQueryCountExecutor;
import com.jdcloud.sdk.service.domainservice.model.DescribeDomainQueryTrafficRequest;
import com.jdcloud.sdk.service.domainservice.model.DescribeDomainQueryTrafficResponse;
import com.jdcloud.sdk.service.domainservice.client.DescribeDomainQueryTrafficExecutor;
import com.jdcloud.sdk.service.domainservice.model.ModifyMonitorStatusRequest;
import com.jdcloud.sdk.service.domainservice.model.ModifyMonitorStatusResponse;
import com.jdcloud.sdk.service.domainservice.client.ModifyMonitorStatusExecutor;
import com.jdcloud.sdk.service.domainservice.model.CreateResourceRecordRequest;
import com.jdcloud.sdk.service.domainservice.model.CreateResourceRecordResponse;
import com.jdcloud.sdk.service.domainservice.client.CreateResourceRecordExecutor;
import com.jdcloud.sdk.service.domainservice.model.ModifyDomainRequest;
import com.jdcloud.sdk.service.domainservice.model.ModifyDomainResponse;
import com.jdcloud.sdk.service.domainservice.client.ModifyDomainExecutor;
import com.jdcloud.sdk.service.domainservice.model.BatchSetResourceRecordsRequest;
import com.jdcloud.sdk.service.domainservice.model.BatchSetResourceRecordsResponse;
import com.jdcloud.sdk.service.domainservice.client.BatchSetResourceRecordsExecutor;
import com.jdcloud.sdk.service.domainservice.model.DescribeMonitorTargetRequest;
import com.jdcloud.sdk.service.domainservice.model.DescribeMonitorTargetResponse;
import com.jdcloud.sdk.service.domainservice.client.DescribeMonitorTargetExecutor;
import com.jdcloud.sdk.service.domainservice.model.CreateMonitorTargetRequest;
import com.jdcloud.sdk.service.domainservice.model.CreateMonitorTargetResponse;
import com.jdcloud.sdk.service.domainservice.client.CreateMonitorTargetExecutor;
import com.jdcloud.sdk.service.domainservice.model.CreateDomainRequest;
import com.jdcloud.sdk.service.domainservice.model.CreateDomainResponse;
import com.jdcloud.sdk.service.domainservice.client.CreateDomainExecutor;
import com.jdcloud.sdk.service.domainservice.model.DescribeUserViewIPRequest;
import com.jdcloud.sdk.service.domainservice.model.DescribeUserViewIPResponse;
import com.jdcloud.sdk.service.domainservice.client.DescribeUserViewIPExecutor;
import com.jdcloud.sdk.service.domainservice.model.ModifyResourceRecordStatusRequest;
import com.jdcloud.sdk.service.domainservice.model.ModifyResourceRecordStatusResponse;
import com.jdcloud.sdk.service.domainservice.client.ModifyResourceRecordStatusExecutor;
import com.jdcloud.sdk.service.domainservice.model.ModifyResourceRecordRequest;
import com.jdcloud.sdk.service.domainservice.model.ModifyResourceRecordResponse;
import com.jdcloud.sdk.service.domainservice.client.ModifyResourceRecordExecutor;
import com.jdcloud.sdk.service.domainservice.model.DescribeDomainsRequest;
import com.jdcloud.sdk.service.domainservice.model.DescribeDomainsResponse;
import com.jdcloud.sdk.service.domainservice.client.DescribeDomainsExecutor;
import com.jdcloud.sdk.service.domainservice.model.CreateMonitorRequest;
import com.jdcloud.sdk.service.domainservice.model.CreateMonitorResponse;
import com.jdcloud.sdk.service.domainservice.client.CreateMonitorExecutor;
import com.jdcloud.sdk.service.domainservice.model.CreateUserViewIPRequest;
import com.jdcloud.sdk.service.domainservice.model.CreateUserViewIPResponse;
import com.jdcloud.sdk.service.domainservice.client.CreateUserViewIPExecutor;
import com.jdcloud.sdk.service.domainservice.model.DeleteUserViewRequest;
import com.jdcloud.sdk.service.domainservice.model.DeleteUserViewResponse;
import com.jdcloud.sdk.service.domainservice.client.DeleteUserViewExecutor;
import com.jdcloud.sdk.service.domainservice.model.ModifyMonitorRequest;
import com.jdcloud.sdk.service.domainservice.model.ModifyMonitorResponse;
import com.jdcloud.sdk.service.domainservice.client.ModifyMonitorExecutor;
import com.jdcloud.sdk.service.domainservice.model.DescribeResourceRecordRequest;
import com.jdcloud.sdk.service.domainservice.model.DescribeResourceRecordResponse;
import com.jdcloud.sdk.service.domainservice.client.DescribeResourceRecordExecutor;
import com.jdcloud.sdk.service.domainservice.model.DescribeUserViewRequest;
import com.jdcloud.sdk.service.domainservice.model.DescribeUserViewResponse;
import com.jdcloud.sdk.service.domainservice.client.DescribeUserViewExecutor;
import com.jdcloud.sdk.service.domainservice.model.DescribeMonitorAlarmRequest;
import com.jdcloud.sdk.service.domainservice.model.DescribeMonitorAlarmResponse;
import com.jdcloud.sdk.service.domainservice.client.DescribeMonitorAlarmExecutor;
import com.jdcloud.sdk.service.domainservice.model.CreateUserViewRequest;
import com.jdcloud.sdk.service.domainservice.model.CreateUserViewResponse;
import com.jdcloud.sdk.service.domainservice.client.CreateUserViewExecutor;
import com.jdcloud.sdk.service.domainservice.model.DescribeViewTreeRequest;
import com.jdcloud.sdk.service.domainservice.model.DescribeViewTreeResponse;
import com.jdcloud.sdk.service.domainservice.client.DescribeViewTreeExecutor;
import com.jdcloud.sdk.service.domainservice.model.DeleteResourceRecordRequest;
import com.jdcloud.sdk.service.domainservice.model.DeleteResourceRecordResponse;
import com.jdcloud.sdk.service.domainservice.client.DeleteResourceRecordExecutor;
import com.jdcloud.sdk.service.domainservice.model.DescribeMonitorRequest;
import com.jdcloud.sdk.service.domainservice.model.DescribeMonitorResponse;
import com.jdcloud.sdk.service.domainservice.client.DescribeMonitorExecutor;
import com.jdcloud.sdk.service.domainservice.model.DeleteMonitorRequest;
import com.jdcloud.sdk.service.domainservice.model.DeleteMonitorResponse;
import com.jdcloud.sdk.service.domainservice.client.DeleteMonitorExecutor;
import com.jdcloud.sdk.service.domainservice.model.DeleteDomainRequest;
import com.jdcloud.sdk.service.domainservice.model.DeleteDomainResponse;
import com.jdcloud.sdk.service.domainservice.client.DeleteDomainExecutor;

/**
 * domainserviceClient
 */
public class DomainserviceClient extends JdcloudClient {

    public final static String ApiVersion = "v2";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.0";
    public final static String DefaultEndpoint = "domainservice.jdcloud-api.com";
    public final static String ServiceName = "domainservice";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private DomainserviceClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 删除主域名的自定义解析线路的IP段
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteUserViewIPResponse deleteUserViewIP(DeleteUserViewIPRequest request) throws JdcloudSdkException {
        return new DeleteUserViewIPExecutor().client(this).execute(request);
    }

    /**
     * 查看用户在云解析服务下的操作记录
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeActionLogResponse describeActionLog(DescribeActionLogRequest request) throws JdcloudSdkException {
        return new DescribeActionLogExecutor().client(this).execute(request);
    }

    /**
     * 查看主域名的解析次数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDomainQueryCountResponse describeDomainQueryCount(DescribeDomainQueryCountRequest request) throws JdcloudSdkException {
        return new DescribeDomainQueryCountExecutor().client(this).execute(request);
    }

    /**
     * 查看域名的查询流量
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDomainQueryTrafficResponse describeDomainQueryTraffic(DescribeDomainQueryTrafficRequest request) throws JdcloudSdkException {
        return new DescribeDomainQueryTrafficExecutor().client(this).execute(request);
    }

    /**
     * 监控项的操作集合，包括：暂停，启动, 手动恢复, 手动切换
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyMonitorStatusResponse modifyMonitorStatus(ModifyMonitorStatusRequest request) throws JdcloudSdkException {
        return new ModifyMonitorStatusExecutor().client(this).execute(request);
    }

    /**
     * 添加主域名的解析记录
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateResourceRecordResponse createResourceRecord(CreateResourceRecordRequest request) throws JdcloudSdkException {
        return new CreateResourceRecordExecutor().client(this).execute(request);
    }

    /**
     * 修改主域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyDomainResponse modifyDomain(ModifyDomainRequest request) throws JdcloudSdkException {
        return new ModifyDomainExecutor().client(this).execute(request);
    }

    /**
     * 同一个主域名下，批量新增或者批量更新导入解析记录。
如果解析记录的ID为0，是新增解析记录，如果不为0，则是更新解析记录。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public BatchSetResourceRecordsResponse batchSetResourceRecords(BatchSetResourceRecordsRequest request) throws JdcloudSdkException {
        return new BatchSetResourceRecordsExecutor().client(this).execute(request);
    }

    /**
     * 查询子域名的可用监控对象
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeMonitorTargetResponse describeMonitorTarget(DescribeMonitorTargetRequest request) throws JdcloudSdkException {
        return new DescribeMonitorTargetExecutor().client(this).execute(request);
    }

    /**
     * 添加子域名的某些特定监控对象为监控项
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateMonitorTargetResponse createMonitorTarget(CreateMonitorTargetRequest request) throws JdcloudSdkException {
        return new CreateMonitorTargetExecutor().client(this).execute(request);
    }

    /**
     * 添加主域名  
如何添加免费域名，详细情况请查阅&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/jd-cloud-dns/domainadd&quot;&gt;文档&lt;/a&gt;
添加收费域名，请查阅&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/jd-cloud-dns/purchase-process&quot;&gt;文档&lt;/a&gt;，
添加收费域名前，请确保用户的京东云账户有足够的资金支付，Openapi接口回返回订单号，可以用此订单号向计费系统查阅详情。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) throws JdcloudSdkException {
        return new CreateDomainExecutor().client(this).execute(request);
    }

    /**
     * 查询主域名的自定义解析线路的IP段
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeUserViewIPResponse describeUserViewIP(DescribeUserViewIPRequest request) throws JdcloudSdkException {
        return new DescribeUserViewIPExecutor().client(this).execute(request);
    }

    /**
     * 启用、停用主域名下的解析记录
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyResourceRecordStatusResponse modifyResourceRecordStatus(ModifyResourceRecordStatusRequest request) throws JdcloudSdkException {
        return new ModifyResourceRecordStatusExecutor().client(this).execute(request);
    }

    /**
     * 修改主域名的某个解析记录
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyResourceRecordResponse modifyResourceRecord(ModifyResourceRecordRequest request) throws JdcloudSdkException {
        return new ModifyResourceRecordExecutor().client(this).execute(request);
    }

    /**
     * 获取用户所属的主域名列表。   
请在调用域名相关的接口之前，调用此接口获取相关的domainId和domainName。  
主域名的相关概念，请查阅&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/jd-cloud-dns/product-overview&quot;&gt;云解析文档&lt;/a&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDomainsResponse describeDomains(DescribeDomainsRequest request) throws JdcloudSdkException {
        return new DescribeDomainsExecutor().client(this).execute(request);
    }

    /**
     * 添加子域名的监控项，默认把子域名的所有监控项都添加上监控
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateMonitorResponse createMonitor(CreateMonitorRequest request) throws JdcloudSdkException {
        return new CreateMonitorExecutor().client(this).execute(request);
    }

    /**
     * 添加主域名的自定义解析线路的IP段
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateUserViewIPResponse createUserViewIP(CreateUserViewIPRequest request) throws JdcloudSdkException {
        return new CreateUserViewIPExecutor().client(this).execute(request);
    }

    /**
     * 删除主域名的自定义解析线路
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteUserViewResponse deleteUserView(DeleteUserViewRequest request) throws JdcloudSdkException {
        return new DeleteUserViewExecutor().client(this).execute(request);
    }

    /**
     * 域名的监控项修改
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyMonitorResponse modifyMonitor(ModifyMonitorRequest request) throws JdcloudSdkException {
        return new ModifyMonitorExecutor().client(this).execute(request);
    }

    /**
     * 查询主域名的解析记录。  
在使用解析记录相关的接口之前，请调用此接口获取解析记录的列表。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeResourceRecordResponse describeResourceRecord(DescribeResourceRecordRequest request) throws JdcloudSdkException {
        return new DescribeResourceRecordExecutor().client(this).execute(request);
    }

    /**
     * 查询主域名的自定义解析线路
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeUserViewResponse describeUserView(DescribeUserViewRequest request) throws JdcloudSdkException {
        return new DescribeUserViewExecutor().client(this).execute(request);
    }

    /**
     * 主域名的监控项的报警信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeMonitorAlarmResponse describeMonitorAlarm(DescribeMonitorAlarmRequest request) throws JdcloudSdkException {
        return new DescribeMonitorAlarmExecutor().client(this).execute(request);
    }

    /**
     * 添加主域名的自定义解析线路
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateUserViewResponse createUserView(CreateUserViewRequest request) throws JdcloudSdkException {
        return new CreateUserViewExecutor().client(this).execute(request);
    }

    /**
     * 查询云解析所有的基础解析线路。  
在使用解析线路的参数之前，请调用此接口获取解析线路的ID。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeViewTreeResponse describeViewTree(DescribeViewTreeRequest request) throws JdcloudSdkException {
        return new DescribeViewTreeExecutor().client(this).execute(request);
    }

    /**
     * 删除主域名下的解析记录
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteResourceRecordResponse deleteResourceRecord(DeleteResourceRecordRequest request) throws JdcloudSdkException {
        return new DeleteResourceRecordExecutor().client(this).execute(request);
    }

    /**
     * 查看主域名的监控项的配置以及状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeMonitorResponse describeMonitor(DescribeMonitorRequest request) throws JdcloudSdkException {
        return new DescribeMonitorExecutor().client(this).execute(request);
    }

    /**
     * 监控项的删除
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteMonitorResponse deleteMonitor(DeleteMonitorRequest request) throws JdcloudSdkException {
        return new DeleteMonitorExecutor().client(this).execute(request);
    }

    /**
     * 删除主域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws JdcloudSdkException {
        return new DeleteDomainExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public DomainserviceClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private DomainserviceClient domainserviceClient;

        public DefaultBuilder() {
            domainserviceClient = new DomainserviceClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            domainserviceClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            domainserviceClient.httpRequestConfig = config;
            return this;
        }

        public DomainserviceClient build() throws JdcloudSdkException {

            if (domainserviceClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                domainserviceClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (domainserviceClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("DomainserviceClient build error: jdcloud credentials provider not set");
                }
            }
            if (domainserviceClient.httpRequestConfig == null) {
                domainserviceClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (domainserviceClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("DomainserviceClient build error: http request config not set");
                }
            }
            return domainserviceClient;
        }

        public Builder environment(Environment environment) {
            domainserviceClient.environment = environment;
            return this;
        }
    }
}
