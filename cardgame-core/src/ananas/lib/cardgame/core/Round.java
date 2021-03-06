package ananas.lib.cardgame.core;

public interface Round {

	Game getGame();

	GroupManager getGroupManager();

	CardManager getCardManager();

	LayerManager getLayerManager();

	PlayerManager getPlayerManager();

	Viewport getViewport();

	void reset();

	void setController(RoundController ctrl);

	RoundController getController();

}
