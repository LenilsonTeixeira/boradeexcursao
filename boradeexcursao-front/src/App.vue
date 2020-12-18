<template>
  <div id="app">
    <Header/>
      <main id="main">
         <router-view/>
      </main>
    <Footer/>
  </div>
</template>

<script>

import Header from '@/components/Header.vue'
import Footer from '@/components/Footer.vue'

export default {
  components: {
    Header,
    Footer
  }
}
</script>

<style>
  * {
      box-sizing: border-box;
      margin: 0;
      padding: 0;
      border: none;
      list-style: none;
      text-decoration: none;
      font-family: "Avenir" Arial, Helvetica, sans-serif;
  }
  
  #app {
    display: flex;
    flex-direction: column;
    min-height: 100vh;
  }

  #main {
    flex: 1;
    min-width: 360px;
  }

::placeholder { /* Chrome, Firefox, Opera, Safari 10.1+ */
  color: rgb(0, 0, 0);
  opacity: 1; /* Firefox */
}

:-ms-input-placeholder { /* Internet Explorer 10-11 */
  color:rgb(0, 0, 0);
}

::-ms-input-placeholder { /* Microsoft Edge */
  color:rgb(0, 0, 0);
}

</style>
