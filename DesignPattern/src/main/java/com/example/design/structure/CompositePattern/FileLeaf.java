package com.example.design.structure.CompositePattern;

public class FileLeaf implements FileComponent{

    private String name;
    private Long size;

    public FileLeaf(String name,Long size){
        super();
        this.name = name;
        this.size = size;
    }

    @Override
    public long totalSize() {
        return size;
    }
    @Override
    public void showProperty() {
        System.out.println("FileLeaf [name=" + name + ", size=" + size + "]");
    }

}
