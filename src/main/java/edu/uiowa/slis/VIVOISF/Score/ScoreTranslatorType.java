package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreTranslatorIterator theScoreTranslatorIterator = (ScoreTranslatorIterator)findAncestorWithClass(this, ScoreTranslatorIterator.class);
			pageContext.getOut().print(theScoreTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for translator tag ");
		}
		return SKIP_BODY;
	}
}

