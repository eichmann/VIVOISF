package edu.uiowa.slis.VIVOISF.IAO_0000109;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000109Translator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000109Translator currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000109Translator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000109TranslatorIterator theIAO_0000109TranslatorIterator = (IAO_0000109TranslatorIterator)findAncestorWithClass(this, IAO_0000109TranslatorIterator.class);
			pageContext.getOut().print(theIAO_0000109TranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000109 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000109 for translator tag ");
		}
		return SKIP_BODY;
	}
}

