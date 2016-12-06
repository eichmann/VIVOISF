package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentHDINotesIterator theContinent = (ContinentHDINotesIterator)findAncestorWithClass(this, ContinentHDINotesIterator.class);
			pageContext.getOut().print(theContinent.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

