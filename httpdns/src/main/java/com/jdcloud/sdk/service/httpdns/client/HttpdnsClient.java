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
 * 京东云httpdns OpenAPI接口
 * 京东云httpdns OpenAPI接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.httpdns.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.httpdns.model.GetAccountInfoRequest;
import com.jdcloud.sdk.service.httpdns.model.GetAccountInfoResponse;
import com.jdcloud.sdk.service.httpdns.client.GetAccountInfoExecutor;
import com.jdcloud.sdk.service.httpdns.model.AddDomainsRequest;
import com.jdcloud.sdk.service.httpdns.model.AddDomainsResponse;
import com.jdcloud.sdk.service.httpdns.client.AddDomainsExecutor;
import com.jdcloud.sdk.service.httpdns.model.DelDomainsRequest;
import com.jdcloud.sdk.service.httpdns.model.DelDomainsResponse;
import com.jdcloud.sdk.service.httpdns.client.DelDomainsExecutor;
import com.jdcloud.sdk.service.httpdns.model.CreateAccountRequest;
import com.jdcloud.sdk.service.httpdns.model.CreateAccountResponse;
import com.jdcloud.sdk.service.httpdns.client.CreateAccountExecutor;
import com.jdcloud.sdk.service.httpdns.model.GetAccountIdRequest;
import com.jdcloud.sdk.service.httpdns.model.GetAccountIdResponse;
import com.jdcloud.sdk.service.httpdns.client.GetAccountIdExecutor;
import com.jdcloud.sdk.service.httpdns.model.GetDomainsRequest;
import com.jdcloud.sdk.service.httpdns.model.GetDomainsResponse;
import com.jdcloud.sdk.service.httpdns.client.GetDomainsExecutor;
import com.jdcloud.sdk.service.httpdns.model.OperateKeyRequest;
import com.jdcloud.sdk.service.httpdns.model.OperateKeyResponse;
import com.jdcloud.sdk.service.httpdns.client.OperateKeyExecutor;

/**
 * httpdnsClient
 */
public class HttpdnsClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.10";
    public final static String DefaultEndpoint = "httpdns.jdcloud-api.com";
    public final static String ServiceName = "httpdns";
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

    private HttpdnsClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询httpdns账户的基本信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetAccountInfoResponse getAccountInfo(GetAccountInfoRequest request) throws JdcloudSdkException {
        return new GetAccountInfoExecutor().client(this).execute(request);
    }

    /**
     * 添加域名。&lt;br&gt;
可以添加顶级域名除外的多级域名。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddDomainsResponse addDomains(AddDomainsRequest request) throws JdcloudSdkException {
        return new AddDomainsExecutor().client(this).execute(request);
    }

    /**
     * 删除域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DelDomainsResponse delDomains(DelDomainsRequest request) throws JdcloudSdkException {
        return new DelDomainsExecutor().client(this).execute(request);
    }

    /**
     * 创建httpdns账户
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) throws JdcloudSdkException {
        return new CreateAccountExecutor().client(this).execute(request);
    }

    /**
     * 查询用户名下httpdns的账户ID
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetAccountIdResponse getAccountId(GetAccountIdRequest request) throws JdcloudSdkException {
        return new GetAccountIdExecutor().client(this).execute(request);
    }

    /**
     * 查询使用httpdns服务的域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetDomainsResponse getDomains(GetDomainsRequest request) throws JdcloudSdkException {
        return new GetDomainsExecutor().client(this).execute(request);
    }

    /**
     * 创建，启用，禁用httpdns服务密钥
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public OperateKeyResponse operateKey(OperateKeyRequest request) throws JdcloudSdkException {
        return new OperateKeyExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public HttpdnsClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private HttpdnsClient httpdnsClient;

        public DefaultBuilder() {
            httpdnsClient = new HttpdnsClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            httpdnsClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            httpdnsClient.httpRequestConfig = config;
            return this;
        }

        public HttpdnsClient build() throws JdcloudSdkException {

            if (httpdnsClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                httpdnsClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (httpdnsClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("HttpdnsClient build error: jdcloud credentials provider not set");
                }
            }
            if (httpdnsClient.httpRequestConfig == null) {
                httpdnsClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (httpdnsClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("HttpdnsClient build error: http request config not set");
                }
            }
            return httpdnsClient;
        }

        public Builder environment(Environment environment) {
            httpdnsClient.environment = environment;
            return this;
        }
    }
}
