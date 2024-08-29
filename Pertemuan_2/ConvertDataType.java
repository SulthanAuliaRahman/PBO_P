class ConvertDataType
{
    static short methodOne(long lon)
    {
        int inte = (int) lon;//10=10.25
        return (short)inte; // 10 = 10
    }
    public static void main(String[] args)
    {
        double dou = 10.25;
        float flo = (float) dou; //10.25 = 10.25
        byte byt = (byte) methodOne((long) flo); //10 = 10(long 10)
        System.out.println(byt + " dari Variabel byt");
        System.out.println(dou + " dari Variabel dou");
        System.out.println(flo + " dari Variabel flo");
    }
}