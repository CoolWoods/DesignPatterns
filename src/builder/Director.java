package builder;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Product construct(){
        builder.builderWall();
        builder.builderTV();
        builder.builderSofa();
        return builder.getResult();
    }
}
