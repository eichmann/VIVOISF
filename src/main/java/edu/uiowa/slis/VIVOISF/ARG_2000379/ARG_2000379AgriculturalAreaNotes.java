package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379AgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379AgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379AgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379AgriculturalAreaNotesIterator theARG_2000379 = (ARG_2000379AgriculturalAreaNotesIterator)findAncestorWithClass(this, ARG_2000379AgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theARG_2000379.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

