## 🔐 Sistema de Autenticação Spring Boot

Um projeto demonstrativo de sistema de autenticação usando Spring Boot, Spring Security e Thymeleaf com interface personalizada de login.

## 🎯 Sobre o Projeto

Este projeto demonstra a implementação de um sistema de autenticação completo usando Spring Boot. Inclui uma página de login personalizada com validações frontend e backend, sistema de logout e proteção de rotas.

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.5.5**
- **Spring Security** - Autenticação e autorização
- **Spring Web** - Controladores REST e MVC
- **Thymeleaf** - Template engine para as páginas HTML
- **HTML5/CSS3** - Interface do usuário
- **JavaScript** - Validações no frontend
- **Maven** - Gerenciamento de dependências

## ✨ Funcionalidades

- ✅ Sistema de login com página personalizada
- ✅ Validação de formulário (frontend e backend)
- ✅ Mensagens de erro e sucesso
- ✅ Sistema de logout seguro
- ✅ Proteção de rotas com Spring Security
- ✅ Interface responsiva e moderna
- ✅ Credenciais padrão do Spring Boot
- ✅ Redirecionamentos automáticos

## 📋 Pré-requisitos

Antes de começar, você precisa ter instalado em sua máquina:

- [Java 21](https://adoptium.net/) ou superior
- [Maven 3.6+](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/) (opcional)

## 🔧 Instalação e Execução

### 1. Clone o repositório
```bash
git clone https://github.com/isaccanedo/spring-boot-security-demo.git
```

### 2. Execute o projeto
```bash
# Usando Maven Wrapper (recomendado)
./mvnw spring-boot:run

# Ou usando Maven instalado
mvn spring-boot:run
```

### 3. Acesse a aplicação
Abra seu navegador e acesse: `http://localhost:8080`

## 🖥️ Como Usar

### 1. **Primeiro Acesso**
- Ao acessar `http://localhost:8080`, você será redirecionado automaticamente para a página de login
- A senha será gerada automaticamente e exibida no console da aplicação

### 2. **Encontrar a Senha**
Procure no console da aplicação por uma linha similar a:
```
Using generated security password: a1b2c3d4-e5f6-7890-abcd-ef1234567890
```

### 3. **Fazer Login**
- **Usuário:** `user`
- **Senha:** (a senha gerada mostrada no console)

### 4. **Navegar no Sistema**
- Após o login, você será redirecionado para a página principal
- Use o botão "Logout" para sair do sistema

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com/example/demo/
│   │       ├── DemoApplication.java      # Classe principal e controllers
│   │       └── SecurityConfig.java       # Configurações de segurança
│   └── resources/
│       ├── templates/
│       │   ├── login.html               # Página de login
│       │   └── index.html               # Página principal
│       └── application.properties       # Configurações da aplicação
├── pom.xml                             # Dependências Maven
└── README.md                           # Este arquivo
```

## 🌐 Endpoints

| Método | Endpoint | Descrição | Autenticação |
|--------|----------|-----------|-------------|
| `GET` | `/` | Página principal | ✅ Requerida |
| `GET` | `/login` | Página de login | ❌ Pública |
| `POST` | `/login` | Processar login | ❌ Pública |
| `POST` | `/logout` | Realizar logout | ✅ Requerida |
| `GET` | `/api/hello` | Endpoint API de exemplo | ✅ Requerida |

## 🔑 Credenciais de Acesso

### Credenciais Padrão (Desenvolvimento)
- **Usuário:** `user`
- **Senha:** Gerada automaticamente (verificar console)

### Para Produção
Recomenda-se configurar usuários específicos através de:
- Banco de dados
- LDAP
- OAuth2/JWT
- Outros provedores de autenticação

## 📸 Screenshots

### Página de Login
- Interface moderna e responsiva
- Validação em tempo real
- Mensagens de erro claras

### Página Principal
- Dashboard pós-login
- Botão de logout
- Informações do usuário

## 🛡️ Segurança

### Configurações Implementadas
- Todas as rotas protegidas por padrão
- Página de login personalizada
- Logout seguro com invalidação de sessão
- Proteção CSRF habilitada
- Redirecionamentos seguros

### Boas Práticas
- Senhas não expostas no código
- Configuração de segurança centralizada
- Validação tanto no frontend quanto backend

## 🔄 Fluxo de Autenticação

1. **Usuário acessa uma rota protegida** → Redirecionado para `/login`
2. **Preenche credenciais** → Validação frontend
3. **Submete formulário** → Spring Security valida
4. **Login bem-sucedido** → Redirecionado para página solicitada
5. **Login falhou** → Volta para login com mensagem de erro

## 🚀 Próximos Passos

Para expandir este projeto, considere implementar:

- [ ] Cadastro de novos usuários
- [ ] Recuperação de senha
- [ ] Perfis de usuário (ADMIN, USER, etc.)
- [ ] Integração com banco de dados
- [ ] API REST com JWT
- [ ] Testes unitários e de integração
- [ ] Docker para deployment
- [ ] Monitoramento e logs

⭐ **Se este projeto foi útil para você, considere dar uma estrela no repositório!**
