/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoxadrez;

/**
 *
 * @author aluno.den
 */
import Xadrez.peao;
import Xadrez.cavalo;
import Xadrez.bispo;

public class ProjetoXadrez {

    public static void main(String[] args) {
        peao pecaPeao = new peao();
        cavalo pecaCavalo = new cavalo();
        bispo pecaBispo = new bispo();
        
        pecaPeao.mover();
        pecaCavalo.mover();
        pecaBispo.mover();
        
    }
}
