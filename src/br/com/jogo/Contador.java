package br.com.jogo;

public class Contador {

    private static int contador;
    private static int contadorSubmarino;
    private static int contabarco;
    private static int contabarco2;
    private static int acertos;
    private static int acertobarco;
    private static int acertoTotal;
    private static int totaldeclique;
    private static int acertobarco2;

    public static void contadorBarcos() {
        Campo[][] matriz = JFrameTabuleiro.matriz;
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (matriz[linha][coluna].getParte() == 1) {
                    if (matriz[linha][coluna].virou == true && matriz[linha][coluna + 1].virou == true) {
                        setContabarco(getContabarco() + 1);
                        acertobarco = getContabarco();
                        matriz[linha][coluna].virou = false;
                        matriz[linha][coluna + 1].virou = false;
                    }
                } else if (matriz[linha][coluna].getParte() == 2) {
                    if (matriz[linha][coluna].virou == true && matriz[linha][coluna - 1].virou == true) {
                        setContabarco2(getContabarco2() + 1);
                        acertobarco2 = getContabarco2();
                        matriz[linha][coluna].virou = false;
                        matriz[linha][coluna - 1].virou = false;
                    }
                }
            }
        }
    }
    // barcos
    public static void verificaacertos() {
        acertoTotal = acertobarco+acertobarco2 ;
    }

    public static void aumentarsubmarino() {
        setContadorSubmarino(getContadorSubmarino() + 1);
        setAcertos(getContadorSubmarino());
    }

    public static void contaclique() {
        setTotaldeclique(getTotaldeclique() + 1);
    }
    public static void zerartabuleiro() {
        contador = 0;
        contadorSubmarino = 0;
        contabarco = 0;
        acertos = 0;
        acertobarco = 0;
        acertoTotal = 0;
        totaldeclique = 0;
        acertobarco2 = 0;
        contabarco2 = 0;
    }

    public static void aumentarBomba() {
        setContador(getContador() + 1);
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }

    public static int getContadorSubmarino() {
        return contadorSubmarino;
    }

    public static void setContadorSubmarino(int aContadorSubmarino) {
        contadorSubmarino = aContadorSubmarino;
    }

    public static int getContabarco() {
        return contabarco;
    }

    public static void setContabarco(int aContabarco) {
        contabarco = aContabarco;
    }

    public static int getAcertobarco() {
        return acertobarco;
    }

    public static void setAcertobarco(int aAcertobarco) {
        acertobarco = aAcertobarco;
    }

    public static int getAcertoTotal() {
        return acertoTotal;
    }

    public static void setAcertoTotal(int aAcertoTotal) {
        acertoTotal = aAcertoTotal;
    }

    public static int getAcertos() {
        return acertos;
    }

    public static void setAcertos(int aAcertos) {
        acertos = aAcertos;
    }

    public static int getTotaldeclique() {
        return totaldeclique;
    }

    public static void setTotaldeclique(int aTotaldeclique) {
        totaldeclique = aTotaldeclique;
    }

    /**
     * @return the acertoBarco2
     */
    /**
     * @return the contabarco2
     */
    public static int getContabarco2() {
        return contabarco2;
    }

    /**
     * @param aContabarco2 the contabarco2 to set
     */
    public static void setContabarco2(int aContabarco2) {
        contabarco2 = aContabarco2;
    }
}
