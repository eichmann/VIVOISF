package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeTranslatorIterator theCodeTranslatorIterator = (CodeTranslatorIterator)findAncestorWithClass(this, CodeTranslatorIterator.class);
			pageContext.getOut().print(theCodeTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for translator tag ");
		}
		return SKIP_BODY;
	}
}

