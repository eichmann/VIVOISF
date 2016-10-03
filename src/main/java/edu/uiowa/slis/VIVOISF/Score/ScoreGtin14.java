package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreGtin14Iterator theScore = (ScoreGtin14Iterator)findAncestorWithClass(this, ScoreGtin14Iterator.class);
			pageContext.getOut().print(theScore.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

