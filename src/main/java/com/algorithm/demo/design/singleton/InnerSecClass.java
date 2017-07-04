package com.algorithm.demo.design.singleton;

/**
 * Created by IntelliJ IDEA.
 * <p>
 * 静态内部类方式
 * 懒加载
 * 线程安全
 *
 * @author huacy
 * @since 2017/07/04
 */
public class InnerSecClass {

    private InnerSecClass() {
    }

    private static class InnerSecHandler {
        private static final InnerSecClass INSTANCE = new InnerSecClass();
    }

    public static InnerSecClass getIntance() {
        return InnerSecHandler.INSTANCE;
    }
}
