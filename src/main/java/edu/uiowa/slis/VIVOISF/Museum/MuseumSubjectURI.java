package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Museum theMuseum = (Museum)findAncestorWithClass(this, Museum.class);
			if (!theMuseum.commitNeeded) {
				pageContext.getOut().print(theMuseum.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Museum theMuseum = (Museum)findAncestorWithClass(this, Museum.class);
			return theMuseum.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Museum for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Museum theMuseum = (Museum)findAncestorWithClass(this, Museum.class);
			theMuseum.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for subjectURI tag ");
		}
	}
}

