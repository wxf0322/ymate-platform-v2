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
package net.ymate.platform.persistence.jdbc.query;

import org.apache.commons.lang.StringUtils;

/**
 * 分组对象
 *
 * @author 刘镇 (suninformation@163.com) on 15/5/12 下午4:10
 * @version 1.0
 */
public class GroupBy {

    private Fields __groupByNames;

    private Cond __having;

    public static GroupBy create(Fields fields) {
        return new GroupBy(fields);
    }

    private GroupBy(Fields fields) {
        __groupByNames = Fields.create().add(fields);
    }

    public Cond getHaving() {
        return this.__having;
    }

    public GroupBy having(Cond cond) {
        __having = cond;
        return this;
    }

    public String getGroupBySQL() {
        StringBuilder _groupBySB = new StringBuilder("GROUP BY ").append(StringUtils.join(__groupByNames.getFields(), ", "));
        if (__having != null) {
            _groupBySB.append(" HAVING ").append(__having.toString());
        }
        return _groupBySB.toString();
    }
}