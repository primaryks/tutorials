package io.ukihsoroy.schemagen.source;

import com.google.common.base.CaseFormat;
import org.apache.commons.lang3.StringUtils;

public abstract class AbstractSource implements ISource {

    /**
     * 下划线去前缀转驼峰
     * @param name
     * @param prefix
     * @return
     */
    protected String reformatTable (String name, String prefix) {
        if (StringUtils.isNotBlank(prefix) && name.startsWith(prefix)) {
            return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name.replaceFirst(prefix, ""));
        }
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name);
    }


    /**
     *
     * @param value
     * @return
     */
    protected Integer toInt(String value) {
        int res = 0;
        if (StringUtils.isNotEmpty(value)) {
            res = Integer.parseInt(value);
        }
        return res;
    }

}
