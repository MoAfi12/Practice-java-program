import java.util.Arrays;

public class Function {
    public static void main(String[] args) {

  /*      int num = sum(10 , 20 , 90);
        System.out.println(num);
    }
     static int sum(int a , int b ){
        return a + b ;

    }

    static int sum(int a , int b , int c){
        return a + b + c;
    }

}
*/


        // another function ..

     /*   int numers = sum(10,  29 , 39 ,40);
        System.out.println(numers);


    }

    static int sum(int a , int b , int c , int d , int...v){
    return a + b + c + d;
    }
}      */


        fullName("mohamed", "abdulahi" , "aden");

    }

    static void fullName(String ...v){
        System.out.println(Arrays.toString(v));
    }

}


  /*  magacaygaSadaxan("mohamed " , "abdulahi" , "aden");
}

static void magacaygaSadaxan(String firstName , String secondName , String lastName){
    System.out.print("Hello my friend" + " ");
    System.out.println(firstName +" " + secondName + " "+ lastName);
    }
}
   */