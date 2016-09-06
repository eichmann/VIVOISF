package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardFeaturesIterator theStandardFeaturesIterator = (StandardFeaturesIterator)findAncestorWithClass(this, StandardFeaturesIterator.class);
			pageContext.getOut().print(theStandardFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for features tag ");
		}
		return SKIP_BODY;
	}
}

