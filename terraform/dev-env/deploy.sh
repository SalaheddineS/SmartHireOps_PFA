cd ./cluster-init
rm .terraform*
rm terraform.tfstate
rm -rf .terraform
terraform init 
terraform apply -auto-approve

cd ../cluster-ressources
rm .terraform*
rm terraform.tfstate
rm -rf .terraform
terraform init
terraform apply -auto-approve

cd ../cluster-dependant-ressources
rm .terraform*
rm terraform.tfstate
rm -rf .terraform
terraform init
terraform apply -auto-approve

cd ..
./get_argo_password.sh