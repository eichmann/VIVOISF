package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCountryAreaNotesIterator theSelf_governing = (Self_governingCountryAreaNotesIterator)findAncestorWithClass(this, Self_governingCountryAreaNotesIterator.class);
			pageContext.getOut().print(theSelf_governing.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

