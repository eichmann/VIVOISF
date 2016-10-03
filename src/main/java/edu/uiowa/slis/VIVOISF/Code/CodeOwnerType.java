package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeOwnerIterator theCodeOwnerIterator = (CodeOwnerIterator)findAncestorWithClass(this, CodeOwnerIterator.class);
			pageContext.getOut().print(theCodeOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for owner tag ");
		}
		return SKIP_BODY;
	}
}

