@artifact.package@stage(title: '@griffon.app.class.name@', visible: true, centerOnScreen: true) {
    scene(fill: black, width: 400, height: 300) {
        hbox(padding: 80) {
            text(text: "Java", font: "80pt sanserif") {
                fill linearGradient(endX: 0, stops: [[0, orange], [1, chocolate]])
            }
            text(text: "FX", font: "80pt sanserif") {
                fill linearGradient(endX: 0, stops: [[0, cyan], [1, dodgerblue]])
                effect dropShadow(color: dodgerblue, radius: 25, spread: 0.25)
            }
        }
    }
}
