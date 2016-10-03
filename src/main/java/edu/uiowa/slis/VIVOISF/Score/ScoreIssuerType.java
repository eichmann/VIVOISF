package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreIssuerIterator theScoreIssuerIterator = (ScoreIssuerIterator)findAncestorWithClass(this, ScoreIssuerIterator.class);
			pageContext.getOut().print(theScoreIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for issuer tag ");
		}
		return SKIP_BODY;
	}
}

