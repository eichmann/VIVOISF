package edu.uiowa.slis.VIVOISF.IAO_0000032;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000032FeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000032FeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000032FeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000032FeaturesIterator theIAO_0000032FeaturesIterator = (IAO_0000032FeaturesIterator)findAncestorWithClass(this, IAO_0000032FeaturesIterator.class);
			pageContext.getOut().print(theIAO_0000032FeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000032 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000032 for features tag ");
		}
		return SKIP_BODY;
	}
}

