package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreTranslationOfIterator theScoreTranslationOfIterator = (ScoreTranslationOfIterator)findAncestorWithClass(this, ScoreTranslationOfIterator.class);
			pageContext.getOut().print(theScoreTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

