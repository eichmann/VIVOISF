package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreARG_0000001Iterator theScore = (ScoreARG_0000001Iterator)findAncestorWithClass(this, ScoreARG_0000001Iterator.class);
			pageContext.getOut().print(theScore.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

