package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumHasPredecessorOrganizationIterator theMuseumHasPredecessorOrganizationIterator = (MuseumHasPredecessorOrganizationIterator)findAncestorWithClass(this, MuseumHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theMuseumHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

