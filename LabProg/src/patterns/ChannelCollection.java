package patterns;

public interface ChannelCollection {
public void addChannel(Channel c);
public void removeChannel(Channel c);
public ChannelIterator iterator(ChannelTypeEnum type);
public ChannelIterator compareChannel(ChannelTypeEnum type);

}