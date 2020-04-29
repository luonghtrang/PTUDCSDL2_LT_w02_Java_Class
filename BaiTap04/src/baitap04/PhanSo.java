/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap04;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class PhanSo {
    //Khai báo các thuộc tính
    private int tuSo;
    private int mauSo;
    
    //Phương thức khởi tạo mặc định
    public PhanSo(){
        this.tuSo = 1;
        this.mauSo = 1;
    }
    
    //Phương thức khởi tạo đầy đủ tham số
    public PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    //Phuong thức khơi tao sao chep
     public PhanSo(PhanSo ps){
        this.tuSo = ps.tuSo;
        this.mauSo = ps.mauSo;
     }
     
    public void setTuSo(int tuSo)
    {
        this.tuSo=tuSo;
    }
    public void setMauSo(int mauSo)
    {
        if (mauSo != 0) {
            this.mauSo = mauSo;
        }
    }
    public int getTuSo()
    {
        return this.tuSo;
    }
    public int getMauSo()
    {
        return this.mauSo;
    }
    
    
     //Nhập phân số
    public void NhapPS(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập tử só: ");
        this.tuSo = Integer.parseInt(scan.nextLine());
        System.out.print("Nhập mãu só: ");
        this.mauSo = Integer.parseInt(scan.nextLine());
        while(this.mauSo == 0){
            System.out.print("Mời nhập lại mãu só khác 0:");
            this.mauSo = Integer.parseInt(scan.nextLine());
        }
    }
    
    public void XuatPS(){
        String str = String.format("%d/%d",this.tuSo, this.mauSo);
        System.out.println(str);
    }
    
    public int USCLN(int a, int b)
    {
        while(a!=b)
        {
         if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
    public void rutGon()
    {
        int i=USCLN(this.getTuSo(),this.getMauSo());
        this.setTuSo(this.getTuSo()/i);
        this.setMauSo(this.getMauSo()/i);
    }
    
    public PhanSo CongPhanSo(PhanSo b){
        PhanSo c = new PhanSo();
        c.tuSo = (this.tuSo * b.mauSo) + (b.tuSo * this.mauSo);
        c.mauSo = this.mauSo * b.mauSo;
        return c;
    }
        
    public PhanSo TruPhanSo(PhanSo ps){
        PhanSo c = new PhanSo();
        c.tuSo = (this.tuSo * ps.mauSo) - (ps.tuSo * this.mauSo);
        c.mauSo = this.mauSo * ps.mauSo;
        return c;
    }
    
    public PhanSo NhanPhanSo(PhanSo ps){
        PhanSo c = new PhanSo();
        c.tuSo = this.tuSo * ps.tuSo;
        c.mauSo = this.mauSo * ps.mauSo;
        return c;
    }
    
    public PhanSo ChiaPhanSo(PhanSo ps){
        PhanSo c = new PhanSo();
        c.tuSo = this.tuSo * ps.mauSo;
        c.mauSo = this.mauSo * ps.tuSo;
        return c;
    }
    
    
    
}
