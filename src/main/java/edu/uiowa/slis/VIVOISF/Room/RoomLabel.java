package edu.uiowa.slis.VIVOISF.Room;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RoomLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RoomLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(RoomLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Room theRoom = (Room)findAncestorWithClass(this, Room.class);
			if (!theRoom.commitNeeded) {
				pageContext.getOut().print(theRoom.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Room for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Room for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Room theRoom = (Room)findAncestorWithClass(this, Room.class);
			return theRoom.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Room for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Room for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Room theRoom = (Room)findAncestorWithClass(this, Room.class);
			theRoom.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Room for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Room for label tag ");
		}
	}
}

