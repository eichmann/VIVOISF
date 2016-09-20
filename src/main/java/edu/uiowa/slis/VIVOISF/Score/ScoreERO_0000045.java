package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreERO_0000045Iterator theScore = (ScoreERO_0000045Iterator)findAncestorWithClass(this, ScoreERO_0000045Iterator.class);
			pageContext.getOut().print(theScore.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

