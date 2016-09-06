package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisFeaturesIterator theThesisFeaturesIterator = (ThesisFeaturesIterator)findAncestorWithClass(this, ThesisFeaturesIterator.class);
			pageContext.getOut().print(theThesisFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for features tag ");
		}
		return SKIP_BODY;
	}
}

