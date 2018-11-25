package ru.usetech.tests;

public class Box {

    int width; // ширина коробки
    int height; // высота коробки
    int depth; // глубина коробки

    // вычисляем объём коробки
    int getVolume() {
        return width * height * depth;
    }

    // устанавливаем размеры коробки
    void setDim(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }


}
