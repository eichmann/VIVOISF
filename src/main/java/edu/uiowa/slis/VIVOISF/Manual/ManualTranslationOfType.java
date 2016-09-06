package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualTranslationOfIterator theManualTranslationOfIterator = (ManualTranslationOfIterator)findAncestorWithClass(this, ManualTranslationOfIterator.class);
			pageContext.getOut().print(theManualTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

