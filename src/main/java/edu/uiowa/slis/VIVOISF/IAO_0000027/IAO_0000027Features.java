package edu.uiowa.slis.VIVOISF.IAO_0000027;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000027Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000027Features currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000027Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000027FeaturesIterator theIAO_0000027FeaturesIterator = (IAO_0000027FeaturesIterator)findAncestorWithClass(this, IAO_0000027FeaturesIterator.class);
			pageContext.getOut().print(theIAO_0000027FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000027 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000027 for features tag ");
		}
		return SKIP_BODY;
	}
}

