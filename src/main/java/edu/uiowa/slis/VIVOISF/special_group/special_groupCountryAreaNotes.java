package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCountryAreaNotesIterator thespecial_group = (special_groupCountryAreaNotesIterator)findAncestorWithClass(this, special_groupCountryAreaNotesIterator.class);
			pageContext.getOut().print(thespecial_group.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

