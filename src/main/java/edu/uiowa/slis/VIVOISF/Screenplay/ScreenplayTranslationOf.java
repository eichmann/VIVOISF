package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayTranslationOfIterator theScreenplayTranslationOfIterator = (ScreenplayTranslationOfIterator)findAncestorWithClass(this, ScreenplayTranslationOfIterator.class);
			pageContext.getOut().print(theScreenplayTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

