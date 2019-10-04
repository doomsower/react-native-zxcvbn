import React, {useCallback, useState} from 'react';
import {SafeAreaView, StyleSheet, Text, TextInput, View} from 'react-native';
import {score} from 'react-native-zxcvbn';

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 8,
    paddingTop: 26,
  },
  input: {height: 40, borderColor: 'gray', borderWidth: 1},
});

const App = () => {
  const [strength, setStrength] = useState(0);
  const onChangeText = useCallback(
    password => {
      score(password).then(result => setStrength(result));
    },
    [setStrength],
  );
  return (
    <SafeAreaView>
      <View styles={styles.container}>
        <TextInput onChangeText={onChangeText} style={styles.input} />
        <Text>{strength}</Text>
      </View>
    </SafeAreaView>
  );
};

export default App;
