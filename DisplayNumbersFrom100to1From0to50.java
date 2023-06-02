package academy.devonline.java.basic.section01_setup.section05_setup;

public class DisplayNumbersFrom100to1From0to50 {
    public static void main(String[] args) {
        var i = 100;
        var n = 0;
        var to = 1;
        int e =i;
        do {
            System.out.print("\t"+ e--);
            if (e % 10 ==0){
                System.out.println();
            }
        }while (n<e);
        System.out.println();



        {
            var p = 50;
            var t =2;
            var o = 0;

            var l = o;
            do {
                System.out.print(l+"\t");
                l+=t;
                if (l %10 ==0){
                    System.out.println();
                }
            }while (l<=p);
            System.out.println();
        }


    }
}
