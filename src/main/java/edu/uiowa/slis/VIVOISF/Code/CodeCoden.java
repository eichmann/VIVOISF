package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeCodenIterator theCode = (CodeCodenIterator)findAncestorWithClass(this, CodeCodenIterator.class);
			pageContext.getOut().print(theCode.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for coden tag ");
		}
		return SKIP_BODY;
	}
}

