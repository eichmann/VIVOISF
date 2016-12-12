package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingHDINotesIterator theSelf_governing = (Self_governingHDINotesIterator)findAncestorWithClass(this, Self_governingHDINotesIterator.class);
			pageContext.getOut().print(theSelf_governing.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

