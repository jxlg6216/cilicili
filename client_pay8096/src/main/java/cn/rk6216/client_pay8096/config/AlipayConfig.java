package cn.rk6216.client_pay8096.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

        // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
        public static String APP_ID = "2016102400753794";

        // 商户私钥，您的PKCS8格式RSA2私钥
        public static String APP_PRIVATE_KEY = "";

        // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
        public static String ALIPAY_PUBLIC_KEY = "";

        // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
        //public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

        // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
        public static String return_url = "http://localhost:8096/pay/success";
        //public static String return_url="http://localhost:8180/#/";  //成功后跳回到vue页面

        // 签名方式
        public static String sign_type = "RSA2";

        // 字符编码格式
        public static String CHARSET = "utf-8";

        // 支付宝网关，这是沙箱的网关
        public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

        // 支付宝网关
        public static String log_path = "E:\\AliTools\\AlipaySecretKeyCreateTool\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

        /**
         * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
         * @param sWord 要写入日志里的文本内容
         */
        public static void logResult(String sWord) {
            FileWriter writer = null;
            try {
                writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
                writer.write(sWord);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
}
