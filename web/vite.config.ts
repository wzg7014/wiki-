import { fileURLToPath, URL } from 'node:url'
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
    vue(),
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  },
  server: {
    proxy: {
      // 将所有 /ebook 开头的请求，代理到 http://localhost:8880
      '/ebook': {
        target: 'http://localhost:8880',
        changeOrigin: true,
      }
    }
  }
})
