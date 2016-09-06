package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumTranslatorIterator theErratumTranslatorIterator = (ErratumTranslatorIterator)findAncestorWithClass(this, ErratumTranslatorIterator.class);
			pageContext.getOut().print(theErratumTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for translator tag ");
		}
		return SKIP_BODY;
	}
}

