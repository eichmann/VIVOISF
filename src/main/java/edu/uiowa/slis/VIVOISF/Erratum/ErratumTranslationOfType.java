package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumTranslationOfIterator theErratumTranslationOfIterator = (ErratumTranslationOfIterator)findAncestorWithClass(this, ErratumTranslationOfIterator.class);
			pageContext.getOut().print(theErratumTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

