package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookIssuerIterator theMultiVolumeBookIssuerIterator = (MultiVolumeBookIssuerIterator)findAncestorWithClass(this, MultiVolumeBookIssuerIterator.class);
			pageContext.getOut().print(theMultiVolumeBookIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for issuer tag ");
		}
		return SKIP_BODY;
	}
}

