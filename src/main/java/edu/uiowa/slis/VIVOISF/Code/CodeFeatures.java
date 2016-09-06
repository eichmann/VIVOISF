package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeFeaturesIterator theCodeFeaturesIterator = (CodeFeaturesIterator)findAncestorWithClass(this, CodeFeaturesIterator.class);
			pageContext.getOut().print(theCodeFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for features tag ");
		}
		return SKIP_BODY;
	}
}

