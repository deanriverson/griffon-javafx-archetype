@artifact.package@
application(title: '@griffon.app.class.name@') {
    scene(fill: "black") {
        hbox(padding: 100) {
            text(text: "Java", font: "80pt sanserif") {
                linearGradient(endX: 0, stops: [[0, orange], [1, chocolate]])
            }
            text(text: "FX", font: "80pt sanserif") {
                linearGradient(endX: 0, stops: [[0, cyan], [1, dodgerblue]])
                dropShadow(color: dodgerblue, radius: 25, spread: 0.25)
            }
        }
    }
}
