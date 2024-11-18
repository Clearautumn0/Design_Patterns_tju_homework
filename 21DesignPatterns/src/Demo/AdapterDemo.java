package Demo;

import Pattern.AdapterPattern.Database;
import Pattern.AdapterPattern.EncryptionAdapterClass;
import Pattern.AdapterPattern.EncryptionAdapterObject;
import Pattern.AdapterPattern.EncryptionTarget;
import Pattern.AdapterPattern.ThirdPartyEncryptor;

public class AdapterDemo {
    public static void main(String[] args) {
     // 第三方加密实例
        ThirdPartyEncryptor thirdPartyEncryptor = new ThirdPartyEncryptor();

        // 使用对象适配器
        EncryptionTarget objectAdapter = new EncryptionAdapterObject(thirdPartyEncryptor);
        String objectEncryptedData = objectAdapter.encrypt("password123");
        System.out.println("对象适配器加密: " + objectEncryptedData);

        // 使用类适配器
        EncryptionTarget classAdapter = new EncryptionAdapterClass();
        String classEncryptedData = classAdapter.encrypt("password123");
        System.out.println("类加密器加密: " + classEncryptedData);

        // 模拟存储到数据库
        Database db = new Database();
        db.save(objectEncryptedData);
        db.save(classEncryptedData);
    }
    
    
    
}

