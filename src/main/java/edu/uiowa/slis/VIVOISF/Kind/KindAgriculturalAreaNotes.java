package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(KindAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindAgriculturalAreaNotesIterator theKind = (KindAgriculturalAreaNotesIterator)findAncestorWithClass(this, KindAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theKind.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

