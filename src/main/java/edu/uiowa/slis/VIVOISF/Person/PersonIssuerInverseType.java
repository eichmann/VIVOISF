package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonIssuerInverseIterator thePersonIssuerInverseIterator = (PersonIssuerInverseIterator)findAncestorWithClass(this, PersonIssuerInverseIterator.class);
			pageContext.getOut().print(thePersonIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for issuer tag ");
		}
		return SKIP_BODY;
	}
}

