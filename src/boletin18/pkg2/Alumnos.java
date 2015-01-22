package boletin18.pkg2;

public class Alumnos {

    public static final int NOTAS = 5;
    int[] notas = new int[NOTAS];

    public Alumnos() {
    }

    public void visualizar() {
        int i;
        int a=0, s=0;
        for (i = 0; i < NOTAS; i++) {
            double random = Math.random() * 10 + 1;
            int valor = (int) random;
            notas[i] = valor;
            if (notas[i] >= 5) {
                a++;
            } else {
                s++;

            }
            System.out.println(notas[i]+"\n"+ s + "suspensos\n" + a + "aprobados");
        }

    }

    public void notaMedia() {
        int i, c = 0;
        int notaMedia;
        for (i = 0; i < NOTAS; i++) {
            c += notas[i];
        }
        notaMedia = c / NOTAS;
        System.out.println(notaMedia);
    }

    public void notaBiggest() {
        int biggestNot = 0;
        for (int i = 0; i < NOTAS; i++) {
            if (notas[i] > biggestNot) {
                biggestNot = notas[i];
            }
        }
        System.out.println(biggestNot);
    }

}
