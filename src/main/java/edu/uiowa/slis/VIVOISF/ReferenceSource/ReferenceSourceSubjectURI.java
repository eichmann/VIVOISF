package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSource theReferenceSource = (ReferenceSource)findAncestorWithClass(this, ReferenceSource.class);
			if (!theReferenceSource.commitNeeded) {
				pageContext.getOut().print(theReferenceSource.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ReferenceSource theReferenceSource = (ReferenceSource)findAncestorWithClass(this, ReferenceSource.class);
			return theReferenceSource.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ReferenceSource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ReferenceSource theReferenceSource = (ReferenceSource)findAncestorWithClass(this, ReferenceSource.class);
			theReferenceSource.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for subjectURI tag ");
		}
	}
}

