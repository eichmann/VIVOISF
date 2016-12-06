package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceAgriculturalAreaNotesIterator theStateOrProvince = (StateOrProvinceAgriculturalAreaNotesIterator)findAncestorWithClass(this, StateOrProvinceAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theStateOrProvince.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

