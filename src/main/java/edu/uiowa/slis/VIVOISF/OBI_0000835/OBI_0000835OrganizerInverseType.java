package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835OrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835OrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835OrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835OrganizerInverseIterator theOBI_0000835OrganizerInverseIterator = (OBI_0000835OrganizerInverseIterator)findAncestorWithClass(this, OBI_0000835OrganizerInverseIterator.class);
			pageContext.getOut().print(theOBI_0000835OrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for organizer tag ");
		}
		return SKIP_BODY;
	}
}

