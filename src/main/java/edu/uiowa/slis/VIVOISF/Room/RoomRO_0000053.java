package edu.uiowa.slis.VIVOISF.Room;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RoomRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RoomRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(RoomRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RoomRO_0000053Iterator theRoomRO_0000053Iterator = (RoomRO_0000053Iterator)findAncestorWithClass(this, RoomRO_0000053Iterator.class);
			pageContext.getOut().print(theRoomRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing Room for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Room for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

