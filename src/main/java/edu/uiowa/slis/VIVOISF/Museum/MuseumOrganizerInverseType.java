package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumOrganizerInverseIterator theMuseumOrganizerInverseIterator = (MuseumOrganizerInverseIterator)findAncestorWithClass(this, MuseumOrganizerInverseIterator.class);
			pageContext.getOut().print(theMuseumOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for organizer tag ");
		}
		return SKIP_BODY;
	}
}

