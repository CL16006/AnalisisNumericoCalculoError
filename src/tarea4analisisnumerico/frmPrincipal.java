/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4analisisnumerico;

import javax.swing.JOptionPane;

/**
 *
 * @author fatycalderon
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }
    public void limpiar(){
        txtX0.setText("");
        txtX1.setText("");
        txtX2.setText("");
        txtX3.setText("");
        txtX4.setText("");
        txtY0.setText("");
        txtY1.setText("");
        txtY2.setText("");
        txtY3.setText("");
        txtY4.setText("");
        txtArea.setText("");
        txtError.setText("");

    }
    
    public void Lagrange(){
         // txtArea.setText("");
    float a,b,c,d,e;
    float yo,y1,y2,y3,y4;
    float co,c1,c2,c3,c4;
    float d0,d1,d2,d3,d4;
    
    a=Float.parseFloat(txtX0.getText());
    b=Float.parseFloat(txtX1.getText());
    c=Float.parseFloat(txtX2.getText());
    d=Float.parseFloat(txtX3.getText());
    e=Float.parseFloat(txtX4.getText());
    yo=Float.parseFloat(txtY0.getText());
    y1=Float.parseFloat(txtY1.getText());
    y2=Float.parseFloat(txtY2.getText());
    y3=Float.parseFloat(txtY3.getText());
    y4=Float.parseFloat(txtY4.getText());
    
    d0=(a-b)*(a-c)-(a-d)*(a-e);
    d1=(b-a)*(b-c)*(b-d)*(b-e);
    d2=(c-a)*(c-b)*(c-d)*(c-e);
    d3=(d-a)*(d-b)*(d-c)*(d-e);
    d4=(e-a)*(e-b)*(e-c)*(e-d);
    
    c4=(yo/d0)+(y1/d0)+(y2/d0)+(y3/d0)+(y4/d0);
    c3=(yo/d1)*(-c-b-d-e)+(y1/d1)*(-e-d-c-a)+(y2/d1)*(-e-d-b-a)+(y3/d1)*(-e-c-b-a)+(y4/d1)*(-d-c-b-a);
    c2=(yo/d2)*(b*c+c*d+b*d+c*e+b*e+d*e)+(y1/d2)*(d*e+c*e+c*d+a*e+a*d+a*c)+(y2/d2)*(d*e+b*e+b*d+a*e+a*d+a*b)+(y3/d2)*(c*e+b*e+b*c+a*e+a*c+a*b)+(y4/d2)*(c*d+b*d+b*c+a*c+a*b);
    c1=(yo/d3)*(-b*c*d-b*c*e-c*d*e-b*d*e)+(y1/d3)*(-d*e*c-d*e*a-a*c*e-a*c*d)+(y2/d3)*(-b*d*e-a*d*e-a*b*e-a*b*d)+(y3/d3)*(-b*c*e-a*c*e-a*b*e-a*b*c)+(y4/d3)*(-b*c*d-a*c*d-a*b*d-a*b*c);
    co=(yo/d4)*(b*c*d*e)+(y1/d4)*(d*e*a*c)+(y2/d4)*(a*b*d*e)+(y3/d4)*(a*b*c*e)+(y4/d4)*(a*b*c*d);
    
   txtArea.setText("p(x)="+c4+"x⁴+"+c3+"x³+"+c2+"x²+"+c1+"x+"+co);
   // JOptionPane.showMessageDialog(null,"p(x)="+c4+"x⁴+"+c3+"x³+"+c2+"x²+"+c1+"x+"+co );
        
    }
    
    public void diferenciasDivididas(){
          //txtArea.setText("");
   // float a,b,c,d,e,bo;
  //  float yo,y1,y2,y3,y4;
    double co,c1,c2,c3,c4;
    double matriz[][]=new double[5][2];
    double vector[]=new double[5];
   double a,b,c,d,e,yo,y1,y2,y3,y4;
    
    a=Double.parseDouble(txtX0.getText());
    b=Double.parseDouble(txtX1.getText());
    c=Double.parseDouble(txtX2.getText());
    d=Double.parseDouble(txtX3.getText());
    e=Double.parseDouble(txtX4.getText());
    yo=Double.parseDouble(txtY0.getText());
    y1=Double.parseDouble(txtY1.getText());
    y2=Double.parseDouble(txtY2.getText());
    y3=Double.parseDouble(txtY3.getText());
    y4=Double.parseDouble(txtY4.getText());
     double valor=Float.parseFloat(JOptionPane.showInputDialog("ingrese el valor"));
    
    metodoNewton ins =new metodoNewton();
    
        double[] x = { a, b, c, d,e };
		double[] fx = { yo, y1,y2,y3,y4 };
		double[] k = ins.solucionar(x, fx);
		for (int i = 0; i < k.length; i++) {
			txtArea.setText(""+k[i]);
		}
     txtArea.setText("f(" + valor + ") = " + ins.calcularValor(valor, k, x));   
    }
     public void EvaluarLagrange (){
          double a,b,c,d,e;
    double yo,y1,y2,y3,y4;
    double co,c1,c2,c3,c4;
    double d0,d1,d2,d3,d4;
    
    a=Double.parseDouble(txtX0.getText());
    b=Double.parseDouble(txtX1.getText());
    c=Double.parseDouble(txtX2.getText());
    d=Double.parseDouble(txtX3.getText());
    e=Double.parseDouble(txtX4.getText());
    yo=Double.parseDouble(txtY0.getText());
    y1=Double.parseDouble(txtY1.getText());
    y2=Double.parseDouble(txtY2.getText());
    y3=Double.parseDouble(txtY3.getText());
    y4=Double.parseDouble(txtY4.getText());
    
    d0=(a-b)*(a-c)-(a-d)*(a-e);
    d1=(b-a)*(b-c)*(b-d)*(b-e);
    d2=(c-a)*(c-b)*(c-d)*(c-e);
    d3=(d-a)*(d-b)*(d-c)*(d-e);
    d4=(e-a)*(e-b)*(e-c)*(e-d);
    
    c4=(yo/d0)+(y1/d0)+(y2/d0)+(y3/d0)+(y4/d0);
    c3=(yo/d1)*(-c-b-d-e)+(y1/d1)*(-e-d-c-a)+(y2/d1)*(-e-d-b-a)+(y3/d1)*(-e-c-b-a)+(y4/d1)*(-d-c-b-a);
    c2=(yo/d2)*(b*c+c*d+b*d+c*e+b*e+d*e)+(y1/d2)*(d*e+c*e+c*d+a*e+a*d+a*c)+(y2/d2)*(d*e+b*e+b*d+a*e+a*d+a*b)+(y3/d2)*(c*e+b*e+b*c+a*e+a*c+a*b)+(y4/d2)*(c*d+b*d+b*c+a*c+a*b);
    c1=(yo/d3)*(-b*c*d-b*c*e-c*d*e-b*d*e)+(y1/d3)*(-d*e*c-d*e*a-a*c*e-a*c*d)+(y2/d3)*(-b*d*e-a*d*e-a*b*e-a*b*d)+(y3/d3)*(-b*c*e-a*c*e-a*b*e-a*b*c)+(y4/d3)*(-b*c*d-a*c*d-a*b*d-a*b*c);
    co=(yo/d4)*(b*c*d*e)+(y1/d4)*(d*e*a*c)+(y2/d4)*(a*b*d*e)+(y3/d4)*(a*b*c*e)+(y4/d4)*(a*b*c*d);
    
   //txtArea.setText("p(x)="+c4+"x⁴+"+c3+"x³+"+c2+"x²+"+c1+"x+"+co);
    double n=Float.parseFloat(JOptionPane.showInputDialog("ingrese el valor"));
    double valor;
        valor = c4*Math.pow(n, 4)+c3*Math.pow(n, 3)+c2*Math.pow(n,2)+c1*Math.pow(n,1)+co;
    txtArea.setText("f("+n+")= "+valor);
         
     }
    public void Splines(){
        //txtArea.setText("");
        Splines inst=new Splines();
       //System.out.println(Math.E);
        float a,b,c,d,e,bo;
    float yo,y1,y2,y3,y4;
    float co,c1,c2,c3,c4;
   // float matriz[][]=new float[5][2];
   // float vector[]=new float[5];
    a=Float.parseFloat(txtX0.getText());
    b=Float.parseFloat(txtX1.getText());
    c=Float.parseFloat(txtX2.getText());
    d=Float.parseFloat(txtX3.getText());
    e=Float.parseFloat(txtX4.getText());
    yo=Float.parseFloat(txtY0.getText());
    y1=Float.parseFloat(txtY1.getText());
    y2=Float.parseFloat(txtY2.getText());
    y3=Float.parseFloat(txtY3.getText());
    y4=Float.parseFloat(txtY4.getText());
    
		double[] xs = { a, b,c,d,e};
		double[] ys = { yo,y1,y2,y3,y4 };
		double[][] splines = inst.solucionar(xs, ys);
                
        for (double[] spline : splines) {
            for (int ch = 0; ch < splines[0].length; ch++) {
                txtArea.setText(spline[ch] + "| ");
            }
            //System.out.println();
            txtArea.setText("\n---------------------------------------------------------------");
        }
    }
    
    public void CalcularSplines(){
        //txtArea.setText("");
        Splines inst=new Splines();
       //System.out.println(Math.E);
        float a,b,c,d,e,bo;
    float yo,y1,y2,y3,y4;
    float co,c1,c2,c3,c4;
   // float matriz[][]=new float[5][2];
   // float vector[]=new float[5];
    a=Float.parseFloat(txtX0.getText());
    b=Float.parseFloat(txtX1.getText());
    c=Float.parseFloat(txtX2.getText());
    d=Float.parseFloat(txtX3.getText());
    e=Float.parseFloat(txtX4.getText());
    yo=Float.parseFloat(txtY0.getText());
    y1=Float.parseFloat(txtY1.getText());
    y2=Float.parseFloat(txtY2.getText());
    y3=Float.parseFloat(txtY3.getText());
    y4=Float.parseFloat(txtY4.getText());
    
		double[] xs = { a, b,c,d,e};
		double[] ys = { yo,y1,y2,y3,y4 };
		double[][] splines = inst.solucionar(xs, ys);
                
        for (double[] spline : splines) {
            for (int ch = 0; ch < splines[0].length; ch++) {
                txtArea.setText(spline[ch] + "| ");
            }
            //System.out.println();
            txtArea.setText("\n---------------------------------------------------------------");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtX0 = new javax.swing.JTextField();
        txtY0 = new javax.swing.JTextField();
        txtX1 = new javax.swing.JTextField();
        txtY1 = new javax.swing.JTextField();
        txtX2 = new javax.swing.JTextField();
        txtY2 = new javax.swing.JTextField();
        txtX3 = new javax.swing.JTextField();
        txtY3 = new javax.swing.JTextField();
        txtX4 = new javax.swing.JTextField();
        txtY4 = new javax.swing.JTextField();
        cmbOpciones = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnCalcularError = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        txtError = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnCalcularFuncion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Interpolacion Numerica");

        jLabel2.setText("ingrese los datos en la tabla de valores:");

        jLabel3.setText("x");

        jLabel4.setText("y");

        txtX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtX1ActionPerformed(evt);
            }
        });

        cmbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lagrange", "Newton(formula)", "Newton(diferencias divididas)", "Hermite", "trazadores cubicos", " " }));

        jLabel5.setText("<--------- seleccione metodo");

        btnCalcularError.setText("calcular Error");
        btnCalcularError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularErrorActionPerformed(evt);
            }
        });

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtError.setEditable(false);

        btnCalcular.setText("evaluar para un valor");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnCalcularFuncion.setText("calcular funcion");
        btnCalcularFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularFuncionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmbOpciones, javax.swing.GroupLayout.Alignment.LEADING, 0, 201, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtY0, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtX0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtY1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(txtX1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtY2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(txtX2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtY3, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(txtX3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtX4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(txtY4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcularFuncion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnCalcularError, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtX0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtY0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtY3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtY4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularError)
                    .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCalcular)
                    .addComponent(btnCalcularFuncion))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtX1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtX1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
       
        int  a=cmbOpciones.getSelectedIndex();
        switch(a){
            case 0:
                EvaluarLagrange();
                break;
            case 1:
                diferenciasDivididas();
                break;
            case 2:
                diferenciasDivididas();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "metodo no disponible");
                break;
            case 4:
                Splines();
                break;
            default:
                break;
                 
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCalcularErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularErrorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCalcularErrorActionPerformed

    private void btnCalcularFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularFuncionActionPerformed
        // TODO add your handling code here:
         int  a=cmbOpciones.getSelectedIndex();
        switch(a){
            case 0:
                Lagrange();
                break;
            case 1:
                metodoNewton c=new metodoNewton();
                c.Mostrar();
                break;
            case 2:
                // diferenciasDivididas();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "metodo no disponible");
                break;
            case 4:
                CalcularSplines();
                break;
            default:
                break;
                 
        }
    }//GEN-LAST:event_btnCalcularFuncionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcularError;
    private javax.swing.JButton btnCalcularFuncion;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtX0;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtX3;
    private javax.swing.JTextField txtX4;
    private javax.swing.JTextField txtY0;
    private javax.swing.JTextField txtY1;
    private javax.swing.JTextField txtY2;
    private javax.swing.JTextField txtY3;
    private javax.swing.JTextField txtY4;
    // End of variables declaration//GEN-END:variables
}
