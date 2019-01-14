пакет  com.company ;
import  java.util.List ;
import  java.util.ArrayList ;
импорт  java.util.Random ;


открытый  класс  Array {
    List strList =  new  ArrayList ();
    public  void  createArray () {
        Случайный ранд =  новый  Случайный ();
        для ( int i = 0 ; i < 10 ; i ++ ) {
        strList . добавить (rand . nextInt ( 100 ));
        }
    }
}