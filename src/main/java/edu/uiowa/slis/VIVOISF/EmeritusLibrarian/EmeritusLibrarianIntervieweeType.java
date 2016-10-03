package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianIntervieweeIterator theEmeritusLibrarianIntervieweeIterator = (EmeritusLibrarianIntervieweeIterator)findAncestorWithClass(this, EmeritusLibrarianIntervieweeIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

