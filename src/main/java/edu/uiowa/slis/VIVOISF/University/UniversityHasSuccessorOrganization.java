package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityHasSuccessorOrganizationIterator theUniversityHasSuccessorOrganizationIterator = (UniversityHasSuccessorOrganizationIterator)findAncestorWithClass(this, UniversityHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theUniversityHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing University for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

