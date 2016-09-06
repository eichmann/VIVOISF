package edu.uiowa.slis.VIVOISF.IAO_0000102;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000102Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000102Features currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000102Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000102FeaturesIterator theIAO_0000102FeaturesIterator = (IAO_0000102FeaturesIterator)findAncestorWithClass(this, IAO_0000102FeaturesIterator.class);
			pageContext.getOut().print(theIAO_0000102FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000102 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000102 for features tag ");
		}
		return SKIP_BODY;
	}
}

