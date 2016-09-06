package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreReproducesIterator theScoreReproducesIterator = (ScoreReproducesIterator)findAncestorWithClass(this, ScoreReproducesIterator.class);
			pageContext.getOut().print(theScoreReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

