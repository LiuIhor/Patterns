package CreatinalPatterns.AbstractFactory.factories;


import CreatinalPatterns.AbstractFactory.checkboxes.Checkbox;
import CreatinalPatterns.AbstractFactory.buttons.Button;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}