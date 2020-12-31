import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Plans from '../views/Plans.vue'
import AddAgency from '../views/AddAgency.vue'
import Excursions from '../views/Excursions.vue'
import Excursion from '../views/Excursion.vue'
import Contact from '../views/Contact.vue'
import Login from '../views/Login.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/planos',
    name: 'Plans',
    component: Plans
  },
  {
    path: '/cadastrar-agencia',
    name: 'AddAgency',
    component: AddAgency
  },
  {
    path: '/excursoes',
    name: 'Excursions',
    component: Excursions
  },
  {
    path: '/excursao',
    name: 'Excursion',
    component: Excursion
  },
  {
    path: '/contato',
    name: 'Contact',
    component: Contact
  },
  {
    path: '/login',
    name: 'Login',
    component: Login
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
