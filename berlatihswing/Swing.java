
package berlatihswing;

import javax.swing.*;


public class Swing extends JFrame{
    
 
    JLabel nama,tempat,judul,mapel,gender,alamat,telp;
    JCheckBox pilihan;
    JTextField isiNama,isiTempat,isiTelp;
    JButton submit;
    JRadioButton laki, perempuan;
    JTextArea isiAlamat;
    JComboBox jenjang; 
    
    
    void tampilan (){
        
        judul = new JLabel ("Bimbingan Belajar Neutrin");
        nama = new JLabel("Nama Lengkap");
        isiNama = new JTextField ();
        gender = new JLabel ("Jenis Kelamin");
        tempat = new JLabel ("Asal Sekolah");
        isiTempat = new JTextField();
        alamat = new JLabel ("Alamat");
        isiAlamat = new JTextArea();
        mapel = new JLabel ("Pilihan Mata Pelajaran");
        pilihan = new JCheckBox();
        isiTelp = new JTextField ();
        telp = new JLabel("Nomor Telepon");
        submit = new JButton("Simpan");
        
        
        
        setLayout (null);
        add(judul);
        add(nama);
        add(isiNama);
        add(tempat);
        add(isiTempat);
        add(mapel);
        add(alamat);
        add(isiAlamat);
        add(gender);
        add(telp);
        add(isiTelp);
        add (submit);
           
       jenjang= new JComboBox ();
       jenjang.addItem("SD");
       jenjang.addItem("SMP");
       jenjang.addItem("SMA");
        
        JRadioButton gender1 = new JRadioButton ("Laki-Laki");
        JRadioButton gender2 = new JRadioButton ("Perempuan");
        add(gender1);
        add(gender2);
        
        add(jenjang);
        
        JCheckBox item1= new JCheckBox ("Matematika");
        JCheckBox  item2 = new JCheckBox ("Fisika");
        JCheckBox  item3 = new JCheckBox ("Kimia");
        JCheckBox  item4 = new JCheckBox ("Bahasa Indonesia");
        JCheckBox  item5 = new JCheckBox ("Bahasa Inggris");
        JCheckBox  item6 = new JCheckBox ("Biologi");
        
        add(item1);
        add(item2);
        add(item3);
        add(item4);
        add(item5);
        add(item6);
       
         
        judul.setBounds(230, 20, 200, 20);
        nama.setBounds(100, 80, 150, 20);
        isiNama.setBounds(240, 80, 200, 25);
        tempat.setBounds(100, 120, 150, 20);
        isiTempat.setBounds(240, 120, 200, 25);
        jenjang.setBounds(500,120,100,25);
        gender.setBounds(100,162,200,20);
        gender1.setBounds(240,162,80,25);
        gender2.setBounds(360,162,200,25);
        mapel.setBounds(100, 190, 150, 20);
        item1.setBounds(100,190,150,20);
        item1.setBounds(100,220,150,20);
        item2.setBounds(100,250,150,20);
        item3.setBounds(100,280,150,20);
        item4.setBounds(100,310,150,20);
        item5.setBounds(100,340,150,20);
        item6.setBounds(100,370,150,20);
        telp.setBounds(100,400,150,20);
        isiTelp.setBounds (240,400,200,25);
        alamat.setBounds (100,420,150,25);
        isiAlamat.setBounds(100,450,400,100);
       
        
        
       submit.setBounds(400, 600, 80, 30);
        
        
        
        setSize(700,800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

 

   
    
}
