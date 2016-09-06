package edu.uiowa.slis.VIVOISF.ERO_0000005;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000005Translator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000005Translator currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000005Translator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000005TranslatorIterator theERO_0000005TranslatorIterator = (ERO_0000005TranslatorIterator)findAncestorWithClass(this, ERO_0000005TranslatorIterator.class);
			pageContext.getOut().print(theERO_0000005TranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000005 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000005 for translator tag ");
		}
		return SKIP_BODY;
	}
}

