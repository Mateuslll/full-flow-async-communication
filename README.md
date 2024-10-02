## **Microserviços com Spring Boot e RabbitMQ**

### **Introdução**

Neste projeto, exploramos a construção de uma aplicação de microserviços utilizando Spring Boot como framework principal e RabbitMQ como broker de mensagens. O objetivo é demonstrar como implementar uma comunicação assíncrona entre microserviços, garantindo escalabilidade e desacoplamento.

### **Tecnologias Utilizadas**

* **Spring Boot:** Framework Java para desenvolvimento de aplicações web.
* **RabbitMQ:** Broker de mensagens de código aberto, utilizado para comunicação assíncrona.
* **CloudAMQP:** Plataforma de hospedagem para RabbitMQ na nuvem.
* **Java:** Linguagem de programação principal do projeto.
* **Gmail SMTP:** Serviço de envio de e-mails utilizado para notificações.

### **Arquitetura**

[Diagrama UML ou imagem da arquitetura]

* **Microserviço User:** Responsável por salvar os dados dos usuários.
* **Microserviço Email:** Responsável por enviar os e-mails de notificação.
* **RabbitMQ:** Intermediário de mensagens, utilizado para enviar mensagens do microserviço User para o microserviço Email.

### **Fluxo da Aplicação**

1. O usuário é salvo no microserviço User.
2. Uma mensagem é enviada para a fila do RabbitMQ, informando que um novo usuário foi criado.
3. O microserviço Email consome a mensagem da fila e envia um e-mail de boas-vindas para o novo usuário.

### **Como Executar**

1. **Pré-requisitos:**
   * Java JDK 11+
   * Maven ou Gradle
   * Conta na CloudAMQP
2. **Clonar o repositório:**
   ```bash
   git clone https://seu-repositorio.git
