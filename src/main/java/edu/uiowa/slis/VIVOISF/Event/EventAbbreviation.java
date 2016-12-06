package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(EventAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			if (!theEvent.commitNeeded) {
				pageContext.getOut().print(theEvent.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Event for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			return theEvent.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Event for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			theEvent.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Event for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for abbreviation tag ");
		}
	}
}

