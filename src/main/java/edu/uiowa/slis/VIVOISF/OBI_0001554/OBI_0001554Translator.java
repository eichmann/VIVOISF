package edu.uiowa.slis.VIVOISF.OBI_0001554;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0001554Translator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0001554Translator currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0001554Translator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0001554TranslatorIterator theOBI_0001554TranslatorIterator = (OBI_0001554TranslatorIterator)findAncestorWithClass(this, OBI_0001554TranslatorIterator.class);
			pageContext.getOut().print(theOBI_0001554TranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0001554 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0001554 for translator tag ");
		}
		return SKIP_BODY;
	}
}

