package AbstractFactory.GUI;

public class WinFactory implements GUIFactory{
    @Override
    public Button ButtonOlustur() {
        return new WinButton();
    }

    @Override
    public CheckBox CheckBoxOlustur() {
        return new WinCheckBox();
    }
}
