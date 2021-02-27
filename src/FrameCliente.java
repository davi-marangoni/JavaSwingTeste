import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


        public class FrameCliente extends JFrame implements ActionListener {
			private static final long serialVersionUID = 1L;
			private JPanel painel = new JPanel();
            private JLabel lbCPF = new JLabel("CPF do cliente:");
            private JLabel lbNome = new JLabel("Nome do cliente:");
            private JLabel lbNroCartao = new JLabel("Número do cartão:");
            private JTextField txCPF = new JTextField();
            private JTextField txNome = new JTextField();
            private JTextField txNroCartao = new JTextField();
            private JButton btSalvaCliente = new JButton("Salvar Cliente");
            private boolean CartaoValido;

        public FrameCliente() {
            this.painel.setPreferredSize(new Dimension(255, 170));
            this.painel.setLayout(null); this.setResizable(false);
            this.setContentPane(this.painel);
            this.lbCPF.setBounds(5,10,110,15); this.lbNome.setBounds(5,40,110,15);
            this.txCPF.setBounds(115,0,135,30); this.txNome.setBounds(115,30,135,30);
            this.painel.add(this.lbCPF); this.painel.add(this.txCPF); 
            this.painel.add(this.lbNome); this.painel.add(this.txNome);
            this.lbNroCartao.setBounds(5,70,110,15);
            this.txNroCartao.setBounds(115,60,135,30);
            this.painel.add(this.lbNroCartao);
            this.painel.add(this.txNroCartao);
            this.btSalvaCliente.setBounds(5,130,120,30);
            this.painel.add(btSalvaCliente);
            this.btSalvaCliente.addActionListener(this);
         }
        public void actionPerformed(ActionEvent evento) { 
        	
            if (evento.getSource().equals(btSalvaCliente)) {
            	Cliente Cli1 = new Cliente(" ", " ", 0);
            	float cartao = Float.parseFloat(txNroCartao.getText());
            	if(cartao % 3 == 0) {
            		CartaoValido = true;
            	}else {
            		CartaoValido = false;
            	}
            	
            	if(CartaoValido == true) {
            	Cli1.setNome(txNome.getText());
            	Cli1.setCpf(txCPF.getText());
            	Cli1.setCartao(cartao);
            	
            	//Prints para testar valor de dentro do objeto
            	//System.out.println(Cli1.getNome());
            	//System.out.println(Cli1.getCpf());
            	//System.out.println(Cli1.getCartao());
            	
                JOptionPane.showMessageDialog(null,"SUCESSO!");
            	}else {
            		JOptionPane.showMessageDialog(null,"NUMERO DE CARTAO INVALIDO!");
            	}
            }

        }
 }