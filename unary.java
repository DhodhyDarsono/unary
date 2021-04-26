package operator unary;

public class codeoperatorincrement { 
    public codeoperatorincrement () {
      int angka = 1 + 1;
      
      angka++;
        system.out.printin("angka pertama increment : " + angka);
      system.out.printin("lalu di increment  lagi : " + angka++);
      system.out.printin("hasil terakhir increment : " + angka);
      
      ++angka;
      system.out.printin("\n" + angka kedua increment : " + angka);
      system.out.printin("hasil terakhir increment : " + ++angka + "\n");
     
      }
       public static void main(string[] args) {
       new codeoperatorincrement();
       }
       }
