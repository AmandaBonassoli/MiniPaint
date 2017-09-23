package aulaOka;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Novo {

	static JFrame TelaPrincipal = new JFrame();// tela principal
	static JButton BotaoRetangulo = new JButton("Retangulo");// botão para desenhar o retangulo
	static JButton BotaoCirculo = new JButton("Circulo");
	static JButton BotaoArco = new JButton("Arco");
	static JButton BotaoLimpar = new JButton("Limpar");
	static JButton BotaoSair = new JButton("Sair");
	static JButton BotaoDegradeRetangulo = new JButton("Degrade Retangulo");
	static JButton BotaoDegradeCirculo = new JButton("Degrade Circulo");
	static JButton BotaoDegradeArco = new JButton("Degrade Arco");
	static JButton BotaoSalvarRetangulo = new JButton("Salvar");
	static JButton BotaoSalvarCirculo = new JButton("Salvar");
	static JButton BotaoSalvarArco = new JButton("Salvar");
	static JButton BotaoSalvarRetanguloDegrade = new JButton("Salvar");
	static JButton BotaoSalvarCirculoDegrade = new JButton("Salvar");
	static JButton BotaoSalvarArcoDegrade = new JButton("Salvar");
	static JButton BotaoJPG = new JButton("JPG");
	static JButton BotaoGIF = new JButton("GIF");
	static JButton BotaoBMP = new JButton("BMP");
	static JButton BotaoPNG = new JButton("PNG");
	static JButton BotaoLivre = new JButton("Livre");

	static Color colorDown;
	static Color colorUp;

	static JButton BotaoCor1 = new JButton();
	static JButton BotaoCor2 = new JButton();
	static JButton BotaoCor3 = new JButton();
	static JButton BotaoCor4 = new JButton();
	static JButton BotaoCor5 = new JButton();
	static JButton BotaoCor6 = new JButton();
	static JButton BotaoCor7 = new JButton();
	static JButton BotaoCor8 = new JButton();
	static JButton BotaoCor9 = new JButton();
	static JButton BotaoCor10 = new JButton();
	static JButton BotaoCor11 = new JButton();
	static JButton BotaoCor12 = new JButton();
	static JButton BotaoCor13 = new JButton();
	static JButton BotaoCor14 = new JButton();
	static JButton BotaoCor15 = new JButton();
	static JButton BotaoCor16 = new JButton();

	static JLabel DimensaoVertical = new JLabel("Dimensão Vertical");
	static JLabel DimensaoHorizontal = new JLabel("Dimensão Horizontal");

	static JLabel DegradeX1 = new JLabel("Degrade Horizontal Cor 1");
	static JLabel DegradeX2 = new JLabel("Degrade Horizontal Cor 2");
	static JTextField tfDegradeX1 = new JTextField("10");
	static JTextField tfDegradeX2 = new JTextField("40");

	static JLabel DegradeY1 = new JLabel("Degrade Vertical Cor 1");
	static JLabel DegradeY2 = new JLabel("Degrade Vertical Cor 2");
	static JTextField tfDegradeY1 = new JTextField("20");
	static JTextField tfDegradeY2 = new JTextField("30");

	static JTextField tfDimensaoVertical = new JTextField();
	static JTextField tfDimensaoHorizontal = new JTextField();

	static JLabel AnguloX = new JLabel("Angulo X");
	static JLabel AnguloY = new JLabel("Angulo Y");

	static JTextField tfAnguloX = new JTextField();
	static JTextField tfAnguloY = new JTextField();

	static Graphics2D g2d;

	static JPanel Painel1 = new JPanel();

	static int V;
	static int H;
	static int X;
	static int Y;
	static int DX1;
	static int DX2;
	static int DY1;
	static int DY2;

	static Color CorSelecionada;
	static Color CorSelecionadaDegrade1;
	static Color CorSelecionadaDegrade2;
	static Color Cor1 = new Color(0, 255, 255);
	static Color Cor2 = new Color(0, 255, 127);
	static Color Cor3 = new Color(255, 215, 0);
	static Color Cor4 = new Color(165, 42, 42);
	static Color Cor5 = new Color(25, 25, 112);
	static Color Cor6 = new Color(205, 0, 0);
	static Color Cor7 = new Color(139, 129, 76);
	static Color Cor8 = new Color(69, 139, 0);
	static Color Cor9 = new Color(238, 99, 99);
	static Color Cor10 = new Color(0, 0, 139);
	static Color Cor11 = new Color(205, 104, 57);
	static Color Cor12 = new Color(255, 165, 79);
	static Color Cor13 = new Color(189, 183, 107);
	static Color Cor14 = new Color(255, 140, 0);
	static Color Cor15 = new Color(64, 224, 208);
	static Color Cor16 = new Color(46, 139, 87);

	public static void TelaPrincipal() {
		TelaPrincipal.setTitle("Paint");
		TelaPrincipal.setBounds(50, 50, 1200, 600);
		TelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TelaPrincipal.setBackground(Color.BLACK);

		Painel1.add(BotaoRetangulo).setBounds(100, 500, 180, 20);
		Painel1.add(BotaoCirculo).setBounds(300, 500, 180, 20);
		Painel1.add(BotaoArco).setBounds(500, 500, 180, 20);
		Painel1.add(BotaoSair).setBounds(1000, 220, 180, 50);
		Painel1.add(BotaoLimpar).setBounds(1000, 160, 180, 50);
		Painel1.add(BotaoLivre).setBounds(700, 500, 120, 20);

		Painel1.add(BotaoSalvarRetangulo).setBounds(100, 530, 180, 20);
		Painel1.add(BotaoSalvarCirculo).setBounds(300, 530, 180, 20);
		Painel1.add(BotaoSalvarArco).setBounds(500, 530, 180, 20);
		
		Painel1.add(BotaoSalvarRetanguloDegrade).setBounds(1000, 530, 180, 20);
		Painel1.add(BotaoSalvarCirculoDegrade).setBounds(1000, 530, 180, 20);
		Painel1.add(BotaoSalvarArcoDegrade).setBounds(1000, 530, 180, 20);

		Painel1.add(BotaoJPG).setBounds(10, 20, 60, 20);
		Painel1.add(BotaoGIF).setBounds(10, 60, 60, 20);
		Painel1.add(BotaoBMP).setBounds(10, 100, 60, 20);
		Painel1.add(BotaoPNG).setBounds(10, 140, 60, 20);

		Painel1.add(DimensaoVertical).setBounds(960, 15, 150, 20);
		tfDimensaoHorizontal = new JTextField("90");
		Painel1.add(DimensaoHorizontal).setBounds(960, 50, 150, 20);
		tfDimensaoVertical = new JTextField("60");

		Painel1.add(tfDimensaoVertical).setBounds(1080, 10, 90, 20);
		Painel1.add(tfDimensaoHorizontal).setBounds(1080, 50, 90, 20);

		Painel1.add(AnguloX).setBounds(1000, 90, 90, 20);
		tfAnguloX = new JTextField("90");
		Painel1.add(AnguloY).setBounds(1000, 130, 90, 20);
		tfAnguloY = new JTextField("60");

		Painel1.add(tfAnguloX).setBounds(1080, 90, 90, 20);
		Painel1.add(tfAnguloY).setBounds(1080, 130, 90, 20);

		Painel1.add(BotaoDegradeRetangulo).setBounds(100, 20, 180, 20);
		Painel1.add(BotaoDegradeCirculo).setBounds(300, 20, 180, 20);
		Painel1.add(BotaoDegradeArco).setBounds(500, 20, 180, 20);
		

		Painel1.add(BotaoCor1).setBounds(1000, 300, 20, 20);
		Painel1.add(BotaoCor2).setBounds(1000, 320, 20, 20);
		Painel1.add(BotaoCor3).setBounds(1000, 340, 20, 20);
		Painel1.add(BotaoCor4).setBounds(1000, 360, 20, 20);
		Painel1.add(BotaoCor5).setBounds(1000, 380, 20, 20);
		Painel1.add(BotaoCor6).setBounds(1040, 300, 20, 20);
		Painel1.add(BotaoCor7).setBounds(1040, 320, 20, 20);
		Painel1.add(BotaoCor8).setBounds(1040, 340, 20, 20);
		Painel1.add(BotaoCor9).setBounds(1040, 360, 20, 20);
		Painel1.add(BotaoCor10).setBounds(1040, 380, 20, 20);
		Painel1.add(BotaoCor11).setBounds(1080, 300, 20, 20);
		Painel1.add(BotaoCor12).setBounds(1080, 320, 20, 20);
		Painel1.add(BotaoCor13).setBounds(1080, 340, 20, 20);
		Painel1.add(BotaoCor14).setBounds(1080, 360, 20, 20);
		Painel1.add(BotaoCor15).setBounds(1080, 380, 20, 20);
		Painel1.add(BotaoCor16).setBounds(1110, 300, 20, 20);

		BotaoCor1.setBackground(new Color(0, 255, 255));
		BotaoCor2.setBackground(new Color(0, 255, 127));
		BotaoCor3.setBackground(new Color(255, 215, 0));
		BotaoCor4.setBackground(new Color(165, 42, 42));
		BotaoCor5.setBackground(new Color(25, 25, 112));
		BotaoCor6.setBackground(new Color(205, 0, 0));
		BotaoCor7.setBackground(new Color(139, 129, 76));
		BotaoCor8.setBackground(new Color(69, 139, 0));
		BotaoCor9.setBackground(new Color(238, 99, 99));
		BotaoCor10.setBackground(new Color(0, 0, 139));
		BotaoCor11.setBackground(new Color(205, 104, 57));
		BotaoCor12.setBackground(new Color(255, 165, 79));
		BotaoCor13.setBackground(new Color(189, 183, 107));
		BotaoCor14.setBackground(new Color(255, 140, 0));
		BotaoCor15.setBackground(new Color(64, 224, 208));
		BotaoCor16.setBackground(new Color(46, 139, 87));

		Painel1.add(DegradeX1).setBounds(850, 420, 200, 20);
		Painel1.add(DegradeX2).setBounds(850, 440, 200, 20);
		Painel1.add(DegradeY1).setBounds(850, 480, 200, 20);
		Painel1.add(DegradeY2).setBounds(850, 500, 200, 20);

		Painel1.add(tfDegradeX1).setBounds(1000, 420, 90, 20);
		Painel1.add(tfDegradeX2).setBounds(1000, 440, 90, 20);
		Painel1.add(tfDegradeY1).setBounds(1000, 480, 90, 20);
		Painel1.add(tfDegradeY2).setBounds(1000, 500, 90, 20);

		BotaoDegradeRetangulo.setEnabled(false);
		BotaoDegradeCirculo.setEnabled(false);
		BotaoDegradeArco.setEnabled(false);
		tfAnguloX.setEnabled(false);
		tfAnguloY.setEnabled(false);
		tfDegradeX1.setEnabled(false);
		tfDegradeX2.setEnabled(false);
		tfDegradeY1.setEnabled(false);
		tfDegradeY2.setEnabled(false);
		tfDimensaoHorizontal.setEnabled(false);
		tfDimensaoVertical.setEnabled(false);
		BotaoLimpar.setEnabled(false);

		BotaoSalvarRetangulo.setEnabled(false);
		BotaoSalvarCirculo.setEnabled(false);
		BotaoSalvarArco.setEnabled(false);
		BotaoSalvarRetanguloDegrade.setEnabled(false);
		BotaoSalvarCirculoDegrade.setEnabled(false);
		BotaoSalvarArcoDegrade.setEnabled(false);

		BotaoJPG.setEnabled(false);
		BotaoGIF.setEnabled(false);
		BotaoBMP.setEnabled(false);
		BotaoPNG.setEnabled(false);

		Painel1.setLayout(null);
		TelaPrincipal.setVisible(true);
		TelaPrincipal.add(Painel1).setBounds(50, 50, 1200, 600);

		Botoes();
	}

	public static void Botoes() {
		
//		BotaoLivre.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//			
//			
//			public void actionPerformed(ActionEvent e) {
//				public void PaintSurface() { // colocar nome na tela
//					JFrame tela = new JFrame(); //escolher um nome para a tela
//					tela.setSize(300, 300); //escolher um tamanho
//					tela.add(new PaintSurface(), BorderLayout.CENTER);
//					tela.setVisible(true);
//				}
//				
//			}
//			}
//		
//	});

		BotaoSalvarRetangulo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				BotaoJPG.setEnabled(true);
				BotaoGIF.setEnabled(true);
				BotaoBMP.setEnabled(true);
				BotaoPNG.setEnabled(true);
				
			

				try {
					BufferedImage bi = new BufferedImage(Painel1.getWidth(), Painel1.getHeight(),
							BufferedImage.TYPE_INT_RGB);
					Graphics2D g2d = bi.createGraphics();
					g2d.setPaint(CorSelecionada);
					g2d.fillRect(450, 200, H, V);

					String caminho = "C:/Users/Amanda/Desktop/teste/teste.jpg";
					ImageIO.write(bi, "JPG", new File(caminho));
					
					String caminho1 = "C:/Users/Amanda/Desktop/teste/teste.png";
					ImageIO.write(bi, "PNG", new File(caminho1));
					
					String caminho2 = "C:/Users/Amanda/Desktop/teste/teste.gif";
					ImageIO.write(bi, "GIF", new File(caminho2));
					
					String caminho3 = "C:/Users/Amanda/Desktop/teste/teste.bmp";
					ImageIO.write(bi, "BMP", new File(caminho3));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		BotaoSalvarRetanguloDegrade.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				BotaoJPG.setEnabled(true);
				BotaoGIF.setEnabled(true);
				BotaoBMP.setEnabled(true);
				BotaoPNG.setEnabled(true);

				try {
					BufferedImage bi = new BufferedImage(Painel1.getWidth(), Painel1.getHeight(),
							BufferedImage.TYPE_INT_RGB);
					GradientPaint gfx = new GradientPaint(DX1, DY1, colorUp, DX2, DY2, colorDown, true);
					g2d.setPaint(gfx);
					g2d.fillRect(450, 200, H, V);

					String caminho = "C:/Users/Amanda/Desktop/teste/teste.jpg";
					ImageIO.write(bi, "JPG", new File(caminho));
					
					String caminho1 = "C:/Users/Amanda/Desktop/teste/teste.png";
					ImageIO.write(bi, "PNG", new File(caminho1));
					
					String caminho2 = "C:/Users/Amanda/Desktop/teste/teste.gif";
					ImageIO.write(bi, "GIF", new File(caminho2));
					
					String caminho3 = "C:/Users/Amanda/Desktop/teste/teste.bmp";
					ImageIO.write(bi, "BMP", new File(caminho3));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		BotaoSalvarCirculo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				BotaoJPG.setEnabled(true);
				BotaoGIF.setEnabled(true);
				BotaoBMP.setEnabled(true);
				BotaoPNG.setEnabled(true);

				try {
					BufferedImage bi = new BufferedImage(Painel1.getWidth(), Painel1.getHeight(),
							BufferedImage.TYPE_INT_RGB);
					Graphics2D g2d = bi.createGraphics();
					g2d.setPaint(CorSelecionada);
					
					g2d.fillOval(270, 130, H, V);

					String caminho = "C:/Users/Amanda/Desktop/teste/teste.jpg";
					ImageIO.write(bi, "JPG", new File(caminho));
					
					String caminho1 = "C:/Users/Amanda/Desktop/teste/teste.png";
					ImageIO.write(bi, "PNG", new File(caminho1));
					
					String caminho2 = "C:/Users/Amanda/Desktop/teste/teste.gif";
					ImageIO.write(bi, "GIF", new File(caminho2));
					
					String caminho3 = "C:/Users/Amanda/Desktop/teste/teste.bmp";
					ImageIO.write(bi, "BMP", new File(caminho3));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		BotaoSalvarCirculoDegrade.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				BotaoJPG.setEnabled(true);
				BotaoGIF.setEnabled(true);
				BotaoBMP.setEnabled(true);
				BotaoPNG.setEnabled(true);
				try {
					BufferedImage bi = new BufferedImage(Painel1.getWidth(), Painel1.getHeight(),
							BufferedImage.TYPE_INT_ARGB);
					GradientPaint gfx = new GradientPaint(DX1, DY1, colorUp, DX2, DY2, colorDown, true);
					g2d.setPaint(gfx);
					g2d.fillOval(270, 130, H, V);

					String caminho = "C:/Users/Amanda/Desktop/teste/teste.gif";
					ImageIO.write(bi, "GIF", new File(caminho));
					
					String caminho1 = "C:/Users/Amanda/Desktop/teste/teste.png";
					ImageIO.write(bi, "PNG", new File(caminho1));
					
					String caminho2 = "C:/Users/Amanda/Desktop/teste/teste.gif";
					ImageIO.write(bi, "GIF", new File(caminho2));
					
					String caminho3 = "C:/Users/Amanda/Desktop/teste/teste.bmp";
					ImageIO.write(bi, "BMP", new File(caminho3));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		BotaoSalvarArco.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				BotaoJPG.setEnabled(true);
				BotaoGIF.setEnabled(true);
				BotaoBMP.setEnabled(true);
				BotaoPNG.setEnabled(true);

				try {
					BufferedImage bi = new BufferedImage(Painel1.getWidth(), Painel1.getHeight(),
							BufferedImage.TYPE_INT_RGB);
					Graphics2D g2d = bi.createGraphics();
					g2d.setPaint(CorSelecionada);
					g2d.fillArc(450, 200, H, V, X, Y);

					String caminho = "C:/Users/Amanda/Desktop/teste/teste.jpg";
					ImageIO.write(bi, "JPG", new File(caminho));
					
					String caminho1 = "C:/Users/Amanda/Desktop/teste/teste.png";
					ImageIO.write(bi, "PNG", new File(caminho1));
					
					String caminho2 = "C:/Users/Amanda/Desktop/teste/teste.gif";
					ImageIO.write(bi, "GIF", new File(caminho2));
					
					String caminho3 = "C:/Users/Amanda/Desktop/teste/teste.bmp";
					ImageIO.write(bi, "BMP", new File(caminho3));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		BotaoSalvarArcoDegrade.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				BotaoJPG.setEnabled(true);
				BotaoGIF.setEnabled(true);
				BotaoBMP.setEnabled(true);
				BotaoPNG.setEnabled(true);
				try {
					BufferedImage bi = new BufferedImage(Painel1.getWidth(), Painel1.getHeight(),
							BufferedImage.TYPE_INT_RGB);
					GradientPaint gfx = new GradientPaint(DX1, DY1, colorUp, DX2, DY2, colorDown, true);
					g2d.setPaint(gfx);
					g2d.fillArc(450, 200, H, V, X, Y);

					String caminho = "C:/Users/Amanda/Desktop/teste/teste.jpg";
					ImageIO.write(bi, "JPG", new File(caminho));
					
					String caminho1 = "C:/Users/Amanda/Desktop/teste/teste.png";
					ImageIO.write(bi, "PNG", new File(caminho1));
					
					String caminho2 = "C:/Users/Amanda/Desktop/teste/teste.gif";
					ImageIO.write(bi, "GIF", new File(caminho2));
					
					String caminho3 = "C:/Users/Amanda/Desktop/teste/teste.bmp";
					ImageIO.write(bi, "BMP", new File(caminho3));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		BotaoSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		BotaoRetangulo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {


				BotaoDegradeRetangulo.setEnabled(true);
				BotaoLimpar.setEnabled(true);
				tfDimensaoHorizontal.setEnabled(true);
				tfDimensaoVertical.setEnabled(true);
				BotaoSalvarRetangulo.setEnabled(true);
				Cores();
				V = Integer.parseInt(tfDimensaoVertical.getText());
				H = Integer.parseInt(tfDimensaoHorizontal.getText());
				Graphics2D g2d = (Graphics2D) Painel1.getGraphics();
				g2d.setPaint(CorSelecionada);
				g2d.fillRect(590, 120, H, V);

			}

			
		});
		BotaoCirculo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BotaoDegradeCirculo.setEnabled(true);
				BotaoLimpar.setEnabled(true);
				tfDimensaoHorizontal.setEnabled(true);
				tfDimensaoVertical.setEnabled(true);
				BotaoSalvarCirculo.setEnabled(true);
				
				Cores();
				V = Integer.parseInt(tfDimensaoVertical.getText());
				H = Integer.parseInt(tfDimensaoHorizontal.getText());
				Graphics2D g2d = (Graphics2D) Painel1.getGraphics();
				g2d.setPaint(CorSelecionada);
				g2d.fillOval(270, 130, H, V);

			}

			
		});
		BotaoArco.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BotaoSalvarArco.setEnabled(true);
				BotaoDegradeArco.setEnabled(true);
				BotaoLimpar.setEnabled(true);
				tfAnguloX.setEnabled(true);
				tfAnguloY.setEnabled(true);
				tfDimensaoHorizontal.setEnabled(true);
				tfDimensaoVertical.setEnabled(true);
				

				V = Integer.parseInt(tfDimensaoVertical.getText());
				H = Integer.parseInt(tfDimensaoHorizontal.getText());
				X = Integer.parseInt(tfAnguloX.getText());
				Y = Integer.parseInt(tfAnguloY.getText());
				Graphics2D g2d = (Graphics2D) Painel1.getGraphics();
				Cores();
				g2d.setPaint(CorSelecionada);
				g2d.fillArc(120, 130, H, V, X, Y);

			}
		});
		BotaoDegradeRetangulo.addActionListener(new ActionListener() {

			private Color colorUp;
			private Color colorDown;

			public void actionPerformed(ActionEvent e) {
				tfDegradeX1.setEnabled(true);
				tfDegradeX2.setEnabled(true);
				tfDegradeY1.setEnabled(true);
				tfDegradeY2.setEnabled(true);
				BotaoLimpar.setEnabled(true);
				tfDimensaoHorizontal.setEnabled(true);
				tfDimensaoVertical.setEnabled(true);
				BotaoSalvarRetanguloDegrade.setEnabled(true);

				H = Integer.parseInt(tfDimensaoHorizontal.getText());
				V = Integer.parseInt(tfDimensaoVertical.getText());

				Graphics2D g2d = (Graphics2D) Painel1.getGraphics();

				Painel1.add(DegradeX1).setBounds(480, 100, 200, 70);
				Painel1.add(tfDegradeX1).setBounds(565, 120, 70, 30);
				Painel1.add(DegradeX2).setBounds(480, 140, 200, 70);
				Painel1.add(tfDegradeX2).setBounds(565, 160, 70, 30);

				Painel1.add(DegradeY1).setBounds(670, 100, 200, 70);
				Painel1.add(tfDegradeY1).setBounds(750, 120, 70, 30);
				Painel1.add(DegradeY2).setBounds(670, 140, 200, 70);
				Painel1.add(tfDegradeY2).setBounds(750, 160, 70, 30);

				DX1 = Integer.parseInt(tfDegradeX1.getText());
				DX2 = Integer.parseInt(tfDegradeX2.getText());
				DY1 = Integer.parseInt(tfDegradeY1.getText());
				DY2 = Integer.parseInt(tfDegradeY2.getText());

				if (colorUp != null) {

					colorUp = CorSelecionadaDegrade1;
				} else {
					colorUp = new Color(0, 0, 0);
				}

				if (colorDown != null) {

					colorDown = CorSelecionadaDegrade2;

				} else {
					colorDown = new Color(0, 0, 0);
				}
				GradientPaint gfx = new GradientPaint(DX1, DY1, colorUp, DX2, DY2, colorDown, true);
				g2d.setPaint(gfx);
				g2d.fillRect(300, 300, H, V);
			}
		});
		BotaoDegradeCirculo.addActionListener(new ActionListener() {

			private Color colorUp;
			private Color colorDown;

			
			public void actionPerformed(ActionEvent e) {
				BotaoSalvarCirculoDegrade.setEnabled(true);
				tfDegradeX1.setEnabled(true);
				tfDegradeX2.setEnabled(true);
				tfDegradeY1.setEnabled(true);
				tfDegradeY2.setEnabled(true);
				BotaoLimpar.setEnabled(true);
				tfDimensaoHorizontal.setEnabled(true);
				tfDimensaoVertical.setEnabled(true);

				H = Integer.parseInt(tfDimensaoHorizontal.getText());
				V = Integer.parseInt(tfDimensaoVertical.getText());

				Graphics2D g2d = (Graphics2D) Painel1.getGraphics();

				Painel1.add(DegradeX1).setBounds(480, 100, 200, 70);
				Painel1.add(tfDegradeX1).setBounds(565, 120, 70, 30);
				Painel1.add(DegradeX2).setBounds(480, 140, 200, 70);
				Painel1.add(tfDegradeX2).setBounds(565, 160, 70, 30);

				Painel1.add(DegradeY1).setBounds(670, 100, 200, 70);
				Painel1.add(tfDegradeY1).setBounds(750, 120, 70, 30);
				Painel1.add(DegradeY2).setBounds(670, 140, 200, 70);
				Painel1.add(tfDegradeY2).setBounds(750, 160, 70, 30);

				DX1 = Integer.parseInt(tfDegradeX1.getText());
				DX2 = Integer.parseInt(tfDegradeX2.getText());
				DY1 = Integer.parseInt(tfDegradeY1.getText());
				DY2 = Integer.parseInt(tfDegradeY2.getText());

				if (colorUp != null) {

					colorUp = CorSelecionadaDegrade1;
				} else {
					colorUp = new Color(0, 0, 0);
				}

				if (colorDown != null) {

					colorDown = CorSelecionadaDegrade2;

				} else {
					colorDown = new Color(0, 0, 0);
				}
				GradientPaint gfx = new GradientPaint(DX1, DY1, colorUp, DX2, DY2, colorDown, true);
				g2d.setPaint(gfx);
				g2d.fillOval(270, 130, H, V);

			}

		});
		BotaoDegradeArco.addActionListener(new ActionListener() {

			private Color colorUp;
			private Color colorDown;

			
			public void actionPerformed(ActionEvent e) {
				BotaoSalvarArcoDegrade.setEnabled(true);
				tfDegradeX1.setEnabled(true);
				tfDegradeX2.setEnabled(true);
				tfDegradeY1.setEnabled(true);
				tfDegradeY2.setEnabled(true);
				BotaoLimpar.setEnabled(true);
				tfDimensaoHorizontal.setEnabled(true);
				tfDimensaoVertical.setEnabled(true);
				

				H = Integer.parseInt(tfDimensaoHorizontal.getText());
				V = Integer.parseInt(tfDimensaoVertical.getText());

				Graphics2D g2d = (Graphics2D) Painel1.getGraphics();

				Painel1.add(DegradeX1).setBounds(480, 100, 200, 70);
				Painel1.add(tfDegradeX1).setBounds(565, 120, 70, 30);
				Painel1.add(DegradeX2).setBounds(480, 140, 200, 70);
				Painel1.add(tfDegradeX2).setBounds(565, 160, 70, 30);

				Painel1.add(DegradeY1).setBounds(670, 100, 200, 70);
				Painel1.add(tfDegradeY1).setBounds(750, 120, 70, 30);
				Painel1.add(DegradeY2).setBounds(670, 140, 200, 70);
				Painel1.add(tfDegradeY2).setBounds(750, 160, 70, 30);

				DX1 = Integer.parseInt(tfDegradeX1.getText());
				DX2 = Integer.parseInt(tfDegradeX2.getText());
				DY1 = Integer.parseInt(tfDegradeY1.getText());
				DY2 = Integer.parseInt(tfDegradeY2.getText());

				if (colorUp != null) {

					colorUp = CorSelecionadaDegrade1;
				} else {
					colorUp = new Color(0, 0, 0);
				}

				if (colorDown != null) {

					colorDown = CorSelecionadaDegrade2;

				} else {
					colorDown = new Color(0, 0, 0);
				}
				GradientPaint gfx = new GradientPaint(DX1, DY1, colorUp, DX2, DY2, colorDown, true);
				g2d.setPaint(gfx);
				g2d.fillArc(120, 130, H, V, X, Y);
			}

		});
	}

	public static void Cores() {
		BotaoCor1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor1;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor1;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor1;
				}

			}
		});
		BotaoCor2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor2;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor2;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor2;
				}

			}
		});
		BotaoCor3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor3;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor3;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor3;
				}

			}
		});
		BotaoCor4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor4;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor4;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor4;
				}

			}
		});
		BotaoCor5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor5;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor5;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor5;
				}

			}
		});
		BotaoCor6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor6;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor6;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor6;
				}

			}
		});
		BotaoCor7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor7;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor7;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor7;
				}

			}
		});
		BotaoCor8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor8;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor8;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor8;
				}

			}
		});
		BotaoCor9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor9;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor9;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor9;
				}

			}
		});

		BotaoCor10.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor10;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor10;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor10;
				}

			}
		});
		BotaoCor11.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor11;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor11;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor11;
				}

			}
		});
		BotaoCor12.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor12;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor12;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor12;
				}

			}
		});
		BotaoCor13.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor13;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor13;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor13;
				}

			}
		});
		BotaoCor14.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor14;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor14;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor14;
				}

			}
		});
		BotaoCor15.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor15;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor15;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor15;
				}

			}
		});
		BotaoCor16.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CorSelecionada = Cor16;
				if (CorSelecionadaDegrade1 == null) {
					CorSelecionadaDegrade1 = Cor16;
				} else if (CorSelecionadaDegrade2 == null) {
					CorSelecionadaDegrade2 = Cor16;
				}

			}
		});

		BotaoLimpar.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {

				Painel1.repaint();
			}

		});
	}

	public static void main(String[] args) {
		TelaPrincipal();
	}
}
