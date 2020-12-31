<template>
        <div class="md-layout md-alignment-center">
     <md-card class="md-layout-item md-size-66">
      <md-card-header>
        <div class="md-title">Cadastro de Agência</div>
      </md-card-header>

      <md-card-content>
         <md-field>
            <label>Nome:</label>
            <md-input></md-input>
         </md-field>
         <md-field>
            <label>Sobrenome:</label>
            <md-input></md-input>
         </md-field>
         <md-field>
            <label>Email:</label>
            <md-input type="email"></md-input>
         </md-field>
         <md-field >
            <label >Telefone:</label>
            <md-input></md-input>
         </md-field>
         <md-field>
            <label>Mensagem:</label>
            <md-textarea></md-textarea>
         </md-field>
      </md-card-content>

      <md-card-actions>
          <md-button class="md-raised md-primary">Enviar</md-button>
      </md-card-actions>
    </md-card>
   </div>
</template>

<script>
export default {
  name:"AddAgency"
}
</script>

<style scoped>

</style>