package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PaginationCook;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.cook.condition.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-25 18:05:49
 */
public class KoubeiCateringCookConditionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4292446741852521536L;

	/** 
	 * 口碑菜谱模型列表
	 */
	@ApiField("kb_dish_cook_page_info")
	private PaginationCook kbDishCookPageInfo;

	public void setKbDishCookPageInfo(PaginationCook kbDishCookPageInfo) {
		this.kbDishCookPageInfo = kbDishCookPageInfo;
	}
	public PaginationCook getKbDishCookPageInfo( ) {
		return this.kbDishCookPageInfo;
	}

}
