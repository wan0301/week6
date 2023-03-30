import java.util.Scanner;

class animal{
    Scanner sc = new Scanner(System.in);

    String name;
    double high;
    int weight;
    int speed;
            
    void show(){
        System.out.printf("姓名:"+name+"\t身高:"+high+"\t體重:"+weight+"\t速度:"+speed+"\n");
    }

    int distance(int x,double y){
        if(x>=0 && y>=0){
            return (int)(x*y*this.speed);
        }else{
            return 0;
        }
    }
}

public class A1113363_0324_1{
    public static void main(String[] argv){

        Scanner sc = new Scanner(System.in);

        animal a = new animal();
        animal b = new animal();
        animal c = new animal();
        animal d = new animal();

        a.name = "雪寶";
        a.high = 1.1;
        a.weight = 52;
        a.speed = 100;

        b.name = "驢子";
        b.high = 1.5;
        b.weight = 99;
        b.speed = 200;

        c.name = "安那";
        c.high = 1.7;
        c.weight = 48;
        c.speed = 120;

        d.name = "愛沙";
        d.high = 1.7;
        d.weight = 50;
        d.speed = 120;

        a.show();   
        b.show();
        c.show();
        d.show();

        String[] nameArr = {"雪寶","驢子","安那","愛沙"};
        for(String name:nameArr){
            System.out.printf("\n請輸入%s的跑步時間：",name);
            int x = sc.nextInt();
            System.out.printf("是否輸入加速度？(是：直接輸入加速度值/否：輸入1)：");
            double y = sc.nextDouble();
            System.out.printf("%s的跑步距離為:%d",name,a.distance(x,y));
        }
    } 
}