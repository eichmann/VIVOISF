package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumRelatedByIterator theMuseumRelatedByIterator = (MuseumRelatedByIterator)findAncestorWithClass(this, MuseumRelatedByIterator.class);
			pageContext.getOut().print(theMuseumRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

