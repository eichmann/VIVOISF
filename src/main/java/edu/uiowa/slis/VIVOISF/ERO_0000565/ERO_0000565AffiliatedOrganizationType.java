package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565AffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565AffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565AffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565AffiliatedOrganizationIterator theERO_0000565AffiliatedOrganizationIterator = (ERO_0000565AffiliatedOrganizationIterator)findAncestorWithClass(this, ERO_0000565AffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theERO_0000565AffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

