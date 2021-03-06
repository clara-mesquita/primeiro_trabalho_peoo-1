package br.uece.peoo;

import br.uece.peoo.model.Comida;
import br.uece.peoo.model.Entidade;
import br.uece.peoo.model.Robo;
import br.uece.peoo.model.RoboInteligente;
import br.uece.peoo.view.DisputaRobosPainel;
import br.uece.peoo.view.RoboPanel;

import javax.swing.*;
import java.awt.*;

import static br.uece.peoo.Main.pegarCoordenada;

/**
 * Crie uma subclasse ReboInteligente que sobrescreve o método mover de forma que se robô fez um movimento inválido,
 * garanta que o próximo movimento será válido. Cria uma classe Main que instancie um robô normal e outro inteligente,
 * peça ao usuário para entrar com a posição do alimento, e faça os dois robôs se moverem randomicamente, um de
 * cada vez, até que um deles encontre o alimento. Ao final, mostre quem achou o alimento e o número de movimentos
 * que cada robô fez.
 */
public class OutraOutraMain {

    public static void main(String[] args) {
        Robo azul = new Robo(Color.BLUE); // Robo normal
        Robo verde = new RoboInteligente(Color.GREEN); // Robo Inteligente

        // Posição da Comida
        int x, y;

        x = pegarCoordenada("Digite o X da posição da comida(0 a 79):");
        y = pegarCoordenada("Digite o Y da posição da comida(0 a 79):");

        Comida comida = new Comida(x * Entidade.SIZE, y * Entidade.SIZE);

        JFrame frame = new JFrame("Dispulta de Robos");
        frame.setContentPane(new DisputaRobosPainel(azul, verde, comida));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); // Não pode mudar o tramano do JFrame
        frame.pack();
        frame.setPreferredSize(new Dimension(RoboPanel.WIDTH + 10, RoboPanel.WIDTH + 10));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
