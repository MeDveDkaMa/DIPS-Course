FROM nginx:alpine

ADD https://releases.hashicorp.com/consul-template/0.25.1/consul-template_0.25.1_linux_amd64.zip /

RUN unzip consul-template_0.25.1_linux_amd64.zip && \
    mv consul-template /usr/local/bin/consul-template &&\
    rm -rf /consul-template_0.25.1_linux_amd64.zip && \
    mkdir -p /consul-template /consul-template/config.d /consul-template/templates && \
    apk add --no-cache curl

RUN rm /etc/nginx/conf.d/*
