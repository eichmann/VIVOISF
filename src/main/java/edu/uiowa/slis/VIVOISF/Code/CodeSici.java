package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeSici currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeSiciIterator theCode = (CodeSiciIterator)findAncestorWithClass(this, CodeSiciIterator.class);
			pageContext.getOut().print(theCode.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for sici tag ");
		}
		return SKIP_BODY;
	}
}

