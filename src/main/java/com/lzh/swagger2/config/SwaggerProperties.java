package com.lzh.swagger2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author linzhihao
 * @Date 2022/10/22 4:45 下午
 * @Description
 */
@Data
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {

    /**
     * 标题
     */
    private String title = "在线文档";

    /**
     * 自定义组名
     */
    private String group = "";

    /**
     * 描述
     */
    private String description = "在线文档";

    /**
     * 版本
     */
    private String version = "1.0";

    /**
     * 联系人
     */
    private Contact contact = new Contact();

    /**
     * swagger会解析的包路径
     */
    private String basePackage = "com.lzh";

    /**
     * swagger会解析的url规则
     */
    private List<String> basePath = new ArrayList<>();

    /**
     * 在basePath基础上需要排除的url规则
     */
    private List<String> excludePath = new ArrayList<>();

    /**
     * 分组文档
     */
    private Map<String, DocketInfo> docket = new LinkedHashMap<>();

    public String getGroup() {
        if (group == null || "".equals(group)) {
            return title;
        }
        return group;
    }

    @Data
    public static class DocketInfo {

        /**
         * 标题
         */
        private String title = "在线文档";

        /**
         * 自定义组名
         */
        private String group = "";

        /**
         * 描述
         */
        private String description = "在线文档";

        /**
         * 版本
         */
        private String version = "1.0";

        /**
         * 联系人
         */
        private Contact contact = new Contact();

        /**
         * swagger会解析的包路径
         */
        private String basePackage = "";

        /**
         * swagger会解析的url规则
         */
        private List<String> basePath = new ArrayList<>();

        /**
         * 在basePath基础上需要排除的url
         */
        private List<String> excludePath = new ArrayList<>();

        public String getGroup() {
            if (group == null || "".equals(group)) {
                return title;
            }
            return group;
        }

    }

    @Data
    public static class Contact {

        /**
         * 联系人
         */
        private String name = "lzh";

        /**
         * 联系人url
         */
        private String url = "";

        /**
         * 联系人email
         */
        private String email = "";
    }
}
