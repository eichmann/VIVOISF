package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionLandAreaNotesIterator theCollection = (CollectionLandAreaNotesIterator)findAncestorWithClass(this, CollectionLandAreaNotesIterator.class);
			pageContext.getOut().print(theCollection.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

