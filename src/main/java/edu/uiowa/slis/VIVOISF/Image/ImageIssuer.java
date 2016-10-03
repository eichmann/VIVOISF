package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageIssuerIterator theImageIssuerIterator = (ImageIssuerIterator)findAncestorWithClass(this, ImageIssuerIterator.class);
			pageContext.getOut().print(theImageIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for issuer tag ");
		}
		return SKIP_BODY;
	}
}

