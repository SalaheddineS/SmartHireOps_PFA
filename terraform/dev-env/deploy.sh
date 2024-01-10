cd ./cluster-init
rm -rf ./.terraform*
rm ./terraform.tfstate
terraform init 
terraform apply -auto-approve

cd ../cluster-ressources
rm -rf ./.terraform*
rm ./terraform.tfstate
terraform init
terraform apply -auto-approve

cd ../cluster-dependant-ressources
rm -rf ./.terraform*
rm ./terraform.tfstate
terraform init
terraform apply -auto-approve

cd ..
./get_argo_password.sh
./configure_etc_hosts.sh