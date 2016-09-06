package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayFeaturesIterator theScreenplayFeaturesIterator = (ScreenplayFeaturesIterator)findAncestorWithClass(this, ScreenplayFeaturesIterator.class);
			pageContext.getOut().print(theScreenplayFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for features tag ");
		}
		return SKIP_BODY;
	}
}

