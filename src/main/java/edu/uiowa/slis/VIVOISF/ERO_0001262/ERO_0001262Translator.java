package edu.uiowa.slis.VIVOISF.ERO_0001262;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001262Translator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001262Translator currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001262Translator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001262TranslatorIterator theERO_0001262TranslatorIterator = (ERO_0001262TranslatorIterator)findAncestorWithClass(this, ERO_0001262TranslatorIterator.class);
			pageContext.getOut().print(theERO_0001262TranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001262 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001262 for translator tag ");
		}
		return SKIP_BODY;
	}
}

