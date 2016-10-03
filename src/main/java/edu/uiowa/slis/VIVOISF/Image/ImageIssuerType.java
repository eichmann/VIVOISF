package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageIssuerIterator theImageIssuerIterator = (ImageIssuerIterator)findAncestorWithClass(this, ImageIssuerIterator.class);
			pageContext.getOut().print(theImageIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for issuer tag ");
		}
		return SKIP_BODY;
	}
}

