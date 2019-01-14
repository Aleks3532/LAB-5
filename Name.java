пакет  com.company ;
import  java.util.HashMap ;
импорт  java.util.Random ;


общественный  класс  Name {
    HashMap < Integer , String > a =  new  HashMap < Integer , String > ();
    Случайный ранд =  новый  Случайный ();
    public  void  mapping () {
        для ( int i =  0 ; i < 15 ; i ++ ) {
            а . ставить (я, random_name ());
        }

    }

    public  String  random_name () {
        String name =  " abcdefghijkmnopqrstuvwxyz " ;
        String names =  " " ;
        for ( int i =  0 ; i < rand . nextInt ( 10 ); i ++ ) {
            имена + = имя . charAt (ранд . nextInt ( 10 ));
        }
    вернуть имена;

    }
    public  void  outall () {
        Система . из . println (a . values ??());
    }

    public  void  out ( int  number ) {
        Система . из . println (a . get (число));
    }
}