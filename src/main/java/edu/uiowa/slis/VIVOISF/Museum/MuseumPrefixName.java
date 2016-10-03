package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MuseumPrefixNameIterator theMuseum = (MuseumPrefixNameIterator)findAncestorWithClass(this, MuseumPrefixNameIterator.class);
			pageContext.getOut().print(theMuseum.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

