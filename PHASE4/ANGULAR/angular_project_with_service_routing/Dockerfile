# #STAGE 1: Build Angular Project
FROM node:alpine as build

WORKDIR /usr

COPY . /usr

RUN npm install -g @angular/cli && npm install && ng build

# #STAGE 2: Run 
FROM nginx:alpine-slim
COPY --from=build /usr/dist/angular_project_with_service_routing/browser /usr/share/nginx/html

# Expose nginx webserver 
EXPOSE 80