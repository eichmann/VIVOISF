package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreHasTranslationIterator theScoreHasTranslationIterator = (ScoreHasTranslationIterator)findAncestorWithClass(this, ScoreHasTranslationIterator.class);
			pageContext.getOut().print(theScoreHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

