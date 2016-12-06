package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionPopulationNotesIterator theCollection = (CollectionPopulationNotesIterator)findAncestorWithClass(this, CollectionPopulationNotesIterator.class);
			pageContext.getOut().print(theCollection.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

