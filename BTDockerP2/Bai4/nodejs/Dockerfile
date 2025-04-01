# Dockerfile

# Sử dụng Node.js phiên bản 18 làm base image
FROM node:18

# Tạo thư mục ứng dụng trong container
WORKDIR /usr/src/app

# Sao chép package.json và package-lock.json vào container
COPY package*.json ./

# Cài đặt các dependencies
RUN npm install

# Sao chép toàn bộ mã nguồn vào container
COPY . .

# Expose cổng 3000 (ứng dụng Node.js sẽ chạy ở đây)
EXPOSE 3000

# Chạy ứng dụng Node.js khi container khởi động
CMD ["npm", "start"]
