package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisHasTranslationIterator theThesisHasTranslationIterator = (ThesisHasTranslationIterator)findAncestorWithClass(this, ThesisHasTranslationIterator.class);
			pageContext.getOut().print(theThesisHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

