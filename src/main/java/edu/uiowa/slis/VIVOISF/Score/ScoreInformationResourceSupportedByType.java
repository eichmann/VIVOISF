package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreInformationResourceSupportedByIterator theScoreInformationResourceSupportedByIterator = (ScoreInformationResourceSupportedByIterator)findAncestorWithClass(this, ScoreInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theScoreInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

