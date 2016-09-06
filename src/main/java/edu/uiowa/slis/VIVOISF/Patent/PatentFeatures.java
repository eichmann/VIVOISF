package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentFeaturesIterator thePatentFeaturesIterator = (PatentFeaturesIterator)findAncestorWithClass(this, PatentFeaturesIterator.class);
			pageContext.getOut().print(thePatentFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for features tag ");
		}
		return SKIP_BODY;
	}
}

