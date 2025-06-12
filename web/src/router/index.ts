import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue' // <--- 修改点 1: 文件名从 HomeView.vue 改为 Home.vue

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home // <--- 修改点 2: 组件名从 HomeView 改为 Home
    },
    {
      path: '/about',
      name: 'about',
      // 同样，这里我们直接加载你的 About.vue
      component: () => import('../views/About.vue')
    }
  ]
})

export default router
