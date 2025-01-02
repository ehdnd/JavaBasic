package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[1];

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉셥";
        movieReview1.review = "인생은 무한 루프";
        reviews[0] = movieReview1;

        for (MovieReview movieReview : reviews) {
            System.out.println("제목: " + movieReview.title + " 리뷰: " + movieReview.review);
        }
    }
}
