package CreatinalPatterns.FactoryMethod.factory;

import CreatinalPatterns.FactoryMethod.buttons.Button;
import CreatinalPatterns.FactoryMethod.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
