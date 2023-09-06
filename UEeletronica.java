package UEeletronica;

import javax.swing.JOptionPane;

public class UEeletronica 
{
    public static void main(String[] args) 
    {

        int lula, dilma, bolsonaro, ciro, resp, candidato;
        lula= 0;
        dilma= 0;
        bolsonaro= 0;
        ciro= 0;
        resp= 1;
        candidato=0;
        
        while (resp==1) 
        {
            candidato = Integer.parseInt(JOptionPane.showInputDialog("CANDIDATOS:"+"\n"+"Dilma = 1"+"\n"+"Lula = 2"+"\n"+"Ciro = 3"+"\n"+"Bolsonaro = 4"));

            switch (candidato)
            {
                case 1: dilma++;
                    JOptionPane.showMessageDialog(null,"candidata selecionada:Dilma");
                    break;
                case 2: lula++;
                    JOptionPane.showMessageDialog(null,"candidato selecionado:Lula");
                    break;
                case 3: ciro++;
                    JOptionPane.showMessageDialog(null,"candidato selecionado:Ciro");
                    break;
                case 4: bolsonaro++;
                    JOptionPane.showMessageDialog(null,"candidato selecionado:Bolsonaro");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"erro: INSIRA UM CANDIDATO DE 1 A 4");
                    break;
            }

        resp = Integer.parseInt(JOptionPane.showInputDialog("Ainda tem pessoas querendo votar?"+"\n"
            +"SIM = 1" 
                +"\n"
                    +"NÃO = 0"));    
        }

        if (resp == 0)
        {
            if ((lula>dilma)&&(lula>ciro)&&(lula>bolsonaro))
            {
                JOptionPane.showMessageDialog(null,"O vencedor foi o LULA"+"\n"+"total de votos: "+lula);
            }
            else if ((dilma>lula)&&(dilma>ciro)&&(dilma>bolsonaro))
            {
                JOptionPane.showMessageDialog(null,"O vencedor foi a DILMA"+"\n"+"total de votos: "+dilma);
            }
            else if ((ciro>lula)&&(ciro>dilma)&&(ciro>bolsonaro))
            {
                JOptionPane.showMessageDialog(null,"O vencedor foi o CIRO"+"\n"+"total de votos: "+ciro);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"O vencedor foi o BOLSONARO"+"\n"+"total de votos: "+bolsonaro);
            }
        }     
    }
}
