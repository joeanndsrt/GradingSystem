/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SplashScreen {
    
    public static void main (String[] args) {
    splash Splash = new splash();
    Splash.setVisible(true);
    Login2 Start = new Login2();
    try
    {
        for (int i = 0; i <= 100; i++)
        {
            Thread.sleep(30);
            Splash.num.setText(Integer.toString(i)+"%");
            Splash.loadingbar.setValue(i);
            if(i== 100)
            {
                Splash.setVisible(false);
                Start.setVisible(true);
            }
        }
    }
    catch (Exception e)
    {
    
    }
    }
}
