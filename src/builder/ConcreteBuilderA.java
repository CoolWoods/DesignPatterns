package builder;

public class ConcreteBuilderA extends Builder{
    @Override
    public void builderWall() {
        product.setWall("白墙");
    }

    @Override
    public void builderTV() {
        product.setTv("小米电视");
    }

    @Override
    public void builderSofa() {
        product.setSofa("木质沙发");
    }
}
