public class SmartTV {
    boolean ligada = false;
    int canal = 2;
    int volume = 5;


    public void ligar(){
        if(!ligada){
            ligada = true;
        }
    }

    public void desligar(){
        if(ligada){
            ligada = false;
        }
    }

    public void aumentarVolume(){
        if(volume <= 10){
           volume++;
        }
    }

    public void diminuirVolume(){
        if(volume  >= 0){
            volume--;
        }
    }

    public void aumentarCanal(){
        if(canal <= 25){
           canal++;
        }
        else{
            canal = 1;
        }
    }

    public void diminuirCanal(){
        if(canal >= 1){
            canal--;
        }
        else{
            canal = 25;
        }
    }

    public void escolherCanal(int canal){
        if(canal >=0 || canal <= 25){
            this.canal = canal;
        }
    }
}
