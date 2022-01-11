package CreatinalPatterns.AbstractFactory.factories;

import CreatinalPatterns.AbstractFactory.checkboxes.Checkbox;
import CreatinalPatterns.AbstractFactory.checkboxes.WindowsCheckbox;
import CreatinalPatterns.AbstractFactory.buttons.Button;
import CreatinalPatterns.AbstractFactory.buttons.WindowsButton;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}