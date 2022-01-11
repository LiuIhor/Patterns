package CreatinalPatterns.FactoryMethod.buttons;

/**
 * Реализация HTML кнопок.
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onclick();
    }

    @Override
    public void onclick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
