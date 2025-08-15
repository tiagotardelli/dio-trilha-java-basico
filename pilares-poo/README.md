# Pilares do POO
**Programação orientada a objetos (POO,** ou **OPP** segundo as suas siglas em inglês) é um paradigma de programação  
baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos, e  
códigos, na forma de procedimentos, também conhecidos como métodos.

Como se trata de um contexto análogo ao mundo real, tudo no qual nos referimos são objetos, exemplo: Conta bancária,  
Aluno, Veículo, Transferência etc.

A programação orientada a objetos é bem requisitada no contexto das aplicações mais atuais no mercado devido a  
possibilidade de reutilização de código e a capacidade de representação do sistema ser muito mais próximo do mundo real.

Para uma linguagem ser considerada orientada a objetos, esta deve seguir o que denominamos como **Os quatro pilares da**  
**orientação a objetos:**

* **Encapsulamento**: Nem tudo precisa esta visível, grande parte do nosso algoritmo pode ser distribuído em métodos  
com finalidades específicas que complementa uma ação em nossa aplicação.

Exemplo: Ligar um veículo exige muitas etapas para a engenharia, mas o condutor só visualiza a
ignição, das a partida e a "magia" acontece.

* **Herança**: Características e comportamentos comuns podem ser elevados e compartilhados através
de uma hierarquia de objetos.

Exemplo: Um Carro e uma Motocicleta possuem propriedades como placa, chassi, ano de fabricação e
métodos como acelerar, frear. Logo para não ser um processo de codificação redundante, podemos
desfrutar da herança criando uma classe **Veículo** para qe seja herdada por Carro e Motocicleta.

* **Abstração**: É a indisponibilidade para determinar a lógica de um ou vários comportamentos em
um objeto.

Exemplo: **Veículo** determina duas ações como acelerar e frear, logo estes comportamentos deverão
ser abstratos pois existem mais de ma maneira de se realizar a mesma operação (ver Polimorfismo).

* **Polimorfismo**: São as inúmeras maneiras de se realizar uma mesma ação.

Exemplo: Veículo determina das ações como acelerar e frear, primeiramente precisamos identificar se
estaremos nos referindo a **Carro** ou **Motocicleta** para determinar a lógica de aceleração e
frenagem dos respectivos veículos.

Em Prática

Para ilustrar a propostas dos Princípios de POO no nosso quotidiano, vamos simular algumas
funcionalidades dos aplicativos de mensagens instantâneas pela internet.

**MSN Messenger** foi um programa de mensagens instantâneas criado pela Microsoft Corporation. O
serviço nasceu a 22 de julho de 1999, anunciando-se como um serviço que permitia falar com uma
pessoa através de conversas instantâneas pela internet. Ao longo dos anos surgiram novos serviços
de mensagens pela internet como **Facebook Messenger** e o **VKontakte Telegram**.

Vamos descrever em UML e depois em código algumas das principais funcionalidades de qualquer
serviço de comunicações instantânea pela internet, inicialmente pelo MSN Messenger e depois
inserindo os demais, considerando os princípios de POO.

|MSNMessenger|
|-|
|+ enviarMensagem() : void|
|+ receberMensagem() : void|
|+ validarConectadoInternet() : void|
|+ salvarHistoricoMensagem() : void|

```java
public class MSNMessenger {
    public void enviarMensagem() {
        System.out.println("Enviando mensagem");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    public void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

    public void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}

```

Pontos de atenção
* Todos os métodos da classe são **public** (tudo realmente precisa estar visível?)
* Só existe uma única forma de se comunicar via internet (como ter novas formas de
se comunicar mantendo a proposta central? )

## Encapsulamento
<sub>Nem tudo precisa estar disponível para todos</sub>
Já imaginou você instalar o MSN Messenger e ao querer enviar uma mensagem, te fosse
solicitado verificar se o computador está conectado na internet e depois, pedir para
você salvar a mensagem no histórico? Ou, então tentar enviar um SMS pelo celular,
primeiro você precisasse consultar manualmente o seu saldo?

Acredito que não seria uma experiência tão agradável de ser executada recorrentemente
por nós usuários.

Mesmo ainda sendo necessário algumas etapas nos processos citados, não é um requisito
uma visibilidade pública, isso quer dizer que, além da própria classe que possui uma
responsabilidade de uma determinada ação.

Quanto ao MSN Messenger, para nós, só é relevante saber que podemos e como devemos
enviar e receber a mensagem, logo, as demais funcionalidades poderão ser consideradas
provadas (private). E é ai que se caracteriza a necessidade do pilar de Encapsulamento,
o que esconder?

Vejamos a refatoração abaixo da nossa classe MSN Messenger


|MSNMessenger|
|-|
|+ enviarMensagem() : void|
|+ receberMensagem() : void|
|- validarConectadoInternet() : void|
|- salvarHistoricoMensagem() : void|


```java
public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();

        msn.receberMensagem();
    }
}
```

```java
public class MSNMessenger {
    public void enviarMensagem() {
        System.out.println("Enviando mensagem");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}
```

## Herança
<sub>Nem tudo se copia</sup>

Já imaginou você ter sido classificado para a vaga de emprego de seus sonhos e como desafio, justamente você criar um
diagrama de classes e em seguida os respectivos arquivos .java que apresentasse os fundamentos de POO com base no
contexto de vários aplicativos de mensagens instantâneas?

Com base na nossa classe **MsnMessenger**, você já podeira dar os primeiros passos para se dar bem no processo seletivo,
simplesmente, copiar e colar a estrutura para as nossas classes ***FacebookMessenger e Telegram**.

|MSNMessenger|FacebookMessenger|Telegram
|-|-|-|
|+ enviarMensagem() : void||+ enviarMensagem() : void||+ enviarMensagem() : void|
|+ receberMensagem() : void|+ receberMensagem() : void|+ receberMensagem() : void|
|- validarConectadoInternet() : void|- validarConectadoInternet() : void|- validarConectadoInternet() : void|
|- salvarHistoricoMensagem() : void|- salvarHistoricoMensagem() : void|- salvarHistoricoMensagem() : void|

```java
public class MSNMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}

```

```java
public class FacebookMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem  pelo Facebook Messenger");
    }

    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}

```

```java
public class TelegramMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram Messenger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem  pelo Telegram Messenger");
    }

    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}
```

```java
package messenger.poo.exemplo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        //abrindo Facebook Messenger
        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        //abrindo Telegram Messenger
        TelegramMessenger telegram = new TelegramMessenger();
        telegram.enviarMensagem();
        telegram.receberMensagem();

    }
}
```

Agora é só escrever o código das classes acima e esperar pela contratação!!

Lamentamos dizer, mas esta não seria a melhor alternativa para a proposta citada acima

Além de uma compreensão do desafio, é necessário, qe tenhamos domínio dos pilares de POO e aplicá-los em situações
iguais a esta.

**NOTE**: Todas as três classes possuem a mesma estrutura comportamental, e diante deste contexto se encaixa
perfeitamente o segundo pilar da POO, a Herança.

|ServicoMensagemInstantanea|
|-|
|+ enviarMensagem() : void|
|+ receberMensagem() : void|
|- validarConectadoInternet() : void|
|- salvarHistoricoMensagem() : void|

MSNMessenger / FacebookMessenger / Telegram -> Herdam da classe ServicoMensagemInstantanea

```java
public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        //primeiro confirmar se esa conectando a internet 
        validarConectadoInternet();
        System.out.println("Enviando mensagem");

        //depois de enviada, salva o histórico da mensagem
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}
```
```java
public class MSNMessenger extends ServicoMensagemInstantanea{

}

public class FacebookMessenger extends ServicoMensagemInstantanea{

}

public class TelegramMessenger extends ServicoMensagemInstantanea {

}
```

```java
public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        //abrindo Facebook Messenger
        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        //abrindo Telegram Messenger
        TelegramMessenger telegram = new TelegramMessenger();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
```

Podemos avaliar a importância de compreender os pilares de POO para ter ma melhor implementação, reaproveitando e  
reutilizando o código em qualquer contexto das nossas aplicações, mas não para por ai.

Será qe todos os sistemas de mensagens realizam as suas operações de uma mesma maneira? E agora? Este é um trabalho  
para os pilares **Abstração e Polimorfismo**

## Abstração
<sub>Para você ser é preciso você fazer</sub>

Sambemos que qualquer sistema de mensagens instantâneas se realiza as mesmas operações de Enviar e Receber Mensagem,  
dentre outras operações comuns ou exclusivas de cada aplicativo disponível no mercado.

Mas será se as ações realizadas contém p mesmo comportamento? Acreditamos que não.

<sub>Já imaginou a **Microsoft** falar para o **Facebook: "Ei, toma meu código do MSN".</sub>

O que vale destacar para compreender aqui é que todo e qualquer sistema de mensagem precisa sim no mínimo Enviar e  
Receber Mensagem, logo, consideramos se firmar um "contrato" para qualquer um que queira se apresentar assim para o
mercado.

Observem a nossa estruturação dos códigos abaixo com base na implementação apresentada no pilar Herança.
```java
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
}
```

```java
public class MSNMessenger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}

public class FacebookMessenger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
}

public class TelegramMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram Messenger");
    }
}
```

```java
public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        //abrindo Facebook Messenger
        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        //abrindo Telegram Messenger
        TelegramMessenger telegram = new TelegramMessenger();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
```

Em Java o conceito de abstração é representado pela palavra reservada **abstract** e métodos que **NÃO** possuem corpo
na classe abstrata (pai).

## Polimorfismo
<sub>Um mesmo comportamento de várias maneiras</sub>

Podemos observar no contexto de **Abstração** e **Herança** que conseguimos criar uma singularidade estrutural de nossos  
elementos. Isso quer dizer que, qualquer classe que deseja representar um serviço de mensagens, basta entender a classe  
**ServicoMensagemInstantanea** e implementar os respectivos métodos abstratos. O que vale reforçar aqui é, cada classe  
terá a mesma ação executando procedimentos de maneira especializada.

Este é o resultado que denominamos como Polimorfismo. Veja o exemplo abaixo:
```java
public class ComputadorPedrinho {
    public static void main(String[] args) {
       
        ServicoMensagemInstantanea smi = null;

        /*
            NÃO SE SABE QUAL APP
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGENS
        */
        String appEscolhido = "???";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessanger();
        else if (appEscolhido.equals("tlg")
            sni = new Telegram();
        
        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
```

Para concluirmos a compreensão, Polimorfismo permite que as classes mais abstratas determinem ações niformes para que  
cada classe filha concreta implementem os comportamentos de forma específica.

Modificador protected
Vamos para ma retrospectiva quanto ao requisito do nosso sistema de mensagens instantâneas desde a etapa de  
encapsulamento.
O nosso requisito solicita que além de Enviar e Receber Mensagens precisamos validar se o aplicativo está conectado  
a internet **(validarConectadoInternet)** e salvar o histórico de cada mensagem **(salvarHistoricoMensagem)**.
Sabemos que cada aplicativo costuma salvar as mensagens em seus respectivos servidores cloud, mas e quanto a validar  
se está conectando a internet? Não poderia ser um mecanismo comum à todos? Logo qualquer classe filha de  
**ServicoMensagemInstantanea** poderia desfrutar através de herança desta funcionalidade.
<dub>Mas fica a reflexão do que já aprendemos sobre visibilidade de recursos: Com o modificaro **private** somente  
a classe conhece a implementação qunato que o modificador **public** todos passarão a conhecer. Mas gostaríamos que   
somente as classes filha soubessem. Bem, é ai que estra o modificador **protected**</sub>

```java
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    public abstract void salvarHistoricoMensagem();
    protected void validarConectadoInternet(){
         System.out.println("Validando se está conectado a internet");
    }
}
```
```java
public class TelegramMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram Messenger");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram Messenger");
    }
}
```
## Interface

Como vimos anteriormente, **Herança** é um dos pilares de POO, mas uma curiosidade que se deve ser esclarecida na  
linguagem Java é que a mesma não permite o que conhecemos como **Herança Múltipla**.

Á medida que vã surgindo novas necessidades, novos equipamentos (objetos) nascem para atender as expectativas de  
oferecer ferramentas com finalidades bem específicas como por exemplo: Impressoras, Digitalizadoras, Copiadoras e etc.
Observem que não há uma especificação de marca, modelo e ou capacidade de execução das classes citadas acima, isto é o 
que consideramos o nível mais abstrato da orientação a objetos que denominamos como **interfaces**.

Ilustração de interfaces dos equipamentos citados acima.
!["Dispositivos representação"](./resources/representacao_interface1.png "Dispositivos representação")
Representação de objetos reais com base nas interfaces citadas acima.
!["Dispositivos marca"](./resources/representacao_interface2.png "Dispositivos marca")
<sub>Então o que você está dizendo é que **interfaces** é o mesmo que **classes**?</sub>
<sub>Um modelo para representação dos objetos reais?</sub>

Este é um dos maiores questionamentos dos desenvolvedores no que se refere a modelo de classes da aplicação.

Como citado acima Java não permite herança múltipla, logo, vamos imaginar que recebemos o desafio de projetar uma nova 
classe para criar objetos que representam as três características citadas acima e que iremos denominar de 
**EquipamentoMultifuncional**

Para uma melhor compreensão, vamos analisar os diagramas de classes abaixo, comparando o conceito de herança entre  
classes e interfaces.

