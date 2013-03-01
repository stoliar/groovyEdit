package groovyedit

fileChooserWindow = fileChooser()
fileViewerWindow = application(
        title:'GroovyEdit',
        size: [480,320],
        locationByPlatform:true,
        iconImage: imageIcon('/griffon-icon-48x48.png').image,
        iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                imageIcon('/griffon-icon-32x32.png').image,
                imageIcon('/griffon-icon-16x16.png').image] ) {
    menuBar {
        menu('File') {
            menuItem 'Open'
            separator()
            menuItem 'Quit'
        }
    }
    borderLayout()
    tabbedPane(id: 'tabGroup', constraints: CENTER)
}