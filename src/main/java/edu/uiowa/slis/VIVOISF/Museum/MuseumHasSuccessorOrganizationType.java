package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumHasSuccessorOrganizationIterator theMuseumHasSuccessorOrganizationIterator = (MuseumHasSuccessorOrganizationIterator)findAncestorWithClass(this, MuseumHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theMuseumHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

