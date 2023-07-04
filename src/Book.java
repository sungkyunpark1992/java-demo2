
public class Book {
    Integer index;//처음에는 null도 없다. 기본은 null값이긴 하다.
    String contents;//fianl을 붙이게 되면 일부러 개발하기 어렵게. 변경 불가능하도록.
    Character type;

    static int page;

    Book(){}//null 또는 기본값으로 초기화를 시켜준다는 의미
    Book (Integer index, String contents){//생성자를 다른 디렉토리에서는 사용이 안된다. -> 제어자가 디폴트라서. public protect de private
        this.index = index;
        this.contents = contents;
    }
    String updateContents(String content){//카멜케이스 메소드는 소문자 띄어쓰기는 대문자
        this.contents = content;
        return contents;//return을 왜 해야하나. 콘텐츠가 정확하게 업데이트되었다는걸 보여주기 위해. 코드를 짤때 기준을 가져야한다.
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
class ex{

}