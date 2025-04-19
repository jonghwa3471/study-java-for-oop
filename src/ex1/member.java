package ex1;

public class member {
    private String name;         // 성명
    private String reg_num;      // 학번
    private int age;             // 나이
    private int grade;           // 학년
    private float avg_point;     // 학점

    public member(String name, String reg_num, int age, int grade, float avg_point) {
        this.name = name;
        this.reg_num = reg_num;
        this.age = age;
        this.grade = grade;
        this.avg_point = avg_point;
    }

    public member() {
        this.name = "";
        this.reg_num = "";
        this.age = 0;
        this.grade = 0;
        this.avg_point = 0.0f;
    }

    public member getmember(String reg_num, member[] var1) {
        member[] tmp = var1;
        member redata = new member();
        for (int cnt = 0; cnt < tmp.length; cnt++) {
            if (tmp[cnt].reg_num.equals(reg_num)) {
                redata = tmp[cnt];
            }
        }
        return redata;
    }

    public String getName() {
        return name;
    }

    public String getRegnum() {
        return reg_num;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public float getAvgpoint() {
        return avg_point;
    }
}
    

