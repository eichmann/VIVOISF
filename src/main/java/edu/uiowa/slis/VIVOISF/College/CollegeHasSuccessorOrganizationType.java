package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeHasSuccessorOrganizationIterator theCollegeHasSuccessorOrganizationIterator = (CollegeHasSuccessorOrganizationIterator)findAncestorWithClass(this, CollegeHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theCollegeHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

