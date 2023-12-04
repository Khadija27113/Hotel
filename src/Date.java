public class Date {
    private int j,m,a;
    private int t[]={31,28,31,30,31,30,31,31,30,31,30,31};
    private String []mois={"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novombre","Decembre"};
    public Date(int j, int m) throws Error{
        if (m>12 || m<=0)
            throw new Error("date");
        if(j>t[m-1] || j<=0)
            throw new Error("date");
        this.j = j;
        this.m = m;
        this.a=-1;
    }
    public Date(int j,int m, int a) throws Error {
        if (m>12 || m<=0)
            throw new Error("date");
        if(j>t[m-1] || j<=0)
            throw new Error("date");
        this.j = j;
        this.m = m;
        this.a = a;
    }
    public String toString() {
        if (a!=-1) {
            if (m < 10) {

                if (j < 10)
                    return "0" + j + "/0" + m + "/" + a;
                return j + "/0" + m + "/" + a;
            }
            if (j < 10)
                return "0" + j + "/" + m + "/" + a;
            return j + "/" + m + "/"  + a;
        }
        return "le " + j + " "+mois[m-1];
    }
    public Date clone() {
        Date d = null;
        try {
            d = new Date(j, m, a);
        } catch (Error e) {
            System.out.println(e);
        }
        return d;
    }
    public int comparTo(Date d){
        if (a>d.a)
            return 1;
        if (a<d.a)
            return -1;
        if (m>d.m)
            return 1;
        if(m<d.m)
            return -1;
        if(j>d.j)
            return 1;
        if (j<d.j)
            return -1;
        return 0;
    }

    public int getJ() {
        return j;
    }
    public int getM() {
        return m;
    }
    public int getA() {
        return a;
    }
    public void addJ(int j){
        this.j+=j;
        while (this.j>t[m-1]){
            this.j-=t[m-1];
            addM(1);
        }
    }
    public void addM(int m){
        this.m+=m;
        while(this.m>12){
            this.m-=12;
            addA(1);
        }
    }
    public void addA(int a){
        this.a+=a;
    }
}