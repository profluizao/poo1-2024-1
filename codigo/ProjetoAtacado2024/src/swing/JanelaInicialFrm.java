package swing;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class JanelaInicialFrm extends JFrame{
    
    private JMenuBar menuBar;

    private JMenu arquivoMenu;
    private JMenu editarMenu;
    private JMenu ajudaMenu;

    public JanelaInicialFrm(){
        this.menuBar = new JMenuBar();
        this.setTitle("Atacado 2024 (Swing Version)");
        this.setMinimumSize(new Dimension(800, 600));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void Exibir(){
        this.prepararArquivoMenu();
        this.prepararEditarMenu();
        this.prepararAjudarMenu();
        this.setJMenuBar(this.menuBar);
        this.pack();
        this.setVisible(true);        
    }

    private void prepararArquivoMenu(){
        this.arquivoMenu = new JMenu("Arquivo");

        JMenuItem abrirMenuItem = new JMenuItem("Abrir");
        abrirMenuItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Abrindo arquivo..."));
        arquivoMenu.add(abrirMenuItem);

        JMenuItem sairMenuItem = new JMenuItem("Sair");
        sairMenuItem.addActionListener(e -> System.exit(0));
        arquivoMenu.add(sairMenuItem);

        this.menuBar.add(arquivoMenu);
    }

    private void prepararEditarMenu(){
        this.editarMenu = new JMenu("Editar");

        JMenuItem copiarMenuItem = new JMenuItem("Copiar");
        copiarMenuItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Copiando arquivo..."));
        editarMenu.add(copiarMenuItem);

        JMenuItem colarMenuItem = new JMenuItem("Colar");
        colarMenuItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Colando arquivo..."));
        editarMenu.add(colarMenuItem);

        this.menuBar.add(editarMenu);
    }

    private void prepararAjudarMenu(){
        this.ajudaMenu = new JMenu("Ajuda");
        JMenuItem sobreMenuItem = new JMenuItem("Sobre");
        sobreMenuItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Aplicativo desenvolvido em Java Swing."));
        this.ajudaMenu.add(sobreMenuItem);

        this.menuBar.add(ajudaMenu);
    }

}
