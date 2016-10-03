package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreIsbn13Iterator theScore = (ScoreIsbn13Iterator)findAncestorWithClass(this, ScoreIsbn13Iterator.class);
			pageContext.getOut().print(theScore.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

