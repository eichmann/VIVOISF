package edu.uiowa.slis.VIVOISF.F1000Link;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class F1000LinkSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static F1000LinkSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(F1000LinkSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			F1000Link theF1000Link = (F1000Link)findAncestorWithClass(this, F1000Link.class);
			if (!theF1000Link.commitNeeded) {
				pageContext.getOut().print(theF1000Link.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing F1000Link for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing F1000Link for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			F1000Link theF1000Link = (F1000Link)findAncestorWithClass(this, F1000Link.class);
			return theF1000Link.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing F1000Link for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing F1000Link for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			F1000Link theF1000Link = (F1000Link)findAncestorWithClass(this, F1000Link.class);
			theF1000Link.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing F1000Link for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing F1000Link for subjectURI tag ");
		}
	}
}

