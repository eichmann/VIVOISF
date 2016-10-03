package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianIntervieweeInverseIterator theEmeritusLibrarianIntervieweeInverseIterator = (EmeritusLibrarianIntervieweeInverseIterator)findAncestorWithClass(this, EmeritusLibrarianIntervieweeInverseIterator.class);
			pageContext.getOut().print(theEmeritusLibrarianIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

