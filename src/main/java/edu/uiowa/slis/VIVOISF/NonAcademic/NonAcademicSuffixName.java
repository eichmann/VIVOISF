package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicSuffixNameIterator theNonAcademic = (NonAcademicSuffixNameIterator)findAncestorWithClass(this, NonAcademicSuffixNameIterator.class);
			pageContext.getOut().print(theNonAcademic.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

