package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumTranslatorIterator theErratumTranslatorIterator = (ErratumTranslatorIterator)findAncestorWithClass(this, ErratumTranslatorIterator.class);
			pageContext.getOut().print(theErratumTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for translator tag ");
		}
		return SKIP_BODY;
	}
}

