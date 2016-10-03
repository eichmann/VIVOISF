package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MuseumSuffixNameIterator theMuseum = (MuseumSuffixNameIterator)findAncestorWithClass(this, MuseumSuffixNameIterator.class);
			pageContext.getOut().print(theMuseum.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

