package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipHDINotesIterator theEditorship = (EditorshipHDINotesIterator)findAncestorWithClass(this, EditorshipHDINotesIterator.class);
			pageContext.getOut().print(theEditorship.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

