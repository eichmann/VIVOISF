package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumHasPredecessorOrganizationIterator theMuseumHasPredecessorOrganizationIterator = (MuseumHasPredecessorOrganizationIterator)findAncestorWithClass(this, MuseumHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theMuseumHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

