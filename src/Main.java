import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam =0;
        int pozitif=0;
        int negatif=0;
        int tek=0;
        int cift=0;
        int adet=0;
        int bt ; // bölenler toplami
        int bs ; // basamak sayisi
        int gecici;
        boolean mukemmelmi;
        boolean asalmi; // flag yerine
        double ortalama=0;
        System.out.println("sayi gir");
        int sayi = scanner.nextInt();
        int enB= sayi; // enB en büyük sayi için
        int enK=sayi; // enK en küçük sayi için
        while (sayi !=0){
        toplam=toplam+sayi;
        adet++;
        if (sayi>0){
            pozitif++;
        }
        else if (sayi<0){
            negatif++;
        }
        if (sayi%2==0){
            cift++;
        }
        else{
            tek++;
        }
        if(sayi>enB){
            enB = sayi;
        }
        if(sayi<enK){
            enK= sayi;
        } asalmi=false;
        if (sayi >1){
            asalmi = true;
            for (int i = 2; i < sayi; i++){
                if (sayi % i ==0){
                    asalmi = false;
                }
            }
        }
            bt=0;
            if (sayi > 0){
                for (int i =1; i<sayi; i++){
                    if(sayi % i==0){
                        bt=bt +i;
                    }
                }
            }
            if (bt==sayi && sayi>0){
                mukemmelmi=true ;
            }else{
                mukemmelmi= false;
            }
              gecici = sayi;
                    if(gecici<0){
                        gecici=gecici*-1 ;
                    }
                    bs  = 0;
                    while(gecici > 0){
                        bs++;
                        gecici = gecici /  10;
                    }
                    System.out.println("basamak sayisi:" + bs);
          sayi = scanner.nextInt();
        }
                if (adet>0){
                    ortalama= (double) toplam/adet;
System.out.println("Pozitif sayi adedi: " + pozitif);
System.out.println("Negatif sayi adedi: " + negatif);
System.out.println("Tek sayi adedi: " + tek);
System.out.println("Cift sayi adedi: " + cift);
System.out.println("En buyuk sayi: " + enB);
System.out.println("En kucuk sayi: " + enK);
System.out.println("Toplam: " + toplam);
System.out.println("Ortalama: " + ortalama);
                }else{
                    System.out.println("hic sayi girilmedi");
                }
                    
        
            
            

        // TODO: 1. Sayaçları ve toplamları tanımlayın (dizi kullanmayın!)

        // TODO: 2. 0 girilene kadar sayı alan bir döngü kurun

        // TODO: 3. Her sayı için pozitif/negatif, tek/çift, en büyük/en küçük, toplam bilgilerini güncelleyin

        // TODO: 4. Her sayı için asal, mükemmel sayı ve basamak sayısı kontrolü yapın

        // TODO: 5. Hiç sayı girilmediyse uyarı verin, girildiyse ortalamayı hesaplayın

        // TODO: 6. Sonuç raporunu düzenli şekilde yazdırın

        // TODO (Opsiyonel): max-min farkı, pozitiflerin ortalaması, asal sayı adedi

        scanner.close();
    }
}
