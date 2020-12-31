<template>
    <md-toolbar class="md-transparent header md-medium" md-elevation="4">
      <h3 class="md-title"><md-button to="/">BORA DE EXCURSÃO</md-button></h3>
      <md-button class="btn" to="/cadastrar-agencia">Agências</md-button>
      <md-button class="btn" to="/planos">Para Agências</md-button>
      <md-button class="btn" to="/contato">Contato</md-button>
      <md-button class="btn" to="/login">Entrar</md-button>
    </md-toolbar>
</template>

<script>
export default {
   name:"Header"
}
</script>

<style scoped>
   .md-title {
       flex: 1;
   }

   .header {
       margin-bottom: 50px;
   }

</style>