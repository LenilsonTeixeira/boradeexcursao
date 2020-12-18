<template>
    <section class="form-contact">
        <form>
            <h1>Fale Conosco</h1>
            <label for="name">Nome:</label>
            <input type="text" id="name" name="name" placeholder="Digite o nome:">
            <label for="lastName">Sobrenome:</label>
            <input type="text" id="lastName" name="lastName" placeholder="Digite o sobrenome:">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Digite o email:">
            <label for="phone">Telefone:</label>
            <input type="text" id="phone" name="phone" placeholder="Digite o telefone com DDD:">
            <label for="message">Mensagem:</label>
            <textarea name="textarea" rows="10" placeholder="Escreva o motivo do contato..."></textarea>
            <button class="btn">Enviar</button>
        </form>
    </section>
</template>

<script>
export default {
   name: "Contact"
}
</script>

<style scoped>
    .form-contact form{
        display: grid;
        max-width: 700px;
        margin: 60px auto;
        font-family: "Avenir" Arial, Helvetica, sans-serif;
        box-shadow: 0px 2px 4px rgb(0 0 0);
        padding: 15px;
        background: #45b7df;
    }
    .form-contact label {
        margin-top: 15px;
    }
    .form-contact input {
        padding: 15px;
        border: none;
        background:#FFFFFF;
    }
    .form-contact textarea {
        padding: 15px;
        border: none;
        background: #FFFFFF;
    }
    .form-contact h1 {
        font-size: 3em;
    }
    .form-contact .btn {
        margin-top: 15px;
        border: none;
        padding: 15px;
        font-weight: bold;
        float: right;
        background: tomato;
        color: #FFFFFF;
        box-shadow: 0px 2px 4px rgb(0 0 0);
        cursor: pointer;
  }

</style>