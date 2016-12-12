package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingAgriculturalAreaNotesIterator theSelf_governing = (Self_governingAgriculturalAreaNotesIterator)findAncestorWithClass(this, Self_governingAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theSelf_governing.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

