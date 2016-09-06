package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(KindSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			if (!theKind.commitNeeded) {
				pageContext.getOut().print(theKind.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			return theKind.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Kind for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			theKind.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for subjectURI tag ");
		}
	}
}

