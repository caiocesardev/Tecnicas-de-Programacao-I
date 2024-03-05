package estruturaDados;

public class Main {

	public static void main(String[] args) {
		double[] vetor = {1.0, 2.0, 3.0, 4.0, 5.0};
        int n = vetor.length;

        System.out.println("Vetor original:");
        imprimirArray(vetor, n);

        inverter(vetor, n);

        System.out.println("Vetor invertido:");
        imprimirArray(vetor, n);
    }

    public static void inverter(double[] vet, int n) {
        for (int i = 0; i < n / 2; i++) {
            double temp = vet[i];
            vet[i] = vet[n - i - 1];
            vet[n - i - 1] = temp;
        }
    }

    public static void imprimirArray(double[] vet, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }


}
