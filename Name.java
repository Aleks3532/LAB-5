�����  com.company ;
import  java.util.HashMap ;
������  java.util.Random ;


������������  �����  Name {
    HashMap < Integer , String > a =  new  HashMap < Integer , String > ();
    ��������� ���� =  �����  ��������� ();
    public  void  mapping () {
        ��� ( int i =  0 ; i < 15 ; i ++ ) {
            � . ������� (�, random_name ());
        }

    }

    public  String  random_name () {
        String name =  " abcdefghijkmnopqrstuvwxyz " ;
        String names =  " " ;
        for ( int i =  0 ; i < rand . nextInt ( 10 ); i ++ ) {
            ����� + = ��� . charAt (���� . nextInt ( 10 ));
        }
    ������� �����;

    }
    public  void  outall () {
        ������� . �� . println (a . values ??());
    }

    public  void  out ( int  number ) {
        ������� . �� . println (a . get (�����));
    }
}