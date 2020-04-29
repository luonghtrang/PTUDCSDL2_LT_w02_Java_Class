/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap02;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Baitap02 {

    /**
     * @param args the command line arguments
     */
    
    public static void OutArr(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++){
            System.out.print("dòng "+i+": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    public static int[][] TangTheoTungDong(int[][] arr, int d, int c)
    {
        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++) {
                for(int e = j+1; e < c; e++){
                    if(arr[i][j] > arr[i][e]){
                        int temp = arr[i][e];
                        arr[i][e] = arr[i][j];
                        arr[i][j] = temp;  
                    }
                }
            }
        }
        return arr;
    }
    
    public static int[][] GiamDanTheoTungCot(int[][] arr, int d, int c)
    {
        for (int i = 0; i < c; i++){
            for (int j = 0; j < d; j++) {
                for(int e = i+1; e < c; e++){
                    if(arr[i][j] < arr[e][j]){
                        int temp = arr[e][j];
                        arr[e][j] = arr[i][j];
                        arr[i][j] = temp;  
                    }
                }
            }
        }
        return arr;
    }
    
    public static int Sum(int[][] arr, int d, int c){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    
    public static int Mul(int[][] arr, int d, int c){
        int sum = 1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                sum *= arr[i][j];
            }
        }
        return sum;
    }
    
    public static int SoNguyenLonNhat(int[][] arr, int d, int c){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j])
                    max = arr[i][j];
            }
        }
        return max;
    }
    
    public static int SoNguyenDuongLonNhat(int[][] arr, int d, int c){
        int max = -1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>0){
                    if(max < arr[i][j]){
                        max = arr[i][j];
                    }
                }  
            }      
        }
        if(max == -1)
            return -1;
        else
            return max;
    }
    
    public static int SoNguyenAmLonNhat(int[][] arr, int d, int c){
        int max = 1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<0){
                    if(max > arr[i][j]){
                        max = arr[i][j];
                    }
                }  
            }      
        }
        if(max == 1)
            return 1;
        else
            return max;
    }
    
    public static int TimDongCoTongLonNhat(int[][] arr, int d, int c){
        int maxSum = arr[0][0];
        int sum = arr[0][0];
        int index = 0;
        for(int i = 0; i<d;i++){
            for(int j=0;j<c;j++){
                sum += arr[i][j];
            }
            if(maxSum < sum){
                maxSum = sum;
                index = i;
            }
                
        }
        return index;
    }
    
    public static int TimCotCoTongLonNhat(int[][] arr, int d, int c){
        int maxSum = 0;
        int index = 0;
        
        for (int i = 0; i < c; i++){
            int sum = 0;
            for (int j = 0; j < d; j++) {
                sum += arr[j][i];
            }
            
            if(maxSum < sum){
                maxSum = sum;
                index = i;
            }
        }
        return index;
    }
    
    public static int[][] ThemMotDongVaoDauDong(int[][] arr, int d, int c){
        int[][] tempArr = new int[d+1][c];
        Scanner scan = new Scanner(System.in);
        int y = 0;
        for(int i = 0; i<d+1; i++){
            if(i == 0){
                System.out.println("Nhập các phần tử trong hàng muốn thêm vào: ");
                for(int j = 0; j<c; j++){
                    System.out.print("a["+i+"]["+j+"]: ");
                    tempArr[i][j] = Integer.parseInt(scan.nextLine());
                }
            }
            else{
                y = i - 1;
                for(int j = 0; j<c; j++){
                    tempArr[i][j] = arr[y][j];
                }
            }    
        }
        return tempArr;
    }
    
    
    public static int[][] ThemMotDongVaoCuoiDong(int[][] arr, int d, int c){
        int[][] tempArr = new int[d+1][c];
        Scanner scan = new Scanner(System.in);
        int y = 0;
        for(int i = 0; i<d+1; i++){
            if(i<d){
                for(int j = 0; j<c; j++){
                    tempArr[i][j] = arr[i][j];
                }
            }
            else if(i == d){
                System.out.println("Nhập các phần tử trong hàng muốn thêm vào: ");
                for(int j = 0; j<c; j++){
                    System.out.print("a["+i+"]["+j+"]: ");
                    tempArr[i][j] = Integer.parseInt(scan.nextLine());
                }
            }
 
        }
        return tempArr;
    }
    
    public static int[][] ThemMotDongVaoDongThuK(int[][] arr, int d, int c, int k){
        int[][] tempArr = new int[d+1][c];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<d+1; i++){
            if(i<k){
                for(int j = 0; j<c; j++){
                    tempArr[i][j] = arr[i][j];
                }
            }
            else if(i == k){
                System.out.println("Nhập các phần tử trong hàng muốn thêm vào: ");
                for(int j = 0; j<c; j++){
                    System.out.print("a["+i+"]["+j+"]: ");
                    tempArr[i][j] = Integer.parseInt(scan.nextLine());
                }
            }
            else{
                for(int j = 0; j<c; j++){
                    tempArr[i][j] = arr[i-1][j];
                }
            }
 
        }
        return tempArr;
    }
    
    public static int[][] XoaDongThuK(int[][] arr, int d, int c, int k){
        int[][] tempArr = new int[d-1][c];
        
        for(int i = 0; i<d-1; i++){
            for(int j = 0; j<c; j++){
                if(i<k){
                    tempArr[i][j] = arr[i][j];
                }
                else{
                    tempArr[i][j] = arr[i+1][j];
                }
            }
        }   
        return tempArr;
    }
    
    public static int[][] XoaCotThuK(int[][] arr, int d, int c, int k){
        int[][] tempArr = new int[d][c-1];
        
        for(int i = 0; i<d; i++){
            for(int j = 0; j<c-1; j++){
                if(j<k){
                    tempArr[i][j] = arr[i][j];
                }
                else{
                    tempArr[i][j] = arr[i][j+1];
                }
            }
        }   
        return tempArr;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int[][] arr;
        System.out.print("Nhap so dong: ");
        int dong = Integer.parseInt(scan.nextLine());
        System.out.print("Nhap so cột: ");
        int cot = Integer.parseInt(scan.nextLine());
        arr = new int[dong][cot];
        
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
            System.out.print("a["+i+"]["+j+"]: ");
            arr[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        
        System.out.println("Mảng vừa nhập: ");
        OutArr(arr);
        
        //Tăng dần theo từng dòng
        /*System.out.println("Mảng Tăng dần theo từng dòng: ");
        arr = TangTheoTungDong(arr, dong, cot);
        OutArr(arr);
        
        //Giảm dần theo từng cột
        System.out.println("Mảng giảm dần theo từng cột: ");
        arr = GiamDanTheoTungCot(arr, dong, cot);
        OutArr(arr);
        
        //Tổng các phần tử trong mảng 2 chiều
        int s = Sum(arr, dong, cot);
        System.out.println("Tổng các phần tử là: "+s);
        
        //Tích các phần tử trong mảng 2 chiều
        int m = Mul(arr, dong, cot);
        System.out.println("Tích các phần tử là: "+m);
        
        //Tìm số nguyên lớn nhất
        int maxNum = SoNguyenLonNhat(arr, dong, cot);
        System.out.println("Số nguyên lớn nhất trong mảng là: "+maxNum);
        
        //Tìm dòng có tổng lớn nhất
        int RowMaxSum = TimDongCoTongLonNhat(arr, dong, cot);
        System.out.println("Dòng có tổng lớn nhất: "+RowMaxSum);
        
        //Tìm cột có tổng lớn nhất
        int CowMaxSum = TimCotCoTongLonNhat(arr, dong, cot);
        System.out.println("Cột có tổng lớn nhất: "+CowMaxSum);
        
        //Thêm 1 dòng vào đầu dòng
        arr = ThemMotDongVaoDauDong(arr, dong, cot);
        System.out.println("Mảng sau khi đã thêm 1 dòng ở đầu dòng: ");
        OutArr(arr);
        
        //Thêm 1 dòng vào cuối dòng
        arr = ThemMotDongVaoCuoiDong(arr, dong, cot);
        System.out.println("Mảng sau khi đã thêm 1 dòng ở cuối dòng: ");
        OutArr(arr);
        
        //Thêm 1 dòng vào dòng thứ K
        System.out.print("Nhap vị trí dòng bạn muốn chèn vào (0-"+(arr.length - 1)+"): ");
        int k;
        k = Integer.parseInt(scan.nextLine());
        arr = ThemMotDongVaoDongThuK(arr, dong, cot, k);
        System.out.println("Mảng sau khi đã thêm 1 dòng ở cuối dòng: ");
        OutArr(arr);
        
        //Xóa dòng thứ k
        System.out.print("Nhap vị trí dòng bạn muốn xóa (0-"+(arr.length - 1)+"): ");
        int kk;
        kk = Integer.parseInt(scan.nextLine());
        arr = XoaDongThuK(arr, dong, cot, kk);
        System.out.println("Mảng sau khi đã xóa tại dòng thứ "+kk+": ");
        OutArr(arr);*/
        
        //Xóa cột thứ k
        System.out.print("Nhap vị trí cột bạn muốn xóa (0-"+(cot - 1)+"): ");
        int kkk;
        kkk = Integer.parseInt(scan.nextLine());
        arr = XoaCotThuK(arr, dong, cot, kkk);
        System.out.println("Mảng sau khi đã xóa tại cột thứ "+kkk+": ");
        OutArr(arr);
       
    }
    
}
