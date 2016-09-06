package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationFeaturesIterator theLegislationFeaturesIterator = (LegislationFeaturesIterator)findAncestorWithClass(this, LegislationFeaturesIterator.class);
			pageContext.getOut().print(theLegislationFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for features tag ");
		}
		return SKIP_BODY;
	}
}

