package edu.uiowa.slis.VIVOISF.IAO_0000144;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000144Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000144Features currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000144Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000144FeaturesIterator theIAO_0000144FeaturesIterator = (IAO_0000144FeaturesIterator)findAncestorWithClass(this, IAO_0000144FeaturesIterator.class);
			pageContext.getOut().print(theIAO_0000144FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000144 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000144 for features tag ");
		}
		return SKIP_BODY;
	}
}

