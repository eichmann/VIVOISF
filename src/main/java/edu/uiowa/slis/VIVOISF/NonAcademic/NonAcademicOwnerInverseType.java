package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicOwnerInverseIterator theNonAcademicOwnerInverseIterator = (NonAcademicOwnerInverseIterator)findAncestorWithClass(this, NonAcademicOwnerInverseIterator.class);
			pageContext.getOut().print(theNonAcademicOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for owner tag ");
		}
		return SKIP_BODY;
	}
}

