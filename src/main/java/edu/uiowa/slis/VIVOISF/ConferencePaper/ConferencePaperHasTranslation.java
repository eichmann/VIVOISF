package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasTranslationIterator theConferencePaperHasTranslationIterator = (ConferencePaperHasTranslationIterator)findAncestorWithClass(this, ConferencePaperHasTranslationIterator.class);
			pageContext.getOut().print(theConferencePaperHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

