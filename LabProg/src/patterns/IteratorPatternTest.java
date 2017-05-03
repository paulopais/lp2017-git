package patterns;

public class IteratorPatternTest {
public static void main(String[] args) {
ChannelCollection channels = populateChannels();
ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
while (baseIterator.hasNext()) {
Channel c = baseIterator.next();
System.out.println(c.toString());
}
System.out.println("******");
// Channel Type Iterator


ChannelIterator englishIterator = channels.iterator(ChannelTypeEnum.ALL);
		while (englishIterator.hasNext()) {
		Channel c = englishIterator.next();
		System.out.println(c.toString());
}

		 
		
		
}


private static ChannelCollection populateChannels() {
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(88, ChannelTypeEnum.PORT));
		channels.addChannel(new Channel(90, ChannelTypeEnum.PORT));
		channels.addChannel(new Channel(91, ChannelTypeEnum.PORT));
		channels.addChannel(new Channel(92, ChannelTypeEnum.PORT));


return channels;
}
}