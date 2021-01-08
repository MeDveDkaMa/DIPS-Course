consul {
  address = "consul.service.consul:8500"
  retry {
    enabled = true
    attempts = 0
    backoff = "250ms"
    max_backoff = "1m"
  }
}

template {
  source = "/etc/consul-template/all-services.ctmpl"
  destination = "/etc/nginx/conf.d/default.conf"
  command     = "/usr/sbin/nginx -s reload"
}
