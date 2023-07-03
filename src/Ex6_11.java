import javax.xml.crypto.Data;

class Data_1{
    int value;
}
class Data_2{
    int value;

    Data_2(int x){
        value = x;
    }
    Data_2(){} // 이게 있어야 아래 class에서 에러가 나지 않는다?
}
class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2();
    }
}
