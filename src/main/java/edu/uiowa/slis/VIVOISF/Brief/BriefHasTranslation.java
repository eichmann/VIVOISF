package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefHasTranslationIterator theBriefHasTranslationIterator = (BriefHasTranslationIterator)findAncestorWithClass(this, BriefHasTranslationIterator.class);
			pageContext.getOut().print(theBriefHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

