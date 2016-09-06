package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationRank currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationRankIterator theOrganization = (OrganizationRankIterator)findAncestorWithClass(this, OrganizationRankIterator.class);
			pageContext.getOut().print(theOrganization.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for rank tag ");
		}
		return SKIP_BODY;
	}
}

