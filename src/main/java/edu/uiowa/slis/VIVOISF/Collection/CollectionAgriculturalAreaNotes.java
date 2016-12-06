package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionAgriculturalAreaNotesIterator theCollection = (CollectionAgriculturalAreaNotesIterator)findAncestorWithClass(this, CollectionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theCollection.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

