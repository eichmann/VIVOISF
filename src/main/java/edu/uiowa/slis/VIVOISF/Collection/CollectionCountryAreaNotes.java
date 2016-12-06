package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCountryAreaNotesIterator theCollection = (CollectionCountryAreaNotesIterator)findAncestorWithClass(this, CollectionCountryAreaNotesIterator.class);
			pageContext.getOut().print(theCollection.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

