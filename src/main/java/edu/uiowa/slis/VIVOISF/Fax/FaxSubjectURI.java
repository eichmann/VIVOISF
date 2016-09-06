package edu.uiowa.slis.VIVOISF.Fax;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FaxSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FaxSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FaxSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Fax theFax = (Fax)findAncestorWithClass(this, Fax.class);
			if (!theFax.commitNeeded) {
				pageContext.getOut().print(theFax.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Fax for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fax for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Fax theFax = (Fax)findAncestorWithClass(this, Fax.class);
			return theFax.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Fax for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fax for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Fax theFax = (Fax)findAncestorWithClass(this, Fax.class);
			theFax.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Fax for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fax for subjectURI tag ");
		}
	}
}

