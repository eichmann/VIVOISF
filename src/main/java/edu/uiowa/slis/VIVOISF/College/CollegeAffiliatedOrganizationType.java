package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeAffiliatedOrganizationIterator theCollegeAffiliatedOrganizationIterator = (CollegeAffiliatedOrganizationIterator)findAncestorWithClass(this, CollegeAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theCollegeAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

