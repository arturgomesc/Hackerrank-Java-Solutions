package java_abstract_class;

abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
