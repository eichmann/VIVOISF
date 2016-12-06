package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityAgriculturalAreaNotesIterator theGeopoliticalEntity = (GeopoliticalEntityAgriculturalAreaNotesIterator)findAncestorWithClass(this, GeopoliticalEntityAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

