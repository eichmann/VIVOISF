package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeFeaturesIterator theCodeFeaturesIterator = (CodeFeaturesIterator)findAncestorWithClass(this, CodeFeaturesIterator.class);
			pageContext.getOut().print(theCodeFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for features tag ");
		}
		return SKIP_BODY;
	}
}

