package edu.uiowa.slis.VIVOISF.ERO_0000392;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000392Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000392Features currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000392Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000392FeaturesIterator theERO_0000392FeaturesIterator = (ERO_0000392FeaturesIterator)findAncestorWithClass(this, ERO_0000392FeaturesIterator.class);
			pageContext.getOut().print(theERO_0000392FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000392 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000392 for features tag ");
		}
		return SKIP_BODY;
	}
}

