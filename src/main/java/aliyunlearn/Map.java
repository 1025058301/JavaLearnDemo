package aliyunlearn;

class Mem{
    private String name;
    private String number;
    private Role role;
    public Mem(String name,String number){
        this.name=name;
        this.number=number;
    }
    public String getInfo(){
        return "员工姓名："+this.name+" 员工编号："+this.number;
    }
    public void setRole(Role role){
        this.role=role;
    }
    public Role getRole(){
        return this.role;
    }

}
class Role{
    private String rname;
    private String rnumber;
    private Mem [] mem;
    private Pevelige [] pevelige;
    public Role(String rname,String rnumber){
        this.rname=rname;
        this.rnumber=rnumber;
    }
    public void setMem(Mem[] mem){
        this.mem=mem;
    }
    public void setPevelige(Pevelige[] pevelige){
        this.pevelige=pevelige;

    }
    public String getInfo(){
        return "角色名："+this.rname+" 角色编号："+this.rnumber;
    }
    public Mem[] getMem(){
        return this.mem;
    }
    public Pevelige[] getPevelige(){
        return this.pevelige;
    }
}
class Pevelige{
    private String pname;
    private String pnumber;
    private Role[] role;
    public Pevelige(String pname,String pnumber){
        this.pname=pname;
        this.pnumber=pnumber;
    }
    public void setRole(Role[] role){
        this.role=role;
    }
    public Role [] getRole(){
        return this.role;
    }
    public String getInfo(){
        return "权限名："+this.pname+" 权限编号："+this.pnumber;
    }

}

public class Map{
    public static void main(String[] args){
        Mem mema=new Mem("张麻子","001");
        Mem memb=new Mem("王大眼","002");
        Mem memc=new Mem("深田咏美","003");
        Role rolea=new Role("人事经理","001");
        Role roleb=new Role("财务经理","002");
        Role rolec=new Role("贴身秘书","003");
        Pevelige pa=new Pevelige("招聘职工","001");
        Pevelige pb=new Pevelige("开除职工","002");
        Pevelige pc=new Pevelige("提升工资","003");
        Pevelige pd=new Pevelige("降低工资","004");
        Pevelige pe=new Pevelige("端茶送水","005");
        Pevelige pf=new Pevelige("贴身服务","006");
        mema.setRole(rolea);
        memb.setRole(roleb);
        memc.setRole(rolec);
        rolea.setPevelige(new Pevelige[]{pa,pb});
        roleb.setPevelige(new Pevelige[]{pc,pd});
        rolec.setPevelige(new Pevelige[]{pe,pf});
        System.out.println(memc.getInfo());
        System.out.println(memc.getRole().getInfo());
        for(int x=0;x<memc.getRole().getPevelige().length;x++){
            System.out.println(memc.getRole().getPevelige()[x].getInfo());

        }
    }
}