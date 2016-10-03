package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPrefixNameIterator theNonFacultyAcademic = (NonFacultyAcademicPrefixNameIterator)findAncestorWithClass(this, NonFacultyAcademicPrefixNameIterator.class);
			pageContext.getOut().print(theNonFacultyAcademic.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

