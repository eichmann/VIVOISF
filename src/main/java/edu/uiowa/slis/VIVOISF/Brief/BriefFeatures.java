package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefFeaturesIterator theBriefFeaturesIterator = (BriefFeaturesIterator)findAncestorWithClass(this, BriefFeaturesIterator.class);
			pageContext.getOut().print(theBriefFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for features tag ");
		}
		return SKIP_BODY;
	}
}

