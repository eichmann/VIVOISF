package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379Features currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379FeaturesIterator theARG_2000379FeaturesIterator = (ARG_2000379FeaturesIterator)findAncestorWithClass(this, ARG_2000379FeaturesIterator.class);
			pageContext.getOut().print(theARG_2000379FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for features tag ");
		}
		return SKIP_BODY;
	}
}

