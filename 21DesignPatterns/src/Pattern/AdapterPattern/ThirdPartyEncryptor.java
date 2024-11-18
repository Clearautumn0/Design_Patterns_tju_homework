package Pattern.AdapterPattern;
/**
 * 第三方加密模拟类(不可修改)
 * @author <覃邱维>
 * @created 21/08/2020 - 10:07 AM
 */
public class ThirdPartyEncryptor {
    public  String externalEncrypt(String data) {
        System.out.println("三方加密器加密中...");
        return new StringBuilder(data).reverse().toString();
    }

}
