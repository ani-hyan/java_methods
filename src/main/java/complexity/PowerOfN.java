package homework_12;

public class PowerOfN {
    int m = 3;
    int count = 0;
    int i = 0;

    public int nPowNTimesRepeat(int n) {
        i++;
        while (i < n) {
            m *= n;
            while (i <= m) {
                count++;
                System.out.println("Ես դուրս չեմ մնացել");
                nPowNTimesRepeat(n);
            }
        }
        return count;
    }

    public void nPowNTimesRepeat1(int n){
        int m = 1;
        //հաշվում ես n^n աստիճանը
        for(int i = 0; i < n; i++){
            m *= n;
        }

        //ու էտքան անգամ ֆռում ես
        for(int i = 0; i < m; i++){
            System.out.println("Ես դուրս չեմ մնացել");
        }
    }

    public static void main(String[] args) {
        PowerOfN n = new PowerOfN();
        n.nPowNTimesRepeat(3);
    }
}
