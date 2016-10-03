package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreIsbn10Iterator theScore = (ScoreIsbn10Iterator)findAncestorWithClass(this, ScoreIsbn10Iterator.class);
			pageContext.getOut().print(theScore.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

