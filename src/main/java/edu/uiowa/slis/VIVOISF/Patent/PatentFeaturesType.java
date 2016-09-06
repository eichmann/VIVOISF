package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentFeaturesIterator thePatentFeaturesIterator = (PatentFeaturesIterator)findAncestorWithClass(this, PatentFeaturesIterator.class);
			pageContext.getOut().print(thePatentFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for features tag ");
		}
		return SKIP_BODY;
	}
}

