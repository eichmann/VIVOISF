package edu.uiowa.slis.VIVOISF.Identification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentificationMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IdentificationMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentificationMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IdentificationMiddleNameIterator theIdentification = (IdentificationMiddleNameIterator)findAncestorWithClass(this, IdentificationMiddleNameIterator.class);
			pageContext.getOut().print(theIdentification.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for middleName tag ");
		}
		return SKIP_BODY;
	}
}

