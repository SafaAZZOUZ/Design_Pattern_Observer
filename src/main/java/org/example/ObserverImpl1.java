package org.example;

public class ObserverImpl1 implements Observer {

    @Override
    public void update(int state) {
        //int state=((ObservableImpl)observable).getState();
        double res=state*state+9;
        System.out.println("********* observerImpli1 *********");
        System.out.println("Nouvelle mise à jour : state =" +state);
        System.out.println("Resultat de calcul :"+res);
        System.out.println("**************************");


    }
}
