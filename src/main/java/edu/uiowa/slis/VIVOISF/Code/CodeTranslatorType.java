package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeTranslatorIterator theCodeTranslatorIterator = (CodeTranslatorIterator)findAncestorWithClass(this, CodeTranslatorIterator.class);
			pageContext.getOut().print(theCodeTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for translator tag ");
		}
		return SKIP_BODY;
	}
}

