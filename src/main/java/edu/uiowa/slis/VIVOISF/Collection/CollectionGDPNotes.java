package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionGDPNotesIterator theCollection = (CollectionGDPNotesIterator)findAncestorWithClass(this, CollectionGDPNotesIterator.class);
			pageContext.getOut().print(theCollection.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

