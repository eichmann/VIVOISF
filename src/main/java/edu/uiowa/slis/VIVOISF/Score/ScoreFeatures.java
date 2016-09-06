package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreFeaturesIterator theScoreFeaturesIterator = (ScoreFeaturesIterator)findAncestorWithClass(this, ScoreFeaturesIterator.class);
			pageContext.getOut().print(theScoreFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for features tag ");
		}
		return SKIP_BODY;
	}
}

