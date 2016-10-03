package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreLccnIterator theScore = (ScoreLccnIterator)findAncestorWithClass(this, ScoreLccnIterator.class);
			pageContext.getOut().print(theScore.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for lccn tag ");
		}
		return SKIP_BODY;
	}
}

