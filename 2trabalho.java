const perguntas = [

{
pergunta:"1. O que é Inteligência Artificial?",
respostas:[
"Uma tecnologia capaz de simular algumas capacidades da inteligência humana.",
"Um equipamento utilizado apenas em laboratórios.",
"Um programa criado apenas para jogos.",
"Uma linguagem de programação."
],
correta:0
},

{
pergunta:"2. Qual é um benefício da IA na educação?",
respostas:[
"Diminuir o acesso ao conhecimento.",
"Auxiliar professores e estudantes durante o processo de aprendizagem.",
"Substituir totalmente os professores.",
"Eliminar todas as atividades escolares."
],
correta:1
},

{
pergunta:"3. Qual tecnologia foi utilizada para estruturar este site?",
respostas:[
"Python",
"HTML5",
"Java",
"SQL"
],
correta:1
},

{
pergunta:"4. Qual linguagem foi utilizada para estilizar o site?",
respostas:[
"CSS3",
"C++",
"PHP",
"Java"
],
correta:0
},

{
pergunta:"5. O JavaScript foi utilizado para:",
respostas:[
"Criar o banco de dados.",
"Adicionar interatividade ao site.",
"Criar imagens.",
"Editar vídeos."
],
correta:1
},

{
pergunta:"6. A IA pode ajudar o professor em:",
respostas:[
"Planejamento de aulas e criação de atividades.",
"Apenas na impressão de documentos.",
"Somente em cálculos financeiros.",
"Troca de equipamentos."
],
correta:0
},

{
pergunta:"7. Um exemplo de ferramenta de IA é:",
respostas:[
"Bloco de notas.",
"Calculadora comum.",
"ChatGPT.",
"Paint."
],
correta:2
},

{
pergunta:"8. A IA pode contribuir para:",
respostas:[
"Aprendizagem personalizada.",
"Redução do aprendizado.",
"Fim das escolas.",
"Substituição completa da educação."
],
correta:0
},

{
pergunta:"9. O uso da IA deve acontecer de forma:",
respostas:[
"Irresponsável.",
"Ética e consciente.",
"Sem orientação.",
"Aleatória."
],
correta:1
},

{
pergunta:"10. Qual é o principal objetivo deste projeto?",
respostas:[
"Ensinar programação.",
"Apresentar uma reflexão sobre a Inteligência Artificial na aprendizagem e na prática pedagógica.",
"Vender cursos.",
"Criar uma rede social."
],
correta:1
}

];

let perguntaAtual = 0;
let pontos = 0;

const pergunta = document.getElementById("pergunta");
const resultado = document.getElementById("resultado");

const botoes = [
document.getElementById("btn0"),
document.getElementById("btn1"),
document.getElementById("btn2"),
document.getElementById("btn3")
];

function carregarPergunta(){

resultado.innerHTML="";

pergunta.innerHTML=perguntas[perguntaAtual].pergunta;

for(let i=0;i<4;i++){

botoes[i].innerHTML=perguntas[perguntaAtual].respostas[i];

}

}

function responder(opcao){

if(opcao===perguntas[perguntaAtual].correta){

pontos++;

}

perguntaAtual++;

if(perguntaAtual<perguntas.length){

carregarPergunta();

}else{

mostrarResultado();

}

}

function mostrarResultado(){

pergunta.innerHTML="Quiz Finalizado!";

document.getElementById("respostas").style.display="none";

resultado.innerHTML=
"Você acertou <strong>"+pontos+"</strong> de <strong>"+perguntas.length+"</strong> perguntas.";

document.getElementById("reiniciar").style.display="inline-block";

}

function reiniciarQuiz(){

perguntaAtual=0;

pontos=0;

document.getElementById("respostas").style.display="block";

document.getElementById("reiniciar").style.display="none";

carregarPergunta();

}

window.onload=function(){

document.getElementById("reiniciar").style.display="none";

carregarPergunta();

};
