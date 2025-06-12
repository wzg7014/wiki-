import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store' // <-- 新增：引入 store
import Antd from 'ant-design-vue';
import 'ant-design-vue/dist/reset.css';
import * as Icons from '@ant-design/icons-vue';

const app = createApp(App)

app.use(store) // <-- 新增：使用 store
app.use(router)
app.use(Antd)
app.mount('#app')

// 全局注册图标
for (const i in Icons) {
  app.component(i, (Icons as any)[i]);
}
