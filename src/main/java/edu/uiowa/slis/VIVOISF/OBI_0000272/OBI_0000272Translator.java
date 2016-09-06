package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272Translator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272Translator currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272Translator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272TranslatorIterator theOBI_0000272TranslatorIterator = (OBI_0000272TranslatorIterator)findAncestorWithClass(this, OBI_0000272TranslatorIterator.class);
			pageContext.getOut().print(theOBI_0000272TranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for translator tag ");
		}
		return SKIP_BODY;
	}
}

