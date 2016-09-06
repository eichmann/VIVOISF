package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionTranslatorOfIterator theDivisionTranslatorOfIterator = (DivisionTranslatorOfIterator)findAncestorWithClass(this, DivisionTranslatorOfIterator.class);
			pageContext.getOut().print(theDivisionTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

