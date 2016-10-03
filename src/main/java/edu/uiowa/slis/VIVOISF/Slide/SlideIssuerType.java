package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideIssuerIterator theSlideIssuerIterator = (SlideIssuerIterator)findAncestorWithClass(this, SlideIssuerIterator.class);
			pageContext.getOut().print(theSlideIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for issuer tag ");
		}
		return SKIP_BODY;
	}
}

