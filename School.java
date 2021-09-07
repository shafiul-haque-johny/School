//Md.Shafiul Haque Johny Id:011171319 Dept:CSE Section:B.


package school;


public abstract class School {

    String schoolName;
    String dateOfEstablished;
    int numberOfStudent;
    int monthlyFee;
    String educationMedium;
    public abstract int TeachersSalary();
    public abstract boolean isCoastly();

}

class Public extends School{
    Public(int numberOfStudent,int monthlyFee){
        this.numberOfStudent = numberOfStudent;
        this.monthlyFee = monthlyFee;
    }

    @Override
    public int TeachersSalary() {
        int s = (int) ((numberOfStudent*100)*0.05);
        return s;
    }

    @Override
    public boolean isCoastly() {
        return false;
    }
}

class Private extends School{
    Private(int numberOfStudent,int monthlyFee){
        this.numberOfStudent = numberOfStudent;
        this.monthlyFee = monthlyFee;
    }

    @Override
    public int TeachersSalary() {
        int s = (int) ((numberOfStudent*monthlyFee)*0.05);
        return s;
    }

    @Override
    public boolean isCoastly() {
        return true;
    }
    
    public static void main(String[] args) {
        
        Public p = new Public(2000,500);
        int a = p.TeachersSalary();
        boolean b = p.isCoastly();
        System.out.println(a);
        System.out.println(b);

        Private p1 = new Private(500,10000);
        int a1 = p1.TeachersSalary();
        boolean b1 = p1.isCoastly();
        System.out.println(a1);
        System.out.println(b1);
        
    }
    
}
