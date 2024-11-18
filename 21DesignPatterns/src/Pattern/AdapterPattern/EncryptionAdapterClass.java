package Pattern.AdapterPattern;

public class EncryptionAdapterClass extends ThirdPartyEncryptor implements EncryptionTarget {

    @Override
    public String encrypt(String data) {
        // TODO Auto-generated method stub
        System.out.println("类加密器加密中...");
        return super.externalEncrypt(data);
        // throw new UnsupportedOperationException("Unimplemented method 'encrypt'");
    }

}
