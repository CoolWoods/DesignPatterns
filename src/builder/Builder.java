package builder;

public abstract class Builder{
    protected Product product = new Product();

    public abstract void builderWall();
    public abstract void builderTV();
    public abstract void builderSofa();
    public Product getResult(){
        return product;
    }
}
