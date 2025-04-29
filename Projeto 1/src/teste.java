public class teste {
    public static void main(String[] args) {
     
    teste obj = new teste();

    obj.seilaporra(1,54,53,900);


    }


  
        public String seilaporra(int a, int b, int c, int n) {
        int max = Math.max(a, Math.max(b,c));
        int igualar = (max - a) + (max - b) + (max - c );

            if (n >= igualar && (n - igualar ) % 3 == 0 ){
                System.out.println("SIM");
            } else {
                System.out.println("NÃO");
            }
            return null ;
          
        }
    }  

