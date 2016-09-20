package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolIssuerInverseIterator theSchoolIssuerInverseIterator = (SchoolIssuerInverseIterator)findAncestorWithClass(this, SchoolIssuerInverseIterator.class);
			pageContext.getOut().print(theSchoolIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for issuer tag ");
		}
		return SKIP_BODY;
	}
}

