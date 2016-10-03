package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeGtin14Iterator theCode = (CodeGtin14Iterator)findAncestorWithClass(this, CodeGtin14Iterator.class);
			pageContext.getOut().print(theCode.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

