public class Animal {
    private int id;
    private String name;

    public Animal() {
        this(1,"Chó");
        /*
        - this() : Gọi constructor của lớp cha có tham số tương ứng để tạo các thành phần cho lớp con sử dụng cho lớp.
        - this() : thì đứng đầu trong constructor
        */
    }
    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String go(String to){
        return "Animal go" + to;
    }
    public void eat(){
        System.out.println("Animal eat");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Animal id: " + id + " name: " + name;
    }
}
/*
Tất cả các lớp đều kế thừa từ object
this. thì đại diện cho đối tượng đang sử dụng lớp đó
super. đại diện cho đối tượng
 */
