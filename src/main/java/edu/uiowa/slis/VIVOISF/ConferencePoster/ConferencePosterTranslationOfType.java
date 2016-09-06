package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterTranslationOfIterator theConferencePosterTranslationOfIterator = (ConferencePosterTranslationOfIterator)findAncestorWithClass(this, ConferencePosterTranslationOfIterator.class);
			pageContext.getOut().print(theConferencePosterTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

