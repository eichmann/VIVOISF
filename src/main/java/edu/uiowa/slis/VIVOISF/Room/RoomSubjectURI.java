package edu.uiowa.slis.VIVOISF.Room;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RoomSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RoomSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(RoomSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Room theRoom = (Room)findAncestorWithClass(this, Room.class);
			if (!theRoom.commitNeeded) {
				pageContext.getOut().print(theRoom.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Room for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Room for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Room theRoom = (Room)findAncestorWithClass(this, Room.class);
			return theRoom.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Room for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Room for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Room theRoom = (Room)findAncestorWithClass(this, Room.class);
			theRoom.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Room for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Room for subjectURI tag ");
		}
	}
}

