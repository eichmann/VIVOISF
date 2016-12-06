package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCountryAreaNotesIterator thegroup = (groupCountryAreaNotesIterator)findAncestorWithClass(this, groupCountryAreaNotesIterator.class);
			pageContext.getOut().print(thegroup.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing group for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

