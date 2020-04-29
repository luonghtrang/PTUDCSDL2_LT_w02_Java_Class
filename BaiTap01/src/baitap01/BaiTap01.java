/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class BaiTap01 {

    /**
     * @param args the command line arguments
     */
    
    public static void HoanVi(int a, int b)
    {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    
    public static void OutArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void SortMinToMax(int[] arr)
    {
        int temp = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    //HoanVi(arr[i], arr[j]);
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void SortMaxToMin(int[] arr)
    {
        int temp = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    //HoanVi(arr[i], arr[j]);
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    
    public static int sum(int[] arr)
    {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }   
        return s;
    }
    
    public static int mul(int[] arr)
    {
        int m = 1;
        for (int i = 0; i < arr.length; i++) {
            m = m * arr[i];
        }   
        return m;
    }

    public static int max(int[] arr)
    {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int MaxSoNguyenDuong(int[] arr)
    {
        int max = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>0){
                if(max < arr[i]){
                    max = arr[i];
                }
            }
        }
        if(max == -1)
            return -1;
        else
            return max;
    }
    
    public static int MaxSoNguyenAm(int[] arr)
    {
        int max = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<0){
                if(max > arr[i]){
                    max = arr[i];
                }
            }
        }
        if(max == 1)
            return 1;
        else
            return max;
    }
    
    public static int [] insertArrHead(int [] arr, int k) {
        int tempIndex = arr.length;
        int [] tempArr = new int [tempIndex + 1];
         
        for(int i = 0; i < arr.length +1; i++){
            if(i == 0){
               tempArr[0] = k;
            }
            else if(i>0){
                tempArr[i] = arr[i-1];
            }
        }
        
        arr = tempArr;
        return arr;
//        return tempArr;
    }
    
    public static int[] insertArrEnd(int[] arr, int x){
        int tempIndex = arr.length;
        int [] tempArr = new int [tempIndex + 1];
        
        for(int i = 0; i <= arr.length; i++){
            if(i<arr.length){
                tempArr[i] = arr[i];
            }
            else
                tempArr[i] = x;
        }
//        return tempArr;
        arr = tempArr;
        return arr;
    }
    
    public static int[] insertArrAtK(int[] arr, int x, int k){
        int tempIndex = arr.length;
        int [] tempArr = new int [tempIndex + 1];
        
        for(int i = 0; i <= arr.length; i++){
            if(i<k){
                tempArr[i] = arr[i];
            }
            else if(i==k){
                tempArr[i] = x;
            }
            else{
                tempArr[i] = arr[i-1];
            }
        }
        
//        return tempArr;
        arr = tempArr;
        return arr;
    }
    
    public static int[] DeleteArrAtK(int[] arr, int k){
        int tempIndex = arr.length;
        int [] tempArr = new int [tempIndex - 1];

        for(int i = 0; i < arr.length; i++){
            if(i<k){
                tempArr[i] = arr[i];
            }
            else if(i==k){
                tempArr[i] = arr[i+1];
                i++;
            }
            else{
                tempArr[i-1] = arr[i];
            }
        }
        
        return tempArr;
    }
        
    public static int[] DeleteValueX(int[] arr, int x)
    {
        int dem = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x)
                dem++;
        }
        
        for(int i = 0; i<arr.length - 1; i++){
            for(int j = 0; j<arr.length - 1;j++){
                if(arr[j] == x){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        int tempIndex = arr.length - dem;
        int [] tempArr = new int [tempIndex];
        for(int i = 0; i<arr.length - dem;i++){
            tempArr[i] = arr[i];
        }
        
        return tempArr;
    }
    
    public static int[] UpdateArrAtK(int[] arr, int x, int k){
        for(int i = 0; i < arr.length; i++){
            if(i==k){
                arr[i] = x;
            }
        }

        return arr;
    }
    
    public static int[] Update_X_to_Y(int[] arr, int x, int y){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==x){
                arr[i] = y;
            }
        }

        return arr;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        int[] arr_int;
        
        int size;
        System.out.print("Nhap so phan tu trong mang: ");
        Scanner scan = new Scanner(System.in);
        size = Integer.parseInt(scan.nextLine());
        arr_int = new int[size];
        
        for (int i = 0; i < arr_int.length; i++) {
            System.out.print("a["+i+"]: ");
            arr_int[i] = Integer.parseInt(scan.nextLine());
        }
        
        System.out.println("Só phàn tử của mảng " + arr_int.length);
        OutArr(arr_int);
    
        System.out.println("Sap xep mang tang dan: ");
        SortMinToMax(arr_int);
        OutArr(arr_int);

        System.out.println("Sap xep mang giam dan: ");
        SortMaxToMin(arr_int);
        OutArr(arr_int);
        
        int sum = sum(arr_int);
        System.out.println("Tong cac phan tu trong mang: " + sum);
        
        int mul = mul(arr_int);
        System.out.println("Tich cac phan tu trong mang: " + mul);
        
        int maxNum = max(arr_int);
        System.out.println("So nguyen lon nhat trong mang: " + maxNum);
        
        int MaxSoNguyenDuong = MaxSoNguyenDuong(arr_int);
        if(MaxSoNguyenDuong == -1)
            System.out.println("Khong co so nguyen duong trong mang!");
        else
            System.out.println("So nguyen duong lon nhat trong mang la: " + MaxSoNguyenDuong);
        
        
        int MaxSoNguyenAm = MaxSoNguyenAm(arr_int);
        if(MaxSoNguyenAm == 1)
            System.out.println("Khong co so nguyen am trong mang!");
        else
            System.out.println("So nguyen am lon nhat trong mang la: " + MaxSoNguyenAm);
        
        
        System.out.print("Nhap phan tu can them vao dau mang: ");
        int x;
        x = Integer.parseInt(scan.nextLine());
        
        System.out.println("Mang sau khi da them phan tu " +x+ " ở đầu:");
        arr_int = insertArrHead(arr_int, x);
        OutArr(arr_int);
        
        System.out.print("Nhap phan tu can them vao cuoi mang: ");
        int y;
        y = Integer.parseInt(scan.nextLine());
        
        System.out.println("Mang sau khi da them phan tu " +x+ "ở cuối:");
        arr_int = insertArrEnd(arr_int, y);
        OutArr(arr_int);
        
        
        System.out.print("Nhap vị trí trong mảng muốn chèn vào (0-n): ");
        int k;
        k = Integer.parseInt(scan.nextLine());
        System.out.print("Nhap phan tu can them vao: ");
        int xx;
        xx = Integer.parseInt(scan.nextLine());
        
        System.out.println("Mang sau khi da them phan tu " +xx+ " vào vị trí "+k+":");
        arr_int = insertArrAtK(arr_int, xx, k);
        OutArr(arr_int);
        
        int a = arr_int.length-1;
        System.out.print("Nhap vị trí trong mảng muốn xóa [0-"+a+"]: ");
        int kk;
        kk = Integer.parseInt(scan.nextLine());
        
        System.out.println("Mang sau khi da xóa phan tu tại vị trí "+kk+":");
        arr_int = DeleteArrAtK(arr_int, k);
        OutArr(arr_int);
        
        System.out.print("Nhap phần tử muốn xóa trong mảng: ");
        int q;
        q = Integer.parseInt(scan.nextLine());
        System.out.println("Mang sau khi da xóa phan tu "+q+" là:");
        arr_int = DeleteValueX(arr_int, q);
        OutArr(arr_int);
        
        System.out.print("Nhap vị trí trong mảng muốn update phần tử (0-n): ");
        int kkk;
        kkk = Integer.parseInt(scan.nextLine());
        System.out.print("Nhap phan tu thay thế: ");
        int xxx;
        xxx = Integer.parseInt(scan.nextLine());
        
        System.out.println("Mang sau khi da update them phan tu " +xxx+ " vào vị trí "+kkk+":");
        arr_int = UpdateArrAtK(arr_int, xxx, kkk);
        OutArr(arr_int);

        System.out.print("Nhap y: ");
        int yyy;
        yyy = Integer.parseInt(scan.nextLine());
        System.out.print("Nhap phan tu muốn thay thế thành "+yyy+": ");
        int xxxx;
        xxxx = Integer.parseInt(scan.nextLine());
        
        System.out.println("Mang sau khi da update them phan tu " +xxxx+ " vào vị trí "+yyy+":");
        arr_int = Update_X_to_Y(arr_int, xxxx, yyy);
        OutArr(arr_int);
        
    }
    
}
