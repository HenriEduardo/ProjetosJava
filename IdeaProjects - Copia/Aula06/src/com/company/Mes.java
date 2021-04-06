package com.company;

public class Mes {

    public String getMesPorExtenso(int m, int idioma) {

        String mes;

        if (idioma != 1 && idioma != 2) {
            return "Idioma inválido!!";
        }

        switch (m) {
            case 1: {
                if (idioma == 1) {
                    mes = "Janeiro";
                } else {
                    mes = "Jnuary";
                }
                break;
            }
            case 2: {
                mes = "Fevereiro";
                break;
            }
            case 3: {
                mes = "Março";
                break;
            }
            case 4: {
                mes = "Abril";
                break;
            }
            case 5: {
                mes = "Maio";
                break;
            }
            default:
                mes = "Mês inválido";
        }

        return mes;

    }

    //Outra maneira de fazer:

    public static String getMesPorExtensoArray(int m, int idioma) {

        String[] monthsPT = {"Janeiro", "Fevereiro", "Março", "April", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"};
        String[] monthsEN = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        if (idioma != 1 && idioma != 2) {
            return "Idioma inválido";
        } else {
            if (m > 0 && m < 12) {
                if (idioma == 1) {
                    return monthsPT[m - 1];
                } else {
                    return monthsEN[m - 1];
                }
            } else {
                return "Mês inválido";
            }
        }
    }

}
