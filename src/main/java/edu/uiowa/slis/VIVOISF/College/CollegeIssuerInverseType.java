package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeIssuerInverseIterator theCollegeIssuerInverseIterator = (CollegeIssuerInverseIterator)findAncestorWithClass(this, CollegeIssuerInverseIterator.class);
			pageContext.getOut().print(theCollegeIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for issuer tag ");
		}
		return SKIP_BODY;
	}
}

