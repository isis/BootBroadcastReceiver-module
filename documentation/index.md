# *BootBroadcastReceiver Module*

## Description

*BootBroadcastReceiver Module* makes your Titanium app launch when Android device boot and/or your app package replaced.

*BootBroadcastReceiver Module* receives "android.intent.action.BOOT_COMPLETED" and "android.intent.action.PACKAGE_REPLACED", and launch your Titanium app.  

## Accessing the bootbroadcastreceiver Module

*BootBroadcastReceiver Module* no neads creation of Object of Module like below:

	var bootbroadcastreceiver = require("jp.isisredirect.bootbroadcastreceiver");

You need only import module by &lt;module&gt; in tiapp.xml :

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
Copyright (c) 2013 Katsumi ISHIDA. All rights reserved.

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.