package cn.rk6216.client_pay8096.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

        // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
        public static String APP_ID = "2016102400753794";

        // 商户私钥，您的PKCS8格式RSA2私钥
        public static String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCvlVSwt/P9jnB+6giRuXgtzHUAWdIW+PaGY7s0TbEY7/clJ+bXx36DaybZwnBmhrF0yRHZbci/JXqGHL7kzGOh8R24C2TqhHjeSn6oWxHz1pSufQcldPTEFBtAnAG0DG0H3QlgjxR0HmV0fJQK4MhYM7XX/bbjaBCfAR5NGGVp3grcnvTR2Xhsd+hu7wFYMwPP3QT5aG6icaj6XcIS7OQTHIzY8f7so8Hn0hTDN/e5DE85QyQgUgmvh/50WQCsQImvpkUpU1nmbg/eV4R4+Nclg5DnUlgKyB/zKIM9+l//k78KwdHQo3nhOb4VnZ/UtBC9bs9068550H4lLmSzB5lDAgMBAAECggEAYKcnU5Avc2gxbOuPhAhAq5Vc4rCPAa5Spm/H4WbTEhMmTQHGBQoADn+xhzWNgiKrFMqKVNImK3KKG8E/I9uPDNoZrfI3vxDlKBiB2FMpcrywY8zXXjsfccBPsCUwmtgsPKPkQY8Bh1okJxdctxA9uK/ebeNwBYaHf7+x2maPjNKQVSvpE5GITlok2yUzGdrTXdktMvEbb7x4LR4hSeii3UL0JjCHgrROc92ibv8v75ylClroMm8Mexjp9AAfFAbSoqTUki/YLLgKUktykpAKBw9jv069FGciyuFG+3cpel2/p1TiC/69bnt/a3WOSkm+6tT7GljfaO2j+FMtfF+OoQKBgQDZDjrGTbKS6m8GsXpixYef3JxGF0GyiBhp2etSXjM8M07rUBcRUh/E+l833hkj7dz9fBWi/jyX60fOZqhQzFcHugh+ixmzmkpeCaAJ3ywWzW1sL9MjoeewZ7EChEIgfH5V0rznphTz9tPNrppIOyf5m9QpVCiYltlal6KOlkq3lwKBgQDPFjPTsH+ZWmR7+O9WkW9vA/BsmIisQiT2ggRCSlrRTVrG9zWayHFqk2JMYopFMsjC6kf4FUmmt4ZKPvN0NZdt2lBvAISRZwSe0zppGgXFi3sWVcecY2WfIZ7Un/WxoqcYLGCzUjROleQQ/sc2G28+PbSbZ0UV6a9gXfORpugBNQKBgCmBYxPQf7lAQwLQpUqF4y1ajjeI8vMkuyZimXEiukFkvk6Y/hA91/1esx6Hxd7s+TkvpSOJ4iRaxVxenQj2Sh4cIMux5bRGaLoatROuLUwe9DGf44wIxbkh2uNUTyDPLYlTxvO0+oS8SjwmizIMvdQpTCSrByhGkEGWhWsmqhr5AoGBAKuVLNoASqkokUt65evnUto7/FAuTkfUAkZRUfAPJZJ4Mnfayop1/Cse9PpvRzuwqVF+xqTSFpVRSK5p3FP0N4Tot25RkoXbQqPKRoJg8llMiW7nIh386W1hcPWhl/RX3XUVCAZsXTSj0zUVtL+rGZALloKQnVhbqFkDX1XWYjLlAoGAV+z1H1DD3prOc1nZAB7d4zym1qoeOqyiVOXAVVtqM0v5Atmx4fvzLZvM6xfmaepUeknBH6DSjkp1AdhYpRQcKl3iFKlgujl3TLLw3/4moe1UtrOgjh4jeCFhZO1KxP36QaY+0EXDo6eOVWqTawDpT8Nh9GaGJ+wlnsY4M7eliqQ=";

        // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
        public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuX9kDEEHD5UJD7XSdQzHh/DkaVqdttrN6b9CdYNLn1VmvMS0Fk0zPumWs3WKkmT2GU/o9V3mQo3RZpmeCqUCTasq+pXVai9+DsqMsQgveG8Y1axJ4gYPRdSvnZ3+xsT+0ZY4M5ct3vtyNptxlZglLerFXnqleEgXZNT+QpNvpwFs3NC2fVr71ApbFo6yEvFgznFDGKaGON0izMvdpSXdFa8U0q9N+ETix/ON/Dfxr5qfoKcGg+PEb7J9RMqMkiFWJW5pNKgoqQ8DznOIOoAshzZlPnViH5WDJ2+sAZHYM299n8YXB6vaAHp8RJ2Tpn2GPj6we+2NBgoVBtPsdC7sEQIDAQAB";

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
