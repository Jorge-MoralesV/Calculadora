package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Contenido extends JFrame implements ActionListener {

    private final JTextField contenedor;
    private final JButton boton0;
    private final JButton boton1;
    private final JButton boton2;
    private final JButton boton3;
    private final JButton boton4;
    private final JButton boton5;
    private final JButton boton6;
    private final JButton boton7;
    private final JButton boton8;
    private final JButton boton9;
    private final JButton botonMas;
    private final JButton botonMenos;
    private final JButton botonPor;
    private final JButton botonEntre;
    private final JButton botonIgual;
    private final JButton botonPunto;
    private final JButton botonC;
    private float valor1;
    private String operador;

    public Contenido() {

        setLayout(null);

        setTitle("Calculadora");

        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("../recursos/icono.png"))).getImage());

        contenedor = new JTextField();
        contenedor.setBounds(11, 11, 378, 61);
        contenedor.setHorizontalAlignment(SwingConstants.RIGHT);
        Font auxFont = contenedor.getFont();
        contenedor.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        add(contenedor);

        boton0 = new JButton("0");
        boton0.setBounds(11, 474, 186, 90);
        auxFont = boton0.getFont();
        boton0.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        boton0.setBackground(new Color(225, 225, 225));
        add(boton0);
        boton0.addActionListener(this);

        boton1 = new JButton("1");
        boton1.setBounds(11, 378, 90, 90);
        auxFont = boton1.getFont();
        boton1.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        boton1.setBackground(new Color(225, 225, 225));
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("2");
        boton2.setBounds(107, 378, 90, 90);
        auxFont = boton2.getFont();
        boton2.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        boton2.setBackground(new Color(225, 225, 225));
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("3");
        boton3.setBounds(203, 378, 90, 90);
        auxFont = boton3.getFont();
        boton3.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        boton3.setBackground(new Color(225, 225, 225));
        add(boton3);
        boton3.addActionListener(this);

        boton4 = new JButton("4");
        boton4.setBounds(11, 282, 90, 90);
        auxFont = boton4.getFont();
        boton4.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        boton4.setBackground(new Color(225, 225, 225));
        add(boton4);
        boton4.addActionListener(this);

        boton5 = new JButton("5");
        boton5.setBounds(107, 282, 90, 90);
        auxFont = boton5.getFont();
        boton5.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        boton5.setBackground(new Color(225, 225, 225));
        add(boton5);
        boton5.addActionListener(this);

        boton6 = new JButton("6");
        boton6.setBounds(203, 282, 90, 90);
        auxFont = boton6.getFont();
        boton6.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        boton6.setBackground(new Color(225, 225, 225));
        add(boton6);
        boton6.addActionListener(this);

        boton7 = new JButton("7");
        boton7.setBounds(11, 187, 90, 90);
        auxFont = boton7.getFont();
        boton7.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        boton7.setBackground(new Color(225, 225, 225));
        add(boton7);
        boton7.addActionListener(this);

        boton8 = new JButton("8");
        boton8.setBounds(107, 187, 90, 90);
        auxFont = boton8.getFont();
        boton8.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        boton8.setBackground(new Color(225, 225, 225));
        add(boton8);
        boton8.addActionListener(this);

        boton9 = new JButton("9");
        boton9.setBounds(203, 187, 90, 90);
        auxFont = boton9.getFont();
        boton9.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        boton9.setBackground(new Color(225, 225, 225));
        add(boton9);
        boton9.addActionListener(this);

        botonMas = new JButton("+");
        botonMas.setBounds(299, 90, 90, 186);
        auxFont = botonMas.getFont();
        botonMas.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        botonMas.setBackground(new Color(225, 255, 225));
        add(botonMas);
        botonMas.addActionListener(this);

        botonMenos = new JButton("-");
        botonMenos.setBounds(299, 282, 90, 186);
        auxFont = botonMenos.getFont();
        botonMenos.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        botonMenos.setBackground(new Color(225, 255, 225));
        add(botonMenos);
        botonMenos.addActionListener(this);

        botonPunto = new JButton(".");
        botonPunto.setBounds(299, 474, 90, 90);
        auxFont = botonPunto.getFont();
        botonPunto.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        botonPunto.setBackground(new Color(225, 255, 225));
        add(botonPunto);
        botonPunto.addActionListener(this);

        botonIgual = new JButton("=");
        botonIgual.setBounds(203, 474, 90, 90);
        auxFont = botonIgual.getFont();
        botonIgual.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        botonIgual.setBackground(new Color(255, 185, 20));
        add(botonIgual);
        botonIgual.addActionListener(this);

        botonPor = new JButton("X");
        botonPor.setBounds(203, 90, 90, 90);
        auxFont = botonPor.getFont();
        botonPor.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        botonPor.setBackground(new Color(225, 255, 225));
        add(botonPor);
        botonPor.addActionListener(this);

        botonEntre = new JButton("/");
        botonEntre.setBounds(107, 90, 90, 90);
        auxFont = botonEntre.getFont();
        botonEntre.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        botonEntre.setBackground(new Color(225, 255, 225));
        add(botonEntre);
        botonEntre.addActionListener(this);

        botonC = new JButton("C");
        botonC.setBounds(11, 90, 90, 90);
        auxFont = botonC.getFont();
        botonC.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        botonC.setBackground(new Color(145, 229, 255));
        add(botonC);
        botonC.addActionListener(this);

    }

    public void Ventana() {
        Contenido obj = new Contenido();
        obj.setSize(415, 610);
        obj.getContentPane().setBackground(new Color(44, 81, 97));
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == botonC) {
                contenedor.setText("");
            } else if (e.getSource() == boton0) {
                contenedor.setText(contenedor.getText() + "0");
            } else if (e.getSource() == boton1) {
                contenedor.setText(contenedor.getText() + "1");
            } else if (e.getSource() == boton2) {
                contenedor.setText(contenedor.getText() + "2");
            } else if (e.getSource() == boton3) {
                contenedor.setText(contenedor.getText() + "3");
            } else if (e.getSource() == boton4) {
                contenedor.setText(contenedor.getText() + "4");
            } else if (e.getSource() == boton5) {
                contenedor.setText(contenedor.getText() + "5");
            } else if (e.getSource() == boton6) {
                contenedor.setText(contenedor.getText() + "6");
            } else if (e.getSource() == boton7) {
                contenedor.setText(contenedor.getText() + "7");
            } else if (e.getSource() == boton8) {
                contenedor.setText(contenedor.getText() + "8");
            } else if (e.getSource() == boton9) {
                contenedor.setText(contenedor.getText() + "9");
            } else if (e.getSource() == botonIgual) {
                float valor2 = Float.parseFloat(contenedor.getText());
                switch (operador) {
                    case "+":
                        contenedor.setText(noCero(valor1 + valor2));
                        break;
                    case "-":
                        contenedor.setText(noCero(valor1 - valor2));
                        break;
                    case "X":
                        contenedor.setText(noCero(valor1 * valor2));
                        break;
                    case "/":
                        if (valor2 == 0) {
                            contenedor.setText("Math ERROR");
                        } else {
                            contenedor.setText(noCero(valor1 / valor2));
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error", "Algo paso porque este mensaje no deberia de aparecer", JOptionPane.ERROR_MESSAGE);
                }
            } else if (e.getSource() == botonMas) {
                valor1 = Float.parseFloat(contenedor.getText());
                operador = "+";
                contenedor.setText("");
            } else if (e.getSource() == botonMenos) {
                valor1 = Float.parseFloat(contenedor.getText());
                operador = "-";
                contenedor.setText("");
            } else if (e.getSource() == botonPor) {
                valor1 = Float.parseFloat(contenedor.getText());
                operador = "X";
                contenedor.setText("");
            } else if (e.getSource() == botonEntre) {
                valor1 = Float.parseFloat(contenedor.getText());
                operador = "/";
                contenedor.setText("");
            } else if (e.getSource() == botonPunto) {
                if (!contenedor.getText().contains(".")) {
                    contenedor.setText(contenedor.getText() + ".");
                }
            }
        } catch (HeadlessException | NumberFormatException ex) {
            System.out.println("Excepcion: " + ex.getMessage());
        }
    }

    public String noCero(float numero) {
        String retorno = "";
        retorno = Float.toString(numero);
        if (numero % 1 == 0) {
            retorno = retorno.substring(0, retorno.length() - 2);
        }
        return retorno;
    }

}
