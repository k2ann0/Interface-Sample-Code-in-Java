package Lab2;

public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour {

    protected int numberOfArticle;

    public PhDStudent(int id , float mid , float fin , int conf ,int numberOfArticle){
        super(id, mid, fin, numberOfArticle);
        conf = numberOfConf;
    }


    public float articleScore(){
        return numberOfArticle * 8;
    }

    public float computeTotalScore(){
        return computeBaseScore() + articleScore();
    }
    
}
