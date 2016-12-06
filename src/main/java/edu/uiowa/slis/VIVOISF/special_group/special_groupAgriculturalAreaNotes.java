package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupAgriculturalAreaNotesIterator thespecial_group = (special_groupAgriculturalAreaNotesIterator)findAncestorWithClass(this, special_groupAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(thespecial_group.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

