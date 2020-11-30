package builder;

public class ConcreteBuilderB extends Builder{
    @Override
    public void builderWall() {
        product.setWall("砖面墙");
    }

    @Override
    public void builderTV() {
        product.setTv("海尔电视");
    }

    @Override
    public void builderSofa() {
        product.setSofa("真皮沙发");
    }
}
