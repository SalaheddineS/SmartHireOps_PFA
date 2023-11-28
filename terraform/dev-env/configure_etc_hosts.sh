#!/bin/bash

# Get the current minikube IP and extract the last part
minikube_ip=$(minikube ip)
last_part=$(echo $minikube_ip | awk -F'.' '{print $4}')

# Replace any IP address in the 192.168.39 range with the last part of minikube IP in the hosts file
sed -i "s/192.168.39.[0-9]\+/192.168.39.$last_part/g" /etc/hosts
