package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeHasSuccessorOrganizationIterator theCollegeHasSuccessorOrganizationIterator = (CollegeHasSuccessorOrganizationIterator)findAncestorWithClass(this, CollegeHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theCollegeHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing College for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

