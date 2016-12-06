package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHDINotesIterator theGeopoliticalEntity = (GeopoliticalEntityHDINotesIterator)findAncestorWithClass(this, GeopoliticalEntityHDINotesIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

