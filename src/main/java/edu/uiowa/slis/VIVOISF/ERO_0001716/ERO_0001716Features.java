package edu.uiowa.slis.VIVOISF.ERO_0001716;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001716Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001716Features currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001716Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001716FeaturesIterator theERO_0001716FeaturesIterator = (ERO_0001716FeaturesIterator)findAncestorWithClass(this, ERO_0001716FeaturesIterator.class);
			pageContext.getOut().print(theERO_0001716FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001716 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001716 for features tag ");
		}
		return SKIP_BODY;
	}
}

