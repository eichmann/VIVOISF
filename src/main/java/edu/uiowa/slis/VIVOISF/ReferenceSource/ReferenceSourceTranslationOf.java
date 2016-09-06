package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceTranslationOfIterator theReferenceSourceTranslationOfIterator = (ReferenceSourceTranslationOfIterator)findAncestorWithClass(this, ReferenceSourceTranslationOfIterator.class);
			pageContext.getOut().print(theReferenceSourceTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

