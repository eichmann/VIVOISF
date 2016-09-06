package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009Features currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009FeaturesIterator theIAO_0000009FeaturesIterator = (IAO_0000009FeaturesIterator)findAncestorWithClass(this, IAO_0000009FeaturesIterator.class);
			pageContext.getOut().print(theIAO_0000009FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for features tag ");
		}
		return SKIP_BODY;
	}
}

