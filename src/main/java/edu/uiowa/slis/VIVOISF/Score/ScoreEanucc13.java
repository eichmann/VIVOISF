package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreEanucc13Iterator theScore = (ScoreEanucc13Iterator)findAncestorWithClass(this, ScoreEanucc13Iterator.class);
			pageContext.getOut().print(theScore.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

