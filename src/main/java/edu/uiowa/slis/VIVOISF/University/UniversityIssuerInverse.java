package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityIssuerInverseIterator theUniversityIssuerInverseIterator = (UniversityIssuerInverseIterator)findAncestorWithClass(this, UniversityIssuerInverseIterator.class);
			pageContext.getOut().print(theUniversityIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing University for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for issuer tag ");
		}
		return SKIP_BODY;
	}
}

