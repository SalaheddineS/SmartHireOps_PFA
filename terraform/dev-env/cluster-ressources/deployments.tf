
resource "kubernetes_manifest" "selfsigned_cluster_issuer" {

  manifest = {
    apiVersion = "cert-manager.io/v1"
    kind       = "ClusterIssuer"
    metadata = {
      name = "selfsigned-cluster-issuer"
    }
    spec = {
      selfSigned = {}
    }
  }
}

resource "helm_release" "kube-prom-stack" {
  name       = "kube-prom"
  namespace  = var.smart-hire-ops-namespace
  repository = "prometheus-community"
  chart      = "kube-prometheus-stack"

  depends_on = [
    kubernetes_manifest.selfsigned_cluster_issuer
  ]

  values = [
    file("${path.module}/../helm-values/values-kube-prometheus-stack.yaml")
  ]

}

resource "helm_release" "vault-deployment" {
  name       = "vault"
  namespace  = var.smart-hire-ops-namespace
  repository = "https://helm.releases.hashicorp.com"  # HashiCorp Helm repository URL
  chart      = "vault"                               # Chart name in the repository

  depends_on = [
    kubernetes_manifest.selfsigned_cluster_issuer
  ]

  values = [
    file("${path.module}/../helm-values/values-vault.yaml")
  ]
}


resource "helm_release" "argocd_deploy" {
  name       = "argo-cd"
  repository = "https://argoproj.github.io/argo-helm"
  chart      = "argo-cd"
  namespace  = var.argocd-namespace

  values = [
    file("${path.module}/../helm-values/values-argo-cd.yaml")
  ]
  depends_on = [
    kubernetes_manifest.selfsigned_cluster_issuer,
  ]
}





