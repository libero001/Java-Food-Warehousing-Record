import java.util.Scanner;

public class InComing {
    static StringBuffer sb=new StringBuffer();
    static int intNum=0;

    public static void main(String[] args) {
        System.out.println("--------食材入库----------");
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        sb.append("本次入库详情："+"\r\n");
        while(flag)
        {
            System.out.println("请输入入库信息（格式:食材名称-入库数量，如土豆-10）");
            String str=sc.next();
            if(!str.contains("-"))
            {
                System.out.println("格式错误！");
            }
            else
            {

                sb.append(str+"\r\n");
                String[] arr=str.split("-");
                try
                {
                    intNum+=Integer.parseInt(arr[1]);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("数量格式错误！");
                }

             arr=new String[0];

            }
            System.out.println("是否继续入库（是输入Y，否输入N）：");
            String s=sc.next();
            if("N".equals(s.toUpperCase()))
            {
                flag=false;
            }

        }
        System.out.println(sb.toString()+"入库总数量："+intNum);
    }
}
