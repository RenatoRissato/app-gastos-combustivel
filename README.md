# ⛽ Aplicativo Android para Controle de Despesas com Combustível

Este projeto foi desenvolvido para a faculdade no Android Studio usando Kotlin. O aplicativo calcula o total gasto com combustível considerando a autonomia do veículo, a distância percorrida e o valor pago por litro.

<div align="center">
<img src="/Images/1.png" alt="Preview do App" >
</div>

---

## 🚀 Funcionalidades

- Cálculo do gasto total com combustível baseado em:
  - Autonomia do veículo (km por litro)
  - Distância percorrida
  - Valor pago por litro
- Fórmula usada:

  Total gasto = (Distância percorrida ÷ Autonomia) × Valor do litro

- Tela de login criada utilizando **RelativeLayout** como exercício prático.

---

## 🛠️ Tecnologias utilizadas

- Kotlin
- Android Studio
- RelativeLayout (para a tela de login)

---

## 🗂️ Estrutura do Projeto
```
GastosCombustivel/
┣ 📂 app
┃ ┣ 📂 src
┃ ┃ ┣ 📂 main
┃ ┃ ┃ ┣ 📂 java/com/example/gastoscombustivel
┃ ┃ ┃ ┃ ┗ 📄 LoginActivity.kt
┃ ┃ ┃ ┃ ┗ 📄 MainActivity.kt
┃ ┃ ┃ ┣ 📂 res
┃ ┃ ┃ ┃ ┣ 📂 layout
┃ ┃ ┃ ┃ ┃ ┗ 📄 activity_login.xml
┃ ┃ ┃ ┃ ┃ ┗ 📄 activity_main.xml
┃ ┃ ┃ ┃ ┗ ...
┃ ┃ ┃ ┣ 📄 AndroidManifest.xml
┃ ┗ ...
```

---

## 🧠 Aprendizados

- Desenvolvimento Android básico com Kotlin
- Uso do RelativeLayout para construir telas responsivas
- Manipulação de entrada de dados e lógica para cálculos simples
- Criação de interface de login funcional

---

## 📌 Como executar localmente

1. Clone o repositório:

```bash
git clone https://github.com/RenatoRissato/app-gastos-combustivel.git
```
2. Abra o projeto no Android Studio.

3. Conecte um dispositivo físico via USB (com modo desenvolvedor ativado) ou utilize um emulador.

4. Clique em Run no Android Studio para instalar e executar o aplicativo no dispositivo escolhido.


## 📜 Licença

Este projeto é open source e está disponível sob a licença MIT.

---

Feito com ❤️ por [Renato Rissato](https://github.com/RenatoRissato) 🚀
