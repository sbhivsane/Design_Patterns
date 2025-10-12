package prototype;

public class IntelligentStudent extends Student{
    private int iq;

    IntelligentStudent(IntelligentStudent st){
       super(st);
        this.iq = st.iq;
    }

    public IntelligentStudent() {

    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
