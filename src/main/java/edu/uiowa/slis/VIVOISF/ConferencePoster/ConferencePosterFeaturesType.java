package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterFeaturesIterator theConferencePosterFeaturesIterator = (ConferencePosterFeaturesIterator)findAncestorWithClass(this, ConferencePosterFeaturesIterator.class);
			pageContext.getOut().print(theConferencePosterFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for features tag ");
		}
		return SKIP_BODY;
	}
}

