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

package com.jdcloud.sdk.service.elite.model;

import java.util.List;
import java.util.ArrayList;

/**
 * jdxProductVo
 */
public class JdxProductVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品ID
     */
    private Integer productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商标图片地址
     */
    private String trademarkUrl;

    /**
     * 所属一级分类名称
     */
    private String categoryLevel1Name;

    /**
     * 所属二级分类名称
     */
    private String categoryLevel2Name;

    /**
     * 交付形态
     */
    private Integer deliveryForm;

    /**
     * 交付形态名称
     */
    private String deliveryFormName;

    /**
     * 商品简介
     */
    private String introduction;

    /**
     * 商品定价模式 1:按套次、2:按周期、3:按套餐包
     */
    private Integer sellType;

    /**
     * 商品定价模式名称
     */
    private String sellTypeName;

    /**
     * -1:不允许退款， 单位：天， 默认-1
     */
    private Integer refundDays;

    /**
     * pc端商品详情
     */
    private String pcProductDetail;

    /**
     * m端商品详情
     */
    private String mProductDetail;

    /**
     * sku详情信息
     */
    private List<JdxProductSkuVo> productSkuList;


    /**
     * get 产品ID
     *
     * @return
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * set 产品ID
     *
     * @param productId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * get 商品名称
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set 商品名称
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * get 商标图片地址
     *
     * @return
     */
    public String getTrademarkUrl() {
        return trademarkUrl;
    }

    /**
     * set 商标图片地址
     *
     * @param trademarkUrl
     */
    public void setTrademarkUrl(String trademarkUrl) {
        this.trademarkUrl = trademarkUrl;
    }

    /**
     * get 所属一级分类名称
     *
     * @return
     */
    public String getCategoryLevel1Name() {
        return categoryLevel1Name;
    }

    /**
     * set 所属一级分类名称
     *
     * @param categoryLevel1Name
     */
    public void setCategoryLevel1Name(String categoryLevel1Name) {
        this.categoryLevel1Name = categoryLevel1Name;
    }

    /**
     * get 所属二级分类名称
     *
     * @return
     */
    public String getCategoryLevel2Name() {
        return categoryLevel2Name;
    }

    /**
     * set 所属二级分类名称
     *
     * @param categoryLevel2Name
     */
    public void setCategoryLevel2Name(String categoryLevel2Name) {
        this.categoryLevel2Name = categoryLevel2Name;
    }

    /**
     * get 交付形态
     *
     * @return
     */
    public Integer getDeliveryForm() {
        return deliveryForm;
    }

    /**
     * set 交付形态
     *
     * @param deliveryForm
     */
    public void setDeliveryForm(Integer deliveryForm) {
        this.deliveryForm = deliveryForm;
    }

    /**
     * get 交付形态名称
     *
     * @return
     */
    public String getDeliveryFormName() {
        return deliveryFormName;
    }

    /**
     * set 交付形态名称
     *
     * @param deliveryFormName
     */
    public void setDeliveryFormName(String deliveryFormName) {
        this.deliveryFormName = deliveryFormName;
    }

    /**
     * get 商品简介
     *
     * @return
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * set 商品简介
     *
     * @param introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * get 商品定价模式 1:按套次、2:按周期、3:按套餐包
     *
     * @return
     */
    public Integer getSellType() {
        return sellType;
    }

    /**
     * set 商品定价模式 1:按套次、2:按周期、3:按套餐包
     *
     * @param sellType
     */
    public void setSellType(Integer sellType) {
        this.sellType = sellType;
    }

    /**
     * get 商品定价模式名称
     *
     * @return
     */
    public String getSellTypeName() {
        return sellTypeName;
    }

    /**
     * set 商品定价模式名称
     *
     * @param sellTypeName
     */
    public void setSellTypeName(String sellTypeName) {
        this.sellTypeName = sellTypeName;
    }

    /**
     * get -1:不允许退款， 单位：天， 默认-1
     *
     * @return
     */
    public Integer getRefundDays() {
        return refundDays;
    }

    /**
     * set -1:不允许退款， 单位：天， 默认-1
     *
     * @param refundDays
     */
    public void setRefundDays(Integer refundDays) {
        this.refundDays = refundDays;
    }

    /**
     * get pc端商品详情
     *
     * @return
     */
    public String getPcProductDetail() {
        return pcProductDetail;
    }

    /**
     * set pc端商品详情
     *
     * @param pcProductDetail
     */
    public void setPcProductDetail(String pcProductDetail) {
        this.pcProductDetail = pcProductDetail;
    }

    /**
     * get m端商品详情
     *
     * @return
     */
    public String getMProductDetail() {
        return mProductDetail;
    }

    /**
     * set m端商品详情
     *
     * @param mProductDetail
     */
    public void setMProductDetail(String mProductDetail) {
        this.mProductDetail = mProductDetail;
    }

    /**
     * get sku详情信息
     *
     * @return
     */
    public List<JdxProductSkuVo> getProductSkuList() {
        return productSkuList;
    }

    /**
     * set sku详情信息
     *
     * @param productSkuList
     */
    public void setProductSkuList(List<JdxProductSkuVo> productSkuList) {
        this.productSkuList = productSkuList;
    }


    /**
     * set 产品ID
     *
     * @param productId
     */
    public JdxProductVo productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
     * set 商品名称
     *
     * @param productName
     */
    public JdxProductVo productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * set 商标图片地址
     *
     * @param trademarkUrl
     */
    public JdxProductVo trademarkUrl(String trademarkUrl) {
        this.trademarkUrl = trademarkUrl;
        return this;
    }

    /**
     * set 所属一级分类名称
     *
     * @param categoryLevel1Name
     */
    public JdxProductVo categoryLevel1Name(String categoryLevel1Name) {
        this.categoryLevel1Name = categoryLevel1Name;
        return this;
    }

    /**
     * set 所属二级分类名称
     *
     * @param categoryLevel2Name
     */
    public JdxProductVo categoryLevel2Name(String categoryLevel2Name) {
        this.categoryLevel2Name = categoryLevel2Name;
        return this;
    }

    /**
     * set 交付形态
     *
     * @param deliveryForm
     */
    public JdxProductVo deliveryForm(Integer deliveryForm) {
        this.deliveryForm = deliveryForm;
        return this;
    }

    /**
     * set 交付形态名称
     *
     * @param deliveryFormName
     */
    public JdxProductVo deliveryFormName(String deliveryFormName) {
        this.deliveryFormName = deliveryFormName;
        return this;
    }

    /**
     * set 商品简介
     *
     * @param introduction
     */
    public JdxProductVo introduction(String introduction) {
        this.introduction = introduction;
        return this;
    }

    /**
     * set 商品定价模式 1:按套次、2:按周期、3:按套餐包
     *
     * @param sellType
     */
    public JdxProductVo sellType(Integer sellType) {
        this.sellType = sellType;
        return this;
    }

    /**
     * set 商品定价模式名称
     *
     * @param sellTypeName
     */
    public JdxProductVo sellTypeName(String sellTypeName) {
        this.sellTypeName = sellTypeName;
        return this;
    }

    /**
     * set -1:不允许退款， 单位：天， 默认-1
     *
     * @param refundDays
     */
    public JdxProductVo refundDays(Integer refundDays) {
        this.refundDays = refundDays;
        return this;
    }

    /**
     * set pc端商品详情
     *
     * @param pcProductDetail
     */
    public JdxProductVo pcProductDetail(String pcProductDetail) {
        this.pcProductDetail = pcProductDetail;
        return this;
    }

    /**
     * set m端商品详情
     *
     * @param mProductDetail
     */
    public JdxProductVo mProductDetail(String mProductDetail) {
        this.mProductDetail = mProductDetail;
        return this;
    }

    /**
     * set sku详情信息
     *
     * @param productSkuList
     */
    public JdxProductVo productSkuList(List<JdxProductSkuVo> productSkuList) {
        this.productSkuList = productSkuList;
        return this;
    }


    /**
     * add item to sku详情信息
     *
     * @param productSkuList
     */
    public void addProductSkuList(JdxProductSkuVo productSkuList) {
        if (this.productSkuList == null) {
            this.productSkuList = new ArrayList<>();
        }
        this.productSkuList.add(productSkuList);
    }

}