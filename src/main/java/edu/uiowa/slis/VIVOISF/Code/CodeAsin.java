package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeAsinIterator theCode = (CodeAsinIterator)findAncestorWithClass(this, CodeAsinIterator.class);
			pageContext.getOut().print(theCode.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for asin tag ");
		}
		return SKIP_BODY;
	}
}

