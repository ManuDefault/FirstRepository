public class ClassB {

    private int a;
    private int b;

    public  ClassB(){

    }

    public ClassB(int a,int b){
        this.a=a;
        this.b=b;
    }
    @Override
    public String toString() {
        return "ClassB{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }



    public class ClassA{
        private int x;
        private int y;

        public ClassA(){

        }

        public ClassA(int x,int y){
            this.x=x;
            this.y=y;
        }

        @Override
        public String toString() {
            return  ClassB.this.toString() +"{ClassA{" +
                    "x=" + x +
                    ", y=" + y +
                    "}}";
        }
    }



}
