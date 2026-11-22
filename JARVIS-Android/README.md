# JARVIS Android Assistant

A separate Android app project. This folder does not modify the website files.

## V1 goals
- User-started listening session with a persistent microphone foreground-service notification.
- Local wake-word detection (initial prototype: Porcupine built-in "Jarvis" keyword; requires an AccessKey and licensing review).
- Hindi voice-command capture and speech output.
- Offline command handling first; online AI integration later.
- Explicit confirmation for sensitive actions.

## Android platform constraints
- The user must grant microphone permission and start listening while the app is visible.
- Android foreground microphone services have platform restrictions; the app will show an ongoing notification and microphone indicator.
- Screen-locked operation depends on device/OS behavior and battery settings; it cannot be guaranteed on every device.
- No hidden or stealth recording.

## Planned implementation
1. Android app scaffold (Kotlin).
2. Foreground microphone service and notification.
3. Wake-word engine integration.
4. Speech-to-text and Hindi text-to-speech.
5. Offline intent router.
6. Optional online AI backend, with secrets kept off-device.

## Build status
Project planning started. Source files and build instructions will be added incrementally. This is not yet a compiled or tested APK.

## Privacy
Audio should be processed locally by default. Any future cloud feature must clearly disclose when audio/text is sent online and require the user's choice.