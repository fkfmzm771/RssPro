package MAIN;

import Manager.NyaaFeedParser;
import Manager.TokyoFeedParser;
import UI.App;
import UI.RssGUI;
import UI.Work;
import VO.FileData;
import VO.Nyaa_si_Feed;
import VO.Nyaa_si_FeedMessage;

import java.io.IOException;

public class RssMain {
	public static void main(String[] args) {

//		NyaaFeedParser parser = new NyaaFeedParser("https://nyaa.si/?page=rss&q=baki von 1080&c=0_0&f=0");
//		Nyaa_si_Feed feed = parser.readFeed();
//
//		try {
//
//			for (Nyaa_si_FeedMessage message : feed.getMessages()) {
//				parser.saveUrlList(new FileData(message.getTitle(), message.getLink()));
//				System.out.println(message);
//			}
//			parser.saveFile();
//		}catch (Exception e){
//			System.out.println("검색된 파일이 없습니다.");
//		}

//		new RssGUI();
//		new Work();

		App app = new App();
		app.createUIComponents();



	}
}
