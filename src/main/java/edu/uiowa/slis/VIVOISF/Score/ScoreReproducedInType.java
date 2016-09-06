package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreReproducedInIterator theScoreReproducedInIterator = (ScoreReproducedInIterator)findAncestorWithClass(this, ScoreReproducedInIterator.class);
			pageContext.getOut().print(theScoreReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

