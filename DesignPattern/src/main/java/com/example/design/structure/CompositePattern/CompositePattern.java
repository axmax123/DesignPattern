package com.example.design.structure.CompositePattern;

import java.util.Arrays;
import java.util.List;

public class CompositePattern {
    public static void main(String[] args) {
        FileComponent fileComponent = new FileLeaf("test", 10L);
        FileComponent fileComponent1 = new FileLeaf("test", 10L);
        List<FileComponent> files = Arrays.asList(fileComponent, fileComponent1);
        FileComponent folder = new FolderComponent(files);
        folder.showProperty();
        System.out.println("Total Size: " + folder.totalSize());
    }
}
