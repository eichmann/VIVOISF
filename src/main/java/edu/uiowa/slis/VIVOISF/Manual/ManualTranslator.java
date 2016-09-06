package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualTranslatorIterator theManualTranslatorIterator = (ManualTranslatorIterator)findAncestorWithClass(this, ManualTranslatorIterator.class);
			pageContext.getOut().print(theManualTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for translator tag ");
		}
		return SKIP_BODY;
	}
}

