package Pertemuan_4;

import Pertemuan_4.com.polban.JTK.Sales.Sales;
import Pertemuan_4.com.polban.JTK.Sales.Product;

public class Soal1 {
    public static void main(String[] args) {
        Product Royco = new Product("Royco", 5000, 10);
        Sales penjualan_micin = new Sales(Royco);
        penjualan_micin.updateProductPrice(1000);
        penjualan_micin.sellProduct(5);
        penjualan_micin.restockProduct(10);
        penjualan_micin.updateProductPrice(700000000);
        penjualan_micin.updateProductPrice(-500000000);

        
    }
}