package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumCourtInverseIterator theMuseumCourtInverseIterator = (MuseumCourtInverseIterator)findAncestorWithClass(this, MuseumCourtInverseIterator.class);
			pageContext.getOut().print(theMuseumCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for court tag ");
		}
		return SKIP_BODY;
	}
}

