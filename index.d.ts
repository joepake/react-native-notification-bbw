declare module 'react-native-notification' {
    export function show(options: Options, callback: (error: Error, result: Result) => void): void
  
    export interface Options {
        payload: string;
        data: string[];
    }
    
    export interface Result {
        payload: string;
        onPress: boolean;
    }
  }
  