package edu.uiowa.slis.VIVOISF.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MeetingBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingBFO_0000055Iterator theMeetingBFO_0000055Iterator = (MeetingBFO_0000055Iterator)findAncestorWithClass(this, MeetingBFO_0000055Iterator.class);
			pageContext.getOut().print(theMeetingBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

