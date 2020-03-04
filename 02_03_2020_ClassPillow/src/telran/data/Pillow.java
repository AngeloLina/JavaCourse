package telran.data;

public class Pillow {
    private int size;
    private int price;
    private String form;
    private String material;

    public Pillow(int size, int price, String form, String material) {
        this.size = size;
        this.price = price;
        this.form = form;
        this.material = material;
    }

    public Pillow(){

    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getForm() {
        return form;
    }

    public String getMaterial() {
        return material;
    }
    public void display(){
        System.out.println("Material");
    }
}
