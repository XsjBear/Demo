package org.example.classLoaderDemo;

/**
 * @description: 自定义类加载器
 * @author: Xsj
 * @create: 2022-06-04 13:04
 **/
public class MyClassLoader extends ClassLoader {

    /**
     * 加载类路径
     */
    private String classPath;


    public MyClassLoader(ClassLoader parent, String classPath) {
        super(parent);
        this.classPath = classPath;
    }

    public MyClassLoader(String classPath) {
        this.classPath = classPath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        System.out.println("自定义类加载器");

        return null;
    }
}
