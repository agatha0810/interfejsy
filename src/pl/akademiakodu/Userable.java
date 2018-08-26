package pl.akademiakodu;


// definicja metod publicznych i abstrakcyjnych
/*
    Interfejs może być używany także jako TYP, podobnie klas
    Jeśli mamy zmienną, która jest type interfejsu

    Userable user = new User(); // gdzie User to klasa
    // to na tej zmiennej możemy wywołać tylko metodę getUsername()
    // natomiast jej implementacja pochodzi z klasy User

        w tym zapisie
         Userable user = new User(); mamy do czynienia z polimorfizmem
     */

public interface Userable {
    // publiczna i abstrakcyjna
    String getUsername();
    /*
    public abstract getUsername();
        abstract oznacza, że metoda jest bez implementacji
     */
}
