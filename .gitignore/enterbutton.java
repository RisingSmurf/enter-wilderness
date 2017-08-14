    public void WalkToWild() {
            RS2Widget enterWildernessButton = getWidgets().singleFilter(getWidgets().getAll(), new WidgetActionFilter("Enter Wilderness"));
            if (enterWildernessButton != null) {
                enterWildernessButton.interact("Enter Wilderness");
            }if (!wilderness.contains(myPlayer().getPosition())){
                status = ("Walking to the wilderness...");
                WebWalkEvent webWalkEvent = new WebWalkEvent(wilderness);
                webWalkEvent.setBreakCondition(new Condition() {
                    @Override
                    public boolean evaluate() {
                        return getWidgets().getWidgetContainingText("Enter Wilderness") != null;
                    }
                });
                getWalking().webWalk(wilderness);
            }
        }
