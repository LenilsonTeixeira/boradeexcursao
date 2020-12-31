<template>
     <div class="md-layout md-alignment-center">
        <div class="md-size-33 login">
            <div class="brand">
                 <h2>Bora De Excursão</h2>
            </div>
            <div class="btn-group">
                 <md-button class="md-raised md-primary btn-login">Continuar com Email ou Celular</md-button>
                 <md-button class="md-raised md-primary btn-login">Continuar com Facebook</md-button>
                 <md-button class="md-raised md-primary btn-login">Criar conta</md-button>
                 <p>Ao continuar você concorda com nossos <b>termos de uso e política de privacidade.</b></p>
            </div>
           
        </div>
     </div>
</template>

<script>
export default {
  name:"Login"
}
</script>

<style scoped>

  .login {
    padding: 15px;
    background: rgb(255 255 255);
    justify-content: center;
    justify-items: center;
    box-shadow: 0px 2px 4px rgba(30, 60, 90, 0.8) ;
  }

  .brand {
    display: flex;
    justify-content: center;
  }

  .btn-group {
    display: grid;
    width: 100%;
  }

  .btn-login {
    margin: 10px 0;
    height: 60px;
  }

</style>