package openclosed.improve;

/**
 * <p>
 *     如果要新增加一个类，需要改动的地方太多，耦合性比较高
 * </p>
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2021-12-27 9:15
 */
public class OpenClosed1 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
       s.draw();
    }

}

abstract class Shape {
    int m_type;

    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//新增画三角形
class Triangle extends Shape{
    Triangle(){
        m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

//新增一个图形
class OtherGraphic extends Shape{
    public OtherGraphic(){
        m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}
