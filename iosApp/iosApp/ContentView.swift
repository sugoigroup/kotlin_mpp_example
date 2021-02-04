import SwiftUI
import shared


struct ContentView: View {
    var body: some View {
        Text("3 달라는 엔화로" + String(ExchangeMoney(baseDollor: 3.0).toYen()))
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
