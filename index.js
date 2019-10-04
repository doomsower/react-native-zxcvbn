import { NativeModules } from 'react-native';

const { RNZxcvbn } = NativeModules;

export const score = (password) => {
  if (!password) {
    return Promise.resolve(0);
  }
  return RNZxcvbn.score(password);
};
