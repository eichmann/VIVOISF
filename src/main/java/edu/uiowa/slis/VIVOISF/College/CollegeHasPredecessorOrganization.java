package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeHasPredecessorOrganizationIterator theCollegeHasPredecessorOrganizationIterator = (CollegeHasPredecessorOrganizationIterator)findAncestorWithClass(this, CollegeHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theCollegeHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing College for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

