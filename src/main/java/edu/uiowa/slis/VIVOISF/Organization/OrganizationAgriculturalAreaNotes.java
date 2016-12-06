package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationAgriculturalAreaNotesIterator theOrganization = (OrganizationAgriculturalAreaNotesIterator)findAncestorWithClass(this, OrganizationAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theOrganization.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

