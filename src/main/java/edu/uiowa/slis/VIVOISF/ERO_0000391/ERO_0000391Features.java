package edu.uiowa.slis.VIVOISF.ERO_0000391;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000391Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000391Features currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000391Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000391FeaturesIterator theERO_0000391FeaturesIterator = (ERO_0000391FeaturesIterator)findAncestorWithClass(this, ERO_0000391FeaturesIterator.class);
			pageContext.getOut().print(theERO_0000391FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000391 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000391 for features tag ");
		}
		return SKIP_BODY;
	}
}

