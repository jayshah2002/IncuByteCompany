package com.assessment;

public class Chandrayan {

	 int x, y, z;
	 Direction direction;

	    public Chandrayan(int x, int y, int z, Direction direction) {
	        this.x = x;
	        this.y = y;
	        this.z = z;
	        this.direction = direction;
	    }

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getZ() {
			return z;
		}

		public void setZ(int z) {
			this.z = z;
		}

	    public void moveForward()
	    {
		   
	    }
	    
	    public void moveBackward()
	    {
	    	
	    }
	    
	    public void turnLeft()
	    {
	    	
	    }
	    
	    public void turnRight()
	    {
	    	
	    }
	    
	    public void turnUp()
	    {
	    	
	    }
	    
	    public void turnDown()
	    {
	    	
	    }
	    
	    public String getPosition()
	    {
	    	return "(" + x + ", " + y + ", " + z + ")";
	    }
	    
	    public void setPosition(int x, int y,int z)
	    {
	    	this.x = x;
	        this.y = y;
	        this.z = z;
	    }
	    public void setDirection(Direction d)
	    {
	    	this.direction = d;
	    }

		public Direction getDirection() {
			return this.direction;
		}
}
