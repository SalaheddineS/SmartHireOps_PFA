resource "kubernetes_manifest" "argocd_application_deploy" {

  manifest = {
    apiVersion = "argoproj.io/v1alpha1"
    kind       = "Application"
    metadata = {
      name      = "argocd-app"
      namespace = var.argocd-namespace
    }
    spec = {
      destination = {
        namespace = var.argocd-namespace
        server    = "https://kubernetes.default.svc"
      }
      project = "default"
      source = {
        path            = var.argo-target-path
        repoURL         = var.project-url
        targetRevision  = var.argo-target-branch
      }
      syncPolicy = {
        automated = {
          prune    = true
          selfHeal = false
        }
        syncOptions = ["CreateNamespace=true"]
      }
    }
  }
}