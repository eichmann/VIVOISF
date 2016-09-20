package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicIssuerInverseIterator theNonAcademicIssuerInverseIterator = (NonAcademicIssuerInverseIterator)findAncestorWithClass(this, NonAcademicIssuerInverseIterator.class);
			pageContext.getOut().print(theNonAcademicIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for issuer tag ");
		}
		return SKIP_BODY;
	}
}

