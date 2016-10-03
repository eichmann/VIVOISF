package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeHandleIterator theCode = (CodeHandleIterator)findAncestorWithClass(this, CodeHandleIterator.class);
			pageContext.getOut().print(theCode.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for handle tag ");
		}
		return SKIP_BODY;
	}
}

