package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianInterviewerInverseIterator theEmeritusLibrarianInterviewerInverseIterator = (EmeritusLibrarianInterviewerInverseIterator)findAncestorWithClass(this, EmeritusLibrarianInterviewerInverseIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

