package edu.uiowa.slis.VIVOISF.ARG_2000377;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000377Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000377Features currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000377Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000377FeaturesIterator theARG_2000377FeaturesIterator = (ARG_2000377FeaturesIterator)findAncestorWithClass(this, ARG_2000377FeaturesIterator.class);
			pageContext.getOut().print(theARG_2000377FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000377 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000377 for features tag ");
		}
		return SKIP_BODY;
	}
}

