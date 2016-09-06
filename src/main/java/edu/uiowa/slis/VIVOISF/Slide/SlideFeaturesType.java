package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideFeaturesIterator theSlideFeaturesIterator = (SlideFeaturesIterator)findAncestorWithClass(this, SlideFeaturesIterator.class);
			pageContext.getOut().print(theSlideFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for features tag ");
		}
		return SKIP_BODY;
	}
}

