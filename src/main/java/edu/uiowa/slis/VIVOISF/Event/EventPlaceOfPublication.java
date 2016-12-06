package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(EventPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			if (!theEvent.commitNeeded) {
				pageContext.getOut().print(theEvent.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Event for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			return theEvent.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Event for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Event theEvent = (Event)findAncestorWithClass(this, Event.class);
			theEvent.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Event for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for placeOfPublication tag ");
		}
	}
}

