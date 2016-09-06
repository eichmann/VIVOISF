package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalFeaturesIterator thePeriodicalFeaturesIterator = (PeriodicalFeaturesIterator)findAncestorWithClass(this, PeriodicalFeaturesIterator.class);
			pageContext.getOut().print(thePeriodicalFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for features tag ");
		}
		return SKIP_BODY;
	}
}

