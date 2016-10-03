package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianInterviewerIterator theEmeritusLibrarianInterviewerIterator = (EmeritusLibrarianInterviewerIterator)findAncestorWithClass(this, EmeritusLibrarianInterviewerIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

