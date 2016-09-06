package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayHasTranslationIterator theScreenplayHasTranslationIterator = (ScreenplayHasTranslationIterator)findAncestorWithClass(this, ScreenplayHasTranslationIterator.class);
			pageContext.getOut().print(theScreenplayHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

