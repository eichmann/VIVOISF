package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumHasSuccessorOrganizationIterator theMuseumHasSuccessorOrganizationIterator = (MuseumHasSuccessorOrganizationIterator)findAncestorWithClass(this, MuseumHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theMuseumHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

