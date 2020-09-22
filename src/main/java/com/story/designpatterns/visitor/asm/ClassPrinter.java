package com.story.designpatterns.visitor.asm;


import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

import java.io.IOException;
import java.util.Arrays;

import static org.objectweb.asm.Opcodes.ASM4;


public class ClassPrinter extends ClassVisitor {

    public ClassPrinter() {
        super(ASM4);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        System.out.print(name);
        if (superName != null) {
            System.out.print(" extends " + superName);
        }

        if (interfaces.length > 0) {
            System.out.print(" implements " + Arrays.toString(interfaces).replace("[","").replace("]",""));
        }
        System.out.println("{");
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        System.out.print(name);
        if (value != null) {
            System.out.println(" = " + value);
        }
        return null;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        System.out.print(name + "()");

        return null;
    }

    @Override
    public void visitEnd() {
        System.out.println("}");
    }

    public static void main(String[] args) throws IOException {
        ClassPrinter cp = new ClassPrinter();
        ClassReader cr = new ClassReader("com.story.designpatterns.visitor.asm.GermanTank");
        cr.accept(cp, 0);

        ClassReader cr1 = new ClassReader(ClassPrinter.class.getClassLoader().getResourceAsStream("com/story/designpatterns/visitor/asm/GermanTank.class"));
        cr1.accept(cp,0);
    }


}

class GermanTank extends Tank implements Fire{
    int Armor = 200;

    @Override
    public void onFire() {
        System.out.println("onfire");
    }
}

class Tank{
    int life = 100;


}

interface Fire {
    void onFire();
}
