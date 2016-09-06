package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationTranslatorOfIterator theFoundationTranslatorOfIterator = (FoundationTranslatorOfIterator)findAncestorWithClass(this, FoundationTranslatorOfIterator.class);
			pageContext.getOut().print(theFoundationTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

