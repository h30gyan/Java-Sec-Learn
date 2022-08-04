package com.naraku.sec.bytecode;

import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;

import java.lang.reflect.Field;

public class HelloTempLoader {

    public static void main(String[] args) throws Exception {
        // 加载字节码
        byte[] code = LoaderClass.load("src/main/java/HelloTemplatesImpl.class");

        TemplatesImpl temp = new TemplatesImpl();

        // 设置属性
        Field name = temp.getClass().getDeclaredField("_name");
        name.setAccessible(true);
        name.set(temp, "HelloTemplatesImpl");

        Field bytecode = temp.getClass().getDeclaredField("_bytecodes");
        bytecode.setAccessible(true);
        bytecode.set(temp, new byte[][]{code});

        Field tfactory = temp.getClass().getDeclaredField("_tfactory");
        tfactory.setAccessible(true);
        tfactory.set(temp, new TransformerFactoryImpl());

        temp.newTransformer();

    }
}