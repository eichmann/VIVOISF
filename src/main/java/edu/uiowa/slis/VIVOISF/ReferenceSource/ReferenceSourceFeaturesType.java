package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceFeaturesIterator theReferenceSourceFeaturesIterator = (ReferenceSourceFeaturesIterator)findAncestorWithClass(this, ReferenceSourceFeaturesIterator.class);
			pageContext.getOut().print(theReferenceSourceFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for features tag ");
		}
		return SKIP_BODY;
	}
}

