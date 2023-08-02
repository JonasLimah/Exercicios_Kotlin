package limah.jonas.smartPhoneDobraveis

class FoldablePhone: Phone()  {

      private var isFoldedUp: Boolean = true
       override fun switchOn(){
           super.isScreenLigthOn = isFoldedUp != true
        }
       fun openScreen(){
                if (this.isFoldedUp) {
                    isFoldedUp = false
                    println("tela desbloqueada veja as notificações")

                }else{
                    println("abra a tela para var as notificações")
                }
        }
}
