package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingAgriculturalAreaNotesIterator theself_governing = (self_governingAgriculturalAreaNotesIterator)findAncestorWithClass(this, self_governingAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theself_governing.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

