package edu.uiowa.slis.VIVOISF.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingRO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MeetingRO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingRO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingRO_0000057Iterator theMeetingRO_0000057Iterator = (MeetingRO_0000057Iterator)findAncestorWithClass(this, MeetingRO_0000057Iterator.class);
			pageContext.getOut().print(theMeetingRO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

