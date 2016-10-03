package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicRecipientInverseIterator theNonAcademicRecipientInverseIterator = (NonAcademicRecipientInverseIterator)findAncestorWithClass(this, NonAcademicRecipientInverseIterator.class);
			pageContext.getOut().print(theNonAcademicRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for recipient tag ");
		}
		return SKIP_BODY;
	}
}

