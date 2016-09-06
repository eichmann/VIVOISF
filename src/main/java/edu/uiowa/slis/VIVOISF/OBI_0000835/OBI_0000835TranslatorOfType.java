package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835TranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835TranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835TranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835TranslatorOfIterator theOBI_0000835TranslatorOfIterator = (OBI_0000835TranslatorOfIterator)findAncestorWithClass(this, OBI_0000835TranslatorOfIterator.class);
			pageContext.getOut().print(theOBI_0000835TranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

