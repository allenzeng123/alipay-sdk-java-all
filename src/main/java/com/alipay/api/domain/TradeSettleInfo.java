package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易结算相关信息。包含分账、补差等信息
 *
 * @author auto create
 * @since 1.0, 2019-07-15 10:56:12
 */
public class TradeSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 2524553662617417979L;

	/**
	 * 该笔订单的超期自动确认结算时间，到达期限后将自动确认结算。此字段只在签约账期结算模式时有效。取值范围：1d～365d。d-天。 该参数数值不接受小数点。
	 */
	@ApiField("settle_period_time")
	private String settlePeriodTime;

	/**
	 * 交易结算明细信息
	 */
	@ApiListField("trade_settle_detail_list")
	@ApiField("trade_settle_detail")
	private List<TradeSettleDetail> tradeSettleDetailList;

	public String getSettlePeriodTime() {
		return this.settlePeriodTime;
	}
	public void setSettlePeriodTime(String settlePeriodTime) {
		this.settlePeriodTime = settlePeriodTime;
	}

	public List<TradeSettleDetail> getTradeSettleDetailList() {
		return this.tradeSettleDetailList;
	}
	public void setTradeSettleDetailList(List<TradeSettleDetail> tradeSettleDetailList) {
		this.tradeSettleDetailList = tradeSettleDetailList;
	}

}