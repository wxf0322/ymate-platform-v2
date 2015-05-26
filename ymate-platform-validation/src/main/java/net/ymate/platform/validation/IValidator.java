/*
 * Copyright 2007-2107 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.ymate.platform.validation;

/**
 * 验证器接口
 *
 * @author 刘镇 (suninformation@163.com) on 2013-4-7 下午4:46:33
 * @version 1.0
 */
public interface IValidator {

    /**
     * @param context 验证器上下文对象
     * @return 执行并返回验证结果，若无错误则返回空
     */
    public ValidateResult validate(ValidateContext context);
}
