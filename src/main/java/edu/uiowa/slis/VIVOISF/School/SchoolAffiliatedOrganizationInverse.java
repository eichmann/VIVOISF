package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolAffiliatedOrganizationInverseIterator theSchoolAffiliatedOrganizationInverseIterator = (SchoolAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, SchoolAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theSchoolAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing School for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}
