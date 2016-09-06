package edu.uiowa.slis.VIVOISF.ERO_0001262;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001262Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001262Features currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001262Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001262FeaturesIterator theERO_0001262FeaturesIterator = (ERO_0001262FeaturesIterator)findAncestorWithClass(this, ERO_0001262FeaturesIterator.class);
			pageContext.getOut().print(theERO_0001262FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001262 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001262 for features tag ");
		}
		return SKIP_BODY;
	}
}

