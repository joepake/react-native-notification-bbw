declare module 'react-native-notification' {
    export function show(options: Options, callback: (error: Error, result: Result) => void): void;

    export interface Options {
        payload: object;
        title: string;
        body: string;
    }

    export interface Result {
        payload: object;
        isClick: boolean;
    }
}
