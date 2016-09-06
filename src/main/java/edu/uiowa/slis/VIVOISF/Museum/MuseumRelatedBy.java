package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumRelatedByIterator theMuseumRelatedByIterator = (MuseumRelatedByIterator)findAncestorWithClass(this, MuseumRelatedByIterator.class);
			pageContext.getOut().print(theMuseumRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

