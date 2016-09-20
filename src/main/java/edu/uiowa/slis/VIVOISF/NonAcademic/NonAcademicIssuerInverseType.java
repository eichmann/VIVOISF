package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicIssuerInverseIterator theNonAcademicIssuerInverseIterator = (NonAcademicIssuerInverseIterator)findAncestorWithClass(this, NonAcademicIssuerInverseIterator.class);
			pageContext.getOut().print(theNonAcademicIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for issuer tag ");
		}
		return SKIP_BODY;
	}
}

