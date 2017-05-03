package patterns;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
private List<Channel> channelsList;
public ChannelCollectionImpl() {
channelsList = new ArrayList<>();
}
public void addChannel(Channel c) {
this.channelsList.add(c);
}
public void removeChannel(Channel c) {
this.channelsList.remove(c);
}
@Override
public ChannelIterator iterator(ChannelTypeEnum type) {
return new ChannelIteratorImpl(type, this.channelsList);
}
@Override
public ChannelIterator compareChannel(ChannelTypeEnum type) {
	// TODO Auto-generated method stub
	return null;
}
public ChannelIterator iteratorFilter(ChannelTypeEnum type) {
	List<Channel> channelsList2 = new ArrayList<>();
	channelsList2.addAll(channelsList);
	
	for(Channel cha : channelsList){
		if(cha.getTYPE().equals(type)){
			channelsList2.remove(cha);
		}
	}
//	for(int i=0; i < channelsList.size(); i++){
//		//Channel cha = channelsList.get(i);
//		if(channelsList.get(i).getTYPE().toString().equals(type.toString())){
//			channelsList2.remove(i);
//		}
//	}
	return new ChannelIteratorImpl(type, channelsList2);
}



}


