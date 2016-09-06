package edu.uiowa.slis.VIVOISF.IAO_0000033;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000033Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000033Features currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000033Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000033FeaturesIterator theIAO_0000033FeaturesIterator = (IAO_0000033FeaturesIterator)findAncestorWithClass(this, IAO_0000033FeaturesIterator.class);
			pageContext.getOut().print(theIAO_0000033FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000033 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000033 for features tag ");
		}
		return SKIP_BODY;
	}
}

