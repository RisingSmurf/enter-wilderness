    public void WalkToWild() {
    	
    	RS2Widget enterButton = getWidgets().getWidgetContainingText("Enter Wilderness");
    	if (!wilderness.contains(myPlayer().getPosition())) {
            WebWalkEvent webWalkEvent = new WebWalkEvent(wilderness);
            webWalkEvent.setBreakCondition(new Condition() {
                @Override
                public boolean evaluate() {
                    return enterButton != null && enterButton.isVisible();
                }
            });
    	getWalking().webWalk(wilderness);
    	} if (enterButton != null && enterButton.isVisible()){
    	enterButton.interact("Enter Wilderness"); 
    	}
    	
    }
