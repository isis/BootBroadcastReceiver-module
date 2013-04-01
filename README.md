BootBroadcastReceiver-module
============================

Titaium Mobile Module for Android to receive BOOT_COMPLETE/PACKAGE_REPLACED and to launch app

## Description

*BootBroadcastReceiver Module* makes your Titanium app launch when Android device boot and/or your app package replaced.

*BootBroadcastReceiver Module* receives "android.intent.action.BOOT_COMPLETED" and "android.intent.action.PACKAGE_REPLACED", and launch your Titanium app.  

## Accessing the bootbroadcastreceiver Module

*BootBroadcastReceiver Module* no neads creation of Object of Module like below:
  var bootbroadcastreceiver = require("jp.isisredirect.bootbroadcastreceiver");

You need only import module by <module> in tiapp.xml :

     <modules>
        <module platform="android" version="2.0">jp.isisredirect.bootbroadcastreceiver</module>
     </modules>

## Requrement

Android min-sdk: Android 2.2 (API Level 8)
Titanium 2.1.0.GA

## Reference

### module method

+ non

### module property

+ non

## Usage

You need import module only.

## Author

Kastumi ISHIDA (isis re-direct) in k.i.office.

isis.redirect4@gmail.com

## License
Copyright 2013 Katsumi ISHIDA. All rights reserved.

 This library is free software; you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public
 License as published by the Free Software Foundation; either
 version 2.1 of the License, or (at your option) any later version.

 This library is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public
 License along with this library; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 USA.
