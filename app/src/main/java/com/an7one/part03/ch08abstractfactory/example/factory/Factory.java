package com.an7one.part03.ch08abstractfactory.example.factory;

public abstract class Factory {
    public static Factory getFactory(String className) {
        Factory factory = null;

        try {
            factory = (Factory) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException ex) {
            System.err.println("Cannot find " + className);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
