package GreddyGil;

public class AlGreddy {
    public int i,j,k;

    AlGreddy(){

    }

    void Greedy(int coin[], int hasil[], int jum[], int uang, int i){
        int s[] = new int[uang];

        while (jum[i] <uang){
            k = (int)(Math.random()* coin.length);

            s[hasil[i]] = coin[k];

            if (jum[i] + s[hasil[i]] <= uang){
                System.out.print(s[hasil[i]] + " ");
            }
            jum[i] += s[hasil[i]];
            hasil[i] +=1;
        }
        System.out.print("}");

        if (jum[i] == uang){
            System.out.println(" = " + hasil[i] + " Coin");
        }
        else {
            System.out.println("Tidak Ada Penyelesaian");
        }
    }

    void sorting(int data[], int n){
        for (i=0; i<n-1;i++){
            for (j=0; j<n-1;j++){
                if (data[j] <= data[j+1]){
                    k = data[j];
                    data[j] = data[j+1];
                    data[j+1] = k;
                }
            }
        }
    }

    void maxMin (int data[], int jum[], int uang){
        int bin[] = new int[data.length];

        j = 0;
        for (i = 0; i<data.length;i++){
            if (jum[i]==uang){
                bin[j] = data[i];
                j+=1;
            }
        }

        sorting(bin, bin.length);

        k = 0;
        for (i = 0; i< bin.length; i++){
            if (bin[i] != 0){
                k+=1;
            }
        }

        System.out.println(" Solusi Max : " + bin[0]);
        System.out.println(" Solusi Min : " + bin[k-1]);
    }
}
