package Java_Algorithm_visualizer;

import javax.swing.DefaultButtonModel;

public class ButtonModel extends DefaultButtonModel    {

    @Override
    public boolean isPressed() {
        return false;
    }

    @Override
    public boolean isRollover() {
        return false;
    }

    @Override
    public void setRollover(boolean b) {
        //NOOP
    }

}