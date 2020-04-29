/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap04;

/**
 *
 * @author OS
 */
public class BaiTap04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Phân số a:");
        PhanSo ps1 = new PhanSo();
        ps1.NhapPS();
        ps1.XuatPS();
        
        System.out.println("Phân số b:");
        PhanSo ps2 = new PhanSo();
        ps2.NhapPS();
        ps2.XuatPS();
        
        //Cộng 2 phân số
        System.out.print("Tổng 2 phân số: ");
        PhanSo cong = ps1.CongPhanSo(ps2);
        cong.XuatPS();
        
        //Trừ 2 phân số
        System.out.print("Hiệu 2 phân số: ");
        PhanSo tru = ps1.TruPhanSo(ps2);
        tru.XuatPS();
        
        //Nhan 2 phân số
        System.out.print("Tích 2 phân số: ");
        PhanSo nhan = ps1.NhanPhanSo(ps2);
        nhan.XuatPS();
        
        
        //Chia 2 phân số
        System.out.print("Chia 2 phân số: ");
        PhanSo chia = ps1.TruPhanSo(ps2);
        chia.XuatPS();
        
        
    }
    
}
