package com.example.design.structure.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class FolderComponent implements FileComponent{
    List<FileComponent> fileComponents = new ArrayList<>();
    public FolderComponent(List<FileComponent> fileComponents){
        this.fileComponents = fileComponents;

    }
    @Override
    public void showProperty() {
for (FileComponent fileComponent :fileComponents) {
    fileComponent.showProperty();
}    }

    @Override
    public long totalSize() {
        long total = 0;
        for (FileComponent fileComponent : fileComponents){
            total += fileComponent.totalSize();

        }
        return total;
    }
}
