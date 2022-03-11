# Demo

Para iniciar o projeto, apenas é necessário usar o Archetype do Maven:

```
mvn -B org.apache.maven.plugins:maven-archetype-plugin:3.2.1:generate \
 -D archetypeGroupId=com.adobe.aem \
 -D archetypeArtifactId=aem-project-archetype \
 -D archetypeVersion=35\
 -D appTitle="Demo" \
 -D appId="demo" \
 -D groupId="com.accenture" \
 -D aemVersion=6.5.12
```

Depois do projeto criado, existirá apenas a estrutura do projeto na pasta executada, com o nome `demo`:

https://github.com/adobe/aem-project-archetype

Foi criado o componente `imagetext`:
- O código java do model do componente está em: `demo.core/src/main/java/com/accenture/core/models/ImageTextModel.java`
- O código referente ao componente criado no AEM está em: `demo.ui.apps/src/main/content/jcr_root/apps/demo/components/imagetext`
- O scss do componente: `demo.ui.frontend/src/main/webpack/components/_imagetext.scss`

A classe java indica um Model já criado, contendo o `text` e a `image` que são autoráveis. Também contém uma forma de disponibilizar o `alt` e `title` para imagem, propriedades que vêm do DAM.

No diretório contendo o componente AEM, temos a `dialog` criada e o `html` do componente, que será renderizado no navegador quando o componente for usado numa página.

## Documentação de apoio

- Core components da Adobe: https://github.com/adobe/aem-core-wcm-components
- Componentes Granite para consturção de dialogs: developer.adobe.com/experience-manager/reference-materials/6-5/granite-ui/api/jcr_root/libs/granite/ui/components/coral/foundation/server.html
- Para fazer deploy do código java, executar o comando dentro da pasta core: ´mvn -Padobe-public install -PautoInstallBundle´
- Para fazer deploy do código do AEM, componentes e configurações, executar na raiz do projeto pai: mvn -Padobe-public install -PautoInstallPackage
- A linguagem utilizada nos HTMLs se chama HTL, procurando por documentação dela no google acharão exemplos de como utilizar
- Para acessar a base de dados do AEM: http://localhost:4502/crx/de
- Para visualizar configurações e estado da aplicação, pode ser acessado (navegar nos menus para ver as opções): http://localhost:4502/system/console

## Desafio a ser implementado

Construir um componente que contenha uma lista de imagens, de preferência em formato de carrossel, podem ser utilizados javascripts de terceiros.