package com.github.wecomsdk.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.github.wecomsdk.enums.WeComGlobalCodeTip;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 类名: WeComBaseResponse
 *
 * @author: 1*+
 * @date: 2021-12-09 14:14
 */
@Data
@NoArgsConstructor
public class WeComBaseResponse implements Serializable {

    @JSONField(name = "errcode")
    private Integer errCode;
    @JSONField(name = "errmsg")
    private String errMsg;

    /**
     * 判断请求成功
     *
     * @return {@link Boolean}
     */
    public boolean isSuccess() {
        return WeComGlobalCodeTip.SUCCESS_CODE_TIP_0.getCode().equals(errCode);
    }

    /**
     * 判断请求失败
     *
     * @return {@link Boolean}
     */
    public boolean isFail() {
        return !isSuccess();
    }


}
