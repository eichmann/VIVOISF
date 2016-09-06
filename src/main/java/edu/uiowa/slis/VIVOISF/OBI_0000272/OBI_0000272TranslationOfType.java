package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272TranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272TranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272TranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272TranslationOfIterator theOBI_0000272TranslationOfIterator = (OBI_0000272TranslationOfIterator)findAncestorWithClass(this, OBI_0000272TranslationOfIterator.class);
			pageContext.getOut().print(theOBI_0000272TranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

