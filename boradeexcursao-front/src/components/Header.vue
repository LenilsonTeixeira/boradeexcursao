<template>
  <header class="header">
    <h1 class="logo">Bora de Excursão</h1>
      <ul>
        <li> <router-link to="/">Para Agências</router-link></li>
        <li> <router-link to="/contato">Contato</router-link></li>
        <li> <router-link to="/login">Entrar</router-link></li>
      </ul>
      <ul>
        <li class="toggle"><a href="#"><i class="fas fa-bars"></i></a></li>
      </ul>
  </header>
</template>

<script>
export default {
  name:"Header"
}
</script>

<style scoped>
    .header {
        background-color: hsl(197, 92%, 42%);
        color: rgb(0, 0, 0);
        display: flex;
        padding: 10px 15px;
        min-width: 350px;
        border-bottom: 1px solid #45b7df;
        box-shadow: 0px 2px 4px rgb(0 0 0);

    }

    .header .logo {
        flex: 1;
        display: flex;
    }

    .header ul {
        display: flex;
    }

    .header ul li {
        display: flex;
        align-items: center;
        cursor: pointer;
    }

    .header ul li a {
        margin-right: 15px;
        font-weight: bold;
        color: #000000;
        padding: 10px;
        font-family: "Avenir" Arial, Helvetica, sans-serif;
    }
</style>