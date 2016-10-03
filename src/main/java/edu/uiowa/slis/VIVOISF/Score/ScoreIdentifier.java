package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreIdentifierIterator theScore = (ScoreIdentifierIterator)findAncestorWithClass(this, ScoreIdentifierIterator.class);
			pageContext.getOut().print(theScore.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for identifier tag ");
		}
		return SKIP_BODY;
	}
}

