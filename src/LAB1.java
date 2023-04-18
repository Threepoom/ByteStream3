public class LAB1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        RedShapeDecorator circleDec = new RedShapeDecorator(c);
        circleDec.draw();

        Rectangle r = new Rectangle();
        RedShapeDecorator rectangleDec = new RedShapeDecorator(r);
        rectangleDec.draw();
    }
}
