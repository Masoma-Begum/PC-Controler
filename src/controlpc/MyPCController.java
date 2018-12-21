
package controlpc;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javazoom.jl.player.Player;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyPCController extends javax.swing.JFrame {
    Process pr,pr1,pr2,pr3,pr4,pr5,pr6,pr7,pr8,pr9,pr10,pr11,pr12,pr13,pr14;  
    Image image;
    Runtime rt = Runtime.getRuntime();

    public MyPCController() {
        
      
       super("My PC Controler");
        initComponents();
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
      this.setSize(418,331);
       
     
     

    }
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmdShoutDown = new javax.swing.JButton();
        cmdRestart = new javax.swing.JButton();
        cmdLogof = new javax.swing.JButton();
        cmdfLock = new javax.swing.JButton();
        cmdSleep = new javax.swing.JButton();
        cmdHibernet = new javax.swing.JButton();
        cmdResSpacifictime = new javax.swing.JButton();
        cmdShoutSpacifictime = new javax.swing.JButton();
        jCombobox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cmdShoutDown.setText("Shutdown");
        cmdShoutDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdShoutDownActionPerformed(evt);
            }
        });
        getContentPane().add(cmdShoutDown);
        cmdShoutDown.setBounds(10, 11, 120, 23);

        cmdRestart.setText("Restart");
        cmdRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRestartActionPerformed(evt);
            }
        });
        getContentPane().add(cmdRestart);
        cmdRestart.setBounds(60, 40, 110, 23);

        cmdLogof.setText("Logof");
        cmdLogof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLogofActionPerformed(evt);
            }
        });
        getContentPane().add(cmdLogof);
        cmdLogof.setBounds(130, 70, 90, 23);

        cmdfLock.setText("Lock");
        cmdfLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdfLockActionPerformed(evt);
            }
        });
        getContentPane().add(cmdfLock);
        cmdfLock.setBounds(160, 100, 90, 23);

        cmdSleep.setText("Sleep");
        cmdSleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSleepActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSleep);
        cmdSleep.setBounds(200, 130, 70, 23);

        cmdHibernet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlpc/duck.gif"))); // NOI18N
        cmdHibernet.setText("Go to Hibernt");
        cmdHibernet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdHibernetActionPerformed(evt);
            }
        });
        getContentPane().add(cmdHibernet);
        cmdHibernet.setBounds(220, 230, 170, 60);

        cmdResSpacifictime.setText("Restart Specific Tilme");
        cmdResSpacifictime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdResSpacifictimeActionPerformed(evt);
            }
        });
        getContentPane().add(cmdResSpacifictime);
        cmdResSpacifictime.setBounds(10, 270, 170, 20);

        cmdShoutSpacifictime.setText("Shutdown specific time");
        cmdShoutSpacifictime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdShoutSpacifictimeActionPerformed(evt);
            }
        });
        getContentPane().add(cmdShoutSpacifictime);
        cmdShoutSpacifictime.setBounds(10, 240, 170, 23);

        jCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "TO WO warning", "Google", "Gmail", "Facebook", "Linkedin", "Yahoo" }));
        jCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(jCombobox);
        jCombobox.setBounds(306, 80, 80, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Projectsssss\\ControlPC\\Images\\cartoon.gif")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 60, 130, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlpc/Cricate.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 10, 80, 100);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setText("Control your PC according  to your wish");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 10, 260, 15);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlpc/mini.gif"))); // NOI18N
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRestartActionPerformed
       
          try {

             pr1 = rt.exec("cmd /c shutdown -r"); // for restart

        } catch (Exception e) {

        }


    }//GEN-LAST:event_cmdRestartActionPerformed

    private void cmdShoutDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdShoutDownActionPerformed
        try {
             pr = rt.exec("cmd /c shutdown -s"); // for shutdown

        } catch (Exception e) {

        }

    }//GEN-LAST:event_cmdShoutDownActionPerformed

    private void cmdLogofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLogofActionPerformed
       
      try {

             pr2 = rt.exec("cmd /c shutdown -l"); // for log off


        } catch (Exception e) {

        }

    }//GEN-LAST:event_cmdLogofActionPerformed

    private void cmdfLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdfLockActionPerformed
        try {
            pr3=rt.exec("");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmdfLockActionPerformed

    private void cmdSleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSleepActionPerformed
       try {
       rt.exec("Rundll32.exe powrprof.dll,SetSuspendState Sleep");
        
        } catch (IOException ex) {

        }

    }//GEN-LAST:event_cmdSleepActionPerformed

    private void cmdHibernetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHibernetActionPerformed
       try {
            pr5 =rt.exec("shutdown -h");
        } catch (IOException ex) {

        }

    }//GEN-LAST:event_cmdHibernetActionPerformed

    private void cmdResSpacifictimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdResSpacifictimeActionPerformed
       
       try {
             pr7 = rt.exec("shutdown -r -t 60");
        } catch (IOException ex) {

        }

    }//GEN-LAST:event_cmdResSpacifictimeActionPerformed

    private void cmdShoutSpacifictimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdShoutSpacifictimeActionPerformed
        try {
          pr6=rt.exec("shutdown -s -t 60");
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_cmdShoutSpacifictimeActionPerformed
           
    private void jComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboboxActionPerformed
      
        if(jCombobox.getSelectedItem().equals("Google")){
            try {
                 pr8=rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
            } catch (IOException ex) {
                Logger.getLogger(MyPCController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(jCombobox.getSelectedItem().equals("Gmail")){
            try{
                //Setting Driver property
                System.setProperty("webdriver.chrome.driver", "D:\\SOFTWER\\SQA\\chromedriver.exe");
                       
                        WebDriver driver= new ChromeDriver();
                       // navigate ur driver to mail.google.com
                       driver.navigate().to("http://accounts.google.com");
                       //wait for the element to load
                       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                       //enter emil id
                       driver.findElement(By.cssSelector("#identifierId")).sendKeys("abc.abc@gmail.com");
                       //click on next button
                       driver.findElement(By.cssSelector("#identifierNext")).click();
                       
                       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                       //enter password
                       driver.findElement(By.cssSelector("#password")).sendKeys("abcabc");
                       //click sign in button
                       driver.findElement(By.cssSelector("#passwordNext")).click();
             
                       //wait for 5 Sec
                       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                       driver.close();
                       driver.quit();
            }catch (Exception e){
                System.out.print(e);
                
            }
           
        }
        else if(jCombobox.getSelectedItem().equals("Facebook")) {
            try {
                System.setProperty("webdriver.chrome.driver", "D:\\SOFTWER\\SQA\\chromedriver.exe");
                WebDriver fdriver=new ChromeDriver();
                fdriver.navigate().to("https://www.facebook.com");
                fdriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                       //enter emil id {Inspect> copy> copyselector}
                       fdriver.findElement(By.cssSelector("#email")).sendKeys("abc.abc@gmail.com");
                      
                       fdriver.findElement(By.cssSelector("#pass")).sendKeys("abcabc");
                        fdriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                       //click sign in button
                       fdriver.findElement(By.cssSelector("#u_0_8")).click();
             
                       //wait for 5 Sec
                       fdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                       fdriver.close();
                       fdriver.quit();
                
            } catch (Exception ex) {
                Logger.getLogger(MyPCController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if(jCombobox.getSelectedItem().equals("Linkedin"))   {
            try {
                System.setProperty("webdriver.chrome.driver", "D:\\SOFTWER\\SQA\\chromedriver.exe");
                WebDriver ldriver=new ChromeDriver();
                ldriver.navigate().to("https://www.linkedin.com/");
                ldriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                       //enter emil id {Inspect> copy> copyselector}
                       ldriver.findElement(By.cssSelector("#login-email")).sendKeys("mba.aaa@gmail.com");
                      
                       ldriver.findElement(By.cssSelector("#login-password")).sendKeys("ananna40802");
                        ldriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                       //click sign in button
                       ldriver.findElement(By.cssSelector("#login-submit")).click();
             
                       //wait for 5 Sec
                       ldriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                       ldriver.close();
                       ldriver.quit();
                
            } catch (Exception ex) {
                Logger.getLogger(MyPCController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if(jCombobox.getSelectedItem().equals("Yahoo")){
            try {
                pr10=rt.exec("");
            } catch (IOException ex) {
                Logger.getLogger(MyPCController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } 
        else if(jCombobox.getSelectedItem().equals("TO WO warning")){
            try {
                pr11=rt.exec(" shutdown -s -p");
            } catch (IOException ex) {
                Logger.getLogger(MyPCController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } 
    }//GEN-LAST:event_jComboboxActionPerformed

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        BufferedReader buffreader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the no. of seconds after which you want your computer to shutdown: ");
		
		long a = Long.parseLong(buffreader.readLine());
		
		Process pro = run.exec("shutdown -s -t " + a);
		
    }//GEN-LAST:event_jLabel2AncestorAdded

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyPCController().setVisible(true);
            }
        });
        
        
        try {
            File f = new File("E:\\Projectsssss\\ControlPC\\Images\\I'm Alive.mp3");
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            try {
                Player p = new Player(bis);
                p.play();
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdHibernet;
    private javax.swing.JButton cmdLogof;
    private javax.swing.JButton cmdResSpacifictime;
    private javax.swing.JButton cmdRestart;
    private javax.swing.JButton cmdShoutDown;
    private javax.swing.JButton cmdShoutSpacifictime;
    private javax.swing.JButton cmdSleep;
    private javax.swing.JButton cmdfLock;
    private javax.swing.JComboBox jCombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    private void SetSuspendState(boolean b, boolean b0, boolean b1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
