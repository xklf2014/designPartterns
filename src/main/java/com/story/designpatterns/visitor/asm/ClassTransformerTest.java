package com.story.designpatterns.visitor.asm;

import com.sun.istack.internal.NotNull;
import org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;

import static org.objectweb.asm.Opcodes.*;


public class ClassTransformerTest {
    public static void main(String[] args) throws Exception {
        ClassTransformerTest ct = new ClassTransformerTest();
        ct.writeNewClass();
        /*ClassWriter cw = new ClassWriter(0);
        cw.visit(V1_6, ACC_PUBLIC, "com/story/designpatterns/visitor/asm/Broom", null, "java/lang/Object", null);



        *//*********************************constructor**********************************************//*

        MethodVisitor mw = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null,
                null);
        mw.visitVarInsn(ALOAD, 0);
        mw.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
        mw.visitInsn(RETURN);
        mw.visitMaxs(1, 1);
        mw.visitEnd();


        *//*************************************field******************************************//*

        //生成String name字段
        FieldVisitor  fv = cw.visitField(ACC_PUBLIC, "name", "Ljava/lang/String;", null, null);
        AnnotationVisitor  av = fv.visitAnnotation("LNotNull;", true);
        av.visit("value", "abc");
        av.visitEnd();
        fv.visitEnd();

        byte[] code = cw.toByteArray();

        MyClassLoader loader = new MyClassLoader();
        Class clazz = loader.defineClass("com.story.designpatterns.visitor.asm.Broom",code);

        *//***********************************test********************************************//*

        Object beanObj = clazz.getConstructor().newInstance();
        String path = (String) System.getProperties().get("user.dir");

        FileOutputStream fos = new FileOutputStream(path + "/src/main/java/com/story/designpatterns/visitor/asm/Broom_0.class");
        fos.write(code);
        fos.flush();
        fos.close();*/


    }

    public void writeNewClass() throws Exception {
        ClassReader cr = new ClassReader(ClassPrinter.class.getClassLoader().getResourceAsStream("com/story/designpatterns/visitor/asm/Broom.class"));
        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = new ClassVisitor(ASM4, cw) {

            @Override
            public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
                System.out.println("visitField:" + name);
                return super.visitField(access, name, descriptor, signature, value);
            }

            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                System.out.println("visitMethod:" + name);
                MethodVisitor mw = cw.visitMethod(access, name, descriptor, signature, exceptions);
                if (name.equals("printHelloWorld")) {
                    mw.visitFieldInsn(GETSTATIC,
                            "java/lang/System",
                            "out",
                            "Ljava/io/PrintStream;");

                    mw.visitLdcInsn("Hello world!");
                    mw.visitMethodInsn(INVOKEVIRTUAL,
                            "java/io/PrintStream",
                            "println",
                            "(Ljava/lang/String;)V");
                    mw.visitInsn(RETURN);
                    mw.visitMaxs(2, 2);
                }
                return mw;
            }


            @Override
            public void visitEnd() {
                super.visitEnd();
            }
        };
        cv.visitField(ACC_PUBLIC, "name", "Ljava/lang/String;", null, null);
        cv.visitMethod(ACC_PUBLIC,
                "printHelloWorld",
                "()V",
                null,
                null);
        cv.visitEnd();
        cr.accept(cv, 0);
        byte[] bytes = cw.toByteArray();
        MyClassLoader classLoader = new MyClassLoader();
        Class clazz = classLoader.defineClass("com.story.designpatterns.visitor.asm.Broom", bytes);
        clazz.getConstructor().newInstance();
        String path = (String) System.getProperties().get("user.dir");

        FileOutputStream fos = new FileOutputStream(path + "/src/main/java/com/story/designpatterns/visitor/asm/Broom_1.class");
        fos.write(bytes);
        fos.flush();
        fos.close();
    }

    public void copyNewClass() throws Exception {
        ClassReader cr = new ClassReader(ClassPrinter.class.getClassLoader().getResourceAsStream("com/story/designpatterns/visitor/asm/Broom.class"));
        ClassWriter cw = new ClassWriter(0);
        cr.accept(cw, 0);
        byte[] bytes = cw.toByteArray();
        MyClassLoader classLoader = new MyClassLoader();
        Class clazz = classLoader.defineClass("com.story.designpatterns.visitor.asm.Broom", bytes);
        clazz.getConstructor().newInstance();
        String path = (String) System.getProperties().get("user.dir");

        FileOutputStream fos = new FileOutputStream(path + "/src/main/java/com/story/designpatterns/visitor/asm/Broom_2.class");
        fos.write(bytes);
        fos.flush();
        fos.close();
    }
}

