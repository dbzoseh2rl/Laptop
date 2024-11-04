package 명품_java;

public class ex5_1 {
    class TV {
        private int size;

        public TV(int size) {
            this.size = size;
        }

        protected int getSize() {
            return size;
        }
    }

    class ColorTV extends TV {
        private int color;

        public ColorTV(int size, int color) {
            super(size);
            this.color = color;
        }

        public void printProperty() {
            System.out.println(getSize() + "인치 " + color + "컬러");
        }
    }

    public static void main(String[] args) {
        ex5_1 outer = new ex5_1(); // 외부 클래스 인스턴스 생성
        ColorTV myTV = outer.new ColorTV(65, 65536); // 내부 클래스 인스턴스 생성
        myTV.printProperty();
    }
}
