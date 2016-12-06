package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityLandAreaNotesIterator theGeopoliticalEntity = (GeopoliticalEntityLandAreaNotesIterator)findAncestorWithClass(this, GeopoliticalEntityLandAreaNotesIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

