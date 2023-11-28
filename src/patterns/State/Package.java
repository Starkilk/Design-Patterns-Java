package patterns.State;
// наш контекст, это будет класс Package

//Состояния будут связаны друг с другом, и каждое состояние будет устанавливать другое на основе этой ссылки , переданной обоим методам.
//
//Клиент будет взаимодействовать с классом Package, но ему не придется иметь дело с установкой состояний,
// все, что нужно сделать клиенту, это перейти к следующему или предыдущему состоянию.
public class Package {//класс посылка
    private PackageState state = new OrderedState();//состояние "Заказан"

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState(){//предыдущее состояние
        state.prev(this);
    }

    public void nextState(){//следующее состояние
        state.next(this);
    }

    public void printState(){
        state.printState();
    }
}
