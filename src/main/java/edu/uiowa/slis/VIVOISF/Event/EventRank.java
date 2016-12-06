package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventRank currentInstance = null;
	private static final Log log = LogFactory.getLog(EventRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventRankIterator theEvent = (EventRankIterator)findAncestorWithClass(this, EventRankIterator.class);
			pageContext.getOut().print(theEvent.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for rank tag ");
		}
		return SKIP_BODY;
	}
}

