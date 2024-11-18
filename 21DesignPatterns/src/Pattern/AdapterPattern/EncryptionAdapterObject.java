package Pattern.AdapterPattern;

/**
 * @author <覃邱维>
 * 
 *         适配器模式：加密适配器对象
 *         采用委托的方式
 */
public class EncryptionAdapterObject implements EncryptionTarget {
    private ThirdPartyEncryptor encryptor;

    public EncryptionAdapterObject(ThirdPartyEncryptor encryptor) {
        this.encryptor = encryptor;
    }

    @Override
    public String encrypt(String data) {
        // TODO Auto-generated method stub
        try {
            System.out.println("对象加密器加密中...    ");
            return encryptor.externalEncrypt(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("加密结束");
        }
        return null;

        // throw new UnsupportedOperationException("Unimplemented method 'encrypt'");
    }
}
