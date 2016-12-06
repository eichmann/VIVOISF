package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			if (!theEvent.commitNeeded) {
				pageContext.getOut().print(theEvent.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			return theEvent.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Event for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			theEvent.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hideFromDisplay tag ");
		}
	}
}

