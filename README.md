Aluno: Daniel de Jesus Machado

a) É a prática de desacoplar as configurações (como endereços de banco de dados, credenciais e limites de sistema) do código-fonte da aplicação.
Externalizada: A configuração fica fora do pacote compilado (.jar). Isso permite mudar o comportamento do sistema sem precisar recompilar ou reinstalar o software.
Centralizada: Em vez de cada microsserviço ter seu próprio arquivo de configuração local espalhado, existe um único servidor (Config-Server), distribuindo as configurações corretas para todos os serviços via HTTP.

b) Se tratando de um cenário bancário, a integridade dos dados é muito fundamental. Nesse caso o Config-Server é vital para isolamento de ambientes, garantindo que uma aplicação rodando em "Desenvolvimento" nunca se conecte acidentalmente ao banco de dados de "Produção", que poderia causar perda financeira real; auditoria e controle, para que as alterações de configuração fiquem registradas no histórico do Git (quem mudou, quando e por que); e agilidade e compliance, permitindo a troca de chaves de API ou ativação de recursos (feature toggles) instantaneamente em todos os serviços, sem processo de deploy demorado.

c) (implementação do código na prática)

d) A proteção das configurações sensíveis é feita da seguinte forma: definição de uma chave mestra no servidor, criptografia da senha do banco de dados, salvamento apenas do código ilegível no github, e em seguida o config server descriptografa na memória, antes de entregar para o microsserviço.



http://localhost:8080/info
