public class Product {
    private String name;
    private Integer size;
    private Integer percentage;

    public Product(String name, Integer size, Integer percentage) {
        this.name = name;
        this.size = size;
        this.percentage = percentage;
    }


    public String productDescription() {

       if ((size == null)&&(percentage==null)){
           return "";
       }else if (size == null){
           return percentage +"%";
       }else if (percentage ==null){
           return size+"cl";
       }
       else


        return "." + size + " cl " + percentage + "%";

    }
}
