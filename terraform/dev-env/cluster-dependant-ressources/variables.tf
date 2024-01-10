variable "smart-hire-ops-namespace" {
  default = "smart-hire-ops"
}

variable "argocd-namespace" {
  default = "argocd"
}

variable "argo-target-path" {
  default = "kubernetes/dev-env/manifests"
}

variable "project-url" {
  default = "https://github.com/SalaheddineS/SmartHireOps_PFA"
}

variable "argo-target-branch" {
  default = "staging"
}