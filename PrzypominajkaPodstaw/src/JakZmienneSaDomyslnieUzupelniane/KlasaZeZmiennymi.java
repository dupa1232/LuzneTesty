package JakZmienneSaDomyslnieUzupelniane;

import java.util.List;

public class KlasaZeZmiennymi {

    private int zmiennaInt;
    private String zmiennaString;
    private int[] array;
    private List<String> listaStringow;
    private List<Integer> listaIntegerow;
    private boolean bulinMaly;
    private Boolean bulinDuzy;
    private StringBuilder stringBuilder;

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public int getZmiennaInt() {
        return zmiennaInt;
    }

    public void setZmiennaInt(int zmiennaInt) {
        this.zmiennaInt = zmiennaInt;
    }

    public String getZmiennaString() {
        return zmiennaString;
    }

    public void setZmiennaString(String zmiennaString) {
        this.zmiennaString = zmiennaString;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public List<String> getListaStringow() {
        return listaStringow;
    }

    public List<Integer> getListaIntegerow() {
        return listaIntegerow;
    }

    public boolean isBulinMaly() {
        return bulinMaly;
    }

    public Boolean getBulinDuzy() {
        return bulinDuzy;
    }
}
