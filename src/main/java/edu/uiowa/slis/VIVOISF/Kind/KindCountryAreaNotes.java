package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCountryAreaNotesIterator theKind = (KindCountryAreaNotesIterator)findAncestorWithClass(this, KindCountryAreaNotesIterator.class);
			pageContext.getOut().print(theKind.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

