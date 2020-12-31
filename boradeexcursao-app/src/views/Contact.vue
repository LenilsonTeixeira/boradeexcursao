<template>
   <div class="md-layout md-alignment-center">
     <md-card class="md-layout-item md-size-66">
      <md-card-header>
        <div class="md-title">Fale Conosco</div>
      </md-card-header>

      <md-card-content>
         <md-field>
            <label>Nome:</label>
            <md-input v-model="contact.name"></md-input>
         </md-field>
         <md-field>
            <label>Sobrenome:</label>
            <md-input v-model="contact.lastName"></md-input>
         </md-field>
         <md-field>
            <label>Email:</label>
            <md-input type="email" v-model="contact.email"></md-input>
         </md-field>
         <md-field >
            <label >Telefone:</label>
            <md-input v-model="contact.phone"></md-input>
         </md-field>
         <md-field>
            <label>Mensagem:</label>
            <md-textarea v-model="contact.message"></md-textarea>
         </md-field>
      </md-card-content>

      <md-card-actions>
          <md-button class="md-raised md-primary" @click="sendContact()">Enviar</md-button>
      </md-card-actions>
    </md-card>
   </div>
</template>

<script>
export default {
  name:"Contact",
  data(){
      return {
          
        contact: {
           name: this.name,
           lastName: this.lastName,
           email: this.email,
           phone: this.phone,
           message: this.message
        }
          
      }
  },
  methods: {
    sendContact() {
      console.log(this.contact)
    }
  }
}
</script>

<style scoped>
</style>