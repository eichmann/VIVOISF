package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumOwnerInverseIterator theMuseumOwnerInverseIterator = (MuseumOwnerInverseIterator)findAncestorWithClass(this, MuseumOwnerInverseIterator.class);
			pageContext.getOut().print(theMuseumOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for owner tag ");
		}
		return SKIP_BODY;
	}
}

