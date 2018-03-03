package com.kodilla.kodilla;

import java.lang.*;

/*
Zadanie: średnia bez skrajnych ocen oraz lista obiektów Book
Zadanie składa się z dwóch części - jedna dotyczy ArrayList, a druga LinkedList. Obie części należy zrealizować wewnątrz edytora Kodilla. Oba rozwiązania powinny być w ramach jednego projektu.
Część 1
    Napisz program przy użyciu listy ArrayList, zawierającej kilkanaście ocen z przedmiotu Informatyka w liceum.
    Wypełnij listę przykładowymi ocenami.
    Następnie przy pomocy pętli for oblicz średnią ocenę ucznia (średnia arytmetyczna), ale w taki sposób, że pominięte zostaną skrajne oceny - JEDNA najmniejsza i JEDNA największa.
    Oceny największą i najmniejszą należy odnaleźć. Przykładowo - dla ocen:
        3,3,4,4,4,5,5,5,6 - do obliczenia średniej wzięte zostaną oceny: 3,4,4,4,5,5,5
        4,4,4,4,4,4,4 - do obliczenia średniej wzięte zostaną oceny: 4,4,4,4,4

Część 2
    Napisz program przy użyciu listy LinkedList, zawierającej obiekty opisujące książki. Każda książka powinna posiadać tytuł i rok wydania.
    Wypełnij listę kilkoma przykładowymi pozycjami.
    Następnie przy pomocy pętli for-each wyświetl tylko te książki z listy, których rok wydania jest nie starszy niż 2000.*/


class Book {
    int id;
    String title;
    int year;
    public Book(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }
}






