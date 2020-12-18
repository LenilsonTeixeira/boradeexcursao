<template>
  <footer>
      <h3>Termos de Uso</h3>
      <div class="social-medias">
        <router-link to="/foo"><i class="fab fa-youtube fa-lg"></i></router-link>
        <router-link to="/foo"><i class="fab fa-facebook-square fa-lg"></i></router-link>
        <router-link to="/foo"><i class="fab fa-instagram-square fa-lg"></i></router-link>
      </div>
  </footer>

</template>

<script>
export default {

}
</script>

<style scoped>
  footer {
    padding: 25px 0px;
    text-align: center;
    font-size: 1rem;
    position: relative;
    background: rgb(91 95 92 / 55%);
    top: 75px
  }

  footer h3 {
    margin-bottom: 10px;
  }

  .social-medias a {
    color: #161616;
    margin: 10px;
  }

</style>