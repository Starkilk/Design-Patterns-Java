package patterns.adapter;

public class LetterAdapter implements ShortMessage{

    private Letter letter;

    public LetterAdapter(Letter letter) {
        this.letter = letter;
    }


    @Override
    public String getShortMessage() {
        return letter.getMessage().substring(0,5);//укоротили сообщение до пяти символов(адаптировали)
    }


}
