package poo;

/**
 * Classe para o Robô de exploração com controle remoto.
 *
 * @author Stefanie Martins.
 */
public class Robô
{
    private int dimensao_area;
    private String frente_robo;
    private int posicao_X;
    private int posicao_Y;
    private int[] posicao_atual = new int[2];

    /**
     * Constutor que não recebe parâmetro.
     */
    public Robô()
    {
        dimensao_area = 10;
        frente_robo = "N";
        posicao_X = 0;
        posicao_Y = 0;
    }

    /**
     * Construtor que recebe como parâmetro a dimensão, direção e posição.
     * @param dimensao_area recebe a dimensão da área a ser explorada.
     * @param frente_robo recebe para onde a frente do robô está virada.
     * @param posicao_X recebe a posição X inicial do robô.
     * @param posicao_Y recebe a posição Y inicial do robô.
     */
    public Robô(int dimensao_area, String frente_robo, int posicao_X, int posicao_Y)
    {
        this.dimensao_area = dimensao_area;
        this.frente_robo = frente_robo;
        this.posicao_X = posicao_X;
        this.posicao_Y = posicao_Y;
    }

    /**
     * Método que obtém a dimensão da área a ser explorada (a área será sempre quadrada).
     * @return a valor da área tanto para X quanto para Y.
     */
    public int getDimensao_area()
    {
        return dimensao_area;
    }

    /**
     * Método que obtém para onde a parte da frente do robô está virada.
     * @return se o robô está virado para o N (Norte), S (Sul), L (Leste) ou O (Oeste).
     */
    public String getFrente_robo()
    {
        return frente_robo;
    }

    /**
     * Método que obtém qual a posição em relação a X o robô se encontra.
     * @return a posição que o robô se encontra na horizontal (a posição irá variar entre 0 e a dimensão estabelecida).
     */
    public int getPosicao_X()
    {
        return posicao_X;
    }

    /**
     * Método que obtém qual a posição em relação a Y o robô se encontra.
     * @return a posição que o robô se encontra na vertical (a posição irá variar entre 0 e a dimensão estabelecida).
     */
    public int getPosicao_Y()
    {
        return posicao_Y;
    }
    
    /**
     * Método obtém qual a posição atual do robô em relação a X e Y.
     * @return a posição que o robô se encontra na horizontal e na vertical em relação ao plano estabelecido.
     */
    public int[] getPosicao_atual()
    {
        return posicao_atual;
    }
}
