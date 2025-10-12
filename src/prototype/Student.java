package prototype;

public class Student implements ProtoType<Student>{

  private  String name;
  private  String batch;
  private  double avgBatchPsp;
  private  double psp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    // copy consructer
    public  Student(Student student){
        this.avgBatchPsp=student.getAvgBatchPsp();
        this.batch = student.getBatch();
    }

    public Student() {
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
