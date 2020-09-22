package com.story.designpatterns.visitor.asm;


import org.objectweb.asm.ClassWriter;


import java.lang.reflect.Field;

import static org.objectweb.asm.Opcodes.*;

public class ClassWriterTest {
    public static void main(String[] args) {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(V1_8, ACC_PUBLIC, "com/story/designpatterns/visitor/asm/Tank"
                , null, "java/lang/Object",new String[]{"java/io/Serializable"});
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "LIFE", "I",
                null, -1).visitEnd();
        cw.visitField(ACC_PUBLIC, "damage", "I",
                null, -1).visitEnd();

        cw.visitMethod(ACC_PUBLIC + ACC_ABSTRACT,"file","(Ljava/lang/Object;)I",null,null);
        cw.visitEnd();
        byte[] b = cw.toByteArray();
        MyClassLoader classLoader = new MyClassLoader();
        Class aClass = classLoader.defineClass("com.story.designpatterns.visitor.asm.Tank", b);
        System.out.println("current class "+aClass.getName());
        System.out.println("super class" +aClass.getSuperclass());
        System.out.println("method " +aClass.getMethods()[0].getName());
        for (Field declaredField : aClass.getDeclaredFields()) {
            System.out.println("field" + declaredField.getType() +" " + declaredField.getName());
        }
        for (Class anInterface : aClass.getInterfaces()) {
            System.out.println("interface " + anInterface.getName());
        }
    }

}
class MyClassLoader extends ClassLoader{
    public Class defineClass(String name,byte[] bytes){
        return defineClass(name,bytes,0,bytes.length);
    }
}