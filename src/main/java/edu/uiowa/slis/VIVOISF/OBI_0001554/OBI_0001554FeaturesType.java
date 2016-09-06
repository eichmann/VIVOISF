package edu.uiowa.slis.VIVOISF.OBI_0001554;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0001554FeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0001554FeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0001554FeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0001554FeaturesIterator theOBI_0001554FeaturesIterator = (OBI_0001554FeaturesIterator)findAncestorWithClass(this, OBI_0001554FeaturesIterator.class);
			pageContext.getOut().print(theOBI_0001554FeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0001554 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0001554 for features tag ");
		}
		return SKIP_BODY;
	}
}

