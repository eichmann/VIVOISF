package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicOwnerInverseIterator theNonAcademicOwnerInverseIterator = (NonAcademicOwnerInverseIterator)findAncestorWithClass(this, NonAcademicOwnerInverseIterator.class);
			pageContext.getOut().print(theNonAcademicOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for owner tag ");
		}
		return SKIP_BODY;
	}
}

