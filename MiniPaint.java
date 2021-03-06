package aulaOka;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class MiniPaint {

	static JFrame fTela = new JFrame();

	static JPanel pPainel = new JPanel();

	static JButton btnLimpar = new JButton("Limpar");
	static JButton btnOk = new JButton("Ok");
	static JButton btnOk1 = new JButton("Ok");
	static JButton btnSalvar = new JButton("Salvar");
	static JButton btnDesenhar = new JButton("Desenhar");
	static JButton btnVoltar = new JButton("Voltar");

	static JButton btnCor1 = new JButton();
	static JButton btnCor2 = new JButton();
	static JButton btnCor3 = new JButton();
	static JButton btnCor4 = new JButton();
	static JButton btnCor5 = new JButton();
	static JButton btnCor6 = new JButton();
	static JButton btnCor7 = new JButton();
	static JButton btnCor8 = new JButton();
	static JButton btnCor9 = new JButton();
	static JButton btnCor10 = new JButton();
	static JButton btnCor11 = new JButton();
	static JButton btnCor12 = new JButton();
	static JButton btnCor13 = new JButton();
	static JButton btnCor14 = new JButton();
	static JButton btnCor15 = new JButton();
	static JButton btnCor16 = new JButton();
	
	static Color cor1 = new Color(255, 255, 255);
	static Color cor2 = new Color(255, 160, 122);
	static Color cor3 = new Color(255, 20, 147);
	static Color cor4 = new Color(255, 0, 0);
	static Color cor5 = new Color(255, 165, 0);
	static Color cor6 = new Color(255, 255, 0);
	static Color cor7 = new Color(0, 255, 0);
	static Color cor8 = new Color(0, 100, 0);
	static Color cor9 = new Color(0, 245, 255);
	static Color cor10 = new Color(0, 0, 255);
	static Color cor11 = new Color(85, 26, 139);
	static Color cor12 = new Color(139, 0, 139);
	static Color cor13 = new Color(205, 155, 129);
	static Color cor14 = new Color(139, 69, 19);
	static Color cor15 = new Color(139, 139, 122);
	static Color cor16 = new Color(0, 0, 0);
	
	static Color corSelecionada;
	static Color corSelecionadaDegrade1;
	static Color corSelecionadaDegrade2;
	static Color colorUp;
	static Color colorDown;

	static JRadioButton radRetangulo = new JRadioButton("Retangulo");
	static JRadioButton radCirculo = new JRadioButton("Circulo");
	static JRadioButton radArco = new JRadioButton("Arco");

	static JRadioButton radDegrade = new JRadioButton("Degrade");
	static JRadioButton radNormal = new JRadioButton("Normal");

	static JRadioButton radJPG = new JRadioButton("JPG");
	static JRadioButton radGIF = new JRadioButton("GIF");
	static JRadioButton radBMP = new JRadioButton("BMP");
	static JRadioButton radPNG = new JRadioButton("PNG");

	static JRadioButton radMouseRetangulo = new JRadioButton("Retangulo");
	static JRadioButton radMouseCirculo = new JRadioButton("Circulo");

	static JLabel lPoligono = new JLabel("Escolha um Pol�gono: ");
	static JLabel lTipo = new JLabel("Escolha o Tipo: ");
	static JLabel lVertical = new JLabel("Vertical: ");
	static JLabel lHorizontal = new JLabel("Horizontal: ");
	static JLabel lAnguloX = new JLabel("X:");
	static JLabel lAnguloY = new JLabel("Y:");

	static JLabel lX1 = new JLabel("Cor 1 (X):");
	static JLabel lY1 = new JLabel("Cor 1 (Y):");
	static JLabel lX2 = new JLabel("Cor 2 (X):");
	static JLabel lY2 = new JLabel("Cor 2 (Y):");

	static int horizontal;
	static int vertical;
	static int x;
	static int y;
	static int x1;
	static int y1;
	static int x2;
	static int y2;

	static JTextField tfTamanhoHorizontal;
	static JTextField tfTamanhoVertical;
	static JTextField tfTamanhoAnguloX;
	static JTextField tfTamanhoAnguloY;
	static JTextField tfTamanhoX1 = new JTextField("10");
	static JTextField tfTamanhoY1 = new JTextField("20");
	static JTextField tfTamanhoX2 = new JTextField("40");
	static JTextField tfTamanhoY2 = new JTextField("30");

	static ButtonGroup btnGrupo = new ButtonGroup();
	static ButtonGroup btnGrupo1 = new ButtonGroup();
	static ButtonGroup btnGrupo2 = new ButtonGroup();
	static ButtonGroup btnGrupo3 = new ButtonGroup();

	public static void main(String[] args) {

		Tela();

	}

	public static void Tela() {

		fTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fTela.setBounds(100, 100, 1000, 500);
		fTela.setLayout(null);
		fTela.setResizable(false);
		fTela.setLocationRelativeTo(null);
		fTela.setVisible(true);

		pPainel.setBackground(Color.LIGHT_GRAY);
		pPainel.setLayout(null);
		pPainel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		fTela.add(pPainel).setBounds(10, 10, 975, 450);

		btnGrupo.add(radRetangulo);
		btnGrupo.add(radCirculo);
		btnGrupo.add(radArco);
		btnGrupo1.add(radNormal);
		btnGrupo1.add(radDegrade);
		btnGrupo2.add(radJPG);
		btnGrupo2.add(radGIF);
		btnGrupo2.add(radBMP);
		btnGrupo2.add(radPNG);

		pPainel.add(lPoligono).setBounds(10, 10, 150, 50);
		
		pPainel.add(radRetangulo).setBounds(10, 50, 90, 50);
		pPainel.add(radCirculo).setBounds(100, 50, 90, 50);
		pPainel.add(radArco).setBounds(190, 50, 90, 50);
		
		pPainel.add(lTipo).setBounds(300, 62, 100, 80);
		
		pPainel.add(radNormal).setBounds(300, 120, 100, 35);
		pPainel.add(radDegrade).setBounds(300, 155, 100, 35);

		pPainel.add(lHorizontal).setBounds(10, 100, 200, 70);
		tfTamanhoHorizontal = new JTextField("90");
		pPainel.add(tfTamanhoHorizontal).setBounds(90, 120, 70, 30);

		pPainel.add(lVertical).setBounds(10, 140, 200, 70);
		tfTamanhoVertical = new JTextField("60");
		pPainel.add(tfTamanhoVertical).setBounds(90, 160, 70, 30);

		pPainel.add(lAnguloX).setBounds(180, 100, 200, 70);
		tfTamanhoAnguloX = new JTextField("5");
		pPainel.add(tfTamanhoAnguloX).setBounds(209, 120, 70, 30);

		pPainel.add(lAnguloY).setBounds(180, 140, 200, 70);
		tfTamanhoAnguloY = new JTextField("150");
		tfTamanhoAnguloY.setEditable(false);
		pPainel.add(tfTamanhoAnguloY).setBounds(209, 160, 70, 30);

		pPainel.add(btnOk).setBounds(814, 50, 90, 25);
		pPainel.add(btnLimpar).setBounds(814, 90, 90, 25);
		pPainel.add(btnDesenhar).setBounds(814, 130, 90, 25);
		pPainel.add(btnSalvar).setBounds(814, 170, 90, 25);

		pPainel.add(btnCor1).setBounds(350, 10, 30, 30);
		btnCor1.setBackground(new Color(255, 255, 255));
		btnCor1.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor2).setBounds(385, 10, 30, 30);
		btnCor2.setBackground(new Color(255, 160, 122));
		btnCor2.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor3).setBounds(420, 10, 30, 30);
		btnCor3.setBackground(new Color(255, 20, 147));
		btnCor3.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor4).setBounds(455, 10, 30, 30);
		btnCor4.setBackground(new Color(255, 0, 0));
		btnCor4.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor5).setBounds(490, 10, 30, 30);
		btnCor5.setBackground(new Color(255, 165, 0));
		btnCor5.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor6).setBounds(525, 10, 30, 30);
		btnCor6.setBackground(new Color(255, 255, 0));
		btnCor6.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor7).setBounds(560, 10, 30, 30);
		btnCor7.setBackground(new Color(0, 255, 0));
		btnCor7.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor8).setBounds(595, 10, 30, 30);
		btnCor8.setBackground(new Color(0, 100, 0));
		btnCor8.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor9).setBounds(630, 10, 30, 30);
		btnCor9.setBackground(new Color(0, 245, 255));
		btnCor9.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor10).setBounds(665, 10, 30, 30);
		btnCor10.setBackground(new Color(0, 0, 255));
		btnCor10.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor11).setBounds(700, 10, 30, 30);
		btnCor11.setBackground(new Color(85, 26, 139));
		btnCor11.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor12).setBounds(735, 10, 30, 30);
		btnCor12.setBackground(new Color(139, 0, 139));
		btnCor12.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor13).setBounds(770, 10, 30, 30);
		btnCor13.setBackground(new Color(205, 155, 129));
		btnCor13.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor14).setBounds(805, 10, 30, 30);
		btnCor14.setBackground(new Color(139, 69, 19));
		btnCor14.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor15).setBounds(840, 10, 30, 30);
		btnCor15.setBackground(new Color(139, 139, 122));
		btnCor15.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
		pPainel.add(btnCor16).setBounds(875, 10, 30, 30);
		btnCor16.setBackground(new Color(0, 0, 0));
		btnCor16.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));

		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				horizontal = Integer.parseInt(tfTamanhoHorizontal.getText());
				vertical = Integer.parseInt(tfTamanhoVertical.getText());
				x = Integer.parseInt(tfTamanhoAnguloX.getText());
				y = Integer.parseInt(tfTamanhoAnguloY.getText());

				if (radRetangulo.isSelected()) {
					if (radNormal.isSelected()) {

						Graphics2D g2d = (Graphics2D) pPainel.getGraphics();
						SelecionarCor();
						g2d.setPaint(corSelecionada);
						g2d.fillRect(400, 300, horizontal, vertical);
						
						tfTamanhoAnguloX.setEditable(false);
						tfTamanhoAnguloY.setEditable(false);
						
						Salvar();

					}
					if (radDegrade.isSelected()) {
						SelecionarCor();

						pPainel.add(lX1).setBounds(425, 100, 200, 70);
						pPainel.add(tfTamanhoX1).setBounds(500, 120, 70, 30);
						pPainel.add(lY1).setBounds(595, 100, 200, 70);
						pPainel.add(tfTamanhoY1).setBounds(670, 120, 70, 30);

						pPainel.add(lX2).setBounds(425, 140, 200, 70);
						pPainel.add(tfTamanhoX2).setBounds(500, 160, 70, 30);
						pPainel.add(lY2).setBounds(595, 140, 200, 70);
						pPainel.add(tfTamanhoY2).setBounds(670, 160, 70, 30);

						x1 = Integer.parseInt(tfTamanhoX1.getText());
						y1 = Integer.parseInt(tfTamanhoY1.getText());
						x2 = Integer.parseInt(tfTamanhoX2.getText());
						y2 = Integer.parseInt(tfTamanhoY2.getText());

						if (colorUp != null) {
							colorUp = corSelecionadaDegrade1;
						} else {

							colorUp = new Color(0, 0, 0);
						}

						if (colorDown != null) {

							colorDown = corSelecionadaDegrade2;

						} else {
							colorDown = new Color(0, 0, 0);
						}

						Graphics2D g2d = (Graphics2D) pPainel.getGraphics();
						GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
						g2d.setPaint(gfx);
						g2d.fillRect(400, 300, horizontal, vertical);
						
						tfTamanhoAnguloX.setEditable(false);
						tfTamanhoAnguloY.setEditable(false);
						
						Salvar();

					}
				} else if (radCirculo.isSelected()) {

					if (radNormal.isSelected()) {

						Graphics2D g2d = (Graphics2D) pPainel.getGraphics();
						SelecionarCor();
						g2d.setPaint(corSelecionada);
						g2d.fillOval(400, 300, horizontal, vertical);
						
						tfTamanhoAnguloX.setEditable(false);
						tfTamanhoAnguloY.setEditable(false);
						
						Salvar();

					}
					if (radDegrade.isSelected()) {
						SelecionarCor();

						pPainel.add(lX1).setBounds(480, 100, 200, 70);
						pPainel.add(tfTamanhoX1).setBounds(565, 120, 70, 30);
						pPainel.add(lY1).setBounds(670, 100, 200, 70);
						pPainel.add(tfTamanhoY1).setBounds(750, 120, 70, 30);

						pPainel.add(lX2).setBounds(480, 140, 200, 70);
						pPainel.add(tfTamanhoX2).setBounds(565, 160, 70, 30);
						pPainel.add(lY2).setBounds(670, 140, 200, 70);
						pPainel.add(tfTamanhoY2).setBounds(750, 160, 70, 30);

						x1 = Integer.parseInt(tfTamanhoX1.getText());
						y1 = Integer.parseInt(tfTamanhoY1.getText());
						x2 = Integer.parseInt(tfTamanhoX2.getText());
						y2 = Integer.parseInt(tfTamanhoY2.getText());

						if (colorUp != null) {
							colorUp = corSelecionadaDegrade1;
						} else {

							colorUp = new Color(0, 0, 0);
						}

						if (colorDown != null) {

							colorDown = corSelecionadaDegrade2;

						} else {
							colorDown = new Color(0, 0, 0);
						}

						Graphics2D g2d = (Graphics2D) pPainel.getGraphics();
						GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
						g2d.setPaint(gfx);
						g2d.fillOval(400, 300, horizontal, vertical);
						
						tfTamanhoAnguloX.setEditable(false);
						tfTamanhoAnguloY.setEditable(false);
						
						Salvar();

					}
				} else if (radArco.isSelected()) {

					if (radNormal.isSelected()) {

						Graphics2D g2d = (Graphics2D) pPainel.getGraphics();
						tfTamanhoAnguloX.setEditable(true);
						tfTamanhoAnguloY.setEditable(true);
						SelecionarCor();
						g2d.setPaint(corSelecionada);
						g2d.fillArc(400, 300, horizontal, vertical, x, y);
						Salvar();

					}
					if (radDegrade.isSelected()) {
						SelecionarCor();

						pPainel.add(lX1).setBounds(480, 100, 200, 70);
						pPainel.add(tfTamanhoX1).setBounds(565, 120, 70, 30);
						pPainel.add(lY1).setBounds(670, 100, 200, 70);
						pPainel.add(tfTamanhoY1).setBounds(750, 120, 70, 30);

						pPainel.add(lX2).setBounds(480, 140, 200, 70);
						pPainel.add(tfTamanhoX2).setBounds(565, 160, 70, 30);
						pPainel.add(lY2).setBounds(670, 140, 200, 70);
						pPainel.add(tfTamanhoY2).setBounds(750, 160, 70, 30);

						x1 = Integer.parseInt(tfTamanhoX1.getText());
						y1 = Integer.parseInt(tfTamanhoY1.getText());
						x2 = Integer.parseInt(tfTamanhoX2.getText());
						y2 = Integer.parseInt(tfTamanhoY2.getText());

						if (colorUp != null) {
							colorUp = corSelecionadaDegrade1;
						} else {

							colorUp = new Color(0, 0, 0);
						}

						if (colorDown != null) {

							colorDown = corSelecionadaDegrade2;

						} else {
							colorDown = new Color(0, 0, 0);
						}

						Graphics2D g2d = (Graphics2D) pPainel.getGraphics();
						tfTamanhoAnguloX.setEditable(true);
						tfTamanhoAnguloY.setEditable(true);
						GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
						g2d.setPaint(gfx);
						g2d.fillArc(400, 300, horizontal, vertical, x, y);
						Salvar();

					}
				}

			}

		});

		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				pPainel.repaint();
			}

		});

		btnDesenhar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Desenhar();
			}

		});
	}

	public static void Salvar() {

		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				pPainel.add(radJPG).setBounds(420, 200, 80, 30);
				pPainel.add(radGIF).setBounds(500, 200, 80, 30);
				pPainel.add(radBMP).setBounds(580, 200, 80, 30);
				pPainel.add(radPNG).setBounds(660, 200, 80, 30);

				if (radJPG.isSelected()) {

					try {
						BufferedImage bi = new BufferedImage(pPainel.getWidth(), pPainel.getHeight(),
								BufferedImage.TYPE_INT_RGB);
						Graphics2D g2d = bi.createGraphics();
						if (radRetangulo.isSelected()) {
							if (radNormal.isSelected()) {
								g2d.setPaint(corSelecionada);
								g2d.fillRect(450, 200, horizontal, vertical);
							}
							if (radDegrade.isSelected()) {
								GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
								g2d.setPaint(gfx);
								g2d.fillRect(450, 200, horizontal, vertical);
							}
						}
						if (radCirculo.isSelected()) {
							if (radNormal.isSelected()) {
								g2d.setPaint(corSelecionada);
								g2d.fillOval(450, 200, horizontal, vertical);
							}
							if (radDegrade.isSelected()) {
								GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
								g2d.setPaint(gfx);
								g2d.fillOval(450, 200, horizontal, vertical);
							}
						}
						if (radArco.isSelected()) {
							if (radNormal.isSelected()) {
								g2d.setPaint(corSelecionada);
								g2d.fillArc(450, 200, horizontal, vertical, x, y);
							}
							if (radDegrade.isSelected()) {
								GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
								g2d.setPaint(gfx);
								g2d.fillArc(450, 200, horizontal, vertical, x, y);
							}
						}
						String caminho = "C://Users/Amanda/Desktop/teste/teste.jpg";
						ImageIO.write(bi, "JPG", new File(caminho));

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
				if (radGIF.isSelected()) {

					try {
						BufferedImage bi = new BufferedImage(pPainel.getWidth(), pPainel.getHeight(),
								BufferedImage.TYPE_INT_ARGB);
						Graphics2D g2d = bi.createGraphics();
						if (radRetangulo.isSelected()) {
							if (radNormal.isSelected()) {
								g2d.setPaint(corSelecionada);
								g2d.fillRect(450, 200, horizontal, vertical);
							}
							if (radDegrade.isSelected()) {
								GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
								g2d.setPaint(gfx);
								g2d.fillRect(450, 200, horizontal, vertical);
							}
						}
						if (radCirculo.isSelected()) {
							if (radNormal.isSelected()) {
								g2d.setPaint(corSelecionada);
								g2d.fillOval(450, 200, horizontal, vertical);
							}
							if (radDegrade.isSelected()) {
								GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
								g2d.setPaint(gfx);
								g2d.fillOval(450, 200, horizontal, vertical);
							}
						}
						if (radArco.isSelected()) {
							if (radNormal.isSelected()) {
								g2d.setPaint(corSelecionada);
								g2d.fillArc(450, 200, horizontal, vertical, x, y);
							}
							if (radDegrade.isSelected()) {
								GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
								g2d.setPaint(gfx);
								g2d.fillArc(450, 200, horizontal, vertical, x, y);
							}
						}

						String caminho = "C://Users/Amanda/Desktop/teste/teste.gif";
						ImageIO.write(bi, "GIF", new File(caminho));

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
				if (radBMP.isSelected()) {

					try {
						BufferedImage bi = new BufferedImage(pPainel.getWidth(), pPainel.getHeight(),
								BufferedImage.TYPE_INT_RGB);
						Graphics2D g2d = bi.createGraphics();
						if (radRetangulo.isSelected()) {
							if (radNormal.isSelected()) {
								g2d.setPaint(corSelecionada);
								g2d.fillRect(450, 200, horizontal, vertical);
							}
							if (radDegrade.isSelected()) {
								GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
								g2d.setPaint(gfx);
								g2d.fillRect(450, 200, horizontal, vertical);
							}

						}
						if (radCirculo.isSelected()) {
							if (radNormal.isSelected()) {
								g2d.setPaint(corSelecionada);
								g2d.fillOval(450, 200, horizontal, vertical);
							}
							if (radDegrade.isSelected()) {
								GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
								g2d.setPaint(gfx);
								g2d.fillOval(450, 200, horizontal, vertical);
							}

						}
						if (radArco.isSelected()) {
							if (radNormal.isSelected()) {
								g2d.setPaint(corSelecionada);
								g2d.fillArc(450, 200, horizontal, vertical, x, y);
							}
							if (radDegrade.isSelected()) {
								GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
								g2d.setPaint(gfx);
								g2d.fillArc(450, 200, horizontal, vertical, x, y);
							}
						}

						String caminho = "C://Users/Amanda/Desktop/teste/teste.bmp";
						ImageIO.write(bi, "BMP", new File(caminho));

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
				if (radPNG.isSelected()) {

					try {
						BufferedImage bi = new BufferedImage(pPainel.getWidth(), pPainel.getHeight(),
								BufferedImage.TYPE_INT_ARGB);
						Graphics2D g2d = bi.createGraphics();
						if (radRetangulo.isSelected()) {
							if (radNormal.isSelected()) {
								g2d.setPaint(corSelecionada);
								g2d.fillRect(450, 200, horizontal, vertical);
							}
							if (radDegrade.isSelected()) {
								GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
								g2d.setPaint(gfx);
								g2d.fillRect(450, 200, horizontal, vertical);
							}

						}
						if (radCirculo.isSelected()) {
							if (radNormal.isSelected()) {
								g2d.setPaint(corSelecionada);
								g2d.fillOval(450, 200, horizontal, vertical);
							}
							if (radDegrade.isSelected()) {
								GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
								g2d.setPaint(gfx);
								g2d.fillOval(450, 200, horizontal, vertical);
							}

						}
						if (radArco.isSelected()) {
							if (radNormal.isSelected()) {
								g2d.setPaint(corSelecionada);
								g2d.fillArc(450, 200, horizontal, vertical, x, y);
							}
							if (radDegrade.isSelected()) {
								GradientPaint gfx = new GradientPaint(x1, y1, colorUp, x2, y2, colorDown, true);
								g2d.setPaint(gfx);
								g2d.fillArc(450, 200, horizontal, vertical, x, y);
							}
						}

						String caminho = "C://Users/Amanda/Desktop/teste/teste.png";
						ImageIO.write(bi, "PNG", new File(caminho));

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});

	}

	public static void Desenhar() {

		JFrame tela = new JFrame();

		tela.setBounds(300, 300, 300, 200);
		tela.setLocationRelativeTo(null);
		tela.add(btnOk1).setBounds(40, 100, 90, 25);
		tela.add(btnVoltar).setBounds(155, 100, 90, 25);
		tela.add(radMouseRetangulo).setBounds(50, 30, 100, 30);
		tela.add(radMouseCirculo).setBounds(150, 30, 100, 30);
		btnGrupo3.add(radMouseRetangulo);
		btnGrupo3.add(radMouseCirculo);
		tela.setLayout(null);

		tela.setVisible(true);

		btnOk1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (radMouseRetangulo.isSelected()) {
					JFrame tela1 = new JFrame();

					tela1.setSize(1500, 700);
					tela1.add(new MouseRetangulo(), BorderLayout.CENTER);
					tela1.setVisible(true);

				}
				if (radMouseCirculo.isSelected()) {
					JFrame tela1 = new JFrame();
					tela1.setSize(1500, 700);
					tela1.add(new MouseCirculo(), BorderLayout.CENTER);
					tela1.setVisible(true);
				}
			}

		});
		
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tela.dispose();
				Tela();
				
			}

		});

	}

	public static void SelecionarCor() {

		

			btnCor1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor1;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor1;
					} else if (corSelecionadaDegrade2 != null) {
						corSelecionadaDegrade2 = cor1;
					}
				}

			});

			btnCor2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor2;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor2;
					} else if (corSelecionadaDegrade2 != null) {
						corSelecionadaDegrade2 = cor2;
					}

				}

			});
			btnCor3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor3;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor3;
					} else if (corSelecionadaDegrade2 != null) {
						corSelecionadaDegrade2 = cor3;
					}

				}

			});

			btnCor4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor4;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor4;
					} else if (corSelecionadaDegrade2 != null) {
						corSelecionadaDegrade2 = cor4;
					}

				}

			});
			btnCor5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor5;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor5;
					} else if (corSelecionadaDegrade2 == null) {
						corSelecionadaDegrade2 = cor5;
					}

				}

			});

			btnCor6.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor6;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor6;
					} else if (corSelecionadaDegrade2 == null) {
						corSelecionadaDegrade2 = cor6;
					}

				}

			});
			btnCor7.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor7;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor7;
					} else if (corSelecionadaDegrade2 == null) {
						corSelecionadaDegrade2 = cor7;
					}

				}

			});

			btnCor8.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor8;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor8;
					} else if (corSelecionadaDegrade2 == null) {
						corSelecionadaDegrade2 = cor8;
					}

				}

			});
			btnCor9.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor9;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor9;
					} else if (corSelecionadaDegrade2 == null) {
						corSelecionadaDegrade2 = cor9;
					}

				}

			});

			btnCor10.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor10;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor10;
					} else if (corSelecionadaDegrade2 == null) {
						corSelecionadaDegrade2 = cor10;
					}

				}

			});
			btnCor11.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor11;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor11;
					} else if (corSelecionadaDegrade2 == null) {
						corSelecionadaDegrade2 = cor11;
					}

				}

			});

			btnCor12.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor12;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor12;
					} else if (corSelecionadaDegrade2 == null) {
						corSelecionadaDegrade2 = cor12;
					}

				}

			});
			btnCor13.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor13;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor13;
					} else if (corSelecionadaDegrade2 == null) {
						corSelecionadaDegrade2 = cor13;
					}

				}

			});

			btnCor14.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor14;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor14;
					} else if (corSelecionadaDegrade2 == null) {
						corSelecionadaDegrade2 = cor14;
					}

				}

			});
			btnCor15.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor15;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor15;
					} else if (corSelecionadaDegrade2 == null) {
						corSelecionadaDegrade2 = cor15;
					}

				}

			});

			btnCor16.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					corSelecionada = cor16;

					if (corSelecionadaDegrade1 == null) {
						corSelecionadaDegrade1 = cor16;
					} else if (corSelecionadaDegrade2 == null) {
						corSelecionadaDegrade2 = cor16;
					}

				}

			});
		}

	}

