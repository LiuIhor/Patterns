package CreatinalPatterns.FactoryMethod.factory;

import CreatinalPatterns.FactoryMethod.buttons.Button;
import CreatinalPatterns.FactoryMethod.buttons.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
