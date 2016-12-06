package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNationalityZHIterator theEvent = (EventNationalityZHIterator)findAncestorWithClass(this, EventNationalityZHIterator.class);
			pageContext.getOut().print(theEvent.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

