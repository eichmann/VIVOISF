package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteTranslationOfIterator theStatuteTranslationOfIterator = (StatuteTranslationOfIterator)findAncestorWithClass(this, StatuteTranslationOfIterator.class);
			pageContext.getOut().print(theStatuteTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

