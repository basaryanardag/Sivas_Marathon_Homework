public class Maraton {
    private final int[] score;
    private final String[] person;

    public Maraton(int[] scoreArray, String[] personArray) {

        score = scoreArray;
        person = personArray;
    }
    public int getFirst() {
        int first;
        String firstperson ;
        int index=0;
        for (int i = 0; i < score.length; i++) {
            for (int j = i + 1; j < score.length; j++) {
                if (score[i] < score[j]) {

                    first = score[i];
                    firstperson = person[i];
                    score[i] = score[j];
                    person[i]=person[j];
                    score[j] = first;
                    person[j]=firstperson;

                }
            }
            index=i;}
        return index;}

    public int getSecond() {
        getFirst();
        int second;
        int index=0;
        String secondperson ;
        for (int u = 0; u < score.length; u++) {
            if(u==getFirst()){
                continue;}
            for (int o = u+1; o < score.length ; o++) {

                if (score[u]<score[o]){



                    second = score[u];
                    secondperson= person[u];
                    score[u] = score[o];
                    person[u]=person[o];
                    score[o] = second;
                    person[o]=secondperson;}



            }
            index=u;
        }
        return index;  }

    public int getThird(){
        getFirst();
        getSecond();
        int index=0;
        int third;
        String thirdperson;
        for (int k = 0; k <score.length ; k++) {
            if(k==getFirst() || k==getSecond()){
                continue;
            }
            for (int l = k+1; l<score.length ; l++) {
                if (score[k]<score[l]){
                    third=score[k];
                    thirdperson=person[k];
                    score[k]=score[l];
                    person[k]=person[l];
                    score[l]=third;
                    person[l]=thirdperson;


                }

            }
            index=k;
        }
        return index;}

    public void displayPosition(){
        System.out.println("Birinci : "+person[getFirst()]+" "+score[getFirst()]+"'");
        System.out.println("İkinci : "+person[getSecond()]+" "+score[getSecond()]+"'");
        System.out.println("Üçüncü : "+person[getThird()]+" "+score[getThird()]+"'");

    }
    public void Grading () {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int m = 0; m < score.length; m++) {
            if (score[m] <= 299)
                a++;
            else if (299 < score[m] && score[m] <= 399)
                b++;
            else
                c++;
        }
        System.out.printf("A->" + " " + a);
        System.out.println();
        System.out.printf("B->" + " " + b);
        System.out.println();
        System.out.println("C->" + " " + c);}
}

