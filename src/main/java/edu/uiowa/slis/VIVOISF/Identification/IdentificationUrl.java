package edu.uiowa.slis.VIVOISF.Identification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentificationUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IdentificationUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentificationUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IdentificationUrlIterator theIdentification = (IdentificationUrlIterator)findAncestorWithClass(this, IdentificationUrlIterator.class);
			pageContext.getOut().print(theIdentification.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for url tag ");
		}
		return SKIP_BODY;
	}
}

