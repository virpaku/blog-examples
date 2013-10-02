#!/bin/bash

# description: initiates password-less ssh for the current user, on the current host, to another user on a remote machine
#
# author: cdlormo
#
# usage: passwordless-ssh.sh <remote user name> <remote host>

r_user=$1
r_host=$2

if [ $# -ne 2 ]
then
   echo `basename $0` "<remote user> <remote host>"
   exit 1
fi

if [ $? -gt 0 ]
then
  exit 2
fi

if [ ! -f ~/.ssh/id_rsa.pub ]
then
   echo "generating RSA keys for this user..."
   ssh-keygen -t rsa
fi

pub_key=`cat ~/.ssh/id_rsa.pub | cut -f 2 -d " "`
pub_key_line=`cat ~/.ssh/id_rsa.pub`

ssh $r_user@$r_host "chmod 700 ~;mkdir -p ~/.ssh;chmod 700 ~/.ssh;if [ \`cat ~/.ssh/authorized_keys 2>/dev/null | grep $pub_key | wc -l \` -eq 0 ]; then echo $pub_key_line >> .ssh/authorized_keys;fi"

if [ $? -gt 0 ]
then
  exit 2
fi

echo "passwordless ssh successfully enabled for $USER on $HOSTNAME to $r_user on $r_host"
