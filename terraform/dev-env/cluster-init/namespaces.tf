resource "kubernetes_namespace" "create-smarthireops-namespace" {
  metadata {
    name = var.smart-hire-ops-namespace
  }
  depends_on = [ null_resource.ingress_deployment ]
}

resource "kubernetes_namespace" "create-argocd-namespace" {
  metadata {
    name = var.argocd-namespace
  }
  depends_on = [ null_resource.ingress_deployment ]

}

