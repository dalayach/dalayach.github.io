package testPackage;

import javax.swing.JFrame;

public class TestClass extends JFrame
{

   public TestClass()
   {
   
      setTitle("Attempt d");
      setSize(300, 300);
      setLocation(300, 300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	
      setVisible(true);
   
   }

   public static void main(String[] args)
   {
   
      new TestClass();
   
   }

}

