package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteOrganizerInverseIterator theInstituteOrganizerInverseIterator = (InstituteOrganizerInverseIterator)findAncestorWithClass(this, InstituteOrganizerInverseIterator.class);
			pageContext.getOut().print(theInstituteOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for organizer tag ");
		}
		return SKIP_BODY;
	}
}

