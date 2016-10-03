package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreAuthorListIterator theScoreAuthorListIterator = (ScoreAuthorListIterator)findAncestorWithClass(this, ScoreAuthorListIterator.class);
			pageContext.getOut().print(theScoreAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for authorList tag ");
		}
		return SKIP_BODY;
	}
}

