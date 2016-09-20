package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityIssuerInverseIterator theUniversityIssuerInverseIterator = (UniversityIssuerInverseIterator)findAncestorWithClass(this, UniversityIssuerInverseIterator.class);
			pageContext.getOut().print(theUniversityIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for issuer tag ");
		}
		return SKIP_BODY;
	}
}

