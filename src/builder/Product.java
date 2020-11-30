package builder;

public class Product {
    private String wall;
    private String tv;
    private String sofa;


    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }


    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void show() {
        System.out.println("Product{" +
                "wall='" + wall + '\'' +
                ", tv='" + tv + '\'' +
                ", sofa='" + sofa + '\'' +
                '}');
    }
}
