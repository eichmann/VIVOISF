package edu.uiowa.slis.VIVOISF.ERO_0000395;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000395Translator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000395Translator currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000395Translator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000395TranslatorIterator theERO_0000395TranslatorIterator = (ERO_0000395TranslatorIterator)findAncestorWithClass(this, ERO_0000395TranslatorIterator.class);
			pageContext.getOut().print(theERO_0000395TranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000395 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000395 for translator tag ");
		}
		return SKIP_BODY;
	}
}

