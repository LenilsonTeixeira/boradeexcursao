<template>
   <section class="hero">
      <img src="@/assets/hero.jpg" alt="Imagem principal de abertura da página inicial">
      <div class="hero-content">
        <nav class="hero-tab">
           <button class="tab-btn active">Já sei meu destino:</button>
           <button class="tab-btn">Quero conhecer os destinos disponíveis:</button>
           <button class="tab-btn">Desejo sugerir um destino:</button>
        </nav>
         <form>
           <div class="input-group">
              <label for="origin">Cidade de Origem:</label>
                <input type="text" id="origin" name="origin" placeholder="De onde vai sair ?">
              <label for="destination">Local de Destino:</label>
                <input type="text" id="destination" name="destination" placeholder="Para onde deseja ir ?">
              <label for="departureDate">Escolha a Data:</label>
                <input type="date" id="departureDate" name="departureDate">
           </div>
            <button class="btn">Buscar Excursões</button>
         </form> 
      </div>

   </section>
</template>

<script>

export default {
  name: 'Home',
  components: {
    
  }
}
</script>

<style scoped>
  .hero {
    width: 100%;
    display: flex;
    color: #FFFFFF;
  }

  .hero img {
    display: block;
    width: 100%;
    height: 800px;
    
  }

  .hero-content {
     top: 30%;
     /* display: flex;
     flex-direction: column;
     align-items: center;
     justify-content: center; */
     transform: translate(40%, 50%);
     position: absolute;
     background:linear-gradient(10deg, black, transparent);
     box-shadow: 0px 5px 5px rgb(0 0 0);
  }

  .hero-content .hero-tab {
     width: 100%;
   }

  .hero-content .tab-btn {
       padding: 15px 20px;
       border: none;
       display: inline-block;
       font-weight: bold;
       text-align: left;
       font-size: 1rem;
       position: relative;
       background:#69c5e8;
       box-shadow: 0px 2px 4px rgb(0 0 0);
       cursor: pointer;
   }

  .hero-content .tab-btn:nth-child(1) {
       background:#a7c3ca;
   }

  .hero-content .tab-btn:nth-child(3) {
       background:hsl(197, 92%, 42%);
  }


  .hero-content form {
    margin-top: 20px;
    padding: 10px;
  }

  .hero-content .input-group {
    flex: 1;
    display: flex;
    align-items: center;
    font-weight: bold;
  }

  .hero-content form input {
     padding: 10px;
     border: none;
     margin: 10px;
  }

  .hero-content .btn {
    border: none;
    padding: 10px;
    font-weight: bold;
    float: right;
    margin: 10px;
    background: tomato;
    color: #FFFFFF;
    box-shadow: 0px 2px 4px rgb(0 0 0);
    cursor: pointer;
  }

</style>
