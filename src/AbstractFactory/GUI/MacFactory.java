package AbstractFactory.GUI;

public class MacFactory implements GUIFactory{
    @Override
    public Button ButtonOlustur() {
        return new MacButton();
    }

    @Override
    public CheckBox CheckBoxOlustur() {
        return new MacCheckBox();
    }
}
