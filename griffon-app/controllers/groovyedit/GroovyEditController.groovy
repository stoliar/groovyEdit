package groovyedit

import javax.swing.JFileChooser

class GroovyEditController {
    // these will be injected by Griffon
    def model
    def view

    def openFile = {
        def openResult = view.fileChooserWindow.showOpenDialog()
        if( JFileChooser.APPROVE_OPTION == openResult ) {
            File file = view.fileChooserWindow.selectedFile
            String mvcId = file.path + System.currentTimeMillis()
            createMVCGroup('filePanel', mvcId,
                    [file: file, tabGroup: view.tabGroup, tabName: file.name, mvcId: mvcId])
        }
    }

    def quit = {
        app.shutdown()
    }
}

