package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.businessorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceBusinessorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3187996716565967165L;

	/** 
	 * 分页查询的办事记录详情列表，没条记录包含isvAppId(isv的appid)、subject(一条办事记录的摘要),status(一条办事记录的状态),recordTime(一条办事记录创建的时间)
	 */
	@ApiField("record_detail")
	private String recordDetail;

	public void setRecordDetail(String recordDetail) {
		this.recordDetail = recordDetail;
	}
	public String getRecordDetail( ) {
		return this.recordDetail;
	}

}
