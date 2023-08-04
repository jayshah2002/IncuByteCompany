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
			if (direction == Direction.N)
            	y++;
        else if (direction == Direction.S)
            	y--;
        else if (direction == Direction.E)
           	 x++;
        else if (direction == Direction.W)
            x--;
        else if (direction == Direction.U)
            z++;
        else if (direction == Direction.D)
            	z--;

		   
	    }
	    
	    public void moveBackward()
	    {
			if (direction == Direction.N)
            y--;
        else if (direction == Direction.S)
            y++;
        else if (direction== Direction.E)
            x--;
        else if (direction == Direction.W)
            x++;
        else if (direction == Direction.U)
           z--;
        else if (direction == Direction.D)
            z++;

	    	
	    }
	    
	    public void turnLeft()
	    {
			if (direction == Direction.N)
            direction = Direction.W;
        else if (direction == Direction.W)
            direction = Direction.S;
        else if (direction == Direction.S)
            direction = Direction.E;
        else if (direction == Direction.E)
           direction = Direction.N;
        else if (direction == Direction.U)
            direction = Direction.W;
        else if (direction == Direction.D)
           direction = Direction.E;

	    	
	    }
	    
	    public void turnRight()
	    {
			if (direction == Direction.N)
            direction = Direction.E;
        else if (direction == Direction.E)
            direction = Direction.S;
        else if (direction == Direction.S)
            direction = Direction.W;
        else if (direction == Direction.W)
           direction = Direction.N;
        else if (direction == Direction.U)
            direction = Direction.E;
        else if (direction == Direction.D)
           direction = Direction.W;

	    	
	    	
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
