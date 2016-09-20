package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeAffiliatedOrganizationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeAffiliatedOrganizationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeAffiliatedOrganizationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeAffiliatedOrganizationInverseIterator theCollegeAffiliatedOrganizationInverseIterator = (CollegeAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, CollegeAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theCollegeAffiliatedOrganizationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

