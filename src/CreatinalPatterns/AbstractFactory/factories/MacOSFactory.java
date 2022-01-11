package CreatinalPatterns.AbstractFactory.factories;

import CreatinalPatterns.AbstractFactory.buttons.Button;
import CreatinalPatterns.AbstractFactory.buttons.MacOSButton;
import CreatinalPatterns.AbstractFactory.checkboxes.Checkbox;
import CreatinalPatterns.AbstractFactory.checkboxes.MacOSCheckbox;


/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}