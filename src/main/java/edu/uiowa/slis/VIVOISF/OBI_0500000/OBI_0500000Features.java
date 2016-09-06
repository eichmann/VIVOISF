package edu.uiowa.slis.VIVOISF.OBI_0500000;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0500000Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0500000Features currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0500000Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0500000FeaturesIterator theOBI_0500000FeaturesIterator = (OBI_0500000FeaturesIterator)findAncestorWithClass(this, OBI_0500000FeaturesIterator.class);
			pageContext.getOut().print(theOBI_0500000FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0500000 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0500000 for features tag ");
		}
		return SKIP_BODY;
	}
}

