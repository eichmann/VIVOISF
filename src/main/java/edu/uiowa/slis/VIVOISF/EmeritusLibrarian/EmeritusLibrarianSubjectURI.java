package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			if (!theEmeritusLibrarian.commitNeeded) {
				pageContext.getOut().print(theEmeritusLibrarian.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			return theEmeritusLibrarian.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusLibrarian for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			theEmeritusLibrarian.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for subjectURI tag ");
		}
	}
}

