package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreHasTranslationIterator theScoreHasTranslationIterator = (ScoreHasTranslationIterator)findAncestorWithClass(this, ScoreHasTranslationIterator.class);
			pageContext.getOut().print(theScoreHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

