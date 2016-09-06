package edu.uiowa.slis.VIVOISF.ERO_0000396;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000396Translator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000396Translator currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000396Translator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000396TranslatorIterator theERO_0000396TranslatorIterator = (ERO_0000396TranslatorIterator)findAncestorWithClass(this, ERO_0000396TranslatorIterator.class);
			pageContext.getOut().print(theERO_0000396TranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000396 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000396 for translator tag ");
		}
		return SKIP_BODY;
	}
}

