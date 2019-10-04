# react-native-zxcvbn

This module is a wrapper around [zxcvbn4j](https://github.com/nulab/zxcvbn4j) and [zxcvbn-ios](https://github.com/dropbox/zxcvbn-ios).

Why? Because js module huge. 

## Getting started

`$ yarn add react-native-zxcvbn`

### Mostly automatic installation

This module supports autolinking so if you use RN 0.60+ then no additional action is required.

Otherwise, run

`$ react-native link react-native-zxcvbn`

## Usage

Render startup time badge somewhere on your first screen:

```jsx
import { score } from 'react-native-zxcvbn';

const strength = await score(password);
console.log(strength);

```
