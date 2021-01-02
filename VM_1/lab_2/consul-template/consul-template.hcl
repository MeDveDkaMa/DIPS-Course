consul {
  address = "consul:8500"
  retry {
    enabled = true
    attempts = 0
    backoff = "250ms"
    max_backoff = "1m"
  }
}

template {
  source = "/consul-template/all-services.ctmpl"
  destination = "/etc/nginx/conf.d/default.conf"
}
