package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class PokemonHashMap {

    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<String, String>();

        do {
            try{
                String pokemon, tipo;
                do {
                    pokemon = JOptionPane.showInputDialog("Digite o nome de um pokemon" +
                            "ou \"fim\" para encerrar!").toLowerCase();
                    if (!pokemon.equals("fim")){
                        tipo = JOptionPane.showInputDialog("Digite o tipo do pokemon informado anteriormente: ");
                        if(mapa.containsKey(pokemon)){
                            JOptionPane.showMessageDialog(null, "Esse pokemon ja foi cadastrado!");
                        } else {
                            mapa.put(tipo, pokemon);
                        }
                    }

                } while(!pokemon.equals("fim"));

                String escolha = JOptionPane.showInputDialog("Digite um tipo de pokemon:");
                if (mapa.containsKey(escolha)){
                    JOptionPane.showMessageDialog(null, "O pokemons que possuem esse tipo são:"
                    + mapa.get(escolha));
                } else {
                    JOptionPane.showMessageDialog(null, "Não há pokemon cadastrado com esse tipo!");
                }

            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } while(JOptionPane.showConfirmDialog(null,"Deseja continuar?", "Atenção",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de programa!");
    }

}
