package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionHDINotesIterator theCollection = (CollectionHDINotesIterator)findAncestorWithClass(this, CollectionHDINotesIterator.class);
			pageContext.getOut().print(theCollection.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

