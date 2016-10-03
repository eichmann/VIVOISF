package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianIntervieweeIterator theEmeritusLibrarianIntervieweeIterator = (EmeritusLibrarianIntervieweeIterator)findAncestorWithClass(this, EmeritusLibrarianIntervieweeIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

