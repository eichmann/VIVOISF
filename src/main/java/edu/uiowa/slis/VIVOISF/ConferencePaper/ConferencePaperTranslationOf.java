package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperTranslationOfIterator theConferencePaperTranslationOfIterator = (ConferencePaperTranslationOfIterator)findAncestorWithClass(this, ConferencePaperTranslationOfIterator.class);
			pageContext.getOut().print(theConferencePaperTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

