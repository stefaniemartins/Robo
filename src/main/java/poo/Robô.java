package poo;

/**
 * Classe para o Robô de exploração com controle remoto.
 *
 * @author Stefanie Martins.
 */
public class Robô {
    private int dimensao_area;
    private char frente_robo;
    private int posicao_X;
    private int posicao_Y;
    private int[] posicao_atual = new int[2];

    /**
     * Constutor que não recebe parâmetro.
     */
    public Robô() {
        dimensao_area = 8;
        frente_robo = 'N';
        posicao_X = 1;
        posicao_Y = 2;
    }

    /**
     * Construtor que recebe como parâmetro a dimensão, direção e posição.
     * @param dimensao_area recebe a dimensão da área a ser explorada.
     * @param frente_robo recebe para onde a frente do robô está virada.
     * @param posicao_X recebe a posição X inicial do robô.
     * @param posicao_Y recebe a posição Y inicial do robô.
     */
    public Robô(int dimensao_area, char frente_robo, int posicao_X, int posicao_Y) {
        this.dimensao_area = dimensao_area;
        this.frente_robo = frente_robo;
        this.posicao_X = posicao_X;
        this.posicao_Y = posicao_Y;
    }

    /**
     * Método que obtém a dimensão da área a ser explorada (a área será sempre quadrada).
     * @return a valor da área tanto para X quanto para Y.
     */
    public int getDimensao_area() {return dimensao_area;}

    /**
     * Método que obtém qual a posição em relação a X o robô se encontra.
     * @return a posição que o robô se encontra na horizontal (a posição irá variar entre 0 e a dimensão estabelecida).
     */
    public int getPosicao_X() {return posicao_X;}

    /**
     * Método que obtém qual a posição em relação a Y o robô se encontra.
     * @return a posição que o robô se encontra na vertical (a posição irá variar entre 0 e a dimensão estabelecida).
     */
    public int getPosicao_Y() { return posicao_Y; }

    /**
     *  Método que seta para onde a parte da frente do robô está virada.
     * @param comando recebe se o robô está virado para o N (Norte), S (Sul), L (Leste) ou O (Oeste).
     */

    public void setFrente_robo(char comando) {
        char frente = getFrente_robo();

        if (comando == 'E') {
            if (frente == 'N') {frente_robo = 'O';}

            else if (frente == 'O') {frente_robo = 'S';}

            else if (frente == 'S') {frente_robo = 'L';}

            else if (frente == 'L') {frente_robo = 'N';}
        }

        if (comando == 'D') {
            if (frente == 'N') {frente_robo ='L';}

            else if (frente == 'L') {frente_robo = 'S';}

            else if (frente == 'S') {frente_robo ='O';}

            else if (frente == 'O') {frente_robo ='N';}
        }
    }

    /**
     * Método que obtém para onde a parte da frente do robô está virada.
     * @return se o robô está virado para o N (Norte), S (Sul), L (Leste) ou O (Oeste).
     */

    public char getFrente_robo() {
        return frente_robo;
    }

    /**
     * Método que seta a posição atual em X e Y do robô em relação ao plano estabelicido.
     * @param comando recebe as coordenadas em X e Y à serem modificadas.
     */
    public void setPosicao_atual(char comando) {
        if ((comando == 'E') || (comando == 'D')) {
            setFrente_robo(comando);
        }

        else if (comando == 'M') {
            char frente = getFrente_robo();

            if (frente == 'N') {
                if (getPosicao_Y() < (dimensao_area - 1)) {
                    posicao_Y++;
                }
            }

            else if (frente == 'L') {
                if (getPosicao_X() < (dimensao_area - 1 )) {
                    posicao_X++;
                }
            }

            else if (frente == 'S') {
                if (getPosicao_Y() > 0) {
                    posicao_Y--;
                }
            }

            else if (frente == 'O') {
                if (getPosicao_X() > 0) {
                    posicao_X--;
                }
            }
        }
    }

    /**
     * Método obtém qual a posição atual do robô em relação a X e Y.
     * @return a posição que o robô se encontra na horizontal e na vertical em relação ao plano estabelecido.
     */
    public String getPosicao_atual(){
        return "X:" + getPosicao_X() + "\ny: " + getPosicao_Y() + "\nFrente: " + getFrente_robo();
    }

    public void converterComandos(String comandos) {
        int i = 0;
        String separaVariavel = comandos;

        while (i < separaVariavel.length()) {
            setPosicao_atual(separaVariavel.charAt(i));
            i++;
        }
    }
}
