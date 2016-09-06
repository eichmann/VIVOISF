package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreIAO_0000136Iterator theScoreIAO_0000136Iterator = (ScoreIAO_0000136Iterator)findAncestorWithClass(this, ScoreIAO_0000136Iterator.class);
			pageContext.getOut().print(theScoreIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

