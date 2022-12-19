# EncryptText

[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=21)
[![](https://jitpack.io/v/IbrahimOdeh/EncryptText.svg)](https://jitpack.io/#IbrahimOdeh/EncryptText)

Simple Library to Encrypt Your Text in Android Studio.

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
    ...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	        implementation 'com.github.IbrahimOdeh:EncryptText:1.0.1'
	}
```

## How To Use
``` java
// Encrypt
enText.decText("Text")

// Decrypt
enText.encText("Text")
```

## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/IbrahimOdeh/EncryptText/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

### Follow Me
- [My Website](https://ibrahimodeh.com)
- [Twitter](https://twitter.com/IbrahimOdeh95)
- [Github](https://github.com/IbrahimOdeh)
- [Instagram](https://www.instagram.com/ibrahim0deh)
- [Facebook](https://fb.me/IbrahimOdehWebsite)

## License MIT

```
MIT License

Copyright (c) 2019-2023 Ibrahim Odeh

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
