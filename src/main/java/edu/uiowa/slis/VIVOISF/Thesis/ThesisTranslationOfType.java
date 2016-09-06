package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisTranslationOfIterator theThesisTranslationOfIterator = (ThesisTranslationOfIterator)findAncestorWithClass(this, ThesisTranslationOfIterator.class);
			pageContext.getOut().print(theThesisTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

