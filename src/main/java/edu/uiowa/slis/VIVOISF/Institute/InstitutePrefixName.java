package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstitutePrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstitutePrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(InstitutePrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstitutePrefixNameIterator theInstitute = (InstitutePrefixNameIterator)findAncestorWithClass(this, InstitutePrefixNameIterator.class);
			pageContext.getOut().print(theInstitute.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

