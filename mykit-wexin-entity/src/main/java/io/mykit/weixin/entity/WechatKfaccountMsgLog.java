/**
 * Copyright 2019-2999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.weixin.entity;

import io.mykit.weixin.entity.base.MonthShardingEntity;
import lombok.Data;

/**
 * @author liuyazhuang
 * @version 1.0.0
 * @date 2019/5/8
 * @description 发送微信客服消息记录表
 */
@Data
public class WechatKfaccountMsgLog extends MonthShardingEntity {
    private static final long serialVersionUID = 5361673834973377809L;

    /**
     * 微信开发者账号表id
     */
    private String accountId;

    /**
     * 接收模板消息的微信用户openId
     */
    private String openId;
}
