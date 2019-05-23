/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan59;

/**
 *
 * @author DADAR GULUNG JUMBO
 */
public class Latihan59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sinichikudo sn = new Sinichikudo();
        sn.setnamaTokoh("Sinichikudo");
        sn.setKarakter("Seorang siswi SMA yang bekerja sebagai detektif yang hebat dan juga terkenal, Shnichi juga berteman sejak kecil sampai sekarang denagn RanMouri ,namun saat Shinichi sedang menelusuri kasus shinici tibatiba menghilang");
        System.out.println("nama tokoh : "+sn.getnamaTokoh());
        System.out.println("karakter :"+sn.getKarakter());
        System.out.println("------------------------------------------------------------");
        RanMouri rm = new RanMouri();
        rm.setnamaTokoh("Ran Mouri");
        rm.setKarakter2("sahabat kecil Shinichi kudo dan selalu menghawatirkan shinichi saat shinichi menghilang, ran sendiri adalah anak kogoro mouri yang ahli dalam beladiri");
        System.out.println("nama tokoh : "+rm.getnamaTokoh());
        System.out.println("karakter "+rm.getKarakter2());
        System.out.println("------------------------------------------------------------");
        Kogomouri kg = new Kogomouri();
        kg.setnamaTokoh("kogomouri");
        kg.setKarakter3("seorang detektif swasta yang payah namun menjadi terkenal sejak conan datang , karakternya sendiriceroboh dan kurang teliti , dan juga pemabuk");
        System.out.println("nama tokoh : "+kg.getnamaTokoh());
        System.out.println("karakter "+kg.getKarakter3());
        System.out.println("------------------------------------------------------------");
        gin g = new gin();
        g.setnamaTokoh("gin");
        g.setKarakter4("salah satu anggota organisasi terlarang yang telah meracuni conan sehingga menjadi menyusut jadi kecil");
        System.out.println("nama tokoh : "+g.getnamaTokoh());
        System.out.println("karakter "+g.getKarakter4());

                
        }       
    }
     
                

    

