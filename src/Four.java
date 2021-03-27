public class Four extends Three implements One,Two {
    @Override
    public String methodOne(){
        String s = super.s + One.s;
        return s;
    }
}
