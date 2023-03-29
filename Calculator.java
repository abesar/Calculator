package uiiii;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.*;

public class Calculator extends JFrame
{
    private JButton btn_equal;
    private JButton btn_0;
    private JButton btn_1;
    private JLabel label_result;
    private JButton btn_clear;
    private JButton btn_del;
    private JButton btn_div;
    private JButton btn_mul;
    private JButton btn_diff;
    private JButton btn_add;
    private JButton btn_2;
    private JButton btn_3;
    private JButton btn_4;
    private JButton btn_5;
    private JButton btn_6;
    private JButton btn_7;
    private JButton btn_8;
    private JButton btn_9;
    private JPanel panel_main;

    public JButton
    getBtn_equal ()
    {
        return btn_equal;
    }

    public void
    setBtn_equal (JButton btn_equal)
    {
        this.btn_equal = btn_equal;
    }

    public JButton
    getBtn_0 ()
    {
        return btn_0;
    }

    public void
    setBtn_0 (JButton btn_0)
    {
        this.btn_0 = btn_0;
    }

    public JButton
    getBtn_1 ()
    {
        return btn_1;
    }

    public void
    setBtn_1 (JButton btn_1)
    {
        this.btn_1 = btn_1;
    }

    public JLabel
    getLabel_result ()
    {
        return label_result;
    }

    public void
    setLabel_result (JLabel label_result, String s)
    {
        this.label_result = label_result;
    }

    public JButton
    getBtn_clear ()
    {
        return btn_clear;
    }

    public void
    setBtn_clear (JButton btn_clear)
    {
        this.btn_clear = btn_clear;
    }

    public JButton
    getBtn_del ()
    {
        return btn_del;
    }

    public void
    setBtn_del (JButton btn_del)
    {
        this.btn_del = btn_del;
    }

    public JButton
    getBtn_div ()
    {
        return btn_div;
    }

    public void
    setBtn_div (JButton btn_div)
    {
        this.btn_div = btn_div;
    }

    public JButton
    getBtn_mul ()
    {
        return btn_mul;
    }

    public void
    setBtn_mul (JButton btn_mul)
    {
        this.btn_mul = btn_mul;
    }

    public JButton
    getBtn_diff ()
    {
        return btn_diff;
    }

    public void
    setBtn_diff (JButton btn_diff)
    {
        this.btn_diff = btn_diff;
    }

    public JButton
    getBtn_add ()
    {
        return btn_add;
    }

    public void
    setBtn_add (JButton btn_add)
    {
        this.btn_add = btn_add;
    }

    public JButton
    getBtn_2 ()
    {
        return btn_2;
    }

    public void
    setBtn_2 (JButton btn_2)
    {
        this.btn_2 = btn_2;
    }

    public JButton
    getBtn_3 ()
    {
        return btn_3;
    }

    public void
    setBtn_3 (JButton btn_3)
    {
        this.btn_3 = btn_3;
    }

    public JButton
    getBtn_4 ()
    {
        return btn_4;
    }

    public void
    setBtn_4 (JButton btn_4)
    {
        this.btn_4 = btn_4;
    }

    public JButton
    getBtn_5 ()
    {
        return btn_5;
    }

    public void
    setBtn_5 (JButton btn_5)
    {
        this.btn_5 = btn_5;
    }

    public JButton
    getBtn_6 ()
    {
        return btn_6;
    }

    public void
    setBtn_6 (JButton btn_6)
    {
        this.btn_6 = btn_6;
    }

    public JButton
    getBtn_7 ()
    {
        return btn_7;
    }

    public void
    setBtn_7 (JButton btn_7)
    {
        this.btn_7 = btn_7;
    }

    public JButton
    getBtn_8 ()
    {
        return btn_8;
    }

    public void
    setBtn_8 (JButton btn_8)
    {
        this.btn_8 = btn_8;
    }

    public JButton
    getBtn_9 ()
    {
        return btn_9;
    }

    public void
    setBtn_9 (JButton btn_9)
    {
        this.btn_9 = btn_9;
    }

    public void
    setLabel_result (JLabel label_result)
    {
        this.label_result = label_result;
    }

    public JPanel
    getPanel_main ()
    {
        return panel_main;
    }

    public void
    setPanel_main (JPanel panel_main)
    {
        this.panel_main = panel_main;
    }

    public String current_symbol = "";

    public String
    concatenateStackValues (Stack<Integer> stack)
    {
        String result = "";
        int i = 0;
        while (stack.size () != i)
        {
            result += stack.get (i).toString ();
            i++;
        };
        return result;
    }

    public Calculator ()
    {
        System.out.println ("Calling Calculator");
        setTitle ("©️Jomari Abejo 2023");
        setContentPane (getPanel_main ());
        setSize (400, 600);
        setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo (null);
        setVisible (true);

        Stack currentStack = new Stack ();
        Stack previousStack = new Stack ();

        try
        {
            ActionListener listener = new ActionListener () {
                @Override public void actionPerformed (ActionEvent e)
                {
                    /*
                     *  Numbers
                     */
                    if (("0").equals (e.getActionCommand ()))
                    {
                        currentStack.push (0);
                        getLabel_result ().setText (
                                concatenateStackValues (currentStack));
                    }
                    if (("1").equals (e.getActionCommand ()))
                    {
                        currentStack.push (1);
                        getLabel_result ().setText (
                                concatenateStackValues (currentStack));
                    }
                    if (("2").equals (e.getActionCommand ()))
                    {
                        currentStack.push (2);
                        getLabel_result ().setText (
                                concatenateStackValues (currentStack));
                    }
                    if (("3").equals (e.getActionCommand ()))
                    {
                        currentStack.push (3);
                        getLabel_result ().setText (
                                concatenateStackValues (currentStack));
                    }
                    if (("4").equals (e.getActionCommand ()))
                    {
                        currentStack.push (4);
                        getLabel_result ().setText (
                                concatenateStackValues (currentStack));
                    }
                    if (("5").equals (e.getActionCommand ()))
                    {
                        currentStack.push (5);
                        getLabel_result ().setText (
                                concatenateStackValues (currentStack));
                    }
                    if (("6").equals (e.getActionCommand ()))
                    {
                        currentStack.push (6);
                        getLabel_result ().setText (
                                concatenateStackValues (currentStack));
                    }
                    if (("7").equals (e.getActionCommand ()))
                    {
                        currentStack.push (7);
                        getLabel_result ().setText (
                                concatenateStackValues (currentStack));
                    }
                    if (("8").equals (e.getActionCommand ()))
                    {
                        currentStack.push (8);
                        getLabel_result ().setText (
                                concatenateStackValues (currentStack));
                    }
                    if (("9").equals (e.getActionCommand ()))
                    {
                        currentStack.push (9);
                        getLabel_result ().setText (
                                concatenateStackValues (currentStack));
                    }
                    /*
                     *  Symbols
                     */
                    if (("+").equals (e.getActionCommand ()))
                    {
                        previousStack.clear ();
                        previousStack.push (Integer.valueOf (
                                concatenateStackValues (currentStack).toString ()));
                        currentStack.clear ();
                        current_symbol = "+";
                        getLabel_result ().setText ("0");
                        System.out.println (previousStack.lastElement () + "-> "
                                + current_symbol);
                    }
                    if (("-").equals (e.getActionCommand ()))
                    {
                        previousStack.clear ();
                        previousStack.push (Integer.valueOf (
                                concatenateStackValues (currentStack).toString ()));
                        currentStack.clear ();
                        current_symbol = "-";
                        getLabel_result ().setText ("0");
                        System.out.println (previousStack.lastElement () + "-> "
                                + current_symbol);
                    }
                    if (("*").equals (e.getActionCommand ()))
                    {
                        previousStack.clear ();
                        previousStack.push (Integer.valueOf (
                                concatenateStackValues (currentStack).toString ()));
                        currentStack.clear ();
                        current_symbol = "*";
                        getLabel_result ().setText ("0");
                        System.out.println (previousStack.lastElement () + "-> "
                                + current_symbol);
                    }
                    if (("/").equals (e.getActionCommand ()))
                    {
                        previousStack.clear ();
                        previousStack.push (Integer.valueOf (
                                concatenateStackValues (currentStack).toString ()));
                        currentStack.clear ();
                        current_symbol = "/";
                        getLabel_result ().setText ("0");
                        System.out.println (previousStack.lastElement () + "-> "
                                + current_symbol);
                    }

                    /*
                     *  Equals Btn
                     */

                    if (("=").equals (e.getActionCommand ()))
                    {
                        if (("+").equals (current_symbol))
                        {
                            int primary_value = Integer.valueOf (
                                    concatenateStackValues (currentStack));
                            int secondary_value = Integer.valueOf (
                                    previousStack.lastElement ().toString ());

                            int result = primary_value + secondary_value;

                            getLabel_result ().setText (String.valueOf (result));

                            currentStack.clear ();
                            previousStack.clear ();

                            currentStack.push (result);
                            previousStack.push (result);
                        }
                        if (("-").equals (current_symbol))
                        {
                            int primary_value = Integer.valueOf (
                                    previousStack.lastElement ().toString ());
                            int secondary_value = Integer.valueOf (
                                    concatenateStackValues (currentStack));

                            int result = primary_value - secondary_value;
                            System.out.println("Subtracting -> " + result);

                            getLabel_result ().setText (String.valueOf (result));

                            currentStack.clear ();
                            previousStack.clear ();

                            currentStack.push (result);
                            previousStack.push (result);
                        }
                        if (("*").equals (current_symbol))
                        {
                            int primary_value = Integer.valueOf (
                                    concatenateStackValues (currentStack));
                            int secondary_value = Integer.valueOf (
                                    previousStack.lastElement ().toString ());

                            int result = primary_value * secondary_value;

                            getLabel_result ().setText (String.valueOf (result));

                            currentStack.clear ();
                            previousStack.clear ();

                            currentStack.push (result);
                            previousStack.push (result);
                        }
                        if (("/").equals (current_symbol))
                        {
                            int primary_value = Integer.valueOf (
                                    previousStack.lastElement ().toString ());
                            int secondary_value = Integer.valueOf (
                                    concatenateStackValues (currentStack));

                            int result = primary_value / secondary_value;

                            System.out.println("Divide res ->L" + result);

                            getLabel_result ().setText (String.valueOf (result));

                            currentStack.clear ();
                            previousStack.clear ();

                            currentStack.push (result);
                            previousStack.push (result);
                        }
                    }

                    /*
                     *  Clear ->
                     *  DEL   ->
                     */
                    System.out.println (e.getActionCommand ());
                    if (("CLR").equals (e.getActionCommand ()))
                    {
                        currentStack.clear ();
                        previousStack.clear ();
                        getLabel_result ().setText ("0");
                    }
                    if (("DEL").equals (e.getActionCommand ()))
                    {
                        if (!currentStack.empty ())
                        {
                            currentStack.pop ();
                        }

                        getLabel_result ().setText (
                                concatenateStackValues (currentStack));

                        if (currentStack.isEmpty ())
                        {
                            getLabel_result ().setText ("0");
                        }
                    }
                }
            };
            btn_0.addActionListener (listener);
            btn_1.addActionListener (listener);
            btn_2.addActionListener (listener);
            btn_3.addActionListener (listener);
            btn_7.addActionListener (listener);
            btn_5.addActionListener (listener);
            btn_6.addActionListener (listener);
            btn_9.addActionListener (listener);
            btn_8.addActionListener (listener);
            btn_4.addActionListener (listener);
            btn_add.addActionListener (listener);
            btn_diff.addActionListener (listener);
            btn_mul.addActionListener (listener);
            btn_div.addActionListener (listener);
            btn_equal.addActionListener (listener);
            btn_clear.addActionListener (listener);
            btn_del.addActionListener (listener);
        }
        catch (Exception E)
        {
            E.printStackTrace ();
        }
    }
}