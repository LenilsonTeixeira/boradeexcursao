<template>
  <div class="md-layout">
    <div class="md-layout-item md-size-100 hero">
     <form class="form-excursion">
           <md-content class="form-excursion-group md-elevation-24">
              <nav class="tab">
                <div class="tab-content">
                    <button class="tab-btn active">Já sei meu destino:</button>
                    <button class="tab-btn">Conhecer os destinos disponíveis:</button>
                    <button class="tab-btn">Desejo sugerir um destino:</button>
                 </div>
              </nav>
              <div class="form-content">
                  <label for="origin">Cidade de Origem:</label>
                  <input type="text" id="origin" name="origin" placeholder="De onde vai sair ?">
                  <label for="destination">Local de Destino:</label>
                  <input type="text" id="destination" name="destination" placeholder="Para onde deseja ir ?">
                  <label for="departureDate">Escolha a Data:</label>
                  <input type="date" id="departureDate" name="departureDate">
              </div>
               <md-button class="md-raised md-primary">Buscar Excursões</md-button>
            </md-content>
      </form>
  </div>
</div>
</template>

<script>

export default {
  name: 'Home',
}
</script>

<style scoped>

  .hero {
    background-image: url('../assets/hero.jpg');
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: cover;
    height: 800px;
    margin-top: -50px;

  }

  .tab {
    display: flex;
    flex-direction: column;
    width: 100%;
  }
  .tab-content {
     display: flex;
  }

  .tab-btn {
       padding: 15px 20px;
       border: none;
       margin-bottom: 15px;
       font-weight: bold;
       display: flex;
       text-align: left;
       font-size: 1rem;
       position: relative;
       background:#b2b5b6;
       box-shadow: 0px 2px 4px rgb(0 0 0);
       cursor: pointer;
   }

    .form-excursion {
      display: flex;
      margin-top: 30vh;
      align-content: center;
      align-self: center;
      justify-content: center;
      justify-items: center;
      
    }

    .form-content {
      padding-left: 10px;
      padding-bottom: 10px;
      padding-top: 10px;
    }

   .form-excursion-group {
     display: flex;
     align-items: center;
     align-content: center;
     flex-wrap: wrap;
     flex-direction: column;
   }

   .form-excursion input {
     padding: 10px;
     margin: 10px;
   } 

</style>
