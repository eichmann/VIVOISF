package edu.uiowa.slis.VIVOISF.Room;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RoomSeatingCapacity extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RoomSeatingCapacity currentInstance = null;
	private static final Log log = LogFactory.getLog(RoomSeatingCapacity.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Room theRoom = (Room)findAncestorWithClass(this, Room.class);
			if (!theRoom.commitNeeded) {
				pageContext.getOut().print(theRoom.getSeatingCapacity());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Room for seatingCapacity tag ", e);
			throw new JspTagException("Error: Can't find enclosing Room for seatingCapacity tag ");
		}
		return SKIP_BODY;
	}

	public String getSeatingCapacity() throws JspTagException {
		try {
			Room theRoom = (Room)findAncestorWithClass(this, Room.class);
			return theRoom.getSeatingCapacity();
		} catch (Exception e) {
			log.error(" Can't find enclosing Room for seatingCapacity tag ", e);
			throw new JspTagException("Error: Can't find enclosing Room for seatingCapacity tag ");
		}
	}

	public void setSeatingCapacity(String seatingCapacity) throws JspTagException {
		try {
			Room theRoom = (Room)findAncestorWithClass(this, Room.class);
			theRoom.setSeatingCapacity(seatingCapacity);
		} catch (Exception e) {
			log.error("Can't find enclosing Room for seatingCapacity tag ", e);
			throw new JspTagException("Error: Can't find enclosing Room for seatingCapacity tag ");
		}
	}
}

