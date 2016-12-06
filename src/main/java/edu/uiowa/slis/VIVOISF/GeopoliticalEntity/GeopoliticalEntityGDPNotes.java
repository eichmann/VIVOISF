package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityGDPNotesIterator theGeopoliticalEntity = (GeopoliticalEntityGDPNotesIterator)findAncestorWithClass(this, GeopoliticalEntityGDPNotesIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

