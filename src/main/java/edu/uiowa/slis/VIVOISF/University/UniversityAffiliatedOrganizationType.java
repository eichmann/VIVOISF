package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityAffiliatedOrganizationIterator theUniversityAffiliatedOrganizationIterator = (UniversityAffiliatedOrganizationIterator)findAncestorWithClass(this, UniversityAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theUniversityAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

