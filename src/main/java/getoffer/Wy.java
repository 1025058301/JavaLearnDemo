package getoffer;

public class Wy {
    public static void main(String[] args){
        String match="(http|ftp)(s)?://(\\w)+(\\.\\w+)+(/[\\w_\\?\\.&=%-]+)+";
        String match2="[\\w_\\?\\.&=%]+";
        String match4="[\\S]*(杀人|鬼|淫|奸)+[\\S]*";
        String s="https://www.baidu.com/s?wd=js%20this.emit&rsv_spt=1&rsv_iqid=0xba65fd050005df13&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=utf-8&rqlang=cn&tn=baiduhome_pg&rsv_enter=1&rsv_dl=tb&oq=js%2520emit%25E6%2596%25B9%25E6%25B3%2595&rsv_btype=t&inputT=3864&rsv_t=8d351%2BvMycGgCnuK%2BBPwsDqBuehLGPbE7vRErzKkKDwHwEAoaKwv5f7RiZnxrTKC%2Bn1S&rsv_pq=95d40b6300057125&rsv_sug3=19&rsv_sug1=7&rsv_sug7=100&rsv_sug2=0&";
        boolean b=s.matches(match);
    }
}

