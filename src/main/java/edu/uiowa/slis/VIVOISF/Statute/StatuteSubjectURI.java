package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Statute theStatute = (Statute)findAncestorWithClass(this, Statute.class);
			if (!theStatute.commitNeeded) {
				pageContext.getOut().print(theStatute.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Statute theStatute = (Statute)findAncestorWithClass(this, Statute.class);
			return theStatute.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Statute for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Statute theStatute = (Statute)findAncestorWithClass(this, Statute.class);
			theStatute.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for subjectURI tag ");
		}
	}
}

