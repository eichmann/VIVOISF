package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitTranslatorOfIterator theExtensionUnitTranslatorOfIterator = (ExtensionUnitTranslatorOfIterator)findAncestorWithClass(this, ExtensionUnitTranslatorOfIterator.class);
			pageContext.getOut().print(theExtensionUnitTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

