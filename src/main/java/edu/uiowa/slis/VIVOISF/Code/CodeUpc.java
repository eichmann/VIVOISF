package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeUpcIterator theCode = (CodeUpcIterator)findAncestorWithClass(this, CodeUpcIterator.class);
			pageContext.getOut().print(theCode.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for upc tag ");
		}
		return SKIP_BODY;
	}
}

