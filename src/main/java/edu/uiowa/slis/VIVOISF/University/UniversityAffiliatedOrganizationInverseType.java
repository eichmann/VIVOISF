package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityAffiliatedOrganizationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityAffiliatedOrganizationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityAffiliatedOrganizationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityAffiliatedOrganizationInverseIterator theUniversityAffiliatedOrganizationInverseIterator = (UniversityAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, UniversityAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theUniversityAffiliatedOrganizationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

