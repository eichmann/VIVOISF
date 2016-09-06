package edu.uiowa.slis.VIVOISF.Room;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RoomFacilityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RoomFacilityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(RoomFacilityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RoomFacilityForIterator theRoomFacilityForIterator = (RoomFacilityForIterator)findAncestorWithClass(this, RoomFacilityForIterator.class);
			pageContext.getOut().print(theRoomFacilityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Room for facilityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Room for facilityFor tag ");
		}
		return SKIP_BODY;
	}
}

