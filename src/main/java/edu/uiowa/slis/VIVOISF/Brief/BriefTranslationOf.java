package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefTranslationOfIterator theBriefTranslationOfIterator = (BriefTranslationOfIterator)findAncestorWithClass(this, BriefTranslationOfIterator.class);
			pageContext.getOut().print(theBriefTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

