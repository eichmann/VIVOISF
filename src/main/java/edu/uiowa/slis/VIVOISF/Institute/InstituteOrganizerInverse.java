package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteOrganizerInverseIterator theInstituteOrganizerInverseIterator = (InstituteOrganizerInverseIterator)findAncestorWithClass(this, InstituteOrganizerInverseIterator.class);
			pageContext.getOut().print(theInstituteOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for organizer tag ");
		}
		return SKIP_BODY;
	}
}

