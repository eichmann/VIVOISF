package edu.uiowa.slis.VIVOISF.ARG_2000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000009Translator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000009Translator currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000009Translator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000009TranslatorIterator theARG_2000009TranslatorIterator = (ARG_2000009TranslatorIterator)findAncestorWithClass(this, ARG_2000009TranslatorIterator.class);
			pageContext.getOut().print(theARG_2000009TranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000009 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000009 for translator tag ");
		}
		return SKIP_BODY;
	}
}

