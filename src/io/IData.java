package io;

public interface IData extends IReader, IPrinter{
// Фишка ... можно использовать метод по умолчанию
    // метод input для демонстрации

    default int input(String text) {
        print(text);
        return read();
    }

}
