package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeIdentifierIterator theCode = (CodeIdentifierIterator)findAncestorWithClass(this, CodeIdentifierIterator.class);
			pageContext.getOut().print(theCode.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for identifier tag ");
		}
		return SKIP_BODY;
	}
}

