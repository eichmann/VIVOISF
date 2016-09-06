package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterFeaturesIterator theConferencePosterFeaturesIterator = (ConferencePosterFeaturesIterator)findAncestorWithClass(this, ConferencePosterFeaturesIterator.class);
			pageContext.getOut().print(theConferencePosterFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for features tag ");
		}
		return SKIP_BODY;
	}
}

