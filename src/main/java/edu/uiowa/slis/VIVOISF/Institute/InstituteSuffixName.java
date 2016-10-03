package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstituteSuffixNameIterator theInstitute = (InstituteSuffixNameIterator)findAncestorWithClass(this, InstituteSuffixNameIterator.class);
			pageContext.getOut().print(theInstitute.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

