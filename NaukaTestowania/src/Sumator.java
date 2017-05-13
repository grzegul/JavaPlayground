
public interface Sumator {
    /**
     * Dodaje do sumatora wskazan� liczb�.
     *
     * @param x
     *            czynnik
     */
    void dodaj(long x);
 
    /**
     * Odejmuje do sumatora wskazan� liczb�. Liczba nie mo�e by� ujemna.
     * 
     * @param x
     *            odjemnik
     * @throws IllegalArgumentException
     *             je�eli odjemnik jest ujemny.
     */
    void odejmij(long x);
 
    /**
     * Zwraca aktualn� wielko�� sumatora. Dla pustego sumatora zwraca 0.
     *
     * @return wielko�� sumatora.
     */
    long wielkosc();
}