
resource "null_resource" "ingress_deployment" {
  provisioner "local-exec" {
    command = "minikube addons enable ingress"
  }
}

