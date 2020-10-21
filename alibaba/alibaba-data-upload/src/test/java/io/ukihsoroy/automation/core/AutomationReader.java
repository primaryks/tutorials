package io.ukihsoroy.automation.core;

import org.springframework.util.ResourceUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author K.O
 */
public final class AutomationReader {

    //todo 读取resource配置，表与表
    //todo 读取用例

    public static String readAutomationConf(String name) throws IOException {
        File file = ResourceUtils.getFile("classpath:feature/" + name + ".json");
        InputStream inputStream = new FileInputStream(file);
        int length = inputStream.available();
        byte bytes[] = new byte[length];
        inputStream.read(bytes);
        inputStream.close();
        return new String(bytes, StandardCharsets.UTF_8);
    }

}