package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisHasTranslationIterator theThesisHasTranslationIterator = (ThesisHasTranslationIterator)findAncestorWithClass(this, ThesisHasTranslationIterator.class);
			pageContext.getOut().print(theThesisHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

