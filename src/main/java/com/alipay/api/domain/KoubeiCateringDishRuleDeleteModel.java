package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品通用规则删除
 *
 * @author auto create
 * @since 1.0, 2020-03-25 18:06:24
 */
public class KoubeiCateringDishRuleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4859537597161716635L;

	/**
	 * 菜品规则通用模型
	 */
	@ApiField("kb_dish_rule_info")
	private KbdishRuleInfo kbDishRuleInfo;

	public KbdishRuleInfo getKbDishRuleInfo() {
		return this.kbDishRuleInfo;
	}
	public void setKbDishRuleInfo(KbdishRuleInfo kbDishRuleInfo) {
		this.kbDishRuleInfo = kbDishRuleInfo;
	}

}
