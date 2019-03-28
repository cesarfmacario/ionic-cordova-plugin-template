#import <Cordova/CDVPlugin.h>

@interface MiPlugin : CDVPlugin {
}

// Encabezados de las funciones del plugin
- (void) listenTextSelectionAction:(CDVInvokedUrlCommand*)command;

@end
