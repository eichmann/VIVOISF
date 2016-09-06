package edu.uiowa.slis.VIVOISF.ERO_0000396;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000396Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000396Features currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000396Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000396FeaturesIterator theERO_0000396FeaturesIterator = (ERO_0000396FeaturesIterator)findAncestorWithClass(this, ERO_0000396FeaturesIterator.class);
			pageContext.getOut().print(theERO_0000396FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000396 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000396 for features tag ");
		}
		return SKIP_BODY;
	}
}

