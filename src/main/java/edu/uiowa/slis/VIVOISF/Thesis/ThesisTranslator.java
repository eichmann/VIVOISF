package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisTranslatorIterator theThesisTranslatorIterator = (ThesisTranslatorIterator)findAncestorWithClass(this, ThesisTranslatorIterator.class);
			pageContext.getOut().print(theThesisTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for translator tag ");
		}
		return SKIP_BODY;
	}
}

