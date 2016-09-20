package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumOBI_0000304InverseIterator theMuseumOBI_0000304InverseIterator = (MuseumOBI_0000304InverseIterator)findAncestorWithClass(this, MuseumOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theMuseumOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

