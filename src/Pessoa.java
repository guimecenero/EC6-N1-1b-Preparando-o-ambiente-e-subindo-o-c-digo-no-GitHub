public class Pessoa {
    String nome;
    int idade;
    String sentimento;
    char genero;

    Pessoa(String name, int age, String feeling, char gender)
    {
        genero = String.valueOf(gender).toUpperCase().charAt(0); //deixa o genero maiúsculo
        nome = name;
        idade = age;
        sentimento = feeling;
    }

    String DarSaudacao()
    {
        if(idade < 3)
        {
            return "Gugu dada. :3";
        }
        else if (idade < 13)
        {
            return "Oi, meu nome é " + nome;
        }
        else if (idade < 18)
        {
            if (genero == 'M')
                return "Eae parça, sou o " + nome;
            else
                return "Eae parça, sou a " + nome;
        }
        else if (idade < 55)
        {
            return "Ola, tudo bem? meu nome é " + nome;
        }
        else if (idade < 110)
        {
            if (genero == 'M')
                return "Na minha época, costumavam me chamar de " + nome + ", mas hoje em dia só me chamam de vovô";
            else
                return "Na minha época, costumavam me chamar de " + nome + ", mas hoje em dia só me chamam de vovó";
        }
        else
        {
            return "hmhmgmhfampwm (Saudação em zumbi)";
        }
    }

    String ResponderSaudacao()
    {
        if(idade < 3)
        {
            return "plah? :o";
        }
        else if (idade < 13)
        {
            if (genero == 'M')
                return "Oi, eu sou o " + nome;
            else
                return "Oi, eu sou a " + nome;
        }
        else if (idade < 18)
        {
            if (genero == 'M')
                return "Suave, aqui é o " + nome;
            else
                return "Suave, aqui é a " + nome;
        }
        else if (idade < 55)
        {
            if (genero == 'M')
                return "tudo ótimo, aqui é o " + nome;
            else
                return "tudo ótimo, aqui é a " + nome;
        }

        else if (idade < 110)
        {
            if (genero == 'M')
                return "Oh, prazer, fui conhecido como " + nome + ", mas isso foi a muitos anos...";
            else
                return "Oh, prazer, fui conhecida como " + nome + ", mas isso foi a muitos anos...";
        }
        else
        {
            return "hmhmgmhfampwm (Resposta a saudação em zumbi)";
        }
    }

    String Apresentar()
    {
        if(idade < 3)
        {
            return "Bla duh bla, páh páh! :D";
        }
        else if (idade < 13)
        {
            return "Eu adoro sair correndo pela casa";
        }
        else if (idade < 18)
        {
            return "Eu curto dar uns rolê ta ligado?";
        }
        else if (idade < 55)
        {
            return "Sou uma pessoa que gosta de tudo um pouco";
        }

        else if (idade < 110)
        {
            return "NA MINHA ÉPOCA, ERA TUDO MELHOR".toLowerCase(); //o lower é pura preguiça de reescrever o código em letra minuscula ksksks
        }
        else
        {
            return "hmhmgmhfampwm (Apresentação em zumbi)";
        }
    }

    String ResponderApresentacao()
    {
        if(idade < 3)
        {
            return "gaga duba, páh páh! :D";
        }
        else if (idade < 13)
        {
            return "Que incrível";
        }
        else if (idade < 18)
        {
            return "louco ein";
        }
        else if (idade < 55)
        {
            return "Que interessante";
        }

        else if (idade < 110)
        {
            return "NA MINHA ÉPOCA, ERA TUDO MELHOR";
        }
        else
        {
            return "hmhmgmhfampwm (Resposta a apresentação em zumbi)";
        }
    }

    String MostrarSentimento()
    {
        if(idade < 3)
        {
            return "páh páh!, bluh bah :D";
        }
        else if (idade < 13)
        {
            return "Hoje eu estou " + sentimento;
        }
        else if (idade < 18)
        {
            return "To me sentindo " + sentimento + " hoje";
        }
        else if (idade < 55)
        {
            return "Eu estou muito " + sentimento + " hoje";
        }

        else if (idade < 110)
        {
            if (genero == 'M')
                return "Eu era " + sentimento + ", mas hoje, sou um velho";
            else
                return "Eu era " + sentimento + ", mas hoje, sou uma velha";
        }
        else
        {
            return "hmhmgmhfampwm (Sentimentos em zumbi)";
        }
    }

    String ResponderSentimento()
    {
        if(idade < 3)
        {
            return "gaga gama, dáh dáh! :D";
        }
        else if (idade < 13)
        {
            return "WOW";
        }
        else if (idade < 18)
        {
            return "show";
        }
        else if (idade < 55)
        {
            return "Incrível";
        }

        else if (idade < 110)
        {
            return "pffft";
        }
        else
        {
            return "hmhmgmhfampwm (Resposta a sentimentos em zumbi)";
        }
    }
}
