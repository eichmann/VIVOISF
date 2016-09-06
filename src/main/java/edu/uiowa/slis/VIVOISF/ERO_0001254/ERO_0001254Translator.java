package edu.uiowa.slis.VIVOISF.ERO_0001254;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001254Translator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001254Translator currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001254Translator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001254TranslatorIterator theERO_0001254TranslatorIterator = (ERO_0001254TranslatorIterator)findAncestorWithClass(this, ERO_0001254TranslatorIterator.class);
			pageContext.getOut().print(theERO_0001254TranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001254 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001254 for translator tag ");
		}
		return SKIP_BODY;
	}
}

