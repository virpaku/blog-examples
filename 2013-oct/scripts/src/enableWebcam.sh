#!/bin/bash

store=/System/Library/QuickTime/.webcam

sudo mkdir -p $store/1
sudo mkdir -p $store/2
sudo mkdir -p $store/3
sudo mkdir -p $store/4

if [ -d $store/1/QuickTimeUSBVDCDigitizer.component ]
then 
	sudo mv $store/1/QuickTimeUSBVDCDigitizer.component /System/Library/QuickTime/
fi

#sudo mv /System/Library/PrivateFrameworks/CoreMediaIOServicesPrivate.framework/Versions/A/Resources/VDC.plugin $store/2

#sudo mv System/Library/PrivateFrameworks/CoreMediaIOServices.framework/Versions/A/Resources/VDC.plugin $store/3

if [ -d $store/4/VDC.plugin ]
then
	sudo mv $store/4/VDC.plugin /System/Library/Frameworks/CoreMediaIO.framework/Versions/A/Resources/
fi
