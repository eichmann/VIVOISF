package edu.uiowa.slis.VIVOISF.OBI_0500000;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0500000Translator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0500000Translator currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0500000Translator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0500000TranslatorIterator theOBI_0500000TranslatorIterator = (OBI_0500000TranslatorIterator)findAncestorWithClass(this, OBI_0500000TranslatorIterator.class);
			pageContext.getOut().print(theOBI_0500000TranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0500000 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0500000 for translator tag ");
		}
		return SKIP_BODY;
	}
}

