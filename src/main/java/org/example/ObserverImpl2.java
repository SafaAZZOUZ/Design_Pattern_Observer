package org.example;

public class ObserverImpl2 implements Observer {
    private int counter;
    @Override
    public void update(int state) {
       // int state=((ObservableImpl)observable).getState();
        if (state%2==0) ++counter;
        System.out.println("********* observerImpli 2 *********");
        System.out.println("Nouvelle mise à jour : state =" +state);
        System.out.println("Resultat de calcul :"+((state%2)==0? "Pair": "Impair"));
        System.out.println("le compteur est :" +counter);
        System.out.println("**************************");


    }
}
