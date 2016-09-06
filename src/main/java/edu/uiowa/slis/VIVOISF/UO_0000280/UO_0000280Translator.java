package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280Translator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280Translator currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280Translator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280TranslatorIterator theUO_0000280TranslatorIterator = (UO_0000280TranslatorIterator)findAncestorWithClass(this, UO_0000280TranslatorIterator.class);
			pageContext.getOut().print(theUO_0000280TranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for translator tag ");
		}
		return SKIP_BODY;
	}
}

