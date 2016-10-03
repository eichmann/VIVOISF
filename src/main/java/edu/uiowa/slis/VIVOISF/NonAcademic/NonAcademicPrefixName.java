package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPrefixNameIterator theNonAcademic = (NonAcademicPrefixNameIterator)findAncestorWithClass(this, NonAcademicPrefixNameIterator.class);
			pageContext.getOut().print(theNonAcademic.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

