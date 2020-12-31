<template>
   <md-content class="md-primary">
     <div class="md-layout md-alignment-center">
        <div>
             <h4>© {{year}} Copyright - Todos os direitos reservados.</h4>
              <md-button href="#" class="footer-icon"><md-icon class="fab fa-facebook"></md-icon></md-button>
              <md-button href="#" class="footer-icon"><md-icon class="fab fa-instagram"></md-icon></md-button>
              <md-button href="#" class="footer-icon"><md-icon class="fab fa-youtube"></md-icon></md-button>
        </div>   
      </div>
   </md-content>

</template>

<script>
export default {
  name:"Footer",
  data() {
    return {
      year: new Date().getFullYear()
    }
  }

}
</script>

<style scoped>
   .footer {
     top: 100px;
   }
   .footer-icon {
     margin: 15px;
   }
</style>