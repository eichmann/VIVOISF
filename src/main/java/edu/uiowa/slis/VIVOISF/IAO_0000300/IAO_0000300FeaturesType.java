package edu.uiowa.slis.VIVOISF.IAO_0000300;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000300FeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000300FeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000300FeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000300FeaturesIterator theIAO_0000300FeaturesIterator = (IAO_0000300FeaturesIterator)findAncestorWithClass(this, IAO_0000300FeaturesIterator.class);
			pageContext.getOut().print(theIAO_0000300FeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000300 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000300 for features tag ");
		}
		return SKIP_BODY;
	}
}

