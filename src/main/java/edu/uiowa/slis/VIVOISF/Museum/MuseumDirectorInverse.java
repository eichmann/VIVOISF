package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumDirectorInverseIterator theMuseumDirectorInverseIterator = (MuseumDirectorInverseIterator)findAncestorWithClass(this, MuseumDirectorInverseIterator.class);
			pageContext.getOut().print(theMuseumDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for director tag ");
		}
		return SKIP_BODY;
	}
}

