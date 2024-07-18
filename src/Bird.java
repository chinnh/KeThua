//Java không cho phép đa kế thừa
public class Bird extends Animal {//Sử dụng extends để kế thừa
    //Lớp con có thể sử dụng các thành phần từ private, có thể khai báo thêm phương thuộc tính và phương thức mới
    private String color;
    public Bird(int id, String name, String color) {
        super(id, name);
        this.color = color;
    }
    /*
        - super() : Gọi constructor của lớp cha có tham số tương ứng để tạo các thành phần cho lớp con sử dụng
        - super() : thì đứng đầu trong constructor
        - this() và super() thì đứng cùng nhau trong 1 constructor
        */
    public String go(String to){
        return super.go(to);
    }
    public void eat(){
        System.out.println("Eating...");
        /*
        Ghi đè phương thức xảy ra trong mối quan hệ kế thừa
        là các phương thức :
            - Cùng tên, cùng kiểu dữ liệu trả về
            - Khác logic xử lý(trong dấu {})
         */
    }
    public void fly(){
        System.out.println("Bird fly");
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

class Main2 {
    public static void main(String[] args) {
        Bird bird = new Bird(1, "cúc cu", "đen");
        System.out.println(bird.getName());
        bird.eat();
        bird.fly();
    }
}