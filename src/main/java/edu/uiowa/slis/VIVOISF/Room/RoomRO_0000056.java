package edu.uiowa.slis.VIVOISF.Room;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RoomRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RoomRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(RoomRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RoomRO_0000056Iterator theRoomRO_0000056Iterator = (RoomRO_0000056Iterator)findAncestorWithClass(this, RoomRO_0000056Iterator.class);
			pageContext.getOut().print(theRoomRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Room for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Room for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

