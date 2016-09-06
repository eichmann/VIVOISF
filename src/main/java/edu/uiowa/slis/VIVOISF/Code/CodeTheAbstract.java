package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeTheAbstractIterator theCode = (CodeTheAbstractIterator)findAncestorWithClass(this, CodeTheAbstractIterator.class);
			pageContext.getOut().print(theCode.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

